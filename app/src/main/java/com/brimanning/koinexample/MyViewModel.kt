package com.brimanning.koinexample

import androidx.lifecycle.ViewModel

class MyViewModel(private val repo: Repository): ViewModel() {
    fun myConsumerFunction() {
        val response = repo.myRepoFunction()
        // do something with that response
    }
}