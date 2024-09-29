package com.kevin.compose.ui.collectflow

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun CollectFlow(
    viewModel: CollectFlowViewModel = hiltViewModel()
) {
//    https://medium.com/androiddevelopers/consuming-flows-safely-in-jetpack-compose-cde014d0d5a3

//    https://www.youtube.com/watch?v=fSB6_KE95bU&t=1009s
//    https://developer.android.com/develop/ui/compose/state

    val time by viewModel.timer.collectAsState()
//    val time by viewModel.timer.collectAsStateWithLifecycle()

//    val counter by viewModel.counter.collectAsState()
//    val uiState by viewModel.uiStateFlow.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Time: $time")
//        Text(text = "Counter: $uiState")

    }
}