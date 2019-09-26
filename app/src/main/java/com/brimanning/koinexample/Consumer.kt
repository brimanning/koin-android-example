package com.brimanning.koinexample

class Consumer(private val repo: Repository) {
    fun myConsumerFunction() {
        val response = repo.myRepoFunction()
        // do something with that response
    }
}