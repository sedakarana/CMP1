package com.sedakarana.tasarimcalismasi

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun MyButton(icerik: String,darkTheme : Boolean) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = if(darkTheme) redBackgroundColorDark else redBackgroundColorLight,
            contentColor = textColorLight1
        )
    ) {
        Text(text = icerik, fontSize = 18.sp)
    }
}

