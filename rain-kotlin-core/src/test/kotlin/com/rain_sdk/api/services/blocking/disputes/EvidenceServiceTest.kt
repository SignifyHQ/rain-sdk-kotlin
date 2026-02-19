// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.disputes

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.disputes.evidence.EvidenceUploadParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class EvidenceServiceTest {

    @Test
    fun list(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val evidenceService = client.disputes().evidence()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val evidences = evidenceService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        assertThat(evidences.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val evidenceService = client.disputes().evidence()

        evidenceService.upload(
            EvidenceUploadParams.builder()
                .disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evidence("some content".byteInputStream())
                .name("name")
                .type("type")
                .build()
        )
    }
}
