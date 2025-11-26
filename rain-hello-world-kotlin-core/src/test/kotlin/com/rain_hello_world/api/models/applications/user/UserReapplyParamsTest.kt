// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.applications.user

import com.rain_hello_world.api.models.applications.company.PhysicalAddress
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserReapplyParamsTest {

    @Test
    fun create() {
        UserReapplyParams.builder()
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
            .ipAddress("ipAddress")
            .isTermsOfServiceAccepted(UserReapplyParams.IsTermsOfServiceAccepted.TRUE)
            .nationalId("nationalId")
            .occupation("occupation")
            .hasExistingDocuments(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UserReapplyParams.builder()
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
                        .build()
                )
                .annualSalary("annualSalary")
                .birthDate(LocalDate.parse("2000-01-01"))
                .countryOfIssue("countryOfIssue")
                .expectedMonthlyVolume("expectedMonthlyVolume")
                .ipAddress("ipAddress")
                .isTermsOfServiceAccepted(UserReapplyParams.IsTermsOfServiceAccepted.TRUE)
                .nationalId("nationalId")
                .occupation("occupation")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserReapplyParams.builder()
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
                .ipAddress("ipAddress")
                .isTermsOfServiceAccepted(UserReapplyParams.IsTermsOfServiceAccepted.TRUE)
                .nationalId("nationalId")
                .occupation("occupation")
                .hasExistingDocuments(true)
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
        assertThat(body.ipAddress()).isEqualTo("ipAddress")
        assertThat(body.isTermsOfServiceAccepted())
            .isEqualTo(UserReapplyParams.IsTermsOfServiceAccepted.TRUE)
        assertThat(body.nationalId()).isEqualTo("nationalId")
        assertThat(body.occupation()).isEqualTo("occupation")
        assertThat(body.hasExistingDocuments()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserReapplyParams.builder()
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
                        .build()
                )
                .annualSalary("annualSalary")
                .birthDate(LocalDate.parse("2000-01-01"))
                .countryOfIssue("countryOfIssue")
                .expectedMonthlyVolume("expectedMonthlyVolume")
                .ipAddress("ipAddress")
                .isTermsOfServiceAccepted(UserReapplyParams.IsTermsOfServiceAccepted.TRUE)
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
                    .build()
            )
        assertThat(body.annualSalary()).isEqualTo("annualSalary")
        assertThat(body.birthDate()).isEqualTo(LocalDate.parse("2000-01-01"))
        assertThat(body.countryOfIssue()).isEqualTo("countryOfIssue")
        assertThat(body.expectedMonthlyVolume()).isEqualTo("expectedMonthlyVolume")
        assertThat(body.ipAddress()).isEqualTo("ipAddress")
        assertThat(body.isTermsOfServiceAccepted())
            .isEqualTo(UserReapplyParams.IsTermsOfServiceAccepted.TRUE)
        assertThat(body.nationalId()).isEqualTo("nationalId")
        assertThat(body.occupation()).isEqualTo("occupation")
    }
}
