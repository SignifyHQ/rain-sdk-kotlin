// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.company.ubo.document

import com.rain_sdk.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUploadParamsTest {

    @Test
    fun create() {
        DocumentUploadParams.builder()
            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .uboId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .document("Example data".byteInputStream())
            .country("xxx")
            .side(DocumentUploadParams.Side.FRONT)
            .type(DocumentUploadParams.Type.ID_CARD)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentUploadParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uboId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("Example data".byteInputStream())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DocumentUploadParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uboId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("Example data".byteInputStream())
                .country("xxx")
                .side(DocumentUploadParams.Side.FRONT)
                .type(DocumentUploadParams.Type.ID_CARD)
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
                        "side" to MultipartField.of(DocumentUploadParams.Side.FRONT),
                        "type" to MultipartField.of(DocumentUploadParams.Type.ID_CARD),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentUploadParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uboId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
