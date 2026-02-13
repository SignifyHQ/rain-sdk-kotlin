// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.companies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyChargeParamsTest {

    @Test
    fun create() {
        CompanyChargeParams.builder()
            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .issuingChargeCreateBody(
                IssuingChargeCreateBody.builder().amount(1L).description("description").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CompanyChargeParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .issuingChargeCreateBody(
                    IssuingChargeCreateBody.builder().amount(1L).description("description").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CompanyChargeParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .issuingChargeCreateBody(
                    IssuingChargeCreateBody.builder().amount(1L).description("description").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                IssuingChargeCreateBody.builder().amount(1L).description("description").build()
            )
    }
}
