package com.example.dand.UI.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

data class DanDColor(val blueUser: Color,
                     val greenUser: Color,
                     val blackUser:Color,
                     val redUser:Color,
                     val yellowUser:Color,
                     val mainColor: Color,
                     val textMessage:Color,
                     val backround: Color,
                     val buttonColor: Color,
                     val editTextBack: Color,
                     val textMessegeColor: Color,
                     val errorColor: Color,
                     val textColor: Color,
                     val cursorColor: Color,
                     val textInButtonColor: Color,
                     val focusColor: Color,
                     val unFocusColor: Color,
                     val tintColor: Color,
                     val backgroundItem:Color,
                     val menuIconColor:Color,
                     val navigationElementColor:Color,
                     val bottomColor:Color,
                     val focusIconColor:Color,
                     val unFocusIconColor: Color,
    //swith colors
                    val checkedThumbColor:Color,
                     val checkedTrackColor:Color,
                     val checkedBorderColor:Color,
                     val checkedIconColor:Color,
                     val disabledCheckedBorderColor:Color,
                     val disabledCheckedIconColor:Color,
                     val disabledCheckedThumbColor:Color,
                     val disabledCheckedTrackColor:Color,
                     val disabledUncheckedBorderColor:Color,
                     val disabledUncheckedIconColor:Color,
                     val disabledUncheckedThumbColor:Color,
                     val disabledUncheckedTrackColor:Color,
                     val uncheckedBorderColor:Color,
                     val uncheckedIconColor:Color,
                     val uncheckedThumbColor:Color,
                     val uncheckedTrackColor:Color,
                     val  sunColorOnSwich:Color,
                     val munColorOnSwitch:Color




)
data class DanDTypography(val heading: TextStyle,
                             val body:TextStyle,
                             val toolbar:TextStyle,
                             val caption:TextStyle,
                             val system:TextStyle)

data class DanDImage(val backgroundImage:Int)

data class DanDShape(val padding: Dp,
                        val cornerShape: Shape
)

object DanDTheme{
    val color:DanDColor
        @Composable
        get()= localDanDColor.current


    val typography:DanDTypography
        @Composable
        get() = localDanDTypography.current

    val shapes:DanDShape
        @Composable
        get() = localDanDShape.current

    val image:DanDImage
        @Composable
        get() = localDanDImage.current
}
val localDanDColor = staticCompositionLocalOf<DanDColor> {
    error("No colors provided")
}
val localDanDImage = staticCompositionLocalOf<DanDImage> {
    error("No image provider")
}

val localDanDTypography = staticCompositionLocalOf<DanDTypography> {
    error("No found provided")
}

val localDanDShape = staticCompositionLocalOf<DanDShape> {
    error("No shape provided")
}

enum class DanDSize{
    Small, Medium, Big
}

enum class DanDCorners{
    Flat,Rounded
}
enum class DanDStyle{
    Black,Blue,Green,Red,Yellow
}