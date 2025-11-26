// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.companies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssuingChargeCreateBodyTest {

    @Test
    fun create() {
        val issuingChargeCreateBody =
            IssuingChargeCreateBody.builder().amount(1L).description("description").build()

        assertThat(issuingChargeCreateBody.amount()).isEqualTo(1L)
        assertThat(issuingChargeCreateBody.description()).isEqualTo("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingChargeCreateBody =
            IssuingChargeCreateBody.builder().amount(1L).description("description").build()

        val roundtrippedIssuingChargeCreateBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingChargeCreateBody),
                jacksonTypeRef<IssuingChargeCreateBody>(),
            )

        assertThat(roundtrippedIssuingChargeCreateBody).isEqualTo(issuingChargeCreateBody)
    }
}
