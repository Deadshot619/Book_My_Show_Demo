package com.example.showtimes_domain.repository

import com.example.showtimes_domain.model.Venue

interface ShowTimesRepository {

    suspend fun getVenues(): List<Venue>
}