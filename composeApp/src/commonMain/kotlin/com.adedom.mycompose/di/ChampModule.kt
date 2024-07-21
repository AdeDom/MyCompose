package com.adedom.mycompose.di

import com.adedom.mycompose.data.datasource.local.champ.ChampLocalDataSource
import com.adedom.mycompose.data.datasource.local.champ.ChampLocalDataSourceImpl
import com.adedom.mycompose.domain.usecases.champ.GetChampHomeUseCase
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val champModule = module {

    // data
    singleOf(::ChampLocalDataSourceImpl) { bind<ChampLocalDataSource>() }

    // domain
    singleOf(::GetChampHomeUseCase)
}
