package com.example.chat_app.DI

import com.example.chat_app.common.Constants
import com.example.chat_app.data.Remote.LogApi
import com.example.chat_app.data.Remote.LoginApi
import com.example.chat_app.data.Repository.LogRepositoryImpl
import com.example.chat_app.data.Repository.LoginRepositoryImpl
import com.example.chat_app.domain.Repository.LogRepository
import com.example.chat_app.domain.Repository.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLoginApi(): LoginApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LoginApi::class.java)
    }
    @Provides
    @Singleton
    fun provideLogApi(): LogApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LogApi::class.java)
    }

    @Provides
    @Singleton
    fun provideLoginRepository(api: LoginApi): LoginRepository{
        return LoginRepositoryImpl(api)
    }
    @Provides
    @Singleton
    fun provideLogRepository(api: LogApi): LogRepository{
        return LogRepositoryImpl(api)
    }
}