package com.example.composeex

import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.AsyncImage
import com.example.composeex.ui.theme.ComposeExTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExTheme {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeExTheme {
        
    }
}

@Composable
fun MySurfaceEx1() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        color = Color.Green,
        shape = RoundedCornerShape(20.dp)
    ) {
        Button(
            onClick = {  },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Red
            )
            ) {
            Text(
                text = "클릭"
            )
        }
    }
}

@Composable
fun MySurfaceEx2() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.LightGray,
        border = BorderStroke(4.dp, Color.Blue),
        contentColor = Color.Red
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                modifier = Modifier
                    .size(300.dp),
                color = Color.Green
            ) {
                Text(text = "Android Compose")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Android Compose Ex", fontSize = 20.sp)
        }

    }
}


@Composable
fun MyWebViewEx() {
    AndroidView(factory = {
        WebView(it).apply {
            loadUrl("https://www.naver.com")
        }
    })
}

@Composable
fun MyCardEx2() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(50.dp),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "1",
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun MyCardEx() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp)
        .background(color = Color.Black)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(8.dp)
                .background(color = Color.LightGray),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "image",
            )


            Text(
                text = "Android Development",
                fontSize = 20.sp,
                style = TextStyle(fontWeight = FontWeight.Bold)
            )
            Text(
                text = "Compose"
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "이메일",
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    modifier = Modifier.padding(start = 20.dp),
                    text = "wkdrns3918@gmail.com"
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "연락처",
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    modifier = Modifier.padding(start = 20.dp),
                    text = "010-1234-5678"
                )
            }

        }
    }

}

@Composable
fun MyRowEx1() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Item1",
            style = TextStyle(background = Color.Red)
        )
        Text(
            text = "Item2",
            style = TextStyle(background = Color.Green)
        )
        Text(
            text = "Item3",
            style = TextStyle(background = Color.Blue)
        )
    }
}

@Composable
fun MyBoxEx1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Yellow)
    ) {
        Text(
            text = "빨간색",
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Red)
                .padding(16.dp)
                .align(Alignment.TopStart)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Blue)
                .align(Alignment.TopCenter),
        ) {
            Text(text = "파란색")
        }

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Green)
                .padding(16.dp)
                .align(Alignment.TopEnd)
        ) {
            Text(text = "연두색")
        }
    }
}

@Composable
fun MyImageEx1() {
    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = "background"
    )
}

@Composable
fun MyImageEx2() {
    AsyncImage(
        model = "https://cdn-icons-png.flaticon.com/512/7591/7591133.png",
        contentDescription = "아기 상어")
}

@Composable
fun MyTextFieldEx3() {
    var textState by remember { mutableStateOf("Android") }
    var resultText by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = textState,
            onValueChange = {
                textState = it
            },
            label = {
                Text(text = "입력하세요.")
            },

            )

        Button(onClick = {
            resultText = textState
        }) {
            Text(text = "입력")
        }


        Text(text = "결과값 : $resultText")
    }
}

@Composable
fun MyTextFieldEx2() {
    var textState by remember { mutableStateOf("Android") }

    OutlinedTextField(
        value = textState,
        onValueChange = {
            textState = it
        },
        label = {
            Text(text = "입력하세요.")
        },
        modifier = Modifier.padding(20.dp)
    )
}

@Composable
fun MyTextFieldEx1() {
    var textState by remember { mutableStateOf("Android") }

    TextField(
        value = textState,
        onValueChange = {
            textState = it
        },
        label = {
            Text(text = "입력하세요.")
        }
    )
}

@Composable
fun MyRememberEx1() {
    val count = remember { mutableStateOf(0) }

    Button(onClick = {
        count.value += 1
    },
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "${count.value}회 클릭되었습니다.",
            fontSize = 40.sp)
    }
}

@Composable
fun MyColumnEx2() {
    Column(
        modifier = Modifier.padding(20.dp)
    ) {
        Text(
            text = "Android",
            fontSize = 30.sp
        )
        Divider(
            thickness = 4.dp,
            color = Color.Yellow
        )
        Spacer(modifier = Modifier.padding(20.dp))
        Text(
            text = "Jetpack",
            fontSize = 30.sp,
        )
        Text(
            text = "Compose",
            fontSize = 30.sp,
        )
    }
}

@Composable
fun MyColumnEx1() {
    Text(
        text = "Android",
        fontSize = 30.sp
    )
    Text(text = "Jetpack",
        fontSize = 30.sp,
        modifier = Modifier.padding(top = 50.dp)
    )
    Text(text = "Compose",
        fontSize = 30.sp,
        modifier = Modifier.padding(top = 100.dp)
    )
}

@Composable
fun MyButtonEx1() {
    val context = LocalContext.current

    Button(onClick = {
        Toast.makeText(context, "클릭", Toast.LENGTH_LONG).show()
    },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Yellow,
            contentColor = Color.Blue
        ),
        modifier = Modifier
            .width(120.dp)
            .height(100.dp)
    )
    {
        Text("버튼입니다. ")
    }
}

@Composable
fun MyTextAlignEx2() {
    Text(
        text = "Hello World, ComposeHello World, ComposeHello World, ComposeHello World, ComposeHello World, ComposeHello World, Compose",
        style = LocalTextStyle.current.merge(
            TextStyle(
                lineHeight = 2.5.em
            )
        )
    )
}

@Composable
fun MyTextAlignEx1() {
    Text(
        text = "Hello World, Compose",
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.width(100.dp)
    )
}

@Composable
fun MyTextEx1() {
    Text(
        text = "안녕하세요 텍스트 예제입니다.",
        fontSize = 40.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier.padding(40.dp),
        style = TextStyle(background = Color.White)
    )
}

@Composable
fun MyScaffoldEx() {
    Scaffold(
        topBar = {
            MyTopBarEx()
        },
        floatingActionButton = {
            MyFloatingActionButtonEx()
        },
        bottomBar = {
            MyBottomBarEx()
        }
    ) { paddingValues ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Text(text = "Android Compose")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBarEx() {
    TopAppBar(
        title = {
            Text(text = "Main")
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Add, contentDescription = "add")
            }
        },
        actions = {
            Button(onClick = { }) {
                Text(text = "Btn")
            }
        },
        colors = topAppBarColors(
            Color.Red
        )
    )
}

@Composable
fun MyFloatingActionButtonEx() {
    FloatingActionButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Menu, contentDescription = "menu")
    }
}

@Composable
fun MyBottomBarEx() {
    BottomAppBar(
        containerColor = Color.Red,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Icon(Icons.Default.Home, contentDescription = "Home")
            Icon(Icons.Default.Favorite, contentDescription = "Favorite")
            Icon(Icons.Default.Settings, contentDescription = "Settings")
        }
    }
}

