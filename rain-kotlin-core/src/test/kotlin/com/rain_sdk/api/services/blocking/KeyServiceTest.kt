// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.keys.KeyCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val keyService = client.keys()

        val key =
            keyService.create(KeyCreateParams.builder().expiresAt("expiresAt").name("name").build())

        key.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val keyService = client.keys()

        keyService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
