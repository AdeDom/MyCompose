package com.adedom.mycompose.ui.map.modifier

import androidx.compose.foundation.border
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.adedom.mycompose.data.models.sdui.ModifierData
import com.adedom.mycompose.data.models.sdui.datamodel.sealed.BorderData
import com.adedom.mycompose.ui.map.datamodel.mapBrushData
import com.adedom.mycompose.ui.map.datamodel.mapShapeData
import com.adedom.mycompose.ui.map.string.mapColor

internal fun Modifier.mapBorder(modifier: ModifierData.Border): Modifier = when (modifier.border) {
    is BorderData.Brush -> this.border(
        width = (modifier.border.width ?: 1).dp,
        brush = modifier.border.brush.mapBrushData(),
        shape = modifier.border.shape.mapShapeData(),
    )

    is BorderData.Color -> this.border(
        width = (modifier.border.width ?: 1).dp,
        color = modifier.border.color.mapColor(),
        shape = modifier.border.shape.mapShapeData(),
    )

    BorderData.Unknown, null -> this
}
