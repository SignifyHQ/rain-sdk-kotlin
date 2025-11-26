// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking.applications.company.ubo

import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClient
import com.rain_hello_world.api.models.applications.company.ubo.document.DocumentUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            RainHelloWorldOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
