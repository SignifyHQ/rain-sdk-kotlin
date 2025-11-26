// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking

import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClient
import com.rain_hello_world.api.models.disputes.DisputeListParams
import com.rain_hello_world.api.models.disputes.DisputeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DisputeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            RainHelloWorldOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val disputeService = client.disputes()

        val issuingDispute = disputeService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingDispute.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            RainHelloWorldOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val disputeService = client.disputes()

        disputeService.update(
            DisputeUpdateParams.builder()
                .disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(DisputeUpdateParams.Status.CANCELED)
                .textEvidence("textEvidence")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            RainHelloWorldOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val disputeService = client.disputes()

        val issuingDisputes =
            disputeService.list(
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
