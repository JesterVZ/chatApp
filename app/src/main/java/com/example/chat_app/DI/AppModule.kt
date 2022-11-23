package com.example.chat_app.DI

import com.example.chat_app.ChatApplication
import com.example.chat_app.common.Constants
import com.example.chat_app.data.Remote.LogApi
import com.example.chat_app.data.Remote.LoginApi
import com.example.chat_app.data.Repository.LoginRepositoryImpl
import com.example.chat_app.domain.Repository.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideLoginApi(): LoginApi{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(LoginApi::class.java)
    }

    @Provides
    @Singleton
    fun provideLoginRepository(api: LoginApi): LoginRepository{
        return LoginRepositoryImpl(api)
    }
}