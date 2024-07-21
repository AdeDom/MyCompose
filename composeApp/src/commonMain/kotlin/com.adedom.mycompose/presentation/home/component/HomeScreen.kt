package com.adedom.mycompose.presentation.home.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.adedom.mycompose.presentation.home.viewmodel.HomeUiEvent
import com.adedom.mycompose.presentation.home.viewmodel.HomeViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    homeViewModel: HomeViewModel,
    onCardClick: (Int) -> Unit,
) {
    LaunchedEffect(Unit) {
        homeViewModel.onEvent(HomeUiEvent.Init)
    }

    LaunchedEffect(Unit) {
        homeViewModel.dramaId.collect {
            onCardClick(it)
        }
    }

    HomeContent(
        uiState = homeViewModel.uiState,
        onEvent = homeViewModel::onEvent,
        modifier = modifier,
    )
}
