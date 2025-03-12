package com.example.ymui.presentation.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalContext

object YMuITheme {
    val typography: TypographyStyle
        @ReadOnlyComposable
        @Composable
        get() = LocalTypography.current
    val colors: ColorPalette
        @ReadOnlyComposable
        @Composable
        get() = LocalColor.current
}

@Composable
fun YMuITheme(
    themeMode: ThemeMode = ThemeMode.Main,
    typography: TypographyStyle = YMuITheme.typography,
    content: @Composable () -> Unit
) {
    val colors = when (themeMode) {
        ThemeMode.Main -> mainTheme
    }
    CompositionLocalProvider(
        LocalTypography provides typography,
        LocalColor provides colors
    ) { }

}


sealed class ThemeMode(val title: String) {
    data object Main: ThemeMode(title = "Main")
}