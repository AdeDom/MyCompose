package com.adedom.mycompose.presentation.home.viewmodel

import androidx.lifecycle.viewModelScope
import com.adedom.mycompose.base.BaseViewModel
import com.adedom.mycompose.data.repositories.drama.DramaRepository
import com.adedom.mycompose.domain.models.DramaModel
import io.ktor.utils.io.errors.IOException
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

sealed interface HomeUiEvent {
    data object Init : HomeUiEvent
    data class OnCardClick(
        val id: Int?,
    ) : HomeUiEvent
}

data class HomeUiState(
    val isLoading: Boolean = false,
    val dramas: List<DramaModel> = emptyList(),
    val error: Throwable? = null,
)

class HomeViewModel(
    private val dramaRepository: DramaRepository,
) : BaseViewModel<HomeUiEvent, HomeUiState>(HomeUiState()) {
    private val _dramaId = Channel<Int>()
    val dramaId: Flow<Int> = _dramaId.receiveAsFlow()

    override fun onEvent(event: HomeUiEvent) {
        when (event) {
            HomeUiEvent.Init -> {
                viewModelScope.launch {
                    try {
                        emit { copy(isLoading = true) }
                        val result = dramaRepository.fetchDramas()
                        emit {
                            copy(
                                isLoading = false,
                                dramas = result,
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

            is HomeUiEvent.OnCardClick -> {
                if (event.id == null) {
                    return
                }

                viewModelScope.launch {
                    _dramaId.send(event.id)
                }
            }
        }
    }
}
