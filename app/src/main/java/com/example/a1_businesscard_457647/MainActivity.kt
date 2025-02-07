package com.example.a1_businesscard_457647

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
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
import com.example.a1_businesscard_457647.ui.theme.A1_BusinessCard_457647Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            A1_BusinessCard_457647Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        name = "Yosita Jasamut",
                        position = "Student of Software Development",
                        call="+1 000 000 000",
                        share="@Yosipat",
                        email="y.jasamut647@mybvc.ca",
                        modifier = Modifier.padding(innerPadding).background(color = Color.LightGray)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, position: String, call: String, share: String, email: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Column {
            Column(modifier=Modifier.padding(horizontal = 120.dp, vertical = 10.dp)) {
                Image(
                    painter=painterResource(R.drawable.android_logo),
                    contentDescription=null,
                    modifier = Modifier.background(color = Color(0xFF2f4f4f))
                )
            }
            Text(
                text = name,
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                modifier = Modifier.fillMaxWidth().padding(5.dp)
            )
            Text(
                text = position,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2f4f4f),
                modifier = Modifier.fillMaxWidth().padding(5.dp)
            )
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.fillMaxSize().padding(bottom = 60.dp)
    ) {
        Column  {
            Row(modifier = Modifier.padding(vertical = 5.dp)) {
                Icon(Icons.Rounded.Call, contentDescription = null, tint = Color(0xFF2f4f4f))
                Text(
                    text = call,
                    modifier = Modifier.padding(horizontal = 10.dp)
                )
            }
            Row(modifier = Modifier.padding(vertical = 5.dp)) {
                Icon(Icons.Rounded.Share, contentDescription = null, tint = Color(0xFF2f4f4f))
                Text(
                    text = share,
                    modifier = Modifier.padding(horizontal = 10.dp)
                )
            }
            Row(modifier = Modifier.padding(vertical = 5.dp)) {
                Icon(Icons.Rounded.Email, contentDescription = null, tint = Color(0xFF2f4f4f))
                Text(
                    text = email,
                    modifier = Modifier.padding(horizontal = 10.dp)
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    A1_BusinessCard_457647Theme {
        BusinessCard("Yosita Jasamut","Student of Software Development","+1 000 000 000","@Yosipat","y.jasamut647@mybvc.ca")
    }
}