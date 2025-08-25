package com.sedakarana.tasarimcalismasi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform