package com.adedom.mycompose.ui.map.modifier

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ModifierData

internal fun Modifier.mapAspectRatio(modifier: ModifierData.AspectRatio): Modifier =
    if (modifier.ratio != null) {
        this.aspectRatio(modifier.ratio)
    } else {
        this
    }
