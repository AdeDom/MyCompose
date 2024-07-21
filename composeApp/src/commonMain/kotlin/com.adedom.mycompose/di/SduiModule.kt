package com.adedom.mycompose.di

import com.adedom.mycompose.presentation.sdui.viewmodel.SduiViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val sduiModule = module {
    viewModelOf(::SduiViewModel)
}
