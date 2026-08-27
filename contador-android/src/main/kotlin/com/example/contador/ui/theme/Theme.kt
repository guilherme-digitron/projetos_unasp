package com.example.contador.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF0066cc),
    onPrimary = Color.White,
    secondary = Color(0xFF51cf66),
    onSecondary = Color.White,
    background = Color(0xFFF5F5F5),
    surface = Color.White
)

@Composable
fun ContadorTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        content = content
    )
}
