// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.user

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import com.rain_sdk.api.models.applications.company.IssuingApplication
import com.rain_sdk.api.models.applications.company.PhysicalAddress
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssuingUserTest {

    @Test
    fun create() {
        val issuingUser =
            IssuingUser.builder()
                .applicationStatus(IssuingApplication.ApplicationStatus.APPROVED)
                .applicationCompletionLink(
                    IssuingApplication.ApplicationCompletionLink.builder()
                        .url("https://example.com")
                        .params(
                            IssuingApplication.ApplicationCompletionLink.Params.builder()
                                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .applicationExternalVerificationLink(
                    IssuingApplication.ApplicationExternalVerificationLink.builder()
                        .url("https://example.com")
                        .params(
                            IssuingApplication.ApplicationExternalVerificationLink.Params.builder()
                                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .applicationReason("applicationReason")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .email("email")
                .firstName("firstName")
                .isActive(true)
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
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .phoneCountryCode("1")
                .phoneNumber("5555555555")
                .build()

        assertThat(issuingUser.applicationStatus())
            .isEqualTo(IssuingApplication.ApplicationStatus.APPROVED)
        assertThat(issuingUser.applicationCompletionLink())
            .isEqualTo(
                IssuingApplication.ApplicationCompletionLink.builder()
                    .url("https://example.com")
                    .params(
                        IssuingApplication.ApplicationCompletionLink.Params.builder()
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )
        assertThat(issuingUser.applicationExternalVerificationLink())
            .isEqualTo(
                IssuingApplication.ApplicationExternalVerificationLink.builder()
                    .url("https://example.com")
                    .params(
                        IssuingApplication.ApplicationExternalVerificationLink.Params.builder()
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )
        assertThat(issuingUser.applicationReason()).isEqualTo("applicationReason")
        assertThat(issuingUser.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(issuingUser.email()).isEqualTo("email")
        assertThat(issuingUser.firstName()).isEqualTo("firstName")
        assertThat(issuingUser.isActive()).isEqualTo(true)
        assertThat(issuingUser.isTermsOfServiceAccepted()).isEqualTo(true)
        assertThat(issuingUser.lastName()).isEqualTo("lastName")
        assertThat(issuingUser.address())
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
        assertThat(issuingUser.companyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(issuingUser.phoneCountryCode()).isEqualTo("1")
        assertThat(issuingUser.phoneNumber()).isEqualTo("5555555555")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingUser =
            IssuingUser.builder()
                .applicationStatus(IssuingApplication.ApplicationStatus.APPROVED)
                .applicationCompletionLink(
                    IssuingApplication.ApplicationCompletionLink.builder()
                        .url("https://example.com")
                        .params(
                            IssuingApplication.ApplicationCompletionLink.Params.builder()
                                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .applicationExternalVerificationLink(
                    IssuingApplication.ApplicationExternalVerificationLink.builder()
                        .url("https://example.com")
                        .params(
                            IssuingApplication.ApplicationExternalVerificationLink.Params.builder()
                                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .applicationReason("applicationReason")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .email("email")
                .firstName("firstName")
                .isActive(true)
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
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .phoneCountryCode("1")
                .phoneNumber("5555555555")
                .build()

        val roundtrippedIssuingUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingUser),
                jacksonTypeRef<IssuingUser>(),
            )

        assertThat(roundtrippedIssuingUser).isEqualTo(issuingUser)
    }
}
