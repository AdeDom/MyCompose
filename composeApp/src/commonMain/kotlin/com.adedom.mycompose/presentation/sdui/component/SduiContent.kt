package com.adedom.mycompose.presentation.sdui.component

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.adedom.mycompose.presentation.sdui.event.SduiUiEvent
import com.adedom.mycompose.presentation.sdui.state.SduiUiState
import com.adedom.mycompose.ui.components.AppUiComposable
import compose.foundation.layout.Box
import compose.foundation.layout.BoxScopeInstance.align

@Composable
fun SduiContent(
    modifier: Modifier = Modifier,
    uiState: SduiUiState,
    onEvent: (SduiUiEvent) -> Unit,
) {
    Box(modifier = modifier) {
        uiState.data?.let {
            AppUiComposable(data = it, onClick = { action ->
                onEvent(SduiUiEvent.OnClick(action))
            })
        }

        if (uiState.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}
