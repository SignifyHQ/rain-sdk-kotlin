// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.companies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssuingChargeCreateResponseTest {

    @Test
    fun create() {
        val issuingChargeCreateResponse =
            IssuingChargeCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .amount(1L)
                .description("description")
                .build()

        assertThat(issuingChargeCreateResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(issuingChargeCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(issuingChargeCreateResponse.amount()).isEqualTo(1L)
        assertThat(issuingChargeCreateResponse.description()).isEqualTo("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingChargeCreateResponse =
            IssuingChargeCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .amount(1L)
                .description("description")
                .build()

        val roundtrippedIssuingChargeCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingChargeCreateResponse),
                jacksonTypeRef<IssuingChargeCreateResponse>(),
            )

        assertThat(roundtrippedIssuingChargeCreateResponse).isEqualTo(issuingChargeCreateResponse)
    }
}
