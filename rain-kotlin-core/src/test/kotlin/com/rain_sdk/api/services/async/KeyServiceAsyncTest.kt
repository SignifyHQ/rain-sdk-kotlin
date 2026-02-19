// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import com.rain_sdk.api.models.keys.KeyCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val keyServiceAsync = client.keys()

        val key =
            keyServiceAsync.create(
                KeyCreateParams.builder().expiresAt("expiresAt").name("name").build()
            )

        key.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val keyServiceAsync = client.keys()

        keyServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
