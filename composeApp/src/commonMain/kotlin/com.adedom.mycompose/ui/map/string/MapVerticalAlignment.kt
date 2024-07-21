package com.adedom.mycompose.ui.map.string

import androidx.compose.ui.Alignment
import com.adedom.mycompose.data.models.sdui.datamodel.enumclass.AlignmentData

internal fun String?.mapVerticalAlignment(): Alignment.Vertical = when (this) {
    AlignmentData.Top.name -> Alignment.Top
    AlignmentData.CenterVertically.name -> Alignment.CenterVertically
    AlignmentData.Bottom.name -> Alignment.Bottom
    else -> Alignment.Top
}
