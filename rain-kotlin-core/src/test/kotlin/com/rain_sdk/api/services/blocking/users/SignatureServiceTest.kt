// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.users

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.users.signatures.SignatureRetrievePaymentSignatureParams
import com.rain_sdk.api.models.users.signatures.SignatureRetrieveWithdrawalSignatureParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SignatureServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrievePaymentSignature() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val signatureService = client.users().signatures()

        val issuingSignature =
            signatureService.retrievePaymentSignature(
                SignatureRetrievePaymentSignatureParams.builder()
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
    fun retrieveWithdrawalSignature() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val signatureService = client.users().signatures()

        val issuingSignature =
            signatureService.retrieveWithdrawalSignature(
                SignatureRetrieveWithdrawalSignatureParams.builder()
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
