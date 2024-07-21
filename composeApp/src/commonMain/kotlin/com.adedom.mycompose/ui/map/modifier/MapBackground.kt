package com.adedom.mycompose.ui.map.modifier

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ModifierData
import com.adedom.mycompose.data.models.sdui.datamodel.sealed.BackgroundData
import com.adedom.mycompose.ui.map.datamodel.mapBrushData
import com.adedom.mycompose.ui.map.datamodel.mapShapeData
import com.adedom.mycompose.ui.map.string.mapColor

internal fun Modifier.mapBackground(modifier: ModifierData.Background): Modifier =
    when (modifier.background) {
        is BackgroundData.Brush -> this.background(
            brush = modifier.background.brush.mapBrushData(),
            shape = modifier.background.shape.mapShapeData(),
            alpha = modifier.background.alpha ?: 1f,
        )

        is BackgroundData.Color -> this.background(
            color = modifier.background.color.mapColor(),
            shape = modifier.background.shape.mapShapeData(),
        )

        BackgroundData.Unknown, null -> this
    }
