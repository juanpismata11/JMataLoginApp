package com.example.loginapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil3.compose.AsyncImage
import com.example.loginapp.ui.theme.LoginAppTheme
import com.example.loginapp.ui.theme.offwhite


@Composable
fun SignupScreen(
    navController: NavController,
    innerPadding: PaddingValues
){
    var firstName by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var repeat by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .background(Color.Black)
    ){

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(start = 32.dp)
                    .fillMaxWidth()
            ) {
                IconButton(
                    onClick = { navController.popBackStack() }
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }

                Text(
                    text = "Sign Up",
                    color = Color.White,
                    fontSize = 32.sp,
                    modifier = Modifier.padding(start = 32.dp)
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 70.dp))

                .background(offwhite)
        ){
            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 28.dp),
                contentAlignment = Alignment.Center
            ){
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(16.dp)
                        )
                        .width(320.dp)
                ){
                    Text(
                        text = "First name",
                        modifier = Modifier
                            .padding(start = 15.dp, top = 8.dp)
                    )

                    TextField(
                        value = firstName,
                        onValueChange = { firstName = it },
                        placeholder = {
                            Text(
                                text = "vijay",
                                fontSize = 13.sp,
                                color = Color.Gray
                            )
                        },
                        singleLine = true,
                        modifier = Modifier
                            .height(52.dp),

                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent, // quita la línea de abajo
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        )
                    )
                }
            }
            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 28.dp),

                contentAlignment = Alignment.Center
            ){
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(16.dp)
                        )
                        .width(320.dp)
                ){
                    Text(
                        text = "Last Name",
                        modifier = Modifier
                            .padding(start = 15.dp, top = 8.dp)
                    )

                    TextField(
                        value = lastname,
                        onValueChange = { lastname = it },
                        placeholder = {
                            Text(
                                text = "buhva",
                                fontSize = 13.sp,
                                color = Color.Gray
                            )
                        },
                        singleLine = true,
                        modifier = Modifier
                            .height(52.dp),

                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent, // quita la línea de abajo
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        )
                    )
                }
            }
            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 28.dp),
                contentAlignment = Alignment.Center
            ){
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(16.dp)
                        )
                        .width(320.dp)
                ){
                    Text(
                        text = "Email",
                        modifier = Modifier
                            .padding(start = 15.dp, top = 8.dp)
                    )

                    TextField(
                        value = email,
                        onValueChange = { email = it },
                        placeholder = {
                            Text(
                                text = "vijaybhuva90@gmail.com",
                                fontSize = 13.sp,
                                color = Color.Gray
                            )
                        },
                        singleLine = true,
                        modifier = Modifier
                            .height(52.dp),

                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent, // quita la línea de abajo
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        )
                    )
                }
            }

            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 28.dp),
                contentAlignment = Alignment.Center,
            ){
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(
                            topStart = 16.dp,
                            topEnd = 0.dp,
                            bottomEnd = 16.dp,
                            bottomStart = 16.dp
                        ))
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(
                                topStart = 16.dp,
                                topEnd = 0.dp,
                                bottomEnd = 16.dp,
                                bottomStart = 16.dp
                            )
                        )
                        .width(320.dp)
                ){
                    Text(
                        text = "Confirm Password",
                        modifier = Modifier
                            .padding(start = 15.dp, top = 8.dp)
                    )

                    TextField(
                        value = password,
                        onValueChange = { password = it },
                        label = {Text(".....")},
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier
                            .height(52.dp),

                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        )
                    )
                }
            }

            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 28.dp),
                contentAlignment = Alignment.Center,
            ){
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(
                            topStart = 16.dp,
                            topEnd = 0.dp,
                            bottomEnd = 16.dp,
                            bottomStart = 16.dp
                        ))
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(
                                topStart = 16.dp,
                                topEnd = 0.dp,
                                bottomEnd = 16.dp,
                                bottomStart = 16.dp
                            )
                        )
                        .width(320.dp)
                ){
                    Text(
                        text = "Password",
                        modifier = Modifier
                            .padding(start = 15.dp, top = 8.dp)
                    )

                    TextField(
                        value = repeat,
                        onValueChange = { repeat = it },
                        label = {Text(".....")},
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier
                            .height(52.dp),

                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        )
                    )
                }
            }

            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 8.dp),
                contentAlignment = Alignment.Center
            ){
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(
                        topStart = 16.dp,
                        topEnd = 0.dp,
                        bottomEnd = 16.dp,
                        bottomStart = 16.dp
                    ),
                    modifier = Modifier.padding(24.dp)
                        .width(320.dp)
                        .height(50.dp)

                ) {
                    Text("Login")
                }
            }

            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 32.dp),
                contentAlignment = Alignment.Center
            ){
                Row {
                    Text("Already have an account?")
                    Text(
                        text = "Log in",
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .clickable {
                                navController.navigate(LoginScreenRoute)
                            }
                    )
                }
            }
        }

    }


}

@Preview(showBackground = true)
@Composable
fun Greeting() {
    LoginAppTheme {
        SignupScreen(
            navController = rememberNavController(),
            innerPadding = PaddingValues(0.dp)
        )
    }
}