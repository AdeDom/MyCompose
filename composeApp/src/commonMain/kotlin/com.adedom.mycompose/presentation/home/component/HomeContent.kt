package com.adedom.mycompose.presentation.home.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.adedom.mycompose.presentation.home.viewmodel.HomeUiEvent
import com.adedom.mycompose.presentation.home.viewmodel.HomeUiState
import com.adedom.mycompose.ui.components.DramaCardComponent
import com.adedom.mycompose.ui.theme.MyComposeTheme
import compose.foundation.layout.Box
import compose.foundation.layout.BoxScopeInstance.align
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    uiState: HomeUiState,
    onEvent: (HomeUiEvent) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Compose")
                },
            )
        },
        modifier = modifier,
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.padding(it),
        ) {
            items(uiState.dramas) { drama ->
                DramaCardComponent(
                    dramaModel = drama,
                    modifier = Modifier.clickable {
                        onEvent(HomeUiEvent.OnCardClick(drama.id))
                    },
                )
            }
        }
    }

    if (uiState.isLoading) {
        Box(modifier = Modifier.fillMaxSize()) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Preview
@Composable
fun HomeContentPreview() {
    MyComposeTheme {
        HomeContent(
            uiState = HomeUiState(),
            onEvent = {},
        )
    }
}
