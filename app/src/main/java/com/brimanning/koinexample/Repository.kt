package com.brimanning.koinexample

class Repository(private val api: ApiClient) {
    fun myRepoFunction(): SomeResponse {
        return api.myFunction()
    }
}
