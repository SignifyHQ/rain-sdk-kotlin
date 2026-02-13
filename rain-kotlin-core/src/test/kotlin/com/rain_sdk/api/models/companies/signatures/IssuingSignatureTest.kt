// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.companies.signatures

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.jsonMapper
import com.rain_sdk.api.errors.RainInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class IssuingSignatureTest {

    @Test
    fun ofIfSignatureIsPending() {
        val ifSignatureIsPending =
            IssuingSignature.IfSignatureIsPending.builder()
                .retryAfter(0L)
                .status(IssuingSignature.IfSignatureIsPending.Status.PENDING)
                .build()

        val issuingSignature = IssuingSignature.ofIfSignatureIsPending(ifSignatureIsPending)

        assertThat(issuingSignature.ifSignatureIsPending()).isEqualTo(ifSignatureIsPending)
        assertThat(issuingSignature.ifSignatureIsReady()).isNull()
    }

    @Test
    fun ofIfSignatureIsPendingRoundtrip() {
        val jsonMapper = jsonMapper()
        val issuingSignature =
            IssuingSignature.ofIfSignatureIsPending(
                IssuingSignature.IfSignatureIsPending.builder()
                    .retryAfter(0L)
                    .status(IssuingSignature.IfSignatureIsPending.Status.PENDING)
                    .build()
            )

        val roundtrippedIssuingSignature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingSignature),
                jacksonTypeRef<IssuingSignature>(),
            )

        assertThat(roundtrippedIssuingSignature).isEqualTo(issuingSignature)
    }

    @Test
    fun ofIfSignatureIsReady() {
        val ifSignatureIsReady =
            IssuingSignature.IfSignatureIsReady.builder()
                .signature(
                    IssuingSignature.IfSignatureIsReady.Signature.builder()
                        .data("data")
                        .salt("salt")
                        .build()
                )
                .status(IssuingSignature.IfSignatureIsReady.Status.READY)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val issuingSignature = IssuingSignature.ofIfSignatureIsReady(ifSignatureIsReady)

        assertThat(issuingSignature.ifSignatureIsPending()).isNull()
        assertThat(issuingSignature.ifSignatureIsReady()).isEqualTo(ifSignatureIsReady)
    }

    @Test
    fun ofIfSignatureIsReadyRoundtrip() {
        val jsonMapper = jsonMapper()
        val issuingSignature =
            IssuingSignature.ofIfSignatureIsReady(
                IssuingSignature.IfSignatureIsReady.builder()
                    .signature(
                        IssuingSignature.IfSignatureIsReady.Signature.builder()
                            .data("data")
                            .salt("salt")
                            .build()
                    )
                    .status(IssuingSignature.IfSignatureIsReady.Status.READY)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedIssuingSignature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingSignature),
                jacksonTypeRef<IssuingSignature>(),
            )

        assertThat(roundtrippedIssuingSignature).isEqualTo(issuingSignature)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val issuingSignature =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<IssuingSignature>())

        val e = assertThrows<RainInvalidDataException> { issuingSignature.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
