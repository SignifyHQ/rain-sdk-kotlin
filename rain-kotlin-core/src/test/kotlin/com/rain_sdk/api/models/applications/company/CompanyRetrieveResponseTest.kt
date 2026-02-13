// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.company

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyRetrieveResponseTest {

    @Test
    fun create() {
        val companyRetrieveResponse =
            CompanyRetrieveResponse.builder()
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
                .addUltimateBeneficialOwner(
                    CompanyRetrieveResponse.UltimateBeneficialOwner.builder()
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
                                    IssuingApplication.ApplicationExternalVerificationLink.Params
                                        .builder()
                                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .build()
                        )
                        .applicationReason("applicationReason")
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .email("dev@stainless.com")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .build()

        assertThat(companyRetrieveResponse.applicationStatus())
            .isEqualTo(IssuingApplication.ApplicationStatus.APPROVED)
        assertThat(companyRetrieveResponse.applicationCompletionLink())
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
        assertThat(companyRetrieveResponse.applicationExternalVerificationLink())
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
        assertThat(companyRetrieveResponse.applicationReason()).isEqualTo("applicationReason")
        assertThat(companyRetrieveResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(companyRetrieveResponse.ultimateBeneficialOwners())
            .containsExactly(
                CompanyRetrieveResponse.UltimateBeneficialOwner.builder()
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
                                IssuingApplication.ApplicationExternalVerificationLink.Params
                                    .builder()
                                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .build()
                    )
                    .applicationReason("applicationReason")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .email("dev@stainless.com")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyRetrieveResponse =
            CompanyRetrieveResponse.builder()
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
                .addUltimateBeneficialOwner(
                    CompanyRetrieveResponse.UltimateBeneficialOwner.builder()
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
                                    IssuingApplication.ApplicationExternalVerificationLink.Params
                                        .builder()
                                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .build()
                        )
                        .applicationReason("applicationReason")
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .email("dev@stainless.com")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .build()

        val roundtrippedCompanyRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyRetrieveResponse),
                jacksonTypeRef<CompanyRetrieveResponse>(),
            )

        assertThat(roundtrippedCompanyRetrieveResponse).isEqualTo(companyRetrieveResponse)
    }
}
