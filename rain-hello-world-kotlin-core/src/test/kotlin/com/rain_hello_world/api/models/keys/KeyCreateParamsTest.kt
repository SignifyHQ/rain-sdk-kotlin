// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.keys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyCreateParamsTest {

    @Test
    fun create() {
        KeyCreateParams.builder().expiresAt("expiresAt").name("name").build()
    }

    @Test
    fun body() {
        val params = KeyCreateParams.builder().expiresAt("expiresAt").name("name").build()

        val body = params._body()

        assertThat(body.expiresAt()).isEqualTo("expiresAt")
        assertThat(body.name()).isEqualTo("name")
    }
}
