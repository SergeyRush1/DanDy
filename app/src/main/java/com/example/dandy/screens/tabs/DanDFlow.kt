package com.example.dand.screens.tabs

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.dand.screens.mainSreen.screens.ChatScreen
import com.example.dand.screens.mainSreen.screens.MainBottomScreen
import com.example.dand.screens.mainSreen.screens.MapScreen
import com.example.dand.screens.mainSreen.screens.PersonScreen

fun NavGraphBuilder.dailyFlow(
    navController: NavController,

    ) {
    navigation(startDestination = "person", route = MainBottomScreen.Profile.route) {
//        composable("chat") {
//            //val chatViewModel = hiltViewModel<Model>()
//            // chatViewModel.loadRooms()
//            //ChatView(navController = navController, chatViewModel = chatViewModel)
//        ChatScreen()
//        }
        composable("person"){
            PersonScreen()
          //  NewRoomCreated(navController)
        }
//        composable("map"){
//            MapScreen(navController)
//        }

    }
}