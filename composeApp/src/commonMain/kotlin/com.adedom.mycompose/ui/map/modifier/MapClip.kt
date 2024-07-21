package com.adedom.mycompose.ui.map.modifier

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.adedom.mycompose.data.models.sdui.ModifierData
import com.adedom.mycompose.data.models.sdui.datamodel.sealed.ClipData

internal fun Modifier.mapClip(modifier: ModifierData.Clip): Modifier = when (modifier.clip) {
    ClipData.CircleShape -> this.clip(CircleShape)
    is ClipData.RoundedCornerShape -> this.clip(modifier.clip.mapRoundedCornerShape())
    ClipData.Unknown, null -> this
}

private fun ClipData.RoundedCornerShape.mapRoundedCornerShape(): Shape = when {
    size != null -> RoundedCornerShape(size = this.size.dp)

    else -> RoundedCornerShape(
        topStart = (this.topStart ?: 0).dp,
        topEnd = (this.topEnd ?: 0).dp,
        bottomEnd = (this.bottomEnd ?: 0).dp,
        bottomStart = (this.bottomStart ?: 0).dp,
    )
}
