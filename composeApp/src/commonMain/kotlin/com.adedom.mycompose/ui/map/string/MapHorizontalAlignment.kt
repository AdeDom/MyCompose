package com.adedom.mycompose.ui.map.string

import androidx.compose.ui.Alignment
import com.adedom.mycompose.data.models.sdui.datamodel.enumclass.AlignmentData

internal fun String?.mapHorizontalAlignment(): Alignment.Horizontal = when (this) {
    AlignmentData.Start.name -> Alignment.Start
    AlignmentData.CenterHorizontally.name -> Alignment.CenterHorizontally
    AlignmentData.End.name -> Alignment.End
    else -> Alignment.Start
}
