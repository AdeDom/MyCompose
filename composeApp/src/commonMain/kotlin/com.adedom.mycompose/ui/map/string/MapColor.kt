package com.adedom.mycompose.ui.map.string

import androidx.compose.ui.graphics.Color
import com.adedom.mycompose.utils.extensions.toColor

internal fun String?.mapColor(): Color = this?.toColor() ?: Color.Unspecified
