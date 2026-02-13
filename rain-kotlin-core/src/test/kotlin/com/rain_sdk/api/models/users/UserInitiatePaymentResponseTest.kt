// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserInitiatePaymentResponseTest {

    @Test
    fun create() {
        val userInitiatePaymentResponse =
            UserInitiatePaymentResponse.builder()
                .address("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .build()

        assertThat(userInitiatePaymentResponse.address())
            .isEqualTo("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userInitiatePaymentResponse =
            UserInitiatePaymentResponse.builder()
                .address("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .build()

        val roundtrippedUserInitiatePaymentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userInitiatePaymentResponse),
                jacksonTypeRef<UserInitiatePaymentResponse>(),
            )

        assertThat(roundtrippedUserInitiatePaymentResponse).isEqualTo(userInitiatePaymentResponse)
    }
}
