package com.sedakarana.tasarimcalismasi

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import tasarimcalismasi.composeapp.generated.resources.Res
import tasarimcalismasi.composeapp.generated.resources.compose_multiplatform
import tasarimcalismasi.composeapp.generated.resources.pizza

@Composable
expect fun getEkranGenisligi(): Double

@Composable
expect fun getEkranYuksekligi(): Double

@Composable //Görsel çalışma yapılıyor demek
@Preview //Ön izleme
fun App(darkTheme: Boolean = isSystemInDarkTheme()) { //Büyük harfler başlar

    var rowList = ArrayList<String>()
    rowList.add("Peynir")
    rowList.add("Zeytin")
    rowList.add("Mısır")
    rowList.add("Sos")

    MaterialTheme { //Tema
        /* Column( //Altalta sıralamamızı sağlar
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
        }*/

        Column(
            modifier = Modifier.fillMaxSize()
                .background(if (darkTheme) backgroundColorDark else backgroundColorLight),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                "PİZZA",
                fontSize = getEkranGenisligi().sp * 0.15,
                color = if (darkTheme) redBackgroundColorDark else redBackgroundColorLight,
                fontFamily = getTitleFontFamily()
            )

            Image(painter = painterResource(Res.drawable.pizza), contentDescription = "")
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                for (item in rowList) {
                    MyButton(item, darkTheme)
                }

            }

            Text(
                text = "20 Dakika",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = if (darkTheme) textColorDark2 else textColorLight2
            )

            Text(
                text = "Harika lezzet hep sizinle. Bir adım ötenizde",
                fontSize = 20.sp,
                color = if (darkTheme) textColorDark2 else textColorLight2,
                textAlign = TextAlign.Center
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Text(
                    text = "450 ₺",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (darkTheme) redBackgroundColorDark else redBackgroundColorLight,
                    textAlign = TextAlign.Center
                )

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (darkTheme) redBackgroundColorDark else redBackgroundColorLight,
                        contentColor = if (darkTheme) textColorDark1 else textColorLight1
                    )
                ) {
                    Text(text = "Sepete Ekle", fontSize = 20.sp)
                }
            }
        }
    }
}