// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async.applications.company

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import com.rain_sdk.api.models.applications.company.PhysicalAddress
import com.rain_sdk.api.models.applications.company.ubo.UboUpdateParams
import com.rain_sdk.api.models.applications.company.ubo.UboUploadDocumentParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UboServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uboServiceAsync = client.applications().company().ubo()

        val issuingCompany =
            uboServiceAsync.update(
                UboUpdateParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .uboId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .address(
                        PhysicalAddress.builder()
                            .city("city")
                            .country("country")
                            .countryCode("xx")
                            .line1("line1")
                            .postalCode("postalCode")
                            .region("region")
                            .line2("line2")
                            .build()
                    )
                    .birthDate(LocalDate.parse("2000-01-01"))
                    .countryOfIssue("countryOfIssue")
                    .email("dev@stainless.com")
                    .firstName("firstName")
                    .lastName("lastName")
                    .nationalId("nationalId")
                    .build()
            )

        issuingCompany.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun uploadDocument() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uboServiceAsync = client.applications().company().ubo()

        uboServiceAsync.uploadDocument(
            UboUploadDocumentParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("some content".byteInputStream())
                .email("email")
                .country("xxx")
                .side(UboUploadDocumentParams.Side.FRONT)
                .type(UboUploadDocumentParams.Type.ID_CARD)
                .build()
        )
    }
}
