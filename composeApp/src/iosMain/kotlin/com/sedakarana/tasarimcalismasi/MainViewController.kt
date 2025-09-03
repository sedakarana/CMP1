package com.sedakarana.tasarimcalismasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIScreen

fun MainViewController() = ComposeUIViewController { App() }

@Composable
actual fun getEkranGenisligi(): Double = LocalWindowInfo.current.containerSize.width.pxToPoint()

@Composable
actual fun getEkranYuksekligi(): Double = LocalWindowInfo.current.containerSize.height.pxToPoint()

fun Int.pxToPoint(): Double = this.toDouble() / UIScreen.mainScreen.scale