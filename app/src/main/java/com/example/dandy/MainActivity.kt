package com.example.dandy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dand.DATA.SettingsPreferences
import com.example.dand.UI.theme.DanDTheme
import com.example.dand.UI.theme.lightColorPalette
import com.example.dand.UI.theme.nightColorPalette
import com.example.dand.screens.LoadingScreen
import com.example.dand.screens.SplashScreenDanD
import com.example.dand.screens.mainSreen.MainView
import com.example.dand.screens.mainSreen.MainViewModel
import com.example.dandy.screens.SettingsScreen
import com.example.dandy.screens.mainSreen.screens.TestScreen
import com.example.dandy.ui.theme.DanDyTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val settings = SettingsPreferences(this).getSettings()
            var isDarkMode by rememberSaveable { mutableStateOf(settings.dark_mode) }
            var textSize by rememberSaveable { mutableStateOf(settings.textSize) }
            var styleDanD by rememberSaveable { mutableStateOf(settings.style) }
            var corner by rememberSaveable { mutableStateOf(settings.corners) }
            var padding by rememberSaveable { mutableStateOf(settings.paddigSize) }
            val settingsSaver = SettingsPreferences(this)

            DanDTheme(style = styleDanD,
                textSize = textSize,
                paddingSize = padding,
                corners = corner,
                darkTheme = isDarkMode) {
                val navController = rememberNavController()
                val systemUiController = rememberSystemUiController()

                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = if (isDarkMode) nightColorPalette.tintColor else lightColorPalette.tintColor,
                        darkIcons = !isDarkMode
                    )
                }

                NavHost(navController = navController, startDestination = "main") {
                    composable("splash") {
                        SplashScreenDanD(navController = navController)
                    }
                    composable("test"){
                        TestScreen(settingsSaver = settingsSaver, settings = settings)
                    }
                    composable("settings"){
                        SettingsScreen(modifier = Modifier,
                            settings = settings,
                            onSettingChange = {
                            isDarkMode = it.dark_mode
                            textSize = it.textSize
                            styleDanD = it.style
                            corner = it.corners
                            padding = it.paddigSize
                        }, settingsSaver = settingsSaver)
                    }
                    composable("loading"){
                        //!!!!!!!
                        LoadingScreen()
                    }
                    composable("main"){
                        //Основной экран с остальными зависимостями
                        //
                        val mainScreenViewModel = hiltViewModel<MainViewModel>()
                        MainView(mainViewModel = mainScreenViewModel,navController = navController, settings = settings)
                        // MainScreen(navController = navController, settings = settings)
                    }
                }



            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DanDyTheme {
        Greeting("Android")
    }
}