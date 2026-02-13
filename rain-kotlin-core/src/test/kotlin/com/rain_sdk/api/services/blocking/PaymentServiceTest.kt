// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.TestServerExtension
import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.payments.PaymentInitiateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun initiate() {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentService = client.payments()

        val response =
            paymentService.initiate(
                PaymentInitiateParams.builder()
                    .amount(0L)
                    .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .chainId(0L)
                    .build()
            )

        response.validate()
    }
}
