package com.example.dandy.imageCrop.models

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Shape

@Immutable
data class CropAspectRatio(
    val title: String,
    val shape: Shape,
    val aspectRatio: AspectRatio = AspectRatio.Original,
    val icons: List<Int> = listOf()
)

/**
 * Value class for containing aspect ratio
 * and [AspectRatio.Original] for comparing
 */
@Immutable
data class AspectRatio(val value: Float) {
    companion object {
        val Original = AspectRatio(-1f)
    }
}