package com.kevin.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.kevin.compose.ui.collectflow.CollectFlow
import com.kevin.compose.ui.remember.LoginScreen
import com.kevin.compose.ui.sideeffects.DisposableEffectForLifeCycle
import com.kevin.compose.ui.theme.KevincomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KevincomposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    //Remember
//                    LoginScreen()
//                    DisposableEffectForLifeCycle()
                    CollectFlow()
                }
            }
        }
    }
}