package com.example.showtimes_presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.common.Resource
import com.example.showtimes_domain.usecase.GetShowTimesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ShowTimesViewModel @Inject constructor(
    private val getShowTimesUseCase: GetShowTimesUseCase
): ViewModel() {

    private val _showTimes = MutableStateFlow(ShowTimesState())
    val showTimes: StateFlow<ShowTimesState> = _showTimes

    init {
        getShowTimes()
    }

    private fun getShowTimes() {
        getShowTimesUseCase().onEach {
            _showTimes.value = when(it){
                is Resource.Error -> ShowTimesState(error = it.message)
                is Resource.Loading -> ShowTimesState(isLoading = true)
                is Resource.Success -> ShowTimesState(data = it.data)
            }
        }.launchIn(viewModelScope)
    }
}