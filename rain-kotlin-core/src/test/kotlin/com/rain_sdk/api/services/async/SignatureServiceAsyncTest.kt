// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import com.rain_sdk.api.models.signatures.SignatureRetrievePaymentSignatureParams
import com.rain_sdk.api.models.signatures.SignatureRetrieveWithdrawalSignatureParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SignatureServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrievePaymentSignature() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val signatureServiceAsync = client.signatures()

        val issuingSignature =
            signatureServiceAsync.retrievePaymentSignature(
                SignatureRetrievePaymentSignatureParams.builder()
                    .token("token")
                    .adminAddress("adminAddress")
                    .amount("amount")
                    .chainId(0L)
                    .build()
            )

        issuingSignature.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveWithdrawalSignature() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val signatureServiceAsync = client.signatures()

        val issuingSignature =
            signatureServiceAsync.retrieveWithdrawalSignature(
                SignatureRetrieveWithdrawalSignatureParams.builder()
                    .token("token")
                    .adminAddress("adminAddress")
                    .amount("amount")
                    .recipientAddress("recipientAddress")
                    .chainId(0L)
                    .build()
            )

        issuingSignature.validate()
    }
}
