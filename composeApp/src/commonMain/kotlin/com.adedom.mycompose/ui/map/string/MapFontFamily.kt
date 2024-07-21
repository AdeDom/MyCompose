package com.adedom.mycompose.ui.map.string

import androidx.compose.ui.text.font.FontFamily
import com.adedom.mycompose.data.models.sdui.datamodel.enumclass.FontFamilyData

internal fun String?.mapFontFamily(): FontFamily? = when (this) {
    FontFamilyData.Default.name -> FontFamily.Default
    FontFamilyData.SansSerif.name -> FontFamily.SansSerif
    FontFamilyData.Serif.name -> FontFamily.Serif
    FontFamilyData.Monospace.name -> FontFamily.Monospace
    FontFamilyData.Cursive.name -> FontFamily.Cursive
    else -> null
}
