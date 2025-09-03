package com.sedakarana.tasarimcalismasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}

@Composable
actual fun getEkranGenisligi(): Double = LocalConfiguration.current.screenWidthDp.toDouble()

@Composable
actual fun getEkranYuksekligi(): Double = LocalConfiguration.current.screenHeightDp.toDouble()