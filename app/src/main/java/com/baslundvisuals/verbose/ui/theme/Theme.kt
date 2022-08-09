package com.baslundvisuals.verbose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Yellow400,
    background = Neutral900,
    onBackground = Neutral100,
    error = Red400
)

private val LightColorPalette = lightColors(
    primary = Yellow400,
    background = Neutral100,
    onBackground = Neutral900,
    error = Red400
)

@Composable
fun VerboseTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}