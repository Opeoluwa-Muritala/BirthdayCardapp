package com.example.birthdaycardapp

sealed class NavRoutes(val route: String){
    object SplashScreen : NavRoutes("Splash")
    object Home: NavRoutes("home")
}
