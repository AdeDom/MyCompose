package com.adedom.mycompose.data.models.sdui.datamodel.sealed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface ArrangementData {

    @Serializable
    @SerialName("SpacedBy")
    data class SpacedBy(
        val spacedBy: Int? = null,
    ) : ArrangementData

    @Serializable
    data object Unknown : ArrangementData
}
