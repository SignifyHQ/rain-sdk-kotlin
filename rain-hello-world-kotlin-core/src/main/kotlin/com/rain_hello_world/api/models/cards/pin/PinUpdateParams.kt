// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.cards.pin

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_hello_world.api.core.ExcludeMissing
import com.rain_hello_world.api.core.JsonField
import com.rain_hello_world.api.core.JsonMissing
import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.core.Params
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.core.http.Headers
import com.rain_hello_world.api.core.http.QueryParams
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.util.Collections
import java.util.Objects

/** Updates the PIN of a specific card by setting the encrypted PIN */
class PinUpdateParams
private constructor(
    private val cardId: String?,
    private val sessionId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun cardId(): String? = cardId

    fun sessionId(): String = sessionId

    /**
     * The encrypted pin
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun encryptedPin(): EncryptedPin = body.encryptedPin()

    /**
     * Returns the raw JSON value of [encryptedPin].
     *
     * Unlike [encryptedPin], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _encryptedPin(): JsonField<EncryptedPin> = body._encryptedPin()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PinUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .sessionId()
         * .encryptedPin()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PinUpdateParams]. */
    class Builder internal constructor() {

        private var cardId: String? = null
        private var sessionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(pinUpdateParams: PinUpdateParams) = apply {
            cardId = pinUpdateParams.cardId
            sessionId = pinUpdateParams.sessionId
            body = pinUpdateParams.body.toBuilder()
            additionalHeaders = pinUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = pinUpdateParams.additionalQueryParams.toBuilder()
        }

        fun cardId(cardId: String?) = apply { this.cardId = cardId }

        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [encryptedPin]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The encrypted pin */
        fun encryptedPin(encryptedPin: EncryptedPin) = apply { body.encryptedPin(encryptedPin) }

        /**
         * Sets [Builder.encryptedPin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryptedPin] with a well-typed [EncryptedPin] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun encryptedPin(encryptedPin: JsonField<EncryptedPin>) = apply {
            body.encryptedPin(encryptedPin)
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
         * Returns an immutable instance of [PinUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .sessionId()
         * .encryptedPin()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PinUpdateParams =
            PinUpdateParams(
                cardId,
                checkRequired("sessionId", sessionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> cardId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                put("SessionId", sessionId)
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val encryptedPin: JsonField<EncryptedPin>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("encryptedPin")
            @ExcludeMissing
            encryptedPin: JsonField<EncryptedPin> = JsonMissing.of()
        ) : this(encryptedPin, mutableMapOf())

        /**
         * The encrypted pin
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun encryptedPin(): EncryptedPin = encryptedPin.getRequired("encryptedPin")

        /**
         * Returns the raw JSON value of [encryptedPin].
         *
         * Unlike [encryptedPin], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("encryptedPin")
        @ExcludeMissing
        fun _encryptedPin(): JsonField<EncryptedPin> = encryptedPin

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
             * .encryptedPin()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var encryptedPin: JsonField<EncryptedPin>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                encryptedPin = body.encryptedPin
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The encrypted pin */
            fun encryptedPin(encryptedPin: EncryptedPin) = encryptedPin(JsonField.of(encryptedPin))

            /**
             * Sets [Builder.encryptedPin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.encryptedPin] with a well-typed [EncryptedPin] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun encryptedPin(encryptedPin: JsonField<EncryptedPin>) = apply {
                this.encryptedPin = encryptedPin
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
             *
             * The following fields are required:
             * ```kotlin
             * .encryptedPin()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("encryptedPin", encryptedPin),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            encryptedPin().validate()
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
        internal fun validity(): Int = (encryptedPin.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                encryptedPin == other.encryptedPin &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(encryptedPin, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{encryptedPin=$encryptedPin, additionalProperties=$additionalProperties}"
    }

    /** The encrypted pin */
    class EncryptedPin
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<String>,
        private val iv: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<String> = JsonMissing.of(),
            @JsonProperty("iv") @ExcludeMissing iv: JsonField<String> = JsonMissing.of(),
        ) : this(data, iv, mutableMapOf())

        /**
         * The encrypted PIN data
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): String = data.getRequired("data")

        /**
         * The initialization vector for encryption
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun iv(): String = iv.getRequired("iv")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

        /**
         * Returns the raw JSON value of [iv].
         *
         * Unlike [iv], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("iv") @ExcludeMissing fun _iv(): JsonField<String> = iv

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
             * Returns a mutable builder for constructing an instance of [EncryptedPin].
             *
             * The following fields are required:
             * ```kotlin
             * .data()
             * .iv()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [EncryptedPin]. */
        class Builder internal constructor() {

            private var data: JsonField<String>? = null
            private var iv: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(encryptedPin: EncryptedPin) = apply {
                data = encryptedPin.data
                iv = encryptedPin.iv
                additionalProperties = encryptedPin.additionalProperties.toMutableMap()
            }

            /** The encrypted PIN data */
            fun data(data: String) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<String>) = apply { this.data = data }

            /** The initialization vector for encryption */
            fun iv(iv: String) = iv(JsonField.of(iv))

            /**
             * Sets [Builder.iv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iv] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun iv(iv: JsonField<String>) = apply { this.iv = iv }

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
             * Returns an immutable instance of [EncryptedPin].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .data()
             * .iv()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EncryptedPin =
                EncryptedPin(
                    checkRequired("data", data),
                    checkRequired("iv", iv),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EncryptedPin = apply {
            if (validated) {
                return@apply
            }

            data()
            iv()
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
        internal fun validity(): Int =
            (if (data.asKnown() == null) 0 else 1) + (if (iv.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EncryptedPin &&
                data == other.data &&
                iv == other.iv &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, iv, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EncryptedPin{data=$data, iv=$iv, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PinUpdateParams &&
            cardId == other.cardId &&
            sessionId == other.sessionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(cardId, sessionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PinUpdateParams{cardId=$cardId, sessionId=$sessionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
