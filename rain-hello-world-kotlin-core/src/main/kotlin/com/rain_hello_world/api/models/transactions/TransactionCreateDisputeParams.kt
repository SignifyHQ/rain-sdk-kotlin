// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.transactions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_hello_world.api.core.ExcludeMissing
import com.rain_hello_world.api.core.JsonField
import com.rain_hello_world.api.core.JsonMissing
import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.core.Params
import com.rain_hello_world.api.core.http.Headers
import com.rain_hello_world.api.core.http.QueryParams
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * This endpoint allows the creation of a dispute for a specific transaction. The dispute can
 * include textual evidence to support the claim.
 */
class TransactionCreateDisputeParams
private constructor(
    private val transactionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun transactionId(): String? = transactionId

    /**
     * The textual evidence that supports the dispute
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun textEvidence(): String? = body.textEvidence()

    /**
     * Returns the raw JSON value of [textEvidence].
     *
     * Unlike [textEvidence], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _textEvidence(): JsonField<String> = body._textEvidence()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): TransactionCreateDisputeParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionCreateDisputeParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [TransactionCreateDisputeParams]. */
    class Builder internal constructor() {

        private var transactionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionCreateDisputeParams: TransactionCreateDisputeParams) = apply {
            transactionId = transactionCreateDisputeParams.transactionId
            body = transactionCreateDisputeParams.body.toBuilder()
            additionalHeaders = transactionCreateDisputeParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionCreateDisputeParams.additionalQueryParams.toBuilder()
        }

        fun transactionId(transactionId: String?) = apply { this.transactionId = transactionId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [textEvidence]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The textual evidence that supports the dispute */
        fun textEvidence(textEvidence: String) = apply { body.textEvidence(textEvidence) }

        /**
         * Sets [Builder.textEvidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textEvidence] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textEvidence(textEvidence: JsonField<String>) = apply {
            body.textEvidence(textEvidence)
        }

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
         * Returns an immutable instance of [TransactionCreateDisputeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TransactionCreateDisputeParams =
            TransactionCreateDisputeParams(
                transactionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> transactionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val textEvidence: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("textEvidence")
            @ExcludeMissing
            textEvidence: JsonField<String> = JsonMissing.of()
        ) : this(textEvidence, mutableMapOf())

        /**
         * The textual evidence that supports the dispute
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun textEvidence(): String? = textEvidence.getNullable("textEvidence")

        /**
         * Returns the raw JSON value of [textEvidence].
         *
         * Unlike [textEvidence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("textEvidence")
        @ExcludeMissing
        fun _textEvidence(): JsonField<String> = textEvidence

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var textEvidence: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                textEvidence = body.textEvidence
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The textual evidence that supports the dispute */
            fun textEvidence(textEvidence: String) = textEvidence(JsonField.of(textEvidence))

            /**
             * Sets [Builder.textEvidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textEvidence] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textEvidence(textEvidence: JsonField<String>) = apply {
                this.textEvidence = textEvidence
            }

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
             */
            fun build(): Body = Body(textEvidence, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            textEvidence()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RainHelloWorldInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = (if (textEvidence.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                textEvidence == other.textEvidence &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(textEvidence, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{textEvidence=$textEvidence, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionCreateDisputeParams &&
            transactionId == other.transactionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(transactionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransactionCreateDisputeParams{transactionId=$transactionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
