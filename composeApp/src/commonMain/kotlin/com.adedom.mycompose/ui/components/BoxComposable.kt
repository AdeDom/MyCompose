package com.adedom.mycompose.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ActionData
import com.adedom.mycompose.data.models.sdui.ComposableData
import com.adedom.mycompose.ui.map.mapModifier
import compose.foundation.layout.Box

@Composable
fun BoxComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.Box,
    onClick: (ActionData?) -> Unit,
) {
    Box(modifier = data.modifier.mapModifier(modifier, onClick)) {
        data.content?.forEach {
            AppUiComposable(data = it, onClick = onClick)
        }
    }
}
