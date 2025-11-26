// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssuingCardLimitTest {

    @Test
    fun create() {
        val issuingCardLimit =
            IssuingCardLimit.builder()
                .amount(0L)
                .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                .build()

        assertThat(issuingCardLimit.amount()).isEqualTo(0L)
        assertThat(issuingCardLimit.frequency())
            .isEqualTo(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingCardLimit =
            IssuingCardLimit.builder()
                .amount(0L)
                .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                .build()

        val roundtrippedIssuingCardLimit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingCardLimit),
                jacksonTypeRef<IssuingCardLimit>(),
            )

        assertThat(roundtrippedIssuingCardLimit).isEqualTo(issuingCardLimit)
    }
}
