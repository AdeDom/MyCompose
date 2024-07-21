package com.adedom.mycompose.domain.usecases.champ

import com.adedom.mycompose.data.datasource.local.champ.ChampLocalDataSource
import com.adedom.mycompose.data.models.sdui.ComposableData

class GetChampHomeUseCase(
    private val champLocalDataSource: ChampLocalDataSource,
) {

    fun execute(): ComposableData = champLocalDataSource.getHome()
}
