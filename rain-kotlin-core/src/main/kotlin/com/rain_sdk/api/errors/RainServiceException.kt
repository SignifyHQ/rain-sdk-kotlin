// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.errors

import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.http.Headers

abstract class RainServiceException
protected constructor(message: String, cause: Throwable? = null) : RainException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
