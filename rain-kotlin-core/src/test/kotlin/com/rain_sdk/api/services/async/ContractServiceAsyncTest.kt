// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.rain_sdk.api.TestServerExtension
import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ContractServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            RainOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val contractServiceAsync = client.contracts()

        val issuingContracts = contractServiceAsync.list()

        issuingContracts.forEach { it.validate() }
    }
}
