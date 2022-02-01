package com.estherobei.notbored.ui.activitiesDetails

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.estherobei.notbored.databinding.ActivityDetailsBinding
import com.estherobei.notbored.model.Activity
import com.estherobei.notbored.model.db.ActivitiesList
import com.estherobei.notbored.ui.activities.Activities

class DetailsActivity : AppCompatActivity() {


    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)

        val intent = Intent(this, Activities::class.java)

        binding.imBtnBack.setOnClickListener {
            startActivity(intent)
        }
        binding.txtActivities.text = intent.getStringExtra("title").toString()
        binding.txtPriceRange.text = intent.extras?.getDouble("price").toString()
        binding.txtDescription.text = intent.extras?.getString("desc").toString()
        binding.txtNumberPartic.text = intent.extras?.getString("numberParticipants").toString()

        setContentView(binding.root)
    }

}