package com.example.dand.screens.settingsScreen.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dand.UI.theme.DanDTheme
import com.example.dandy.R

@Composable
fun SettingsScreen(){
    /*
    Column() {
        //val settingsmemorySaver = Settings(LocalContext.current)

      Row(){

      }
        Row(
            modifier = Modifier.padding(DanDTheme.shapes.padding),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = stringResource(id = R.string.darck_theme),
                color = DanDTheme.color.textColor,
                style = DanDTheme.typography.body
            )
            Checkbox(
                checked = settings.isDarkMode, onCheckedChange = {
                    onSettingsChanged.invoke(settings.copy(isDarkMode = !settings.isDarkMode))
                    settingsmemorySaver.setDarkMode(!settings.isDarkMode)
                },
                colors = CheckboxDefaults.colors(
                    //поменять цвет
                    checkedColor = DollarsTheme.color.menuIconColor,
                    //Добавить цвет
                    uncheckedColor = DollarsTheme.color.menuIconColor
                )
            )
        }

        Divider(
            modifier = Modifier.padding(start = DanDTheme.shapes.padding),
            thickness = 0.5.dp,
            color = DanDTheme.color.textColor.copy(
                alpha = 0.3f
            )
        )
        //  MARGIN
        MenuItem(
            model = MenuItemModel(
                title = stringResource(id = R.string.title_padding_size),
                currentIndex = when (settings.paddingSize) {
                    DollarsSize.Small -> 0
                    DollarsSize.Medium -> 1
                    DollarsSize.Big -> 2
                },
                values = listOf(
                    stringResource(id = R.string.title_padding_small),
                    stringResource(id = R.string.title_padding_medium),
                    stringResource(id = R.string.title_padding_big)
                )
            ),
            onItemSelected = {
                val settingsNew = settings.copy(
                    paddingSize = when (it) {
                        0 -> DollarsSize.Small
                        1 -> DollarsSize.Medium
                        2 -> DollarsSize.Big
                        else -> throw NotImplementedError("No valid value for this $it")
                    }
                )
                settingsmemorySaver.setSize(PADDING_SIZE,settingsNew.paddingSize)
                onSettingsChanged.invoke(settingsNew)
            }
        )
        //TEXT SIZE
        MenuItem(
            model = MenuItemModel(
                title = stringResource(id = R.string.title_font_size),
                currentIndex = when (settings.textSize) {
                    DollarsSize.Small -> 0
                    DollarsSize.Medium -> 1
                    DollarsSize.Big -> 2
                },
                values = listOf(
                    stringResource(id = R.string.title_font_size_small),
                    stringResource(id = R.string.title_font_size_medium),
                    stringResource(id = R.string.title_font_size_big)
                )
            ),
            onItemSelected = {
                val settingsNew = settings.copy(
                    textSize = when (it) {
                        0 -> DollarsSize.Small
                        1 -> DollarsSize.Medium
                        2 -> DollarsSize.Big
                        else -> throw NotImplementedError("No valid value for this $it")
                    }
                )
                settingsmemorySaver.setSize(FONT_SIZE,settingsNew.textSize)
                onSettingsChanged.invoke(settingsNew)
            }
        )
        MyMessageItem(bitmap = FirebaseHelper(LocalContext.current).paintBitmap(localUser.avatar!!.image_name)?:
        BitmapFactory.decodeResource(LocalContext.current.resources,R.drawable.ic_blueuser).asImageBitmap(),
            message = Message(user = localUser, stringResource(id = R.string.message_example)))

        MessageItem(bitmap = FirebaseHelper(LocalContext.current).paintBitmap(localUser.avatar!!.image_name)?:
        BitmapFactory.decodeResource(LocalContext.current.resources,R.drawable.ic_blueuser).asImageBitmap(),
            message = Message(user = localUser, stringResource(id = R.string.message_example)))



    }
    (
     */
}
@Preview
@Composable
fun SettingsScreenPrew(){
    DanDTheme {

    }

}