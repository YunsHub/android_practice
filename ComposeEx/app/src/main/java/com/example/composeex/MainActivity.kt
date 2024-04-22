package com.example.composeex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeex.ui.theme.ComposeExTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MyMarqueeTextEx()
                }
            }
        }
    }
}

@Composable
fun MyTextEx() {
    // text
    // fontSize
    // fontStyle
    // fontWeight
    // color
    // modifier(padding)
    // background
    // shadow

    val offset = Offset(5.0f, 10.0f)
    Text(
        text = "안녕하세요 텍스트 예제입니다.",
        fontSize = 40.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier.padding(40.dp),
        style = TextStyle(shadow = Shadow(color = Color.Blue, offset = offset, blurRadius = 3f))
    )
}

@Composable
fun MyMultipleTextEx() {
    // AnnotatedString
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.Blue, fontSize = 40.sp)) {
                append("안")
            }
            append("녕하세요 ")

            withStyle(style = SpanStyle(Color.LightGray, fontSize = 40.sp)) {
                append("텍스트 ")
            }
            append("예제입니다.")
        }

    )
}

@Composable
fun MyBrushTextEx() {
    // linearGradient
    val gradientColors = listOf(Color.Cyan, Color.LightGray, Color.Magenta)

    Text(
        text = "안녕하세요 텍스트 예제입니다.",
        fontSize = 40.sp,
        style = TextStyle(
            brush = Brush.linearGradient(colors = gradientColors)
        )
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyMarqueeTextEx() {
    Column(Modifier.width(400.dp)) {
        Text(
            text = "안녕하세요 텍스트 예제입니다.",
            modifier = Modifier.basicMarquee(),
            fontSize = 50.sp,
        )
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeExTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            MyMarqueeTextEx()
        }
    }
}