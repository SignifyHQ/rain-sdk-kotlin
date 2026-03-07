// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.user

import com.rain_sdk.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUploadDocumentParamsTest {

    @Test
    fun create() {
        UserUploadDocumentParams.builder()
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .document("Example data".byteInputStream())
            .country("xxx")
            .name("name")
            .side(UserUploadDocumentParams.Side.FRONT)
            .type(UserUploadDocumentParams.Type.ID_CARD)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UserUploadDocumentParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("Example data".byteInputStream())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserUploadDocumentParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("Example data".byteInputStream())
                .country("xxx")
                .name("name")
                .side(UserUploadDocumentParams.Side.FRONT)
                .type(UserUploadDocumentParams.Type.ID_CARD)
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
                        "document" to MultipartField.of("Example data".byteInputStream()),
                        "country" to MultipartField.of("xxx"),
                        "name" to MultipartField.of("name"),
                        "side" to MultipartField.of(UserUploadDocumentParams.Side.FRONT),
                        "type" to MultipartField.of(UserUploadDocumentParams.Type.ID_CARD),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserUploadDocumentParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("Example data".byteInputStream())
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
                mapOf("document" to MultipartField.of("Example data".byteInputStream()))
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
