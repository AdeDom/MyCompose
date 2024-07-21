package com.adedom.mycompose.presentation.detail.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.adedom.mycompose.presentation.detail.viewmodel.DetailUiEvent
import com.adedom.mycompose.presentation.detail.viewmodel.DetailUiState
import com.adedom.mycompose.ui.components.DramaCardComponent
import com.adedom.mycompose.ui.theme.MyComposeTheme
import compose.foundation.layout.Box
import compose.foundation.layout.BoxScopeInstance.align
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailContent(
    modifier: Modifier = Modifier,
    uiState: DetailUiState,
    onEvent: (DetailUiEvent) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(
                        onClick = {
                            onEvent(DetailUiEvent.OnBackClick)
                        },
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBackIosNew,
                            contentDescription = null,
                        )
                    }
                },
                title = {
                    Text("Compose")
                },
            )
        },
        modifier = modifier,
    ) {
        DramaCardComponent(
            dramaModel = uiState.drama ?: return@Scaffold,
            modifier = Modifier
                .padding(it)
                .padding(
                    horizontal = 8.dp,
                    vertical = 16.dp,
                ),
        )
    }

    if (uiState.isLoading) {
        Box(modifier = Modifier.fillMaxSize()) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Preview
@Composable
fun DetailContentPreview() {
    MyComposeTheme {
        DetailContent(
            uiState = DetailUiState(),
            onEvent = {},
        )
    }
}
