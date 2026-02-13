// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.disputes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeUpdateParamsTest {

    @Test
    fun create() {
        DisputeUpdateParams.builder()
            .disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(DisputeUpdateParams.Status.CANCELED)
            .textEvidence("textEvidence")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DisputeUpdateParams.builder().disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DisputeUpdateParams.builder()
                .disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(DisputeUpdateParams.Status.CANCELED)
                .textEvidence("textEvidence")
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(DisputeUpdateParams.Status.CANCELED)
        assertThat(body.textEvidence()).isEqualTo("textEvidence")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DisputeUpdateParams.builder().disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
