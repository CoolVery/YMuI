package com.example.ymui.presentation.ui.theme

import android.graphics.ColorMatrix
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class ColorPalette(
    val background: Color,
    val backgroundElement: Color,
    val colorHeadlineText: Color,
    val colorCommonText: Color,
    val colorTextInElement: Color,
    val colorShadow: Color,
    val colorIcon: Color
)

val mainTheme = ColorPalette(
    background = Color(0xFFFFFFFF),
    backgroundElement = Color(0xFF3FADE5),
    colorHeadlineText = Color(0xFF000000),
    colorCommonText = Color(0xFF000000),
    colorTextInElement = Color(0xFF000000),
    colorShadow = Color(0xFF000000),
    colorIcon = Color(0xFFFFFFFF)
)

val LocalColor = staticCompositionLocalOf { mainTheme }