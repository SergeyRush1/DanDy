package com.example.dandy.DATA

import com.example.dand.UI.theme.DanDCorners
import com.example.dand.UI.theme.DanDSize
import com.example.dand.UI.theme.DanDStyle

data class SettingsBundle(
    val isDarkMode: Boolean,
    val textSize: DanDSize,
    val paddingSize:DanDSize,
    val cornerStyle:DanDCorners,
    val style: DanDStyle
)