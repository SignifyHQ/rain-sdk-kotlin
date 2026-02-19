// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async.cards

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import com.rain_sdk.api.models.cards.pin.PinRetrieveParams
import com.rain_sdk.api.models.cards.pin.PinUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PinServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pinServiceAsync = client.cards().pin()

        val pin =
            pinServiceAsync.retrieve(
                PinRetrieveParams.builder()
                    .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("x")
                    .build()
            )

        pin.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pinServiceAsync = client.cards().pin()

        pinServiceAsync.update(
            PinUpdateParams.builder()
                .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("x")
                .encryptedPin(PinUpdateParams.EncryptedPin.builder().data("data").iv("iv").build())
                .build()
        )
    }
}
