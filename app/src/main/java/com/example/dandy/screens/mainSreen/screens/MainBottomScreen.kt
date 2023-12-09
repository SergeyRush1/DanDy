package com.example.dand.screens.mainSreen.screens

import androidx.annotation.StringRes
import com.example.dandy.R


sealed class MainBottomScreen(val route: String,val resourceId: Int,@StringRes val resName:Int) {
    object Map:MainBottomScreen("Map", R.drawable.baseline_map_24,R.string.mapBottom)
    object Chat:MainBottomScreen("Chat",R.drawable.baseline_message_24,R.string.messageBottom)
    object Profile:MainBottomScreen("Person",R.drawable.baseline_person_4_24,R.string.personBottom)
   // object Event:MainBottomScreen("Event",R.drawable.baseline_sports_motorsports_24,R.string.Event_screen)


}