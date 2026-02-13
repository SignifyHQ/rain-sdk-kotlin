// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.users.signatures

import com.rain_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignatureRetrievePaymentSignatureParamsTest {

    @Test
    fun create() {
        SignatureRetrievePaymentSignatureParams.builder()
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .token("token")
            .adminAddress("adminAddress")
            .amount("amount")
            .chainId(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SignatureRetrievePaymentSignatureParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .token("token")
                .adminAddress("adminAddress")
                .amount("amount")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SignatureRetrievePaymentSignatureParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
