// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async.applications.company.ubo

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import com.rain_sdk.api.models.applications.company.ubo.document.DocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun upload() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.applications().company().ubo().document()

        documentServiceAsync.upload(
            DocumentUploadParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uboId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("some content".byteInputStream())
                .country("xxx")
                .side(DocumentUploadParams.Side.FRONT)
                .type(DocumentUploadParams.Type.ID_CARD)
                .build()
        )
    }
}
