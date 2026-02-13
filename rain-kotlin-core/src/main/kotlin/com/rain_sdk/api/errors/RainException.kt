package com.rain_sdk.api.errors

open class RainException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
