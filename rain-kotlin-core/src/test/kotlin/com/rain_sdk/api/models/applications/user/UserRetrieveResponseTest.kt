// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.user

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import com.rain_sdk.api.models.applications.company.IssuingApplication
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveResponseTest {

    @Test
    fun create() {
        val userRetrieveResponse =
            UserRetrieveResponse.builder()
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
                .build()

        assertThat(userRetrieveResponse.applicationStatus())
            .isEqualTo(IssuingApplication.ApplicationStatus.APPROVED)
        assertThat(userRetrieveResponse.applicationCompletionLink())
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
        assertThat(userRetrieveResponse.applicationExternalVerificationLink())
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
        assertThat(userRetrieveResponse.applicationReason()).isEqualTo("applicationReason")
        assertThat(userRetrieveResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRetrieveResponse =
            UserRetrieveResponse.builder()
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
                .build()

        val roundtrippedUserRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRetrieveResponse),
                jacksonTypeRef<UserRetrieveResponse>(),
            )

        assertThat(roundtrippedUserRetrieveResponse).isEqualTo(userRetrieveResponse)
    }
}
