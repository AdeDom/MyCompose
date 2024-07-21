package com.adedom.mycompose.data.models.sdui.datamodel.sealed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface ClipData {

    @Serializable
    @SerialName("CircleShape")
    data object CircleShape : ClipData

    @Serializable
    @SerialName("RoundedCornerShape")
    data class RoundedCornerShape(
        val size: Int? = null,
        val topStart: Int? = null,
        val topEnd: Int? = null,
        val bottomEnd: Int? = null,
        val bottomStart: Int? = null,
    ) : ClipData

    @Serializable
    data object Unknown : ClipData
}
