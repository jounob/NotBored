package com.estherobei.notbored

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
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
        binding.termsAndCond.setOnClickListener {
            startActivity(Intent(this, Terms::class.java))
        }
        binding.btnStart.setOnClickListener {
            startActivity(Intent(this, Activities::class.java))
        }
        actionBar?.hide()
    }

    //Start Button activate
    private fun whenTextChanged() {
        val a = verifyInput(binding.etParticipants.text.toString())

        when (a) {
            true -> binding.btnStart.isEnabled = true
            else -> binding.btnStart.isEnabled = false
        }
    }


    //    fun verifyInput(value: String): Boolean = value.toInt() != 0
    private fun verifyInput(value: String): Boolean {
        return try {
            value.toInt() != 0 && value.isNotEmpty()
        } catch (e: Exception) {
            Toast.makeText(this, "Put a valid number", Toast.LENGTH_SHORT).show()
            false
        }
    }
}
