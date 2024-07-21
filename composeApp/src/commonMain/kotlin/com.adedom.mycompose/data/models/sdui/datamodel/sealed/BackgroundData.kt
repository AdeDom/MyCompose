package com.adedom.mycompose.data.models.sdui.datamodel.sealed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface BackgroundData {

    @Serializable
    @SerialName("Brush")
    data class Brush(
        val brush: BrushData? = null,
        val shape: ShapeData? = null,
        val alpha: Float? = null,
    ) : BackgroundData

    @Serializable
    @SerialName("Color")
    data class Color(
        val color: String? = null,
        val shape: ShapeData? = null,
    ) : BackgroundData

    @Serializable
    data object Unknown : BackgroundData
}
