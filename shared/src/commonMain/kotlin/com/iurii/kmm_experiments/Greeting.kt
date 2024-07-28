package com.iurii.kmm_experiments

import com.iurii.kmm_experiments.domain.Platform
import com.iurii.kmm_experiments.domain.getPlatform

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}