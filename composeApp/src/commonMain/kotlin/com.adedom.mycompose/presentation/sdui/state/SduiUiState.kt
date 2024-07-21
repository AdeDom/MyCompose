package com.adedom.mycompose.presentation.sdui.state

import com.adedom.mycompose.data.models.sdui.ComposableData

data class SduiUiState(
    val isLoading: Boolean = false,
    val data: ComposableData? = null,
)
