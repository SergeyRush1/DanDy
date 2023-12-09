package com.example.dand.UI.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DanDTheme(   style:DanDStyle = DanDStyle.Black,
                 textSize:DanDSize = DanDSize.Medium,
                 paddingSize:DanDSize=DanDSize.Medium,
                 corners: DanDCorners=DanDCorners.Rounded,
                 darkTheme:Boolean = isSystemInDarkTheme(),
                 content: @Composable () -> Unit
){
    val colors = when (darkTheme) {
        true ->{
            when(style){
                DanDStyle.Blue -> blueNightColorPalette
                DanDStyle.Black -> blackNightColorPalette
                DanDStyle.Green -> greenNightColorPalette
                DanDStyle.Red -> redNightColorPalette
                DanDStyle.Yellow -> yellowNightColorPalette
            }
        }
        false ->{
            when(style){
                DanDStyle.Blue -> blueLightPalette
                DanDStyle.Black -> blackLightColorPalette
                DanDStyle.Green -> greenLightColorPalette
                DanDStyle.Red -> redLightColorPalette
                DanDStyle.Yellow -> yellowLightColorPalette
            }

        }
    }
    //val image =DollarsImage( when(darkTheme){
       // false-> R.drawable.ic_ligh_back
        //true -> R.drawable.ic_night_back
    //    }
    //)

    val typography = DanDTypography(
        heading = TextStyle(
            fontSize = when(textSize){
                DanDSize.Small ->24.sp
                DanDSize.Medium -> 28.sp
                DanDSize.Big -> 32.sp
            }, fontWeight = FontWeight.Normal
        ),
        body = TextStyle(
            fontSize = when(textSize){
                DanDSize.Small -> 16.sp
                DanDSize.Medium -> 20.sp
                DanDSize.Big -> 26.sp
            }, fontWeight = FontWeight.Normal
        ),
        toolbar = TextStyle(
            fontSize = when (textSize){
                DanDSize.Small -> 16.sp
                DanDSize.Medium -> 20.sp
                DanDSize.Big -> 26.sp
            }, fontWeight = FontWeight.Medium
        ),
        caption = TextStyle(
            fontSize = when (textSize){
                DanDSize.Small -> 16.sp
                DanDSize.Medium -> 18.sp
                DanDSize.Big -> 20.sp
            }, fontWeight = FontWeight.Medium
        ), system = TextStyle(
            fontSize = when(textSize){
                DanDSize.Small -> 16.sp
                DanDSize.Medium -> 20.sp
                DanDSize.Big -> 26.sp
            }, fontWeight = FontWeight.Normal
        ))


    val shapes = DanDShape(
        padding = when(paddingSize){
            DanDSize.Small -> 4.dp
            DanDSize.Medium -> 16.dp
            DanDSize.Big -> 12.dp
        },
        cornerShape = when(corners){
            DanDCorners.Flat -> RoundedCornerShape(0.dp)
            DanDCorners.Rounded -> RoundedCornerShape(25.dp)
        }
    )

    CompositionLocalProvider(
        localDanDColor provides colors,
        localDanDTypography provides typography,
        localDanDShape provides shapes,
      //  localDollarsImage provides image,
        content = content
    )

}