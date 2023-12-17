package com.example.dandy.theme.components.croper

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import kotlin.math.roundToInt
import kotlin.random.Random

@Composable
fun AnimatableExample() {
    val animatedOffset = remember { Animatable(Offset(0f, 0f), Offset.VectorConverter) }
    val corutine= rememberCoroutineScope()

//    Box(
//        Modifier
//            .fillMaxSize()
//            .background(Color.LightGray)
//            .pointerInput(Unit) {
//                coroutineScope {
//                    while (true) {
//                        val offset = awaitPointerEventScope {
//                            awaitFirstDown().position
//                        }
//                        launch {
//                            animatedOffset.animateTo(
//                                offset,
//                                animationSpec = spring(stiffness = Spring.StiffnessLow)
//                            )
//                        }
//                    }
//                }
//            }
//    ) {
    //Text(text = "ffffff", Modifier.align(Alignment.Center))
    Column(modifier = Modifier.fillMaxSize()) {


        Box(
            Modifier
                .offset {
                    IntOffset(
                        animatedOffset.value.x.roundToInt(),
                        animatedOffset.value.y.roundToInt()
                    )
                }
                .clickable(role = Role.Button) {
                    corutine.launch {
                        val randomX = Random.nextFloat() * (1000 - 0)
                        val randomY = Random.nextFloat() * (1000 - 0)
                        val offset = Offset(randomX, randomY)
                        animatedOffset.animateTo(
                            offset,
                            animationSpec = spring(stiffness = Spring.StiffnessLow)
                        )
                    }
                }

                .size(40.dp)
                .background(Color.Black, CircleShape)
        )
        // }
    }
}