package com.fireb.viewmodelpractice.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    val apiService = RetrofitClient.createService(ApiService::class.java)
    fun getDataList(): LiveData<List<PaymentDetails>> {
        val data = MutableLiveData<List<PaymentDetails>>()

        apiService.getData().enqueue(object : Callback<List<PaymentDetails>> {
            override fun onResponse(call: Call<List<PaymentDetails>>, response: Response<List<PaymentDetails>>) {
                if (response.isSuccessful) {
                    data.value = response.body()
                } else {
                    // Handle error
                }
            }

            override fun onFailure(call: Call<List<PaymentDetails>>, t: Throwable) {
                // Handle failure
            }
        })

        return data
    }

}