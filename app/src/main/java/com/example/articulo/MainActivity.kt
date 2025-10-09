package com.example.articulo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
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
    val image = painterResource(R.drawable.bg_compose_background)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            alpha = 0.5F
        )
    }
}

@Composable
fun LoadText(message: String, fontSize: TextUnit, padding: Dp, modifier: Modifier = Modifier) {
    Text(
        message,
        textAlign = TextAlign.Justify,
        fontSize = fontSize,
        modifier = modifier.padding(padding)
    )
}


@Preview(showBackground = true)
@Composable
fun MainPreview() {
    HappyBirthdayTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            SetBackgroundImage()
            LoadText(stringResource(R.string.jetpack_compose_tutorial_title), 24.sp, 16.dp)
            LoadText(stringResource(R.string.jetpack_compose_tutorial_subtitle), 17.sp, 16.dp)
            LoadText(stringResource(R.string.jetpack_compose_tutorial_text), 17.sp, 16.dp)
        }
    }
}