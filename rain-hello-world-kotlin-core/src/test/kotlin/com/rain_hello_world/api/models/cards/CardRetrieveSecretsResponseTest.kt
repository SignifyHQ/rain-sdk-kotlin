// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardRetrieveSecretsResponseTest {

    @Test
    fun create() {
        val cardRetrieveSecretsResponse =
            CardRetrieveSecretsResponse.builder()
                .encryptedCvc(
                    CardRetrieveSecretsResponse.EncryptedCvc.builder().data("data").iv("iv").build()
                )
                .encryptedPan(
                    CardRetrieveSecretsResponse.EncryptedPan.builder().data("data").iv("iv").build()
                )
                .build()

        assertThat(cardRetrieveSecretsResponse.encryptedCvc())
            .isEqualTo(
                CardRetrieveSecretsResponse.EncryptedCvc.builder().data("data").iv("iv").build()
            )
        assertThat(cardRetrieveSecretsResponse.encryptedPan())
            .isEqualTo(
                CardRetrieveSecretsResponse.EncryptedPan.builder().data("data").iv("iv").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardRetrieveSecretsResponse =
            CardRetrieveSecretsResponse.builder()
                .encryptedCvc(
                    CardRetrieveSecretsResponse.EncryptedCvc.builder().data("data").iv("iv").build()
                )
                .encryptedPan(
                    CardRetrieveSecretsResponse.EncryptedPan.builder().data("data").iv("iv").build()
                )
                .build()

        val roundtrippedCardRetrieveSecretsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardRetrieveSecretsResponse),
                jacksonTypeRef<CardRetrieveSecretsResponse>(),
            )

        assertThat(roundtrippedCardRetrieveSecretsResponse).isEqualTo(cardRetrieveSecretsResponse)
    }
}
