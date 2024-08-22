package com.example.gabyb5

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.gabyb5.ui.theme.Gabyb5Theme
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column {
                var GABYZINHA by rememberSaveable {
                    mutableStateOf("")
                }
                TextField(
                    modifier = Modifier.background(Color.Yellow),
                    value = GABYZINHA,
                    onValueChange = {
                        Log.d("GABYB4", it)
                        GABYZINHA = it
                    })

                var GABYZINHA2 by rememberSaveable {
                    mutableStateOf("")
                }
                TextField(
                    modifier = Modifier.background(Color.Yellow),
                    value = GABYZINHA2,
                    onValueChange = {
                        Log.d("GABYB5", it)
                        GABYZINHA2 = it
                    })

            }
        }
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
    Gabyb5Theme {
        Greeting("Android")
    }
}