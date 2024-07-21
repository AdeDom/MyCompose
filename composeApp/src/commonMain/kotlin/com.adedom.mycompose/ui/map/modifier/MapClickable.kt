package com.adedom.mycompose.ui.map.modifier

import androidx.compose.foundation.clickable
import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ActionData
import com.adedom.mycompose.data.models.sdui.ModifierData

internal fun Modifier.mapClickable(
    modifier: ModifierData.Clickable,
    onClick: (ActionData?) -> Unit,
): Modifier = this.clickable(
    enabled = modifier.enabled ?: true,
    onClick = { onClick(modifier.action) },
)
