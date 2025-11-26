// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.keys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyCreateResponseTest {

    @Test
    fun create() {
        val keyCreateResponse =
            KeyCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("key")
                .name("name")
                .build()

        assertThat(keyCreateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(keyCreateResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyCreateResponse.key()).isEqualTo("key")
        assertThat(keyCreateResponse.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyCreateResponse =
            KeyCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("key")
                .name("name")
                .build()

        val roundtrippedKeyCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyCreateResponse),
                jacksonTypeRef<KeyCreateResponse>(),
            )

        assertThat(roundtrippedKeyCreateResponse).isEqualTo(keyCreateResponse)
    }
}
