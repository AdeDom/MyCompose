package com.adedom.mycompose.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ActionData
import com.adedom.mycompose.data.models.sdui.ComposableData
import com.adedom.mycompose.ui.map.datamodel.mapHorizontalArrangement
import com.adedom.mycompose.ui.map.mapModifier
import com.adedom.mycompose.ui.map.string.mapVerticalAlignment
import compose.foundation.layout.Row

@Composable
fun RowComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.Row,
    onClick: (ActionData?) -> Unit,
) {
    Row(
        modifier = data.modifier.mapModifier(modifier, onClick),
        horizontalArrangement = data.horizontalArrangement.mapHorizontalArrangement(),
        verticalAlignment = data.verticalAlignment.mapVerticalAlignment(),
    ) {
        data.content?.forEach {
            AppUiComposable(data = it, onClick = onClick)
        }
    }
}
