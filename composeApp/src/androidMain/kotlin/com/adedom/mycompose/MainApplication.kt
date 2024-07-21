package com.adedom.mycompose

import android.app.Application
import com.adedom.mycompose.di.androidModule
import com.adedom.mycompose.di.champModule
import com.adedom.mycompose.di.commonModule
import com.adedom.mycompose.di.homeModule
import com.adedom.mycompose.di.sduiModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(
                commonModule,
                androidModule,
                champModule,
                sduiModule,
                homeModule,
            )
        }
    }
}
