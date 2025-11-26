// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async

import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BalanceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val balanceServiceAsync = client.balances()

        val balance = balanceServiceAsync.retrieve()

        balance.validate()
    }
}
