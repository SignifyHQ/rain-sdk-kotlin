// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async

import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClientAsync
import com.rain_hello_world.api.models.keys.KeyCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class KeyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.keys()

        keyServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
