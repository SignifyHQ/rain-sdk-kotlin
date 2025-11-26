// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.applications.company.ubo

import com.rain_hello_world.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UboUploadDocumentParamsTest {

    @Test
    fun create() {
        UboUploadDocumentParams.builder()
            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .document("some content".byteInputStream())
            .email("email")
            .country("xxx")
            .side(UboUploadDocumentParams.Side.FRONT)
            .type(UboUploadDocumentParams.Type.ID_CARD)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UboUploadDocumentParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("some content".byteInputStream())
                .email("email")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UboUploadDocumentParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("some content".byteInputStream())
                .email("email")
                .country("xxx")
                .side(UboUploadDocumentParams.Side.FRONT)
                .type(UboUploadDocumentParams.Type.ID_CARD)
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
                        "document" to MultipartField.of("some content".byteInputStream()),
                        "email" to MultipartField.of("email"),
                        "country" to MultipartField.of("xxx"),
                        "side" to MultipartField.of(UboUploadDocumentParams.Side.FRONT),
                        "type" to MultipartField.of(UboUploadDocumentParams.Type.ID_CARD),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UboUploadDocumentParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("some content".byteInputStream())
                .email("email")
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
                        "document" to MultipartField.of("some content".byteInputStream()),
                        "email" to MultipartField.of("email"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
