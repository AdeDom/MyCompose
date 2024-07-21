package com.adedom.mycompose.ui.map.string

import androidx.compose.ui.text.style.TextOverflow
import com.adedom.mycompose.data.models.sdui.datamodel.enumclass.TextOverflowData

internal fun String?.mapOverflow(): TextOverflow = when (this) {
    TextOverflowData.Clip.name -> TextOverflow.Clip
    TextOverflowData.Ellipsis.name -> TextOverflow.Ellipsis
    TextOverflowData.Visible.name -> TextOverflow.Visible
    else -> TextOverflow.Clip
}
