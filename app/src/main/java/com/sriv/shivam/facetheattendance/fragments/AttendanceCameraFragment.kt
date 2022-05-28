package com.sriv.shivam.facetheattendance.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import com.google.common.util.concurrent.ListenableFuture
import com.sriv.shivam.facetheattendance.R
import com.sriv.shivam.facetheattendance.databinding.FragmentAttendanceCameraBinding

class AttendanceCameraFragment : Fragment() {
    lateinit var binding: FragmentAttendanceCameraBinding
    private lateinit var cameraProviderFuture: ListenableFuture<ProcessCameraProvider>
    private lateinit var cameraSelector: CameraSelector

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAttendanceCameraBinding.inflate(layoutInflater)

        cameraProviderFuture = ProcessCameraProvider.getInstance(requireActivity())
        cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA

        startCamera()

        return binding.root
    }

    private fun startCamera() {
        // listening for data from the camera
        cameraProviderFuture.addListener({
            val cameraProvider = cameraProviderFuture.get()

            // connecting a preview use case to the preview in the xml file.
            val preview = Preview.Builder().build().also{
                it.setSurfaceProvider(binding.camera.surfaceProvider)
            }
            try{
                // clear all the previous use cases first.
                cameraProvider.unbindAll()
                // binding the lifecycle of the camera to the lifecycle of the application.
                cameraProvider.bindToLifecycle(this,cameraSelector,preview)
            } catch (e: Exception) {
                Log.d("TAG", "Use case binding failed")
            }

        }, ContextCompat.getMainExecutor(requireActivity()))
    }
}