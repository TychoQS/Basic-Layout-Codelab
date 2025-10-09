package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
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
                    ) {}
            }
        }
    }
}



@Composable
fun SetTextUnderPicture(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            name,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            title,
            fontSize = 8.sp,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun LoadImage() {
    val image = painterResource(R.drawable.android_logo)
    Image(
        painter = image,
        contentDescription = null,
        alpha = 0.5F
    )
}

@Composable
fun SetList() {
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start) {
        Row() {
            Icon(Icons.Rounded.Phone, contentDescription = "PhoneIcon")
            Text("+00 00 0000",textAlign = TextAlign.Center)
        }
        Row(modifier = Modifier.padding(top = 10.dp)) {
            Icon(Icons.Rounded.Share, contentDescription = "ShareIcon")
            Text("@socialmedialink",textAlign = TextAlign.Center)
        }
        Row(modifier = Modifier.padding(top = 10.dp)) {
            Icon(Icons.Rounded.Email, contentDescription = "EmailIcon")
            Text("mail@mail.com",textAlign = TextAlign.Center)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        Column(Modifier.fillMaxSize().background(Color(0x2B0033FF)),
            horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(top = 60.dp)) {
                LoadImage()
                SetTextUnderPicture("Jennifer Doe", "Android Developer Extraordinaire")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(top = 60.dp, bottom = 10.dp)) {
                SetList()
            }
        }
    }
}