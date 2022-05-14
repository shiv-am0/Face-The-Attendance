package com.sriv.shivam.facetheattendance.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.sriv.shivam.facetheattendance.R
import com.sriv.shivam.facetheattendance.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)

        //On clicking Take Attendance
        binding.takeAttendanceCard.setOnClickListener {
            findNavController(this).navigate(R.id.action_homeFragment_to_takeAttendanceFragment)
        }

        //On clicking View Attendance
        binding.viewAttendanceCard.setOnClickListener {
            findNavController(this).navigate(R.id.action_homeFragment_to_viewAttendanceFragment)
        }

        return binding.root
    }
}