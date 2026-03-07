// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.company

import com.rain_sdk.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyUploadDocumentParamsTest {

    @Test
    fun create() {
        CompanyUploadDocumentParams.builder()
            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .document("Example data".byteInputStream())
            .country("xxx")
            .name("name")
            .side(CompanyUploadDocumentParams.Side.FRONT)
            .type(CompanyUploadDocumentParams.Type.DIRECTORS_REGISTRY)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CompanyUploadDocumentParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("Example data".byteInputStream())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CompanyUploadDocumentParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("Example data".byteInputStream())
                .country("xxx")
                .name("name")
                .side(CompanyUploadDocumentParams.Side.FRONT)
                .type(CompanyUploadDocumentParams.Type.DIRECTORS_REGISTRY)
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
                        "side" to MultipartField.of(CompanyUploadDocumentParams.Side.FRONT),
                        "type" to
                            MultipartField.of(CompanyUploadDocumentParams.Type.DIRECTORS_REGISTRY),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CompanyUploadDocumentParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
