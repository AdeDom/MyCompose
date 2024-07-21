package com.adedom.mycompose.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ActionData
import com.adedom.mycompose.data.models.sdui.ComposableData
import com.adedom.mycompose.ui.map.int.mapFontSize
import com.adedom.mycompose.ui.map.int.mapMaxLines
import com.adedom.mycompose.ui.map.mapModifier
import com.adedom.mycompose.ui.map.string.mapColor
import com.adedom.mycompose.ui.map.string.mapFontFamily
import com.adedom.mycompose.ui.map.string.mapFontStyle
import com.adedom.mycompose.ui.map.string.mapFontWeight
import com.adedom.mycompose.ui.map.string.mapOverflow
import com.adedom.mycompose.ui.map.string.mapTextAlign

@Composable
fun TextComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.Text,
    onClick: (ActionData?) -> Unit,
) {
    Text(
        text = data.text.orEmpty(),
        modifier = data.modifier.mapModifier(modifier, onClick),
        color = data.color.mapColor(),
        fontSize = data.fontSize.mapFontSize(),
        fontStyle = data.fontStyle.mapFontStyle(),
        fontWeight = data.fontWeight.mapFontWeight(),
        fontFamily = data.fontFamily.mapFontFamily(),
        textAlign = data.textAlign.mapTextAlign(),
        overflow = data.overflow.mapOverflow(),
        maxLines = data.maxLines.mapMaxLines(),
    )
}
