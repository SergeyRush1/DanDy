package com.example.dand.UI.theme.components

import android.widget.ImageButton
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawContent(navController: NavController){
   Column(verticalArrangement = Arrangement.Bottom,
       modifier = Modifier.fillMaxSize(),
       horizontalAlignment = Alignment.End) {
       Button(onClick = { navController.navigate("settings") },) {
           Text(text = "Setting")
       }

   }
}
@Preview
@Composable
fun DrawPrew(){
    val navController = rememberNavController()
    DrawContent(navController)
}