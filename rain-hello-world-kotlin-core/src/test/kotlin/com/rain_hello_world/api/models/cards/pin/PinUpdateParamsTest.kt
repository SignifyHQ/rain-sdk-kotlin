// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.cards.pin

import com.rain_hello_world.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PinUpdateParamsTest {

    @Test
    fun create() {
        PinUpdateParams.builder()
            .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sessionId("x")
            .encryptedPin(PinUpdateParams.EncryptedPin.builder().data("data").iv("iv").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PinUpdateParams.builder()
                .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("x")
                .encryptedPin(PinUpdateParams.EncryptedPin.builder().data("data").iv("iv").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            PinUpdateParams.builder()
                .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("x")
                .encryptedPin(PinUpdateParams.EncryptedPin.builder().data("data").iv("iv").build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("SessionId", "x").build())
    }

    @Test
    fun body() {
        val params =
            PinUpdateParams.builder()
                .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("x")
                .encryptedPin(PinUpdateParams.EncryptedPin.builder().data("data").iv("iv").build())
                .build()

        val body = params._body()

        assertThat(body.encryptedPin())
            .isEqualTo(PinUpdateParams.EncryptedPin.builder().data("data").iv("iv").build())
    }
}
