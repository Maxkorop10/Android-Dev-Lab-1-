package com.example.lab_1

import androidx.lifecycle.ViewModel

class CustomViewModel : ViewModel() {
    var number = 0
    fun Incrementation() {
        number++
    }

    override fun onCleared() {
        super.onCleared()
    }
}