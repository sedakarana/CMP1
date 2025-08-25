package com.sedakarana.tasarimcalismasi

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import tasarimcalismasi.composeapp.generated.resources.Res
import tasarimcalismasi.composeapp.generated.resources.compose_multiplatform

@Composable //Görsel çalışma yapılıyor demek
@Preview //Ön izleme
fun App() { //Büyük harfler başlar
    MaterialTheme { //Tema
        Column( //Altalta sıralamamızı sağlar
            modifier = Modifier.fillMaxSize() //Tüm ekranı kaplar
                .background(Color.Red),
            verticalArrangement = Arrangement.Center, //dikeyde merkezle
            horizontalAlignment = Alignment.CenterHorizontally //Yatakda merkezle
        ) {

            Text(
                text = "Merhaba Dünya",
                fontSize = 40.sp,//Text için sp kullanılır.Çünkü kullanıcının yazı boyuta duyarlıdır.
                color = Color.White
            )
        }
    }
}