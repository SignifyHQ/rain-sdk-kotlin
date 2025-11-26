// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.balances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceRetrieveResponseTest {

    @Test
    fun create() {
        val balanceRetrieveResponse =
            BalanceRetrieveResponse.builder()
                .balanceDue(0L)
                .creditLimit(0L)
                .pendingCharges(0L)
                .postedCharges(0L)
                .spendingPower(0L)
                .build()

        assertThat(balanceRetrieveResponse.balanceDue()).isEqualTo(0L)
        assertThat(balanceRetrieveResponse.creditLimit()).isEqualTo(0L)
        assertThat(balanceRetrieveResponse.pendingCharges()).isEqualTo(0L)
        assertThat(balanceRetrieveResponse.postedCharges()).isEqualTo(0L)
        assertThat(balanceRetrieveResponse.spendingPower()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceRetrieveResponse =
            BalanceRetrieveResponse.builder()
                .balanceDue(0L)
                .creditLimit(0L)
                .pendingCharges(0L)
                .postedCharges(0L)
                .spendingPower(0L)
                .build()

        val roundtrippedBalanceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceRetrieveResponse),
                jacksonTypeRef<BalanceRetrieveResponse>(),
            )

        assertThat(roundtrippedBalanceRetrieveResponse).isEqualTo(balanceRetrieveResponse)
    }
}
