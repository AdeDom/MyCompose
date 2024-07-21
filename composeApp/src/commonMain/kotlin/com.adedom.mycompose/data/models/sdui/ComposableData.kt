package com.adedom.mycompose.data.models.sdui

import com.adedom.mycompose.data.models.sdui.datamodel.sealed.ArrangementData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface ComposableData {

    @Serializable
    @SerialName("Box")
    data class Box(
        val modifier: List<ModifierData>? = null,
        val content: List<ComposableData>? = null,
    ) : ComposableData

    @Serializable
    @SerialName("Column")
    data class Column(
        val modifier: List<ModifierData>? = null,
        val verticalArrangement: ArrangementData? = null,
        val horizontalAlignment: String? = null,
        val content: List<ComposableData>? = null,
    ) : ComposableData

    @Serializable
    @SerialName("KamelImage")
    data class KamelImage(
        val data: String? = null,
        val contentDescription: String? = null,
        val modifier: List<ModifierData>? = null,
        val contentScale: String? = null,
    ) : ComposableData

    @Serializable
    @SerialName("LazyColumn")
    data class LazyColumn(
        val modifier: List<ModifierData>? = null,
        val itemContent: List<ComposableData>? = null,
    ) : ComposableData

    @Serializable
    @SerialName("Row")
    data class Row(
        val modifier: List<ModifierData>? = null,
        val horizontalArrangement: ArrangementData? = null,
        val verticalAlignment: String? = null,
        val content: List<ComposableData>? = null,
    ) : ComposableData

    @Serializable
    @SerialName("Text")
    data class Text(
        val text: String? = null,
        val modifier: List<ModifierData>? = null,
        val color: String? = null,
        val fontSize: Int? = null,
        val fontStyle: String? = null,
        val fontWeight: String? = null,
        val fontFamily: String? = null,
        val textAlign: String? = null,
        val overflow: String? = null,
        val maxLines: Int? = null,
    ) : ComposableData

    @Serializable
    data object Unknown : ComposableData
}
