package com.estherobei.notbored

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.viewbinding.ViewBinding
import com.estherobei.notbored.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.isEnabled = false

        binding.etParticipants.doAfterTextChanged {
            whenTextChanged()
        }
    }

    fun whenTextChanged(){
        val a = verifyInput(binding.etParticipants.text.toString())

        when (a) {
            true -> binding.btnStart.isEnabled = true
          else -> binding.btnStart.isEnabled = false
        }


    }


  fun verifyInput(value: String): Boolean = value.toInt()!= 0

//  fun verifyInput(value: String): Boolean{
//
//     if(value.toInt() != 0 && value.isNotEmpty()){
//            return true
//        }
//        else{
//            return false
//        }
//    }








}