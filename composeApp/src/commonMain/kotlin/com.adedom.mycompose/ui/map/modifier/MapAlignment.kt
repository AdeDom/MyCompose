package com.adedom.mycompose.ui.map.modifier

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.adedom.mycompose.data.models.sdui.ModifierData
import com.adedom.mycompose.data.models.sdui.datamodel.enumclass.AlignmentData
import compose.foundation.layout.BoxScopeInstance.align

internal fun Modifier.mapAlignment(modifier: ModifierData.Alignment): Modifier =
    when (modifier.alignment) {
        AlignmentData.TopStart.name -> this.align(Alignment.TopStart)
        AlignmentData.TopCenter.name -> this.align(Alignment.TopCenter)
        AlignmentData.TopEnd.name -> this.align(Alignment.TopEnd)
        AlignmentData.CenterStart.name -> this.align(Alignment.CenterStart)
        AlignmentData.Center.name -> this.align(Alignment.Center)
        AlignmentData.CenterEnd.name -> this.align(Alignment.CenterEnd)
        AlignmentData.BottomStart.name -> this.align(Alignment.BottomStart)
        AlignmentData.BottomCenter.name -> this.align(Alignment.BottomCenter)
        AlignmentData.BottomEnd.name -> this.align(Alignment.BottomEnd)
        else -> this
    }
