// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.payments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentInitiateResponseTest {

    @Test
    fun create() {
        val paymentInitiateResponse =
            PaymentInitiateResponse.builder()
                .address("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .build()

        assertThat(paymentInitiateResponse.address())
            .isEqualTo("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentInitiateResponse =
            PaymentInitiateResponse.builder()
                .address("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .build()

        val roundtrippedPaymentInitiateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentInitiateResponse),
                jacksonTypeRef<PaymentInitiateResponse>(),
            )

        assertThat(roundtrippedPaymentInitiateResponse).isEqualTo(paymentInitiateResponse)
    }
}
