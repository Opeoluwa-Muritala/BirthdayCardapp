package com.example.birthdaycardapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.birthdaycardapp.NavRoutes

@Composable
fun SplashScreen(navController: NavHostController){


    Button(
        onClick = {navController.navigate(NavRoutes.Home.route)},
        content = { Splash()},


    )

}

@Composable
fun Splash(){
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment= Alignment.Center,
            ){

            Icon(
                modifier = Modifier.size(200.dp),
                imageVector = Icons.Default.Star,
                contentDescription = "Star",
                tint = Color.White
            )

    }
}

