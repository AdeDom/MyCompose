package com.adedom.mycompose.data.models.drama

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DramaResponse(
    @SerialName("data") val `data`: List<DramaData?>?,
    @SerialName("message") val message: String?,
    @SerialName("status") val status: String?,
)
