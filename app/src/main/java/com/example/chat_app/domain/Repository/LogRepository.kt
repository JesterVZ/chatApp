package com.example.chat_app.domain.Repository

import com.example.chat_app.data.dto.LogData

interface LogRepository {
    suspend fun SendLog(value: LogData)
}