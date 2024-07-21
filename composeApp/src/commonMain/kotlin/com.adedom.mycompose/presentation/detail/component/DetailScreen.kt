package com.adedom.mycompose.presentation.detail.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.adedom.mycompose.presentation.detail.viewmodel.DetailUiEvent
import com.adedom.mycompose.presentation.detail.viewmodel.DetailViewModel

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    id: Int?,
    detailViewModel: DetailViewModel,
    onBackPressed: () -> Unit,
) {
    LaunchedEffect(Unit) {
        detailViewModel.onEvent(DetailUiEvent.Init(id))
    }

    LaunchedEffect(Unit) {
        detailViewModel.backPressed.collect {
            onBackPressed()
        }
    }

    DetailContent(
        uiState = detailViewModel.uiState,
        onEvent = detailViewModel::onEvent,
        modifier = modifier,
    )
}
