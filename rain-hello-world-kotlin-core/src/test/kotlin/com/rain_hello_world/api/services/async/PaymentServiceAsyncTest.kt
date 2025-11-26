// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async

import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClientAsync
import com.rain_hello_world.api.models.payments.PaymentInitiateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun initiate() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
