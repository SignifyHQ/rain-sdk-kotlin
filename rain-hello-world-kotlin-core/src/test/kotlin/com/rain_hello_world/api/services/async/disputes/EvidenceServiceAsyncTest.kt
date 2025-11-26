// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async.disputes

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClientAsync
import com.rain_hello_world.api.models.disputes.evidence.EvidenceUploadParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class EvidenceServiceAsyncTest {

    @Test
    suspend fun list(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val evidenceServiceAsync = client.disputes().evidence()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val evidences = evidenceServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        assertThat(evidences.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun upload() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val evidenceServiceAsync = client.disputes().evidence()

        evidenceServiceAsync.upload(
            EvidenceUploadParams.builder()
                .disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evidence("some content".byteInputStream())
                .name("name")
                .type("type")
                .build()
        )
    }
}
