package com.adedom.mycompose.ui.map.datamodel

import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ModifierData
import com.adedom.mycompose.utils.extensions.weight

internal fun Modifier.mapWeight(modifier: ModifierData.Weight): Modifier =
    if (modifier.weight != null) {
        this.weight(modifier.weight, modifier.fill ?: true)
    } else {
        this
    }
