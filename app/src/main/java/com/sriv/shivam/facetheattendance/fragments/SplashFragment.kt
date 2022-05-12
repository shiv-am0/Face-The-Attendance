package com.sriv.shivam.facetheattendance.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.sriv.shivam.facetheattendance.R
import com.sriv.shivam.facetheattendance.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    lateinit var binding : FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(layoutInflater)

        binding.splashText.animate().setDuration(2000).alpha(1f).withEndAction {
            findNavController(this).navigate(R.id.action_splashFragment_to_homeFragment)
        }

        return binding.root
    }
}