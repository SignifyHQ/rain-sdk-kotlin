// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.transactions.receipt

import com.rain_sdk.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReceiptUploadParamsTest {

    @Test
    fun create() {
        ReceiptUploadParams.builder()
            .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .receipt("some content".byteInputStream())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReceiptUploadParams.builder()
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receipt("some content".byteInputStream())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ReceiptUploadParams.builder()
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receipt("some content".byteInputStream())
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
                mapOf("receipt" to MultipartField.of("some content".byteInputStream())).mapValues {
                    (_, field) ->
                    field.map { (it as? ByteArray)?.inputStream() ?: it }
                }
            )
    }
}
