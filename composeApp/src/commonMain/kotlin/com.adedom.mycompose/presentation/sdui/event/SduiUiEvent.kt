package com.adedom.mycompose.presentation.sdui.event

import com.adedom.mycompose.data.models.sdui.ActionData

sealed interface SduiUiEvent {
    data object Initial : SduiUiEvent
    data class OnClick(
        val action: ActionData?,
    ) : SduiUiEvent
}
