package com.example.dand.screens.mainSreen.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.dand.DATA.Settings
import com.example.dand.UI.theme.DanDTheme
import com.example.dand.UI.theme.components.DrawContent
import com.example.dand.screens.tabs.dailyFlow

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavController,settings:Settings){
    val childNavController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val titleTopBar = remember { mutableStateOf("chat") }
    val items = listOf(
        MainBottomScreen.Profile,
        MainBottomScreen.Map,
        MainBottomScreen.Chat)

    Scaffold(scaffoldState = scaffoldState,
        drawerContent = {
       DrawContent(navController,scaffoldState) }
    ) {
        Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.padding(it)) {
            Box(modifier = Modifier.weight(1f)) {
                NavHost(
                    navController = childNavController,
                    startDestination = MainBottomScreen.Chat.route
                ) {
                    dailyFlow(navController)
                    composable(MainBottomScreen.Map.route) {
                        MapScreen(navController = navController)
                    }

                    composable(MainBottomScreen.Chat.route) {
                        //val chatViewModel = hiltViewModel<Model>()
                        // chatViewModel.loadRooms()
                        //ChatView(navController = navController, chatViewModel = chatViewModel)
                        ChatScreen()
                    }

                }
            }



            Box(
                modifier = Modifier
                    .height(56.dp)
                    .fillMaxWidth()
            ) {
                BottomNavigation {
                    val navBackStackEntry by childNavController.currentBackStackEntryAsState()
                    val currentDestination = navBackStackEntry?.destination
                    val previousDestination = remember { mutableStateOf(items[2].route) }

                    items.forEach { screen ->
                        val isSelected =
                            currentDestination?.hierarchy
                                ?.any { it.route == screen.route } == true
                        BottomNavigationItem(
                            modifier = Modifier.background(DanDTheme.color.tintColor),
                            icon = {
                                Icon(
                                    painter = when (screen) {
                                        MainBottomScreen.Profile -> painterResource(id = screen.resourceId)
                                        MainBottomScreen.Map -> painterResource(id = screen.resourceId)
                                        MainBottomScreen.Chat -> painterResource(id = screen.resourceId)
                                    }, contentDescription = null,
                                    tint = if (isSelected) DanDTheme.color.errorColor else DanDTheme.color.sunColorOnSwich
                                )
                            }, label = {
                                Text(
                                    stringResource(id = screen.resName),
                                    color = if (isSelected) DanDTheme.color.errorColor else DanDTheme.color.sunColorOnSwich
                                )
                            }, selected = isSelected,
                            onClick = {
                                if (screen.route == previousDestination.value) return@BottomNavigationItem
                                previousDestination.value = screen.route
                                titleTopBar.value = screen.route
                                childNavController.navigate(screen.route) {
                                    popUpTo(childNavController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        )

                    }

                }
            }
        }





    }


}