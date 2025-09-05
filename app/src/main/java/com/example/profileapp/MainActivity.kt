package com.example.profileapp

import android.R.attr.end
import android.R.attr.name
import android.R.attr.text
import android.R.attr.top
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileapp.ui.theme.ProfileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileAppTheme {

            }
        }
    }
}

@Composable
fun ProfileApp(name: String, title: String, contact: String, socialMedia: String, email: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Box(
        contentAlignment = Alignment.Center
    ){
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = modifier
            .padding(top = 50.dp,start = 50.dp,end = 50.dp,bottom = 80.dp)
    )
        Text(
            text = name,
            textAlign = TextAlign.Center,
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 100.dp)
            )
        Text(
            text = title,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 150.dp)
        )
    }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(top = 80.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Call,
                contentDescription = "Contact Icon",
                modifier = Modifier

            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = contact,
                modifier = Modifier

            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
            ) {
            Icon(
                imageVector = Icons.Filled.AddCircle,
                contentDescription = "Contact Icon",
                modifier = Modifier
                    .padding(start = 30.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = socialMedia,
                modifier = Modifier
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Filled.MailOutline,
                contentDescription = "Contact Icon",
                modifier = Modifier
                    .padding()

            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = email,
                modifier = Modifier
                    .padding(end = 16.dp)

            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfileAppTheme {
        ProfileApp(
            name = "Siddharth",
            title = "Developer",
            contact = "contact",
            socialMedia = "socialmedia",
            email = "email"
        )
    }
}