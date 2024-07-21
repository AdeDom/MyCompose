package com.adedom.mycompose.ui.map.modifier

import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.adedom.mycompose.data.models.sdui.ModifierData

internal fun Modifier.mapSize(modifier: ModifierData.Size): Modifier = when {
    modifier.size != null -> {
        this.size(size = modifier.size.dp)
    }

    modifier.width != null &&
        modifier.height != null -> {
        this.size(
            width = modifier.width.dp,
            height = modifier.height.dp,
        )
    }

    else -> {
        this
    }
}
