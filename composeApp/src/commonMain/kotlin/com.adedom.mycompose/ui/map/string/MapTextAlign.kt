package com.adedom.mycompose.ui.map.string

import androidx.compose.ui.text.style.TextAlign
import com.adedom.mycompose.data.models.sdui.datamodel.enumclass.TextAlignData

internal fun String?.mapTextAlign(): TextAlign? = when (this) {
    TextAlignData.Left.name -> TextAlign.Left
    TextAlignData.Right.name -> TextAlign.Right
    TextAlignData.Center.name -> TextAlign.Center
    TextAlignData.Justify.name -> TextAlign.Justify
    TextAlignData.Start.name -> TextAlign.Start
    TextAlignData.End.name -> TextAlign.End
    else -> null
}
