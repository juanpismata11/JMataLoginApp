package com.example.loginapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SignupScreen(){
    var textSearchBar by remember { mutableStateOf("") }


    Box(
        modifier = Modifier.fillMaxWidth(),
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
                value = textSearchBar,
                onValueChange = { textSearchBar = it },
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
        modifier = Modifier.fillMaxWidth(),
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
                value = textSearchBar,
                onValueChange = { textSearchBar = it },
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
        modifier = Modifier.fillMaxWidth(),
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
                value = textSearchBar,
                onValueChange = { textSearchBar = it },
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
        modifier = Modifier.fillMaxWidth(),
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
                value = textSearchBar,
                onValueChange = { textSearchBar = it },
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
        modifier = Modifier.fillMaxWidth(),
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
                value = textSearchBar,
                onValueChange = { textSearchBar = it },
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
}