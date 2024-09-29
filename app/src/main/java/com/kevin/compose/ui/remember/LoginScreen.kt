package com.kevin.compose.ui.remember

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.derivedStateOf
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
    //No recomposition
    var value = ""

    //Recomposition but...
//    var value by mutableStateOf("")

//Using remember
//    var value = remember { mutableStateOf("") }

    //delegate property
//    var value by remember {
//        mutableStateOf("")
//    }


//    var value by rememberSaveable {
//        mutableStateOf("")
//    }

//    var user by remember { mutableStateOf(User("Kevin", 18)) }
//    var user by rememberSaveable { mutableStateOf(User("Kevin", 18)) }

    //Remember with param
    //Remember: Tính toán mỗi khi có recomposition, Derived State of: Tính toán mỗi khi state thay đổi

//    var lastName by remember {
//        mutableStateOf("")
//    }
//    val fullName = remember {
//        Log.e("KevinCompose", "Full name recomputed")
//        "Kevin $lastName"
//    }

//    val fullName by remember {
//        derivedStateOf {
//            Log.e("KevinCompose", "Full name recomputed")
//            "Kevin $lastName"
//        }
//    }
//




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
        OutlinedTextField(value = value, onValueChange = { value = it })

//        Spacer(modifier = Modifier.padding(8.dp))
//        Text(text = "Full name: $fullName")
//        OutlinedTextField(value = lastName, onValueChange = { lastName = it })


        Log.e("KevinCompose", "Login screen end")
    }
}

@Composable
fun Title(
    modifier: Modifier = Modifier,
//    text: String
) {
    //First time: State less
    //Second time: State full

    Log.e("KevinCompose", "Title start")
    Text(text = "LOGIN SCREEN")

//    Text(text = text)

    Log.e("KevinCompose", "Title end")
//    DisposableEffect(Unit) {
//        onDispose { Log.e("KevinCompose", "Title disposed") }
//    }

    //DisposableEffect with key

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    KevincomposeTheme {
        LoginScreen()
    }
}

//State hoisting
