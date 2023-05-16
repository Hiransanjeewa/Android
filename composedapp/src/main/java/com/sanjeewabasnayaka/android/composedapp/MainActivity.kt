package com.sanjeewabasnayaka.android.composedapp

import android.content.res.Resources.Theme
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.sanjeewabasnayaka.android.composedapp.services.Calculate
import com.sanjeewabasnayaka.android.composedapp.services.HellomessageService
import com.sanjeewabasnayaka.android.composedapp.ui.theme.Android1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android1Theme {
                // A surface container using the 'background' color from the theme
                  Twogreetings()

            }
        }
    }
}

// **********    Addition of two numbers    **************

//@Composable
//fun Twogreetings(){
//    Surface(
//        modifier = Modifier.fillMaxSize(),
//        color = MaterialTheme.colors.background
//    ) {
//        Column{
//           // Greeting("Hello Hiran")
//           // Greeting("Hello Android")
//            var text1 by remember { mutableStateOf(TextFieldValue("0", TextRange(0,7))) }
//            var text2 by remember { mutableStateOf(TextFieldValue("0", TextRange(0,7))) }
//            var total by remember {
//                mutableStateOf(0)
//            }
//            val calculate = Calculate();
//
//            TextField(
//                value = text1, onValueChange = { text1 = it },
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//                label = {Text("number 1")}
//            )
//            TextField(
//                value = text2, onValueChange = { text2 = it },
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//                label = {Text("number 2")}
//            )
//
//            Button(onClick = {
//                total=calculate.add(text1.text.toInt(),text2.text.toInt())
//            Log.d("total","Total is "+total)
//            }
//            ) {
//                 Text(text = "Click here")
//            }
//            Text(text = "Total is : "+ total)
//        }
//    }
//}

@Composable
fun Twogreetings(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column{
            // Greeting("Hello Hiran")
            // Greeting("Hello Android")
            var name by remember { mutableStateOf(TextFieldValue(" ", TextRange(0,7))) }
            var age by remember { mutableStateOf(TextFieldValue(" ", TextRange(0,7))) }


            var message by remember {
               mutableStateOf(" ")
         }

            val helloMessageService=HellomessageService()
            TextField(
                value = name, onValueChange = { name = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                label = {Text("Name")}
            )
            TextField(
                value = age, onValueChange = { age = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                label = {Text("Age")}
            )
            Text(text = message)
            Button(onClick = {
                message=helloMessageService.showMessage(name.text,age.text)
                Log.d("Hello Message",message)
            }
            ) {
                Text(text = "Click here")
            }

        }
    }
}






@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android1Theme {
        Twogreetings()
    }
}
@Preview(showBackground = false)
@Composable
fun DefaultPreviewDark() {
    Android1Theme {
        Twogreetings()
    }
}