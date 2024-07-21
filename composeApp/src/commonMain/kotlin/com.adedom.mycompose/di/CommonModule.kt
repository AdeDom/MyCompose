package com.adedom.mycompose.di

import com.adedom.mycompose.data.datasource.DataSourceProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val commonModule = module {

    single { Dispatchers.IO }
    singleOf(::DataSourceProvider)
}
