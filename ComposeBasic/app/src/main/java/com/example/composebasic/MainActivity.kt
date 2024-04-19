package com.example.composebasic

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composebasic.ui.theme.ComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {

                var clickCount: MutableState<Int> = remember { mutableStateOf(0) }

                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android", clickCount.value, onClicked = {
                        Log.d("TAG", "onCreate: 클릭")
                        clickCount.value += 1
                    })
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, clickCount: Int, onClicked: () -> Unit) {
    Column {
        Text(text = "Hello $name!")
        Text(text = "클릭된 카운트 : $clickCount")
        Button(onClicked) {
            Text(text = "클릭해주세요.")
        }
    }

}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ComposeBasicTheme {
//        Greeting("Android")
//    }
//}