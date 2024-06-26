package com.example.composebasic

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.composebasic.ui.theme.ComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                var clickCount: MutableState<Int> = remember { mutableStateOf(0) }
                var messageList: SnapshotStateList<Message> =
                    remember { mutableStateListOf<Message>() }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {


                    Column {
                        Greeting("Android", clickCount.value, onClicked = {
                            Log.d("TAG", "onCreate: 클릭")
                            clickCount.value += 1

                            val newMsg = Message(clickCount.value, "메세지 입니다. ${clickCount.value}")
                            messageList.add(newMsg)
                        })

                        MessageList(messageList, onDeleteClicked = {
                            messageList.remove(it)
                        })
                    }


                }
            }
        }
    }
}

@Composable
fun MessageList(messages: List<Message>, onDeleteClicked: (Message) -> Unit) {
    LazyColumn {
        items(messages) { message ->
            MessageRow(message, onDeleteClicked)
        }
    }
}

@Composable
fun MessageRow(msg: Message, onDeleteClicked: (Message) -> Unit) {
    Surface (
        modifier = Modifier.padding(16.dp).fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        shadowElevation = 10.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "id : ${msg.id} / content : ${msg.content}")
            Button(onClick = { onDeleteClicked(msg) }) {
                Text(text = "삭제")
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