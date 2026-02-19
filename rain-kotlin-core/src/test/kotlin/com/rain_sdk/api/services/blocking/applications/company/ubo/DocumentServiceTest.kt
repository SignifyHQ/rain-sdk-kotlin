// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.applications.company.ubo

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.applications.company.ubo.document.DocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.applications().company().ubo().document()

        documentService.upload(
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
