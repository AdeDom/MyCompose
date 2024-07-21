package com.adedom.mycompose.di

import com.adedom.mycompose.data.datasource.remote.drama.DramaRemoteDataSource
import com.adedom.mycompose.data.datasource.remote.drama.DramaRemoteDataSourceImpl
import com.adedom.mycompose.data.repositories.drama.DramaRepository
import com.adedom.mycompose.data.repositories.drama.DramaRepositoryImpl
import com.adedom.mycompose.domain.usecases.drama.GetDramaByIdUseCase
import com.adedom.mycompose.presentation.detail.viewmodel.DetailViewModel
import com.adedom.mycompose.presentation.home.viewmodel.HomeViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val homeModule = module {
    // data
    singleOf(::DramaRemoteDataSourceImpl) { bind<DramaRemoteDataSource>() }
    singleOf(::DramaRepositoryImpl) { bind<DramaRepository>() }

    // domain
    factoryOf(::GetDramaByIdUseCase)

    // presentation
    viewModelOf(::HomeViewModel)
    viewModelOf(::DetailViewModel)
}
