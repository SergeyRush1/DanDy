package com.example.dandy.theme.components

import android.annotation.SuppressLint
import androidx.compose.material.Icon
import androidx.compose.material.SwitchDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dand.UI.theme.DanDTheme
import com.example.dandy.R

@Composable
fun ThemeSwitch(darkMode:Boolean,
                modeChange: (Boolean)->Unit){
    var checked by remember { mutableStateOf(darkMode) }
    Switch(
        checked = checked,
        onCheckedChange = {
            checked = it
            modeChange(it)

        },
        thumbContent =  {
            when (checked) {
                true -> {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_nightlight_24),
                        contentDescription = "checked",
                        tint = DanDTheme.color.munColorOnSwitch)
                }
                false -> Icon(
                    painter = painterResource(id = R.drawable.baseline_wb_sunny_24),
                    contentDescription = "checked",
                    tint = DanDTheme.color.sunColorOnSwich
                )
            }

        }, colors = androidx.compose.material3.SwitchDefaults.colors(
            checkedThumbColor = DanDTheme.color.checkedThumbColor,
            checkedTrackColor = DanDTheme.color.checkedTrackColor,
            checkedBorderColor = DanDTheme.color.checkedBorderColor,
            checkedIconColor =DanDTheme.color.checkedIconColor,
            disabledCheckedBorderColor = DanDTheme.color.disabledCheckedBorderColor,
            disabledCheckedIconColor = DanDTheme.color.disabledCheckedIconColor,
            disabledCheckedThumbColor = DanDTheme.color.disabledCheckedThumbColor,
            disabledCheckedTrackColor = DanDTheme.color.disabledCheckedTrackColor,
            disabledUncheckedBorderColor = DanDTheme.color.disabledUncheckedBorderColor,
            disabledUncheckedIconColor = DanDTheme.color.disabledUncheckedIconColor,
            disabledUncheckedThumbColor = DanDTheme.color.disabledUncheckedThumbColor,
            disabledUncheckedTrackColor = DanDTheme.color.disabledUncheckedTrackColor,
            uncheckedBorderColor = DanDTheme.color.uncheckedBorderColor,
            uncheckedIconColor  = DanDTheme.color.uncheckedIconColor,
            uncheckedThumbColor = DanDTheme.color.uncheckedThumbColor,
            uncheckedTrackColor = DanDTheme.color.uncheckedTrackColor))
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun DanDySwithPrew(){
    DanDTheme {
        Scaffold {
          //  DanDySwitch(darkMode = true)
        }

    }

}