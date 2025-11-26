// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async.transactions

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClientAsync
import com.rain_hello_world.api.models.transactions.receipt.ReceiptUploadParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ReceiptServiceAsyncTest {

    @Test
    suspend fun retrieve(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val receiptServiceAsync = client.transactions().receipt()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val receipt = receiptServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        assertThat(receipt.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun upload() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val receiptServiceAsync = client.transactions().receipt()

        receiptServiceAsync.upload(
            ReceiptUploadParams.builder()
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receipt("some content".byteInputStream())
                .build()
        )
    }
}
