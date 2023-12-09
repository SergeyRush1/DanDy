package com.example.dand.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.dand.UI.theme.DanDTheme

@Composable
fun SplashScreenDanD(navController: NavController){
    val corutine = rememberCoroutineScope()
    DanDTheme {
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(DanDTheme.color.cursorColor)) {

    }

    LaunchedEffect(key1 = corutine, block = {
        navController.navigate("loading")
//        if (firebaseHelper.authCheck()){
//            navController.navigate("main")
//        }else{
//            navController.navigate("signin")
//        }
   })
}