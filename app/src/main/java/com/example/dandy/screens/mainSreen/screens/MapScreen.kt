package com.example.dand.screens.mainSreen.screens

import androidx.compose.foundation.layout.consumedWindowInsets
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MapScreen(navController: NavController){
    Text(text = "rerere")
    Button(onClick = { navController.navigate("loading") },) {
        Text(text = "fsfsd")
        
    }
}