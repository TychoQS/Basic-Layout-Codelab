package com.example.administrator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.R
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                }
            }
        }
    }
}




@Composable
fun SetBackgroundImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            alpha = 0.5F
        )
    }
}

@Composable
fun LoadText(message: String, message2: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            message,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            message2,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth()
        )
    }
}


@Preview(showBackground = true)
@Composable
fun MainPreview() {
    HappyBirthdayTheme {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()) {
            SetBackgroundImage()
            LoadText("All task completed", "Nice work!")
        }

    }
}