package com.example.mymusic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mymusic.ui.theme.MyMusicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMusicTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    GreetingBackground("Hello!\nWelcome to MyMusic!")
                }
            }
        }
    }
}

@Composable
fun GreetingBackground(message: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bec5e3f0_37cb_4420_afe9_fef27bde1148_upscaled)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.9F
        )
        GreetingText (
            message = message,
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)
        )
    }
}

@Composable
fun GreetingText(message: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bec5e3f0_37cb_4420_afe9_fef27bde1148_upscaled)

    Column {
        var verticalArrangement = Arrangement.Center
        Text(
            text = "Hello $message!\nWelcome to MyMusic!",
            fontSize = 20.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(20.dp)

        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyMusicTheme {
        GreetingBackground("Hello!\nWelcome to MyMusic!")
    }
}