// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.cards.pin

import com.rain_sdk.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PinRetrieveParamsTest {

    @Test
    fun create() {
        PinRetrieveParams.builder()
            .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sessionId("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PinRetrieveParams.builder()
                .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            PinRetrieveParams.builder()
                .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("x")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("SessionId", "x").build())
    }
}
