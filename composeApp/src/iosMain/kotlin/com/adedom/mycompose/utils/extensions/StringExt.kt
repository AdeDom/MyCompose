package com.adedom.mycompose.utils.extensions

import androidx.compose.ui.graphics.Color

actual fun String?.toColor(): Color {
    return if (this != null && this.isColor()) {
        when (this.length) {
            7 -> {
                val red = this.substring(1, 3).toInt(16)
                val green = this.substring(3, 5).toInt(16)
                val blue = this.substring(5, 7).toInt(16)
                return Color(red, green, blue)
            }

            9 -> {
                val alpha = this.substring(1, 3).toInt(16)
                val red = this.substring(3, 5).toInt(16)
                val green = this.substring(5, 7).toInt(16)
                val blue = this.substring(7, 9).toInt(16)
                return Color(red, green, blue, alpha)
            }

            else -> {
                Color.Unspecified
            }
        }
    } else {
        Color.Unspecified
    }
}
