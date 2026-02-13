// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.company.ubo

import com.rain_sdk.api.models.applications.company.PhysicalAddress
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UboUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            UboUpdateParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uboId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
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
        assertThat(body.birthDate()).isEqualTo(LocalDate.parse("2000-01-01"))
        assertThat(body.countryOfIssue()).isEqualTo("countryOfIssue")
        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.firstName()).isEqualTo("firstName")
        assertThat(body.lastName()).isEqualTo("lastName")
        assertThat(body.nationalId()).isEqualTo("nationalId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UboUpdateParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uboId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
