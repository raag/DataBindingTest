package com.raagpc.databindingtest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val myText: String = "Hello binding"
    val counter = MutableLiveData<Int>(1)

    fun incrementCounter() {
        counter.value?.let {
            counter.value = it + 1
        }
    }
}