// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.cards.pin

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PinRetrieveResponseTest {

    @Test
    fun create() {
        val pinRetrieveResponse =
            PinRetrieveResponse.builder()
                .encryptedPin(
                    PinRetrieveResponse.EncryptedPin.builder().data("data").iv("iv").build()
                )
                .build()

        assertThat(pinRetrieveResponse.encryptedPin())
            .isEqualTo(PinRetrieveResponse.EncryptedPin.builder().data("data").iv("iv").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pinRetrieveResponse =
            PinRetrieveResponse.builder()
                .encryptedPin(
                    PinRetrieveResponse.EncryptedPin.builder().data("data").iv("iv").build()
                )
                .build()

        val roundtrippedPinRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pinRetrieveResponse),
                jacksonTypeRef<PinRetrieveResponse>(),
            )

        assertThat(roundtrippedPinRetrieveResponse).isEqualTo(pinRetrieveResponse)
    }
}
