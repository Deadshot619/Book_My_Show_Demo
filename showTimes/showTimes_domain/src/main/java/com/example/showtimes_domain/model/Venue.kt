package com.example.showtimes_domain.model

data class Venue(
    val name: String,
    val showDate: String,
    val showTimes: List<ShowTime>
)

data class ShowTime(
    val showDateCode: Long,
    val showTime: String
)