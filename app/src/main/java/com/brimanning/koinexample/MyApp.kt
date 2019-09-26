package com.brimanning.koinexample

import android.app.Application
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)
            listOf(module {
                single { ApiClient.build() }
                single { Repository(get()) }
                single { Consumer(get()) }
            })
        }
    }
}