package com.sedakarana.tasarimcalismasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.Font
import tasarimcalismasi.composeapp.generated.resources.Res
import tasarimcalismasi.composeapp.generated.resources.title

@Composable
fun getTitleFontFamily() = FontFamily(Font(Res.font.title))