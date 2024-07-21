package com.adedom.mycompose.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ActionData
import com.adedom.mycompose.data.models.sdui.ComposableData
import com.adedom.mycompose.ui.map.mapModifier
import com.adedom.mycompose.ui.map.string.mapContentScale
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun KamelImageComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.KamelImage,
    onClick: (ActionData?) -> Unit,
) {
    if (data.data != null) {
        KamelImage(
            resource = asyncPainterResource(data = data.data),
            contentDescription = data.contentDescription,
            contentScale = data.contentScale.mapContentScale(),
            modifier = data.modifier.mapModifier(modifier, onClick),
        )
    } else {
        Box(modifier = data.modifier.mapModifier(modifier, onClick))
    }
}
