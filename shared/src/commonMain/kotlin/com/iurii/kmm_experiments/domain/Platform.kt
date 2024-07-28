package com.iurii.kmm_experiments.domain

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform