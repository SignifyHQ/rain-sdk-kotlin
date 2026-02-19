// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContractServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val contractService = client.contracts()

        val issuingContracts = contractService.list()

        issuingContracts.forEach { it.validate() }
    }
}
