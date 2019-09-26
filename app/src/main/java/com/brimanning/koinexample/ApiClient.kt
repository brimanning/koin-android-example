package com.brimanning.koinexample

// yes, we're faking this for simplicity - shhhhhh!!
interface ApiClient {
    fun myFunction(): SomeResponse

    companion object {
        fun build(): ApiClient {
            return object : ApiClient {
                override fun myFunction() = SomeResponse("hi!")
            }
        }
    }

}
