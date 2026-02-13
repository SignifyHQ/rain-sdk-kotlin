// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.TestServerExtension
import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BalanceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val balanceService = client.balances()

        val balance = balanceService.retrieve()

        balance.validate()
    }
}
