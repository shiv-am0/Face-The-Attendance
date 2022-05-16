package com.sriv.shivam.facetheattendance.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.sriv.shivam.facetheattendance.R
import com.sriv.shivam.facetheattendance.databinding.FragmentTakeAttendanceBinding
import java.util.*

class TakeAttendanceFragment : Fragment() {
    lateinit var binding: FragmentTakeAttendanceBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTakeAttendanceBinding.inflate(layoutInflater)

        //Initializing the DatePicker to current date
//        val today = Calendar.getInstance()
//        binding.datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH),
//            today.get(Calendar.DAY_OF_MONTH)
//
//        ) { view, year, month, day ->
//            val month = month + 1
//            val msg = "You Selected: $day/$month/$year"
//            Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()
//        }

        return binding.root
    }
}