// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.disputes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssuingDisputeTest {

    @Test
    fun create() {
        val issuingDispute =
            IssuingDispute.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(IssuingDispute.Status.PENDING)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .textEvidence("textEvidence")
                .build()

        assertThat(issuingDispute.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(issuingDispute.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(issuingDispute.status()).isEqualTo(IssuingDispute.Status.PENDING)
        assertThat(issuingDispute.transactionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(issuingDispute.resolvedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(issuingDispute.textEvidence()).isEqualTo("textEvidence")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingDispute =
            IssuingDispute.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(IssuingDispute.Status.PENDING)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .textEvidence("textEvidence")
                .build()

        val roundtrippedIssuingDispute =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingDispute),
                jacksonTypeRef<IssuingDispute>(),
            )

        assertThat(roundtrippedIssuingDispute).isEqualTo(issuingDispute)
    }
}
