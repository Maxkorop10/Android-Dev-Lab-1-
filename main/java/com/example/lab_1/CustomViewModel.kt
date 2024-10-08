package com.example.lab_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CustomViewModel : ViewModel() {

    private val number = MutableLiveData<Int>(0)
    val count: LiveData<Int> = number

    //var number = 0
    fun Incrementation() {
        number.value = number.value?.plus(1)
    }
}