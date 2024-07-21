package com.adedom.mycompose.utils

import com.adedom.mycompose.di.champModule
import com.adedom.mycompose.di.commonModule
import com.adedom.mycompose.di.homeModule
import com.adedom.mycompose.di.iosModule
import com.adedom.mycompose.di.sduiModule
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(
            commonModule,
            iosModule,
            champModule,
            sduiModule,
            homeModule,
        )
    }
}
