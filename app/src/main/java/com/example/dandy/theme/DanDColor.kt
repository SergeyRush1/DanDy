package com.example.dand.UI.theme

import androidx.compose.ui.graphics.Color

val lightColorPalette = DanDColor(
    blueUser = Color(0xFF8EB2DD),
    greenUser = Color(0xFF70EA36),
    blackUser = Color(0xFF000000),
    redUser = Color(0xFFC60000),
    yellowUser = Color(0xFFEFAF0B),
    backround = Color(0xFFC0C0C0),
    buttonColor = Color(0xFFBCBCBC),
    textInButtonColor =  Color(0xFF131313),
    editTextBack = Color(0xFFD9D9D9),
    textMessegeColor = Color(0xFFF1F1F1),
    errorColor = Color(0xFFEB0000),
    textColor = Color(0xFF000000),
    cursorColor = Color(0xFF131313),
    textMessage = Color(0xFFF1F1F1),
    focusColor = Color(0xFF000000),
    unFocusColor = Color(0xFFBCBCBC),
    mainColor = Color(0xFF8EB2DD),
    tintColor = Color(0xFFC7C6C6),
    backgroundItem = Color(0xC1CFCFCF),
    menuIconColor  = Color(0xFF131313),
    navigationElementColor = Color(0xFF9E9E9E),
    bottomColor = Color(0xFF02B3B3),
    focusIconColor = Color(0xFF000000),
    unFocusIconColor = Color(0xFF292929),
    //Switch color
    checkedThumbColor = Color(0xFF02B3B3),
    checkedTrackColor = Color(0xFF02B3B3),
    checkedBorderColor = Color(0xFF02B3B3),
    checkedIconColor =Color(0xFF02B3B3),
    disabledCheckedBorderColor = Color(0xFF02B3B3),
    disabledCheckedIconColor = Color(0xFF02B3B3),
    disabledCheckedThumbColor = Color(0xFF02B3B3),
    disabledCheckedTrackColor = Color(0xFF02B3B3),
    disabledUncheckedBorderColor = Color.Red,
    disabledUncheckedIconColor = Color.Red,
    disabledUncheckedThumbColor = Color.Red,
    disabledUncheckedTrackColor = Color.Red,
    uncheckedBorderColor = Color(0xFFFFE020),
    uncheckedIconColor  = Color.Red,
    uncheckedThumbColor = Color(0xFFC0C0C0),
    uncheckedTrackColor = Color(0xFFC0C0C0),
    sunColorOnSwich = Color(0xFFFFE020),
    munColorOnSwitch = Color(0xFF00326F),
    selectedHero = Color(0xFF00326F),
    unselectedHero = Color(0xFFC0C0C0)
)
val nightColorPalette = DanDColor(
    blueUser = Color(0xFF8EB2DD),
    greenUser = Color(0xFF70EA36),
    backround = Color(0xFF000000),
    buttonColor = Color(0xFFBCBCBC),
    editTextBack = Color(0xFF333333),
    textMessegeColor = Color(0xFF000000),
    errorColor = Color(0xFFEB0000),
    textColor = Color(0xFF7A7A7A),
    cursorColor = Color(0xFF9C9C9C),
    textInButtonColor =  Color(0xFF131313),
    mainColor = Color(0xFF000000),
    blackUser = Color(0xFF000000),
    redUser = Color(0xFFC60000),
    yellowUser = Color(0xFFEFAF0B),
    textMessage = Color(0xFFC2C2C2),
    focusColor = Color(0xFFC7C7C7),
    unFocusColor = Color(0xFFBCBCBC),
    tintColor = Color(0xFF292828),
    backgroundItem = Color(0xC2181818),
    menuIconColor  = Color(0xFF9C9C9C),
    navigationElementColor = Color(0xFF292929),
    bottomColor = Color(0xFF226464),
    focusIconColor = Color(0xFF575757),
    unFocusIconColor = Color(0xFF292929),
    //Switch colors
    checkedThumbColor = Color(0xFF000000), //фон  в иконке
    checkedTrackColor = Color(0xFF000000), //фон внутри свича
    checkedBorderColor =Color(0xFF00326F), // Фон обводки свича
    checkedIconColor =Color.Red,
    disabledCheckedBorderColor = Color.Red,
    disabledCheckedIconColor = Color.Red,
    disabledCheckedThumbColor = Color.Red,
    disabledCheckedTrackColor = Color.Red,
    disabledUncheckedBorderColor = Color.Red,
    disabledUncheckedIconColor = Color.Red,
    disabledUncheckedThumbColor = Color.Red,
    disabledUncheckedTrackColor = Color.Red,
    uncheckedBorderColor = Color.Red,
    uncheckedIconColor  = Color.Red,
    uncheckedThumbColor = Color.Red,
    uncheckedTrackColor = Color.Red,
    sunColorOnSwich = Color(0xFFFFE020),
    munColorOnSwitch = Color(0xFF00326F),
    selectedHero = Color(0xFF00326F),
    unselectedHero = Color(0xFFC0C0C0)

)
val blueLightPalette = lightColorPalette.copy(
    mainColor = Color(0xFF8EB2DD)
)
val blueNightColorPalette = nightColorPalette.copy(
    mainColor = Color(0xFF8EB2DD)
)
val blackLightColorPalette = lightColorPalette.copy(
    mainColor = Color(0xFF000000)
)
val blackNightColorPalette = nightColorPalette.copy(
    mainColor = Color(0xFF000000)
)
val yellowLightColorPalette = lightColorPalette.copy(
    mainColor = Color(0xFFFF9800)
)
val yellowNightColorPalette = nightColorPalette.copy(
    mainColor = Color(0xFFFF9800)
)
val redLightColorPalette = lightColorPalette.copy(
    mainColor = Color(0xFFE91E63)
)
val redNightColorPalette = nightColorPalette.copy(
    mainColor = Color(0xFFE91E63)
)
val greenLightColorPalette = lightColorPalette.copy(
    mainColor = Color(0xFF70EA36)
)
val greenNightColorPalette = nightColorPalette.copy(
    mainColor = Color(0xFF70EA36)
)