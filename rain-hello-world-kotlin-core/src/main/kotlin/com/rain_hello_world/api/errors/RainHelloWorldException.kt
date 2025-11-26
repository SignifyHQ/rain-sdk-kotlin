package com.rain_hello_world.api.errors

open class RainHelloWorldException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
