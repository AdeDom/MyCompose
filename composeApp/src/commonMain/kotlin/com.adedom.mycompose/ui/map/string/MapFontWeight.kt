package com.adedom.mycompose.ui.map.string

import androidx.compose.ui.text.font.FontWeight
import com.adedom.mycompose.data.models.sdui.datamodel.enumclass.FontWeightData

internal fun String?.mapFontWeight(): FontWeight? = when (this) {
    FontWeightData.Thin.name -> FontWeight.Thin
    FontWeightData.ExtraLight.name -> FontWeight.ExtraLight
    FontWeightData.Light.name -> FontWeight.Light
    FontWeightData.Normal.name -> FontWeight.Normal
    FontWeightData.Medium.name -> FontWeight.Medium
    FontWeightData.SemiBold.name -> FontWeight.SemiBold
    FontWeightData.Bold.name -> FontWeight.Bold
    FontWeightData.ExtraBold.name -> FontWeight.ExtraBold
    FontWeightData.Black.name -> FontWeight.Black
    else -> null
}
