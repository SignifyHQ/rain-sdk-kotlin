// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async.companies

import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClientAsync
import com.rain_hello_world.api.models.companies.signatures.SignatureRetrievePaymentSignatureParams
import com.rain_hello_world.api.models.companies.signatures.SignatureRetrieveWithdrawalSignatureParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SignatureServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrievePaymentSignature() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signatureServiceAsync = client.companies().signatures()

        val issuingSignature =
            signatureServiceAsync.retrievePaymentSignature(
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
    suspend fun retrieveWithdrawalSignature() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signatureServiceAsync = client.companies().signatures()

        val issuingSignature =
            signatureServiceAsync.retrieveWithdrawalSignature(
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
