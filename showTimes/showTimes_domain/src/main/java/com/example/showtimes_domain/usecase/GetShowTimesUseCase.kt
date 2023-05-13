package com.example.showtimes_domain.usecase

import com.example.common.Resource
import com.example.showtimes_domain.model.Venue
import com.example.showtimes_domain.repository.ShowTimesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetShowTimesUseCase(
    private val showTimesRepository: ShowTimesRepository
) {

    operator fun invoke(): Flow<Resource<List<Venue>>> = flow {
        emit(Resource.Loading())

        try {
            emit(Resource.Success(data = showTimesRepository.getVenues()))
        } catch (e: Exception) {
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}