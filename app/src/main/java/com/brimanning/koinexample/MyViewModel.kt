package com.brimanning.koinexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel(private val repo: Repository): ViewModel() {
    val responseText = MutableLiveData<String>()

    fun myConsumerFunction() {
        val response = repo.myRepoFunction()
        // do something with that response
        responseText.value = response.text
    }
}