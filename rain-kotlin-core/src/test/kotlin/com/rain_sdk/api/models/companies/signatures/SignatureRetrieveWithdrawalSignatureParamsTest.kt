// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.companies.signatures

import com.rain_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignatureRetrieveWithdrawalSignatureParamsTest {

    @Test
    fun create() {
        SignatureRetrieveWithdrawalSignatureParams.builder()
            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .token("token")
            .adminAddress("adminAddress")
            .amount("amount")
            .recipientAddress("recipientAddress")
            .chainId(0L)
            .isAmountNative(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SignatureRetrieveWithdrawalSignatureParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .token("token")
                .adminAddress("adminAddress")
                .amount("amount")
                .recipientAddress("recipientAddress")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SignatureRetrieveWithdrawalSignatureParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .token("token")
                .adminAddress("adminAddress")
                .amount("amount")
                .recipientAddress("recipientAddress")
                .chainId(0L)
                .isAmountNative(true)
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
                    .put("isAmountNative", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SignatureRetrieveWithdrawalSignatureParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
