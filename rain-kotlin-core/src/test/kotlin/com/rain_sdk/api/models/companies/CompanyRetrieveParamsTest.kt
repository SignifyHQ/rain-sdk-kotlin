// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.companies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyRetrieveParamsTest {

    @Test
    fun create() {
        CompanyRetrieveParams.builder().companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
    }

    @Test
    fun pathParams() {
        val params =
            CompanyRetrieveParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
