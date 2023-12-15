package com.fireb.viewmodelpractice.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fireb.viewmodelpractice.model.PaymentDetails
import com.fireb.viewmodelpractice.model.Repository

class MyViewModel : ViewModel() {
    var paymentList : LiveData<List<PaymentDetails>>

    private val results = Repository()
    init {
        val listOfPeople = results.getDataList()
        paymentList = listOfPeople


    }



    private val _number : MutableLiveData<Int> = MutableLiveData(0)
    var number : LiveData<Int> = _number

//    fun setNumber (no : Int)  {
//        _number.value = no
//    }

    fun increaseNumber () : Int{
        _number.value = _number.value?.plus(1)

        return _number.value!!
    }
}