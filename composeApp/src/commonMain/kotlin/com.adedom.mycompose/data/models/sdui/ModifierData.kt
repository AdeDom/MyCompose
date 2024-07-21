package com.adedom.mycompose.data.models.sdui

import com.adedom.mycompose.data.models.sdui.datamodel.sealed.BackgroundData
import com.adedom.mycompose.data.models.sdui.datamodel.sealed.BorderData
import com.adedom.mycompose.data.models.sdui.datamodel.sealed.ClipData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface ModifierData {

    @Serializable
    @SerialName("Alignment")
    data class Alignment(
        val alignment: String? = null,
    ) : ModifierData

    @Serializable
    @SerialName("AspectRatio")
    data class AspectRatio(
        val ratio: Float? = null,
    ) : ModifierData

    @Serializable
    @SerialName("Background")
    data class Background(
        val background: BackgroundData? = null,
    ) : ModifierData

    @Serializable
    @SerialName("Border")
    data class Border(
        val border: BorderData? = null,
    ) : ModifierData

    @Serializable
    @SerialName("Clickable")
    data class Clickable(
        val enabled: Boolean? = null,
        val action: ActionData? = null,
    ) : ModifierData

    @Serializable
    @SerialName("Clip")
    data class Clip(
        val clip: ClipData? = null,
    ) : ModifierData

    @Serializable
    @SerialName("FillMaxHeight")
    data object FillMaxHeight : ModifierData

    @Serializable
    @SerialName("FillMaxSize")
    data object FillMaxSize : ModifierData

    @Serializable
    @SerialName("FillMaxWidth")
    data object FillMaxWidth : ModifierData

    @Serializable
    @SerialName("Height")
    data class Height(
        val height: Int? = null,
    ) : ModifierData

    @Serializable
    @SerialName("Padding")
    data class Padding(
        val all: Int? = null,
        val horizontal: Int? = null,
        val vertical: Int? = null,
        val start: Int? = null,
        val top: Int? = null,
        val end: Int? = null,
        val bottom: Int? = null,
    ) : ModifierData

    @Serializable
    @SerialName("Size")
    data class Size(
        val size: Int? = null,
        val width: Int? = null,
        val height: Int? = null,
    ) : ModifierData

    @Serializable
    @SerialName("Weight")
    data class Weight(
        val weight: Float? = null,
        val fill: Boolean? = null,
    ) : ModifierData

    @Serializable
    @SerialName("Width")
    data class Width(
        val width: Int? = null,
    ) : ModifierData

    @Serializable
    data object Unknown : ModifierData
}
