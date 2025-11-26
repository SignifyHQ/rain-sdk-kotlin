// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.applications.company

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssuingApplicationTest {

    @Test
    fun create() {
        val issuingApplication =
            IssuingApplication.builder()
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
                .build()

        assertThat(issuingApplication.applicationStatus())
            .isEqualTo(IssuingApplication.ApplicationStatus.APPROVED)
        assertThat(issuingApplication.applicationCompletionLink())
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
        assertThat(issuingApplication.applicationExternalVerificationLink())
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
        assertThat(issuingApplication.applicationReason()).isEqualTo("applicationReason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingApplication =
            IssuingApplication.builder()
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
                .build()

        val roundtrippedIssuingApplication =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingApplication),
                jacksonTypeRef<IssuingApplication>(),
            )

        assertThat(roundtrippedIssuingApplication).isEqualTo(issuingApplication)
    }
}
