// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.signatures

import com.rain_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignatureRetrievePaymentSignatureParamsTest {

    @Test
    fun create() {
        SignatureRetrievePaymentSignatureParams.builder()
            .token("token")
            .adminAddress("adminAddress")
            .amount("amount")
            .chainId(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SignatureRetrievePaymentSignatureParams.builder()
                .token("token")
                .adminAddress("adminAddress")
                .amount("amount")
                .chainId(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("token", "token")
                    .put("adminAddress", "adminAddress")
                    .put("amount", "amount")
                    .put("chainId", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SignatureRetrievePaymentSignatureParams.builder()
                .token("token")
                .adminAddress("adminAddress")
                .amount("amount")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("token", "token")
                    .put("adminAddress", "adminAddress")
                    .put("amount", "amount")
                    .build()
            )
    }
}
