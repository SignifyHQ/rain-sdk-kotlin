// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentInitiateParamsTest {

    @Test
    fun create() {
        PaymentInitiateParams.builder()
            .amount(0L)
            .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
            .chainId(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentInitiateParams.builder()
                .amount(0L)
                .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .chainId(0L)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.walletAddress()).isEqualTo("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
        assertThat(body.chainId()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentInitiateParams.builder()
                .amount(0L)
                .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.walletAddress()).isEqualTo("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
    }
}
