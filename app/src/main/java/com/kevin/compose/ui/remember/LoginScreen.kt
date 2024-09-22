package com.kevin.compose.ui.remember

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.compose.ui.theme.KevincomposeTheme

data class User(var name: String, var age: Int)

@SuppressLint("UnrememberedMutableState")
@Composable
fun LoginScreen() {
//    var value = ""
//    var value by mutableStateOf("")
//    var value = remember { mutableStateOf("") }
    //delegate property
    var value by remember {
        mutableStateOf("")
    }
//    var value by rememberSaveable {
//        mutableStateOf("")
//    }

//    var user by remember { mutableStateOf(User("Kevin", 18)) }
//    var user by rememberSaveable { mutableStateOf(User("Kevin", 18)) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Log.e("KevinCompose", "Login screen start")
//        if (value.isEmpty()) {
//
//        }
        Title()
        //Stateless
        OutlinedTextField(value = value, onValueChange = { value     = it })

        Log.e("KevinCompose", "Login screen end")
    }
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    Log.e("KevinCompose", "Title start")
    Text(text = "LOGIN SCREEN")
    Log.e("KevinCompose", "Title end")
//    DisposableEffect(Unit) {
//        onDispose { Log.e("KevinCompose", "Title disposed") }
//    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    KevincomposeTheme {
        LoginScreen()
    }
}