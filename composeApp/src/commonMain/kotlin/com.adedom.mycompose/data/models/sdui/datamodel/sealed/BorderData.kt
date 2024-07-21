package com.adedom.mycompose.data.models.sdui.datamodel.sealed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface BorderData {

    @Serializable
    @SerialName("Brush")
    data class Brush(
        val width: Int? = null,
        val brush: BrushData? = null,
        val shape: ShapeData? = null,
    ) : BorderData

    @Serializable
    @SerialName("Color")
    data class Color(
        val width: Int? = null,
        val color: String? = null,
        val shape: ShapeData? = null,
    ) : BorderData

    @Serializable
    data object Unknown : BorderData
}
