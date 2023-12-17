package com.example.dandy.theme.components.croper

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dandy.R

@Composable
fun ImageZoom(){
    var scale by remember { mutableStateOf(1f) }

    var rotationState by remember { mutableStateOf(1f) }

    Column (modifier = Modifier.fillMaxSize()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .padding(15.dp) ) {
             Text(text = "Image",
                 fontWeight = FontWeight.Bold,
                 fontSize = 20.sp)
        }
        Row(modifier = Modifier
            .fillMaxSize()
            .clip(RectangleShape)
            .background(Color.Blue)
            .pointerInput(Unit) {
                detectTransformGestures { _, _, zoom, rotation ->
                    rotationState += rotation
                    scale *= zoom
                }
            }) {
            Image(painter = painterResource(id = R.drawable.hero_example),
                contentDescription ="nin",
                modifier = Modifier.align(Alignment.CenterVertically).
                graphicsLayer(
                    //scaleX = maxOf(5f, minOf(3f,scale)),
                   // scaleY = maxOf(5f, minOf(3f,scale)),
                    scaleX = scale,
                    scaleY = scale,
                    rotationZ = rotationState ), contentScale = ContentScale.Inside )

        }

    }

}