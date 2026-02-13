// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.companies

import com.rain_sdk.api.models.applications.company.PhysicalAddress
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyCreateUserParamsTest {

    @Test
    fun create() {
        CompanyCreateUserParams.builder()
            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .email("email")
            .firstName("firstName")
            .isTermsOfServiceAccepted(true)
            .lastName("lastName")
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
            .birthDate(LocalDate.parse("2019-12-27"))
            .phoneCountryCode("phoneCountryCode")
            .phoneNumber("phoneNumber")
            .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CompanyCreateUserParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .email("email")
                .firstName("firstName")
                .isTermsOfServiceAccepted(true)
                .lastName("lastName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CompanyCreateUserParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .email("email")
                .firstName("firstName")
                .isTermsOfServiceAccepted(true)
                .lastName("lastName")
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
                .birthDate(LocalDate.parse("2019-12-27"))
                .phoneCountryCode("phoneCountryCode")
                .phoneNumber("phoneNumber")
                .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.firstName()).isEqualTo("firstName")
        assertThat(body.isTermsOfServiceAccepted()).isEqualTo(true)
        assertThat(body.lastName()).isEqualTo("lastName")
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
        assertThat(body.birthDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.phoneCountryCode()).isEqualTo("phoneCountryCode")
        assertThat(body.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(body.walletAddress()).isEqualTo("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CompanyCreateUserParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .email("email")
                .firstName("firstName")
                .isTermsOfServiceAccepted(true)
                .lastName("lastName")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.firstName()).isEqualTo("firstName")
        assertThat(body.isTermsOfServiceAccepted()).isEqualTo(true)
        assertThat(body.lastName()).isEqualTo("lastName")
    }
}
