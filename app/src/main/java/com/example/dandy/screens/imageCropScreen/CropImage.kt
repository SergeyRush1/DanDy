package com.example.dandy.screens.imageCropScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.dand.UI.theme.DanDTheme
import com.example.dandy.R
import com.example.dandy.imageCrop.models.OutlineType
import com.example.dandy.imageCrop.models.RectCropShape
import com.example.dandy.imageCrop.settings.CropDefaults
import com.example.dandy.imageCrop.settings.CropOutlineProperty

@Composable
fun CropImage(){
    val imageBitmapLarge = ImageBitmap.imageResource(
        id = R.drawable.forest )

    var imageBitmap by remember { mutableStateOf(imageBitmapLarge) }
    var croppedImage by remember { mutableStateOf<ImageBitmap?>(null) }
    var crop by remember { mutableStateOf(false) }
    var showDialog by remember { mutableStateOf(false) }
    var isCropping by remember { mutableStateOf(false) }

    val handleSize: Float = LocalDensity.current.run { 20.dp.toPx() }
    var cropProperties by remember {
        mutableStateOf(
            CropDefaults.properties(
                cropOutlineProperty = CropOutlineProperty(
                    OutlineType.Rect,
                    RectCropShape(0, "Rect")
                ),
                handleSize = handleSize
            )
        )
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(DanDTheme.color.backround),
        contentAlignment = Alignment.Center) {
        Column(modifier = Modifier.fillMaxSize()) {


        }
    }







}