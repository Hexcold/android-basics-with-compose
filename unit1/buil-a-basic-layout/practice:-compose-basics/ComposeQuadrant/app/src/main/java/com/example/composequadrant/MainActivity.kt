package com.example.composequadrant

import android.os.Bundle
import android.text.TextWatcher
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(

                ) {
                    GreetingQuadrat(
                        title1 = stringResource(R.string.title1),
                        message1 = stringResource(R.string.message1),
                        title2 = stringResource(R.string.title2),
                        message2 = stringResource(R.string.message2),
                        title3 = stringResource(R.string.title3),
                        message3 = stringResource(R.string.message3),
                        title4 = stringResource(R.string.title4),
                        message4 = stringResource(R.string.message4)
                    )
                }
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

@Composable
fun GreetingText(title: String, message: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = message
        )
    }
}

@Composable
fun GreetingQuadrat(title1: String, message1: String, title2: String, message2: String, title3: String, message3: String, title4: String, message4: String , modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)

        ) {
            GreetingText(
                title = title1,
                message = message1,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)

            )
            GreetingText(
                title = title2,
                message = message2,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            GreetingText(
                title = title1,
                message = message1,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
            )
            GreetingText(
                title = title4,
                message = message4,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        GreetingQuadrat(
            title1 = stringResource(R.string.title1),
            message1 = stringResource(R.string.message1),
            title2 = stringResource(R.string.title2),
            message2 = stringResource(R.string.message2),
            title3 = stringResource(R.string.title3),
            message3 = stringResource(R.string.message3),
            title4 = stringResource(R.string.title4),
            message4 = stringResource(R.string.message4)
        )
    }
}