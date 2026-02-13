// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.companies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyInitiatePaymentResponseTest {

    @Test
    fun create() {
        val companyInitiatePaymentResponse =
            CompanyInitiatePaymentResponse.builder()
                .address("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .build()

        assertThat(companyInitiatePaymentResponse.address())
            .isEqualTo("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyInitiatePaymentResponse =
            CompanyInitiatePaymentResponse.builder()
                .address("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .build()

        val roundtrippedCompanyInitiatePaymentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyInitiatePaymentResponse),
                jacksonTypeRef<CompanyInitiatePaymentResponse>(),
            )

        assertThat(roundtrippedCompanyInitiatePaymentResponse)
            .isEqualTo(companyInitiatePaymentResponse)
    }
}
