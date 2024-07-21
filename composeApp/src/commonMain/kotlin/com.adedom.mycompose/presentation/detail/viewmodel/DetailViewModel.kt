package com.adedom.mycompose.presentation.detail.viewmodel

import androidx.lifecycle.viewModelScope
import com.adedom.mycompose.base.BaseViewModel
import com.adedom.mycompose.domain.models.DramaModel
import com.adedom.mycompose.domain.usecases.drama.GetDramaByIdUseCase
import io.ktor.utils.io.errors.IOException
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

sealed interface DetailUiEvent {
    data class Init(
        val id: Int?,
    ) : DetailUiEvent

    data object OnBackClick : DetailUiEvent
}

data class DetailUiState(
    val isLoading: Boolean = false,
    val drama: DramaModel? = null,
    val error: Throwable? = null,
)

class DetailViewModel(
    private val getDramaByIdUseCase: GetDramaByIdUseCase,
) : BaseViewModel<DetailUiEvent, DetailUiState>(DetailUiState()) {
    private val _backPressed = Channel<Unit>()
    val backPressed: Flow<Unit> = _backPressed.receiveAsFlow()

    override fun onEvent(event: DetailUiEvent) {
        when (event) {
            is DetailUiEvent.Init -> {
                viewModelScope.launch {
                    try {
                        emit { copy(isLoading = true) }
                        val result = getDramaByIdUseCase.execute(event.id)
                        emit {
                            copy(
                                isLoading = false,
                                drama = result,
                            )
                        }
                    } catch (e: IOException) {
                        emit {
                            copy(
                                isLoading = false,
                                error = e,
                            )
                        }
                    } catch (e: Throwable) {
                        emit {
                            copy(
                                isLoading = false,
                                error = e,
                            )
                        }
                    }
                }
            }

            DetailUiEvent.OnBackClick -> {
                viewModelScope.launch {
                    _backPressed.send(Unit)
                }
            }
        }
    }
}
