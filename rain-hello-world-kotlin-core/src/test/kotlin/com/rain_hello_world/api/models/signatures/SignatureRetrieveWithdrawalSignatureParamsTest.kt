// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.signatures

import com.rain_hello_world.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignatureRetrieveWithdrawalSignatureParamsTest {

    @Test
    fun create() {
        SignatureRetrieveWithdrawalSignatureParams.builder()
            .token("token")
            .adminAddress("adminAddress")
            .amount("amount")
            .recipientAddress("recipientAddress")
            .chainId(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SignatureRetrieveWithdrawalSignatureParams.builder()
                .token("token")
                .adminAddress("adminAddress")
                .amount("amount")
                .recipientAddress("recipientAddress")
                .chainId(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("token", "token")
                    .put("adminAddress", "adminAddress")
                    .put("amount", "amount")
                    .put("recipientAddress", "recipientAddress")
                    .put("chainId", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SignatureRetrieveWithdrawalSignatureParams.builder()
                .token("token")
                .adminAddress("adminAddress")
                .amount("amount")
                .recipientAddress("recipientAddress")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("token", "token")
                    .put("adminAddress", "adminAddress")
                    .put("amount", "amount")
                    .put("recipientAddress", "recipientAddress")
                    .build()
            )
    }
}
