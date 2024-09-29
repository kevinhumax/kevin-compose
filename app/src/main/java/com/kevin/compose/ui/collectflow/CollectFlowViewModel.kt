package com.kevin.compose.ui.collectflow

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CollectFlowViewModel @Inject constructor() : ViewModel() {
//    private val _uiStateFlow = MutableStateFlow(0)
//    val uiStateFlow: StateFlow<Int> = _uiStateFlow

//    init {
//        viewModelScope.launch {
//            while (true) {
//                delay(1000)
//                Log.d("KevinCompose", "Flow is active")
//                _uiStateFlow.value += 1
//            }
//        }
//    }


    private var currentTime = 0
    val timer = flow {
        while (true) {
            delay(1000L)
            Log.d("KevinCompose", "Flow is active")
            emit(currentTime++)
        }
    }.stateIn(
        viewModelScope,
        SharingStarted.Lazily,
//        SharingStarted.WhileSubscribed(5000L),
        0
    )
}