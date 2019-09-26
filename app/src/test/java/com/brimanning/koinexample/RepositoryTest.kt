package com.brimanning.koinexample

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import org.junit.Assert
import org.junit.Test

class RepositoryTest {

    @Test
    fun myRepoFunctionTest() {
        val mockedApi: ApiClient = mock {
            on { myFunction() } doReturn SomeResponse("my response string")
        }
        val underTest = Repository(mockedApi)
        val response = underTest.myRepoFunction()

        Assert.assertEquals("my response string", response.text)
    }
}