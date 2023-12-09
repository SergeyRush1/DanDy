package com.example.dand.screens.mainSreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController
import com.example.dand.DATA.Settings
import com.example.dand.screens.LoadingScreen
import com.example.dand.screens.mainSreen.models.MainEvent
import com.example.dand.screens.mainSreen.models.MainState
import com.example.dand.screens.mainSreen.screens.MainScreen

@Composable
fun MainView( mainViewModel:MainViewModel,navController: NavController, settings:Settings) {
    val viewState = mainViewModel.mainState.observeAsState()
    when (val state = viewState.value) {
        is MainState.Loading -> LoadingScreen()
        is MainState.MainView -> MainScreen(navController = navController, settings = settings)
        else -> throw NotImplementedError("Error State")

    }

    LaunchedEffect(key1 = viewState, block = {
        mainViewModel.obtainEvent(event = MainEvent.Loading)
    })
}