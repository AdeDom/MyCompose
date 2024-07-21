package com.adedom.mycompose.ui.map.string

import androidx.compose.ui.text.font.FontStyle
import com.adedom.mycompose.data.models.sdui.datamodel.enumclass.FontStyleData

internal fun String?.mapFontStyle(): FontStyle? = when (this) {
    FontStyleData.Normal.name -> FontStyle.Normal
    FontStyleData.Italic.name -> FontStyle.Italic
    else -> null
}
