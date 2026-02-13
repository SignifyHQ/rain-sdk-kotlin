// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.companies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyRetrieveBalancesResponseTest {

    @Test
    fun create() {
        val companyRetrieveBalancesResponse =
            CompanyRetrieveBalancesResponse.builder()
                .balanceDue(0L)
                .creditLimit(0L)
                .pendingCharges(0L)
                .postedCharges(0L)
                .spendingPower(0L)
                .build()

        assertThat(companyRetrieveBalancesResponse.balanceDue()).isEqualTo(0L)
        assertThat(companyRetrieveBalancesResponse.creditLimit()).isEqualTo(0L)
        assertThat(companyRetrieveBalancesResponse.pendingCharges()).isEqualTo(0L)
        assertThat(companyRetrieveBalancesResponse.postedCharges()).isEqualTo(0L)
        assertThat(companyRetrieveBalancesResponse.spendingPower()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyRetrieveBalancesResponse =
            CompanyRetrieveBalancesResponse.builder()
                .balanceDue(0L)
                .creditLimit(0L)
                .pendingCharges(0L)
                .postedCharges(0L)
                .spendingPower(0L)
                .build()

        val roundtrippedCompanyRetrieveBalancesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyRetrieveBalancesResponse),
                jacksonTypeRef<CompanyRetrieveBalancesResponse>(),
            )

        assertThat(roundtrippedCompanyRetrieveBalancesResponse)
            .isEqualTo(companyRetrieveBalancesResponse)
    }
}
