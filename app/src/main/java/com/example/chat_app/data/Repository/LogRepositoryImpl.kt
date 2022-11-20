package com.example.chat_app.data.Repository

import com.example.chat_app.data.Remote.LogApi
import com.example.chat_app.data.dto.LogData
import com.example.chat_app.domain.Repository.LogRepository
import javax.inject.Inject

class LogRepositoryImpl @Inject constructor(
    private val api: LogApi
) : LogRepository {
    override suspend fun SendLog(value: LogData) {
        return api.SendLog(value)
    }
}