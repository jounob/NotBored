package com.estherobei.notbored.model

data class Activity(
    val id: Int,
    val participants: String = "1",
    val title: String,
    val message: String,
    val price: Float,
)

