package com.sjaindl.hvtdp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
