package com.adedom.mycompose.utils.extensions

import androidx.compose.ui.Modifier
import compose.foundation.layout.LayoutWeightElement

fun Modifier.weight(weight: Float, fill: Boolean = true): Modifier {
    require(weight > 0.0) { "invalid weight $weight; must be greater than zero" }
    return this.then(
        LayoutWeightElement(
            // Coerce Float.POSITIVE_INFINITY to Float.MAX_VALUE to avoid errors
            weight = weight.coerceAtMost(Float.MAX_VALUE),
            fill = fill,
        ),
    )
}
