// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveBalancesResponseTest {

    @Test
    fun create() {
        val userRetrieveBalancesResponse =
            UserRetrieveBalancesResponse.builder()
                .balanceDue(0L)
                .creditLimit(0L)
                .pendingCharges(0L)
                .postedCharges(0L)
                .spendingPower(0L)
                .build()

        assertThat(userRetrieveBalancesResponse.balanceDue()).isEqualTo(0L)
        assertThat(userRetrieveBalancesResponse.creditLimit()).isEqualTo(0L)
        assertThat(userRetrieveBalancesResponse.pendingCharges()).isEqualTo(0L)
        assertThat(userRetrieveBalancesResponse.postedCharges()).isEqualTo(0L)
        assertThat(userRetrieveBalancesResponse.spendingPower()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRetrieveBalancesResponse =
            UserRetrieveBalancesResponse.builder()
                .balanceDue(0L)
                .creditLimit(0L)
                .pendingCharges(0L)
                .postedCharges(0L)
                .spendingPower(0L)
                .build()

        val roundtrippedUserRetrieveBalancesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRetrieveBalancesResponse),
                jacksonTypeRef<UserRetrieveBalancesResponse>(),
            )

        assertThat(roundtrippedUserRetrieveBalancesResponse).isEqualTo(userRetrieveBalancesResponse)
    }
}
