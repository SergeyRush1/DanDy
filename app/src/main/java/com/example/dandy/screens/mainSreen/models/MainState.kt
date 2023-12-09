package com.example.dand.screens.mainSreen.models

sealed class MainState {
    object Loading:MainState()
    object MainView:MainState()
}