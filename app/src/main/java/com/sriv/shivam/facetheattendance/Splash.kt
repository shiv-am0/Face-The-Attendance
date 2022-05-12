package com.sriv.shivam.facetheattendance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sriv.shivam.facetheattendance.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {
    lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.splashText.animate().setDuration(2000).alpha(1f).withEndAction {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}