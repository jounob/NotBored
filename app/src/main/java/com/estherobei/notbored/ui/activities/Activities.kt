package com.estherobei.notbored.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.estherobei.notbored.adapter.ActivitiesAdapter
import com.estherobei.notbored.adapter.ClickListener
import com.estherobei.notbored.databinding.ActivityActivitiesBinding
import com.estherobei.notbored.model.Activity
import com.estherobei.notbored.model.db.ActivitiesList
import com.estherobei.notbored.ui.activitiesDetails.DetailsActivity

class Activities : AppCompatActivity(), ClickListener {

    private lateinit var activitiesBinding: ActivityActivitiesBinding
    private lateinit var activitiesAdapter: ActivitiesAdapter

    private val activities: List<Activity> = ActivitiesList.activitiesList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitiesBinding = ActivityActivitiesBinding.inflate(layoutInflater)
        setContentView(activitiesBinding.root)
        activitiesBinding.rvActivities.layoutManager = LinearLayoutManager(this)
        activitiesAdapter = ActivitiesAdapter(ActivitiesList.activitiesList, this)
        activitiesBinding.rvActivities.adapter = activitiesAdapter

    }

    override fun onItemClick(position: Int) {
        val participants = intent.getStringExtra("numberParticipants").toString()
        val intent = Intent(this, DetailsActivity::class.java)

        intent.putExtra("numberParticipants", participants)
        intent.putExtra("price",  activities[position].price.toDouble())
        intent.putExtra("desc", activities[position].message)
        intent.putExtra("title", activities[position].title)


        startActivity(intent)
    }
}

