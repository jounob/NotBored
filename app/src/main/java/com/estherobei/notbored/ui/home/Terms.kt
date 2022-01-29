package com.estherobei.notbored.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.estherobei.notbored.databinding.ActivityTermsBinding

class Terms : AppCompatActivity() {

    private lateinit var termsBinding: ActivityTermsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        termsBinding = ActivityTermsBinding.inflate(layoutInflater)
        setContentView(termsBinding.root)

        termsBinding.imBtnClose.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }


}