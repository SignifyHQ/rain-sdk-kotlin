// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.applications.user

import com.rain_hello_world.api.models.applications.company.PhysicalAddress
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
        UserUpdateParams.builder()
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountPurpose("accountPurpose")
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
            .annualSalary("annualSalary")
            .birthDate(LocalDate.parse("2000-01-01"))
            .countryOfIssue("countryOfIssue")
            .expectedMonthlyVolume("expectedMonthlyVolume")
            .firstName("firstName")
            .hasExistingDocuments(true)
            .ipAddress("ipAddress")
            .isTermsOfServiceAccepted(UserUpdateParams.IsTermsOfServiceAccepted.TRUE)
            .lastName("lastName")
            .nationalId("nationalId")
            .occupation("occupation")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UserUpdateParams.builder().userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserUpdateParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountPurpose("accountPurpose")
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
                .annualSalary("annualSalary")
                .birthDate(LocalDate.parse("2000-01-01"))
                .countryOfIssue("countryOfIssue")
                .expectedMonthlyVolume("expectedMonthlyVolume")
                .firstName("firstName")
                .hasExistingDocuments(true)
                .ipAddress("ipAddress")
                .isTermsOfServiceAccepted(UserUpdateParams.IsTermsOfServiceAccepted.TRUE)
                .lastName("lastName")
                .nationalId("nationalId")
                .occupation("occupation")
                .build()

        val body = params._body()

        assertThat(body.accountPurpose()).isEqualTo("accountPurpose")
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
        assertThat(body.annualSalary()).isEqualTo("annualSalary")
        assertThat(body.birthDate()).isEqualTo(LocalDate.parse("2000-01-01"))
        assertThat(body.countryOfIssue()).isEqualTo("countryOfIssue")
        assertThat(body.expectedMonthlyVolume()).isEqualTo("expectedMonthlyVolume")
        assertThat(body.firstName()).isEqualTo("firstName")
        assertThat(body.hasExistingDocuments()).isEqualTo(true)
        assertThat(body.ipAddress()).isEqualTo("ipAddress")
        assertThat(body.isTermsOfServiceAccepted())
            .isEqualTo(UserUpdateParams.IsTermsOfServiceAccepted.TRUE)
        assertThat(body.lastName()).isEqualTo("lastName")
        assertThat(body.nationalId()).isEqualTo("nationalId")
        assertThat(body.occupation()).isEqualTo("occupation")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserUpdateParams.builder().userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
