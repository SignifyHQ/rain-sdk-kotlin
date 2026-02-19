// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BalanceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val balanceServiceAsync = client.balances()

        val balance = balanceServiceAsync.retrieve()

        balance.validate()
    }
}
