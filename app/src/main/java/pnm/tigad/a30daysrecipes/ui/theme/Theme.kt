package pnm.tigad.a30daysrecipes.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val AppColorScheme = lightColorScheme(
    primary = Color(0xFFFFA239),
    secondary = Color(0xFFFFE08F),
    background = Color(0xFFFFF8DE)
)

@Composable
fun A30DaysRecipesTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = AppTypography,
        content = content
    )
}