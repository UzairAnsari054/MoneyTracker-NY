package com.example.moneytracker_ex.spending_overview.util


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import kotlin.random.Random

/**
 * @author Ahmed Guedmioui
 */

fun randomColor(minBrightness: Int = 90): Int {
    val random = Random.Default
    val red = random.nextInt(minBrightness, 256)
    val green = random.nextInt(minBrightness, 256)
    val blue = random.nextInt(minBrightness, 256)
    return Color(red, green, blue).copy(0.3f).toArgb()
}