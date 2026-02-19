// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.signatures.SignatureRetrievePaymentSignatureParams
import com.rain_sdk.api.models.signatures.SignatureRetrieveWithdrawalSignatureParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SignatureServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePaymentSignature() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val signatureService = client.signatures()

        val issuingSignature =
            signatureService.retrievePaymentSignature(
                SignatureRetrievePaymentSignatureParams.builder()
                    .token("token")
                    .adminAddress("adminAddress")
                    .amount("amount")
                    .chainId(0L)
                    .build()
            )

        issuingSignature.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveWithdrawalSignature() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val signatureService = client.signatures()

        val issuingSignature =
            signatureService.retrieveWithdrawalSignature(
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
