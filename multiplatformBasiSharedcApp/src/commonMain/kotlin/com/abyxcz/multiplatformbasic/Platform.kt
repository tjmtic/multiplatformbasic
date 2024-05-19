package com.abyxcz.multiplatformbasic

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform