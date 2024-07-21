package com.adedom.mycompose.data.models.sdui

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface ActionData {

    @Serializable
    @SerialName("Open")
    data class Open(
        val url: String? = null,
    ) : ActionData

    @Serializable
    data object Unknown : ActionData
}
