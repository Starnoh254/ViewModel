package com.fireb.viewmodelpractice.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASE_URL = "http://pickerapp.pythonanywhere.com/api/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun <T> createService(serviceClass: Class<T>): T {
        return retrofit.create(serviceClass)
    }
}