package com.kevin.compose.ui.remember

import android.icu.text.CaseMap.Title
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.compose.ui.theme.KevincomposeTheme

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Log.e("KevinCompose", "Login screen start")
        Title()
        //Stateless
        OutlinedTextField(value = "", onValueChange = {})

        Log.e("KevinCompose", "Login screen end")
    }
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    Log.e("KevinCompose", "Title start")
    Text(text = "LOGIN SCREEN")
    Log.e("KevinCompose", "Title end")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    KevincomposeTheme {
        LoginScreen()
    }
}