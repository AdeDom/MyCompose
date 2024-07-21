package com.adedom.mycompose.ui.map.datamodel

import androidx.compose.ui.graphics.Brush
import com.adedom.mycompose.data.models.sdui.datamodel.sealed.BrushData
import com.adedom.mycompose.utils.extensions.toColor

internal fun BrushData?.mapBrushData(): Brush = when (this) {
    is BrushData.HorizontalGradient -> {
        val colors = this.colors?.map { it.toColor() } ?: emptyList()
        Brush.horizontalGradient(colors)
    }

    is BrushData.LinearGradient -> {
        val colors = this.colors?.map { it.toColor() } ?: emptyList()
        Brush.linearGradient(colors)
    }

    is BrushData.RadialGradient -> {
        val colors = this.colors?.map { it.toColor() } ?: emptyList()
        Brush.radialGradient(colors)
    }

    is BrushData.SweepGradient -> {
        val colors = this.colors?.map { it.toColor() } ?: emptyList()
        Brush.sweepGradient(colors)
    }

    is BrushData.VerticalGradient -> {
        val colors = this.colors?.map { it.toColor() } ?: emptyList()
        Brush.verticalGradient(colors)
    }

    BrushData.Unknown, null -> Brush.horizontalGradient()
}
