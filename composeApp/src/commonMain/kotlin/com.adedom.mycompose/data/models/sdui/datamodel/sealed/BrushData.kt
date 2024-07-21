package com.adedom.mycompose.data.models.sdui.datamodel.sealed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface BrushData {

    @Serializable
    @SerialName("HorizontalGradient")
    data class HorizontalGradient(
        val colors: List<String?>? = null,
    ) : BrushData

    @Serializable
    @SerialName("LinearGradient")
    data class LinearGradient(
        val colors: List<String?>? = null,
    ) : BrushData

    @Serializable
    @SerialName("RadialGradient")
    data class RadialGradient(
        val colors: List<String?>? = null,
    ) : BrushData

    @Serializable
    @SerialName("SweepGradient")
    data class SweepGradient(
        val colors: List<String?>? = null,
    ) : BrushData

    @Serializable
    @SerialName("VerticalGradient")
    data class VerticalGradient(
        val colors: List<String?>? = null,
    ) : BrushData

    @Serializable
    data object Unknown : BrushData
}
