package com.adedom.mycompose.presentation.sdui.viewmodel

import androidx.lifecycle.viewModelScope
import com.adedom.mycompose.base.BaseViewModel
import com.adedom.mycompose.data.models.sdui.ActionData
import com.adedom.mycompose.domain.usecases.champ.GetChampHomeUseCase
import com.adedom.mycompose.presentation.sdui.event.SduiUiEvent
import com.adedom.mycompose.presentation.sdui.state.SduiUiState
import com.adedom.mycompose.utils.AppNavigation
import kotlinx.coroutines.launch

class SduiViewModel(
    private val getChampHomeUseCase: GetChampHomeUseCase,
    private val appNavigation: AppNavigation,
) : BaseViewModel<SduiUiEvent, SduiUiState>(SduiUiState()) {

    override fun onEvent(event: SduiUiEvent) {
        when (event) {
            SduiUiEvent.Initial -> {
                viewModelScope.launch {
                    try {
                        emit {
                            copy(isLoading = true)
                        }
                        val result = getChampHomeUseCase.execute()
                        emit {
                            copy(
                                isLoading = false,
                                data = result,
                            )
                        }
                    } catch (e: Throwable) {
                        emit {
                            copy(isLoading = false)
                        }
                    }
                }
            }

            is SduiUiEvent.OnClick -> {
                when (event.action) {
                    is ActionData.Open -> {
                        appNavigation.openWebOrDeeplink(event.action.url)
                    }

                    ActionData.Unknown, null -> {}
                }
            }
        }
    }
}
