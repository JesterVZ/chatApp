package com.example.chat_app.data.dto

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

data class LogData(
    val date: LocalDateTime,
    val message: String)