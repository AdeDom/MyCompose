package com.adedom.mycompose.utils.extensions

import androidx.compose.ui.graphics.Color

expect fun String?.toColor(): Color

fun String?.isColor(): Boolean {
    if (this == null) {
        return false
    }

    return Regex("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{8})$").matches(this.toString())
}
