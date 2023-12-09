package com.example.dandy.theme.components

import android.view.MenuItem
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dand.UI.theme.DanDTheme


data class MenuItemModel(
    val title: String,
    val currentIndex: Int = 0,
    val values: List<String>
)
@Composable
fun SettingsMenuItem(model: MenuItemModel,
             onItemSelected: ((Int) -> Unit)? = null){
    val isDropdownOpen = remember { mutableStateOf(false) }
    val currentPosition = remember { mutableStateOf(model.currentIndex) }

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Row(
                Modifier
                    .clickable {
                        isDropdownOpen.value = true
                    }
                    .padding(DanDTheme.shapes.padding),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = DanDTheme.shapes.padding),
                    text = model.title,
                    style = DanDTheme.typography.body,
                    //добавить primaryText color
                    color = DanDTheme.color.textColor
                )

                Text(
                    text = model.values[currentPosition.value],
                    style = DanDTheme.typography.body,
                    //***************************
                    color = DanDTheme.color.textColor
                )

                Icon(
                    modifier = Modifier
                        .padding(start = DanDTheme.shapes.padding / 4)
                        .size(18.dp)
                        .align(Alignment.CenterVertically),
                    painter = painterResource(id = com.example.dandy.R.drawable.baseline_arrow_24),
                    contentDescription = "Arrow",
                    tint = DanDTheme.color.menuIconColor
                )
            }

            Divider(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .align(Alignment.BottomStart),
                thickness = 0.5.dp,
                color = DanDTheme.color.textColor.copy(
                    alpha = 0.3f
                )
            )
        }


        // Dropdown doesnt work
        // https://issuetracker.google.com/u/1/issues/211474319
        DropdownMenu(
            expanded = isDropdownOpen.value,
            onDismissRequest = {
                isDropdownOpen.value = false
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(DanDTheme.color.backgroundItem)
        ) {
            model.values.forEachIndexed { index, value ->
                DropdownMenuItem(onClick = {
                    currentPosition.value = index
                    isDropdownOpen.value = false
                    onItemSelected?.invoke(index)
                }) {
                    Text(
                        text = value,
                        style = DanDTheme.typography.body,
                        //******************
                        color = DanDTheme.color.textColor
                    )
                }
            }
        }
    }


}

@Preview
@Composable
fun MenuItemPrewiew(){
    DanDTheme {
        SettingsMenuItem(model = MenuItemModel(title = "test String", currentIndex = 3, values = listOf("testVal1","TestVal2","TestVal3")))
    }

}