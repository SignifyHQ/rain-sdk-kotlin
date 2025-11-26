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
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.util.Collections
import java.util.Objects

/** The encrypted pin */
class PinRetrieveResponse
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
     * Unlike [encryptedPin], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [PinRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .encryptedPin()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PinRetrieveResponse]. */
    class Builder internal constructor() {

        private var encryptedPin: JsonField<EncryptedPin>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(pinRetrieveResponse: PinRetrieveResponse) = apply {
            encryptedPin = pinRetrieveResponse.encryptedPin
            additionalProperties = pinRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [PinRetrieveResponse].
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
        fun build(): PinRetrieveResponse =
            PinRetrieveResponse(
                checkRequired("encryptedPin", encryptedPin),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PinRetrieveResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = (encryptedPin.asKnown()?.validity() ?: 0)

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
         * The encrypted pin in base64
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): String = data.getRequired("data")

        /**
         * The initialization vector in base64
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

            /** The encrypted pin in base64 */
            fun data(data: String) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<String>) = apply { this.data = data }

            /** The initialization vector in base64 */
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

        return other is PinRetrieveResponse &&
            encryptedPin == other.encryptedPin &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(encryptedPin, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PinRetrieveResponse{encryptedPin=$encryptedPin, additionalProperties=$additionalProperties}"
}
