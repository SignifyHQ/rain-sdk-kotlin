// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.companies

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.companies.signatures.SignatureRetrievePaymentSignatureParams
import com.rain_sdk.api.models.companies.signatures.SignatureRetrieveWithdrawalSignatureParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SignatureServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePaymentSignature() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val signatureService = client.companies().signatures()

        val issuingSignature =
            signatureService.retrievePaymentSignature(
                SignatureRetrievePaymentSignatureParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .token("token")
                    .adminAddress("adminAddress")
                    .amount("amount")
                    .chainId(0L)
                    .isAmountNative(true)
                    .build()
            )

        issuingSignature.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveWithdrawalSignature() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val signatureService = client.companies().signatures()

        val issuingSignature =
            signatureService.retrieveWithdrawalSignature(
                SignatureRetrieveWithdrawalSignatureParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .token("token")
                    .adminAddress("adminAddress")
                    .amount("amount")
                    .recipientAddress("recipientAddress")
                    .chainId(0L)
                    .isAmountNative(true)
                    .build()
            )

        issuingSignature.validate()
    }
}
