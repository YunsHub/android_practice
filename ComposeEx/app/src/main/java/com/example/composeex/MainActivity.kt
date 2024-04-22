package com.example.composeex

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeex.ui.theme.ComposeExTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyButtonEx("Android")
                }
            }
        }
    }
}

@Composable
fun MyButtonEx(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(context, "클릭", Toast.LENGTH_LONG).show()
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Yellow,
            contentColor = Color.Blue
        ),
        modifier = Modifier.width(120.dp).height(100.dp)
    )
    {
        Text("버튼입니다. ")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeExTheme {
        MyButtonEx("Android")
    }
}