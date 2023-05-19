package com.example.showtimes_presentation.ui

import com.example.showtimes_domain.model.Venue

data class ShowTimesState(
    val isLoading: Boolean = false,
    val error: String = "",
    val data: List<Venue>? = null
)
