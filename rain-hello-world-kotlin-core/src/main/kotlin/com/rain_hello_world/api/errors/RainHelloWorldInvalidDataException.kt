package com.rain_hello_world.api.errors

class RainHelloWorldInvalidDataException(message: String? = null, cause: Throwable? = null) :
    RainHelloWorldException(message, cause)
