// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking.applications.company

import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClient
import com.rain_hello_world.api.models.applications.company.PhysicalAddress
import com.rain_hello_world.api.models.applications.company.ubo.UboUpdateParams
import com.rain_hello_world.api.models.applications.company.ubo.UboUploadDocumentParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UboServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            RainHelloWorldOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uboService = client.applications().company().ubo()

        val issuingCompany =
            uboService.update(
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

    @Disabled("Prism tests are disabled")
    @Test
    fun uploadDocument() {
        val client =
            RainHelloWorldOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uboService = client.applications().company().ubo()

        uboService.uploadDocument(
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
