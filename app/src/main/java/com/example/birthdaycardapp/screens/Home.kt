package com.example.birthdaycardapp.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Home(navController: NavHostController){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = Color.Blue,
            contentColor = Color.White,
            title = { Text("Design Your Birthday Card")},

        )
                 },
        content = {BirthdayCard()}
    )
}

@Composable
fun BirthdayCard(){

    Column(verticalArrangement = Arrangement.SpaceBetween)
    {
        Background()
        Text()
    }

}

@Composable
fun Background() {
    val context = LocalContext.current

    Card(modifier = Modifier.fillMaxSize(),
    shape = RoundedCornerShape(10.dp),
    backgroundColor = MaterialTheme.colors.onPrimary,){

        Button(onClick = { Toast.makeText(context,
            "It Works",
            Toast.LENGTH_LONG).show()
                         },
            colors = buttonColors(backgroundColor = Color.White,
                contentColor = Color.Green),
            content = {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Select An Image",
                       fontSize= 35.sp,)
                }
            },

        )

        Row (
            verticalAlignment = Alignment.Bottom){

            var text by rememberSaveable{mutableStateOf("")}

            TextField(
                modifier = Modifier
                    .padding(0.dp,0.dp)
                    .size(500.dp,50.dp),

                value = text,
                onValueChange = {text = it},
                label = {
                    Text(text = "Birthday Greeting",)
                },
            )
        }
    }
}


@Composable
fun Text(){





    }
