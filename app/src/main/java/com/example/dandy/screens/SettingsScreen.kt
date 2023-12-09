package com.example.dandy.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dand.DATA.Settings
import com.example.dand.DATA.SettingsPreferences
import com.example.dand.UI.theme.DanDSize
import com.example.dand.UI.theme.DanDTheme
import com.example.dandy.R
import com.example.dandy.theme.components.MenuItemModel
import com.example.dandy.theme.components.SettingsMenuItem
import com.example.dandy.theme.components.ThemeSwitch

@Composable
fun SettingsScreen(modifier: Modifier,
                   settings: Settings,
                   settingsSaver: SettingsPreferences,
                   onSettingChange: (Settings) -> Unit,
){
    var themeIcon by remember {mutableStateOf(R.drawable.baseline_nightlight_24) }
    Surface(
        modifier = modifier,
        color = DanDTheme.color.backgroundItem,
    ) {
        Column() {
            //val settingsmemorySaver = Settings(LocalContext.current)


            Row(
                modifier = androidx.compose.ui.Modifier.padding(DanDTheme.shapes.padding),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = stringResource(id = com.example.dandy.R.string.action_dark_theme_enable),
                    color = DanDTheme.color.textColor,
                    style = DanDTheme.typography.body
                )
                ThemeSwitch(darkMode = settings.dark_mode,
                    modeChange = { settingsSaver.setDarckMode(it)
                        onSettingChange.invoke(settings.copy(dark_mode = it)) })
            }

            Divider(
                modifier = Modifier.padding(start = DanDTheme.shapes.padding),
                thickness = 0.5.dp,
                color = DanDTheme.color.textColor.copy(
                    alpha = 0.3f
                )
            )
            //  MARGIN
            SettingsMenuItem(
                model = MenuItemModel(
                    title = stringResource(id = R.string.title_padding_size),
                    currentIndex = when (settings.paddigSize) {
                        DanDSize.Small -> 0
                        DanDSize.Medium -> 1
                        DanDSize.Big -> 2
                    },
                    values = listOf(
                        stringResource(id = R.string.title_padding_small),
                        stringResource(id = R.string.title_padding_medium),
                        stringResource(id = R.string.title_padding_big)
                    )
                ),
                onItemSelected = {
                    val settingsNew = settings.copy(
                        paddigSize = when (it) {
                            0 -> DanDSize.Small
                            1 -> DanDSize.Medium
                            2 -> DanDSize.Big
                            else -> throw NotImplementedError("No valid value for this $it")
                        }
                    )
                    settingsSaver.setPaddingSize(settingsNew.paddigSize)
                    onSettingChange.invoke(settingsNew)
                }
            )
            //TEXT SIZE
            SettingsMenuItem(
                model = MenuItemModel(
                    title = stringResource(id = R.string.title_font_size),
                    currentIndex = when (settings.textSize) {
                        DanDSize.Small -> 0
                        DanDSize.Medium -> 1
                        DanDSize.Big -> 2
                    },
                    values = listOf(
                        stringResource(id = R.string.title_font_size_small),
                        stringResource(id = R.string.title_font_size_medium),
                        stringResource(id = R.string.title_font_size_big)
                    )
                ), onItemSelected = {
                    val settingsNew = settings.copy(
                        textSize = when (it) {
                            0 -> DanDSize.Small
                            1 -> DanDSize.Medium
                            2 -> DanDSize.Big
                            else -> throw NotImplementedError("No valid value for this $it")
                        }
                    )
                    //settingsmemorySaver.setSize(FONT_SIZE,settingsNew.textSize)
                    //   onSettingsChanged.invoke(settingsNew)
                }
            )
//            MyMessageItem(bitmap = FirebaseHelper(LocalContext.current).paintBitmap(localUser.avatar!!.image_name)?:
//            BitmapFactory.decodeResource(LocalContext.current.resources,R.drawable.ic_blueuser).asImageBitmap(),
//                message = Message(user = localUser, stringResource(id = R.string.message_example)))
//
//            MessageItem(bitmap = FirebaseHelper(LocalContext.current).paintBitmap(localUser.avatar!!.image_name)?:
//            BitmapFactory.decodeResource(LocalContext.current.resources,R.drawable.ic_blueuser).asImageBitmap(),
//                message = Message(user = localUser, stringResource(id = R.string.message_example)))



        }
    }


}


@Preview
@Composable
fun SettingsPreview (){
   // SettingsScreen(modifier = Modifier, settings = )
}