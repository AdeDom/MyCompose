package com.adedom.mycompose.ui.map.string

import androidx.compose.ui.layout.ContentScale
import com.adedom.mycompose.data.models.sdui.datamodel.enumclass.ContentScaleData

internal fun String?.mapContentScale(): ContentScale = when (this) {
    ContentScaleData.Crop.name -> ContentScale.Crop
    ContentScaleData.FillBounds.name -> ContentScale.FillBounds
    else -> ContentScale.Fit
}
