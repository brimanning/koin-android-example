package com.brimanning.koinexample

import android.app.Application
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)
            modules(module {
                single { ApiClient.build() }
                single { Repository(get()) }
                viewModel { MyViewModel(get()) }
            })
        }
    }
}