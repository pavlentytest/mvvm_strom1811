package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    val counter = MutableLiveData<Int>()
    fun updateCounter() {
        this.counter.value = (this.counter.value ?: 0) + 1
    }
}