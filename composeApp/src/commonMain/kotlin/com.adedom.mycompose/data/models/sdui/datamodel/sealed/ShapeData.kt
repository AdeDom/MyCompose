package com.adedom.mycompose.data.models.sdui.datamodel.sealed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface ShapeData {

    @Serializable
    @SerialName("CircleShape")
    data object CircleShape : ShapeData

    @Serializable
    @SerialName("RectangleShape")
    data object RectangleShape : ShapeData

    @Serializable
    @SerialName("RoundedCornerShape")
    data class RoundedCornerShape(
        val size: Int? = null,
    ) : ShapeData

    @Serializable
    data object Unknown : ShapeData
}
