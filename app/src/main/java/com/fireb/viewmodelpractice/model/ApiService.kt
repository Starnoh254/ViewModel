package com.fireb.viewmodelpractice.model

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("getPayment_detail")
    fun getData() : Call<List<PaymentDetails>>
}