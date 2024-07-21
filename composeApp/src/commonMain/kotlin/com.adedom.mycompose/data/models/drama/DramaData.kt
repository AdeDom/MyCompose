package com.adedom.mycompose.data.models.drama

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DramaData(
    @SerialName("description") val description: String?,
    @SerialName("id") val id: Int?,
    @SerialName("image") val image: String?,
    @SerialName("title") val title: String?,
)
