package com.estherobei.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.estherobei.notbored.databinding.ActivityActivitiesBinding

class Activities : AppCompatActivity() {

    private lateinit var activitiesBinding: ActivityActivitiesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitiesBinding = ActivityActivitiesBinding.inflate(layoutInflater)
        setContentView(activitiesBinding.root)

    }
}