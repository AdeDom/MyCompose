package com.adedom.mycompose.ui.map.modifier

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.adedom.mycompose.data.models.sdui.ModifierData

internal fun Modifier.mapPadding(modifier: ModifierData.Padding): Modifier = when {
    modifier.all != null -> {
        this.padding(all = modifier.all.dp)
    }

    modifier.horizontal != null ||
        modifier.vertical != null -> {
        this.padding(
            horizontal = (modifier.horizontal ?: 0).dp,
            vertical = (modifier.vertical ?: 0).dp,
        )
    }

    modifier.start != null ||
        modifier.top != null ||
        modifier.end != null ||
        modifier.bottom != null -> {
        this.padding(
            start = (modifier.start ?: 0).dp,
            top = (modifier.top ?: 0).dp,
            end = (modifier.end ?: 0).dp,
            bottom = (modifier.bottom ?: 0).dp,
        )
    }

    else -> {
        this
    }
}
