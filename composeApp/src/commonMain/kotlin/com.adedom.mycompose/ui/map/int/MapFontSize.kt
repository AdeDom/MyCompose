package com.adedom.mycompose.ui.map.int

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

internal fun Int?.mapFontSize(): TextUnit = this?.sp ?: TextUnit.Unspecified
