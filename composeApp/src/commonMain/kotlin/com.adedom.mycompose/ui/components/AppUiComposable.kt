package com.adedom.mycompose.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ActionData
import com.adedom.mycompose.data.models.sdui.ComposableData
import compose.foundation.layout.Box

@Composable
fun AppUiComposable(
    modifier: Modifier = Modifier,
    data: ComposableData,
    onClick: (ActionData?) -> Unit,
) {
    when (data) {
        is ComposableData.Box -> BoxComposable(modifier, data, onClick)
        is ComposableData.Column -> ColumnComposable(modifier, data, onClick)
        is ComposableData.KamelImage -> KamelImageComposable(modifier, data, onClick)
        is ComposableData.LazyColumn -> LazyColumnComposable(modifier, data, onClick)
        is ComposableData.Row -> RowComposable(modifier, data, onClick)
        is ComposableData.Text -> TextComposable(modifier, data, onClick)
        is ComposableData.Unknown -> Box(modifier)
    }
}
