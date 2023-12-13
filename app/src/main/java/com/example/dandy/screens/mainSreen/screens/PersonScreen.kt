package com.example.dand.screens.mainSreen.screens

import HeroImage
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dand.UI.theme.DanDTheme

@Composable
fun PersonScreen(){
    var statusw by remember { mutableStateOf(2) }
    LazyRow(contentPadding = PaddingValues(5.dp),
        modifier = Modifier.background(DanDTheme.color.tintColor)){

        items(statusw){
            HeroImage(80.dp,DanDTheme.color.checkedBorderColor, onClickImage = {
statusw = it
            })
        }
    }

    LazyRow(){

    }
}