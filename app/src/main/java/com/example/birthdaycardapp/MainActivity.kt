package com.example.birthdaycardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.birthdaycardapp.screens.Home
import com.example.birthdaycardapp.screens.SplashScreen
import com.example.birthdaycardapp.ui.theme.BirthdayCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardAppTheme(isSystemInDarkTheme()) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PhoneScreen()
                }
            }
        }
    }
}

@Composable
fun PhoneScreen(){
    val navController = rememberNavController()

    NavHost(navController = navController,
    startDestination = NavRoutes.SplashScreen.route){
        composable(NavRoutes.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(NavRoutes.Home.route){
            Home(navController = navController)
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayCardAppTheme {
        PhoneScreen()
    }
}