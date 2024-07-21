package com.adedom.mycompose.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ActionData
import com.adedom.mycompose.data.models.sdui.ComposableData
import com.adedom.mycompose.ui.map.datamodel.mapVerticalArrangement
import com.adedom.mycompose.ui.map.mapModifier
import com.adedom.mycompose.ui.map.string.mapHorizontalAlignment
import compose.foundation.layout.Column

@Composable
fun ColumnComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.Column,
    onClick: (ActionData?) -> Unit,
) {
    Column(
        modifier = data.modifier.mapModifier(modifier, onClick),
        verticalArrangement = data.verticalArrangement.mapVerticalArrangement(),
        horizontalAlignment = data.horizontalAlignment.mapHorizontalAlignment(),
    ) {
        data.content?.forEach {
            AppUiComposable(data = it, onClick = onClick)
        }
    }
}
