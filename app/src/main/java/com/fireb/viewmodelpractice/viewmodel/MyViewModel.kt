package com.fireb.viewmodelpractice.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

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