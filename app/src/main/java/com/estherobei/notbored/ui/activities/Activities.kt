package com.estherobei.notbored.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.estherobei.notbored.adapter.ActivitiesAdapter
import com.estherobei.notbored.databinding.ActivityActivitiesBinding
import com.estherobei.notbored.model.db.ActivitiesList

class Activities : AppCompatActivity() {

    private lateinit var activitiesBinding: ActivityActivitiesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitiesBinding = ActivityActivitiesBinding.inflate(layoutInflater)
        setContentView(activitiesBinding.root)
        activitiesBinding.rvActivities.layoutManager = LinearLayoutManager(this)
        activitiesBinding.rvActivities.adapter = ActivitiesAdapter(ActivitiesList.activitiesList)

    }
}

