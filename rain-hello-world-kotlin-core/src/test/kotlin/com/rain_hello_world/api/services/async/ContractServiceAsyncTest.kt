// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async

import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ContractServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val contractServiceAsync = client.contracts()

        val issuingContracts = contractServiceAsync.list()

        issuingContracts.forEach { it.validate() }
    }
}
