// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.transactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionCreateDisputeParamsTest {

    @Test
    fun create() {
        TransactionCreateDisputeParams.builder()
            .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .textEvidence("textEvidence")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TransactionCreateDisputeParams.builder()
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TransactionCreateDisputeParams.builder()
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .textEvidence("textEvidence")
                .build()

        val body = params._body()

        assertThat(body.textEvidence()).isEqualTo("textEvidence")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionCreateDisputeParams.builder()
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
