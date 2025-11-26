// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.disputes.evidence

import com.rain_hello_world.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvidenceUploadParamsTest {

    @Test
    fun create() {
        EvidenceUploadParams.builder()
            .disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .evidence("some content".byteInputStream())
            .name("name")
            .type("type")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EvidenceUploadParams.builder()
                .disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evidence("some content".byteInputStream())
                .name("name")
                .type("type")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EvidenceUploadParams.builder()
                .disputeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evidence("some content".byteInputStream())
                .name("name")
                .type("type")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "evidence" to MultipartField.of("some content".byteInputStream()),
                        "name" to MultipartField.of("name"),
                        "type" to MultipartField.of("type"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
