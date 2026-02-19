// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.cards

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.cards.pin.PinRetrieveParams
import com.rain_sdk.api.models.cards.pin.PinUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PinServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val pinService = client.cards().pin()

        val pin =
            pinService.retrieve(
                PinRetrieveParams.builder()
                    .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("x")
                    .build()
            )

        pin.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val pinService = client.cards().pin()

        pinService.update(
            PinUpdateParams.builder()
                .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("x")
                .encryptedPin(PinUpdateParams.EncryptedPin.builder().data("data").iv("iv").build())
                .build()
        )
    }
}
