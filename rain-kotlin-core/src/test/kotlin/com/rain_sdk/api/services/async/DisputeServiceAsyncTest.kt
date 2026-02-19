// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import com.rain_sdk.api.models.disputes.DisputeListParams
import com.rain_sdk.api.models.disputes.DisputeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DisputeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val disputeServiceAsync = client.disputes()

        val issuingDispute = disputeServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingDispute.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val disputeServiceAsync = client.disputes()

        disputeServiceAsync.update(
            DisputeUpdateParams.builder()
                .disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(DisputeUpdateParams.Status.CANCELED)
                .textEvidence("textEvidence")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val disputeServiceAsync = client.disputes()

        val issuingDisputes =
            disputeServiceAsync.list(
                DisputeListParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .limit(1L)
                    .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        issuingDisputes.forEach { it.validate() }
    }
}
