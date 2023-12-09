package com.example.dand.DATA

import com.example.dand.UI.theme.DanDCorners
import com.example.dand.UI.theme.DanDSize
import com.example.dand.UI.theme.DanDStyle

data class Settings(var dark_mode:Boolean = false,
                    var style:DanDStyle = DanDStyle.Black,
                    var textSize:DanDSize = DanDSize.Medium,
                    var corners:DanDCorners = DanDCorners.Flat,
                    var paddigSize:DanDSize = DanDSize.Medium  ) {
}