// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.transactions.receipt

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_hello_world.api.core.ExcludeMissing
import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.core.MultipartField
import com.rain_hello_world.api.core.Params
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.core.http.Headers
import com.rain_hello_world.api.core.http.QueryParams
import com.rain_hello_world.api.core.toImmutable
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import kotlin.io.path.inputStream
import kotlin.io.path.name

/**
 * This endpoint allows you to upload a receipt for a specific transaction. The receipt is provided
 * as a binary file, typically in PDF format.
 */
class ReceiptUploadParams
private constructor(
    private val transactionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun transactionId(): String? = transactionId

    /**
     * The receipt file to upload, typically in PDF or other binary formats
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun receipt(): InputStream = body.receipt()

    /**
     * Returns the raw multipart value of [receipt].
     *
     * Unlike [receipt], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _receipt(): MultipartField<InputStream> = body._receipt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReceiptUploadParams].
         *
         * The following fields are required:
         * ```kotlin
         * .receipt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ReceiptUploadParams]. */
    class Builder internal constructor() {

        private var transactionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(receiptUploadParams: ReceiptUploadParams) = apply {
            transactionId = receiptUploadParams.transactionId
            body = receiptUploadParams.body.toBuilder()
            additionalHeaders = receiptUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = receiptUploadParams.additionalQueryParams.toBuilder()
        }

        fun transactionId(transactionId: String?) = apply { this.transactionId = transactionId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [receipt]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The receipt file to upload, typically in PDF or other binary formats */
        fun receipt(receipt: InputStream) = apply { body.receipt(receipt) }

        /**
         * Sets [Builder.receipt] to an arbitrary multipart value.
         *
         * You should usually call [Builder.receipt] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun receipt(receipt: MultipartField<InputStream>) = apply { body.receipt(receipt) }

        /** The receipt file to upload, typically in PDF or other binary formats */
        fun receipt(receipt: ByteArray) = apply { body.receipt(receipt) }

        /** The receipt file to upload, typically in PDF or other binary formats */
        fun receipt(path: Path) = apply { body.receipt(path) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ReceiptUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .receipt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReceiptUploadParams =
            ReceiptUploadParams(
                transactionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("receipt" to _receipt()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> transactionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val receipt: MultipartField<InputStream>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The receipt file to upload, typically in PDF or other binary formats
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun receipt(): InputStream = receipt.value.getRequired("receipt")

        /**
         * Returns the raw multipart value of [receipt].
         *
         * Unlike [receipt], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("receipt")
        @ExcludeMissing
        fun _receipt(): MultipartField<InputStream> = receipt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .receipt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var receipt: MultipartField<InputStream>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                receipt = body.receipt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The receipt file to upload, typically in PDF or other binary formats */
            fun receipt(receipt: InputStream) = receipt(MultipartField.of(receipt))

            /**
             * Sets [Builder.receipt] to an arbitrary multipart value.
             *
             * You should usually call [Builder.receipt] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receipt(receipt: MultipartField<InputStream>) = apply { this.receipt = receipt }

            /** The receipt file to upload, typically in PDF or other binary formats */
            fun receipt(receipt: ByteArray) = receipt(receipt.inputStream())

            /** The receipt file to upload, typically in PDF or other binary formats */
            fun receipt(path: Path) =
                receipt(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .receipt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("receipt", receipt), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            receipt()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RainHelloWorldInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                receipt == other.receipt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(receipt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{receipt=$receipt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReceiptUploadParams &&
            transactionId == other.transactionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(transactionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReceiptUploadParams{transactionId=$transactionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
