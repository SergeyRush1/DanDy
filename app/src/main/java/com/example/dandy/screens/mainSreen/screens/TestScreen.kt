package com.example.dandy.screens.mainSreen.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.dand.DATA.Settings
import com.example.dand.DATA.SettingsPreferences
import com.example.dandy.theme.components.ThemeSwitch

@Composable
fun TestScreen(settingsSaver:SettingsPreferences,
               //onSettingChange: (Settings) -> Unit,
               settings:Settings, ){
    val change by remember { mutableStateOf(settings.dark_mode) }
    var mode by remember { mutableStateOf(settings.dark_mode)
    }
    //var mode:Boolean = false
    Column {
        Button(onClick = {
            settingsSaver.setDarckMode(!mode)

            mode = settingsSaver.getDarckMode() }) {
        }
        Text(text = "Mode is $mode")
    }




}