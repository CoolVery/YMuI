package com.example.ymui.presentation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ymui.R

data class TypographyStyle (
    val headlineFont: TextStyle,
    val commonFont: TextStyle
)

val typography = TypographyStyle(
    headlineFont = TextStyle(
        fontFamily = FontFamily(Font(R.font.cramaten)),
        fontSize = 64.sp
    ),
    commonFont = TextStyle(
        fontFamily = FontFamily(Font(R.font.antelive)),
        fontSize = 32.sp
    )
)

val LocalTypography = staticCompositionLocalOf { typography }