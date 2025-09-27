package com.example.loginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginapp.Screens.LoginScreen
import com.example.loginapp.Screens.LoginScreenRoute
import com.example.loginapp.Screens.SignupScreen
import com.example.loginapp.Screens.SignupScreenRoute
import com.example.loginapp.ui.theme.LoginAppTheme
import com.example.loginapp.ui.theme.black

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ){
                    val navController = rememberNavController()
                    Scaffold(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(black),
                        containerColor = black,
                        bottomBar = {

                        }
                    ) { innerPadding ->
                        NavHost(
                            navController = navController,
                            startDestination = LoginScreenRoute
                        ){
                            composable<LoginScreenRoute> {
                                LoginScreen(
                                    navController = navController,
                                    innerPadding = innerPadding
                                )
                            }

                            composable<SignupScreenRoute>{
                                SignupScreen(
                                    navController = navController,
                                    innerPadding = innerPadding
                                )
                            }
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginScreen(
        navController = rememberNavController(),
        innerPadding = PaddingValues(0.dp)
    )
}