package com.adedom.mycompose.di

import com.adedom.mycompose.data.datasource.remote.engine.AppHttpClientEngine
import com.adedom.mycompose.data.datasource.remote.engine.AppHttpClientEngineImpl
import com.adedom.mycompose.utils.AppNavigation
import com.adedom.mycompose.utils.AppNavigationImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val iosModule = module {

    // data
    singleOf(::AppHttpClientEngineImpl) { bind<AppHttpClientEngine>() }

    // utils
    singleOf(::AppNavigationImpl) { bind<AppNavigation>() }
}
