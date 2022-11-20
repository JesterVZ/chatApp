package com.example.chat_app.domain.UseCases

import com.example.chat_app.common.Resource
import com.example.chat_app.data.dto.LogData
import com.example.chat_app.domain.Repository.LogRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class SendLogDataUseCase @Inject constructor(
    private val repository: LogRepository
) {
    suspend operator fun invoke(logData: LogData): Flow<Resource<String>> = flow {
        try {
            emit(Resource.Loading())
            repository.SendLog(logData)
            emit(Resource.Success("Log send successful"))
        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage?: "Some error"))
        }catch (e: IOException){
            emit(Resource.Error("Connection error"))
        }
    }
}