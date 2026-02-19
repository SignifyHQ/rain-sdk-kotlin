// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import com.rain_sdk.api.models.payments.PaymentInitiateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PaymentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun initiate() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val paymentServiceAsync = client.payments()

        val response =
            paymentServiceAsync.initiate(
                PaymentInitiateParams.builder()
                    .amount(0L)
                    .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .chainId(0L)
                    .build()
            )

        response.validate()
    }
}
