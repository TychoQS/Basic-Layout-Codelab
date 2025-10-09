package com.example.cuadrante

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
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
fun View() {
    Column(modifier = Modifier.fillMaxWidth().fillMaxSize().fillMaxHeight()) {
        Row(Modifier.weight(1f)) {
            Quadrant("Text composable", "Displays text and follows the recommended Material Design guidelines.", Color(0xFFEADDFF), Modifier.weight(1f))
            Quadrant("Image composable", "Creates a composable that lays out and draws a given Painter class object.", Color(0xFFD0BCFF), Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)) {
            Quadrant("Row composable", "A layout composable that places its children in a horizontal sequence.", Color(0xFFB69DF8), Modifier.weight(1f))
            Quadrant("Column composable", "A layout composable that places its children in a vertical sequence.", Color(0xFFF6EDFF), Modifier.weight(1f))
        }
    }
}

@Composable
fun Quadrant(message: String, message2: String, background: Color, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().background(background).padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            message,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            message2,
            textAlign = TextAlign.Justify,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun MainPreview() {
    HappyBirthdayTheme {
        View()
    }
}