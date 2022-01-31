package com.example.tjfeedgifv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tjfeedgifv.ui.theme.TJFeedGifvTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TJFeedGifvTheme {
                // A surface container using the 'background' color from the theme
//                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                    AnotherText()
//                }
                Column() {
                    Greeting("Android")
                    AnotherText()
                    Button(onClick = { /*TODO*/ }) {
                    }
//                    Tab(selected = , onClick = { /*TODO*/ })
                }
            }
        }
    }
}

@Composable
fun AnotherText() {
    Text(text = "Another Text")
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TJFeedGifvTheme {
        Greeting("Android")
    }
}