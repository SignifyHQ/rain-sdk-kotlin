// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.errors

import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.core.http.Headers

abstract class RainHelloWorldServiceException
protected constructor(message: String, cause: Throwable? = null) :
    RainHelloWorldException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
