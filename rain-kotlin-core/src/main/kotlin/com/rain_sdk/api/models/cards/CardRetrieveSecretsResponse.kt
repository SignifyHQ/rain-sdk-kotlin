// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.cards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_sdk.api.core.ExcludeMissing
import com.rain_sdk.api.core.JsonField
import com.rain_sdk.api.core.JsonMissing
import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.errors.RainInvalidDataException
import java.util.Collections
import java.util.Objects

/** The encrypted data for the card */
class CardRetrieveSecretsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val encryptedCvc: JsonField<EncryptedCvc>,
    private val encryptedPan: JsonField<EncryptedPan>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("encryptedCvc")
        @ExcludeMissing
        encryptedCvc: JsonField<EncryptedCvc> = JsonMissing.of(),
        @JsonProperty("encryptedPan")
        @ExcludeMissing
        encryptedPan: JsonField<EncryptedPan> = JsonMissing.of(),
    ) : this(encryptedCvc, encryptedPan, mutableMapOf())

    /**
     * The encrypted CVC
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun encryptedCvc(): EncryptedCvc = encryptedCvc.getRequired("encryptedCvc")

    /**
     * The encrypted PAN
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun encryptedPan(): EncryptedPan = encryptedPan.getRequired("encryptedPan")

    /**
     * Returns the raw JSON value of [encryptedCvc].
     *
     * Unlike [encryptedCvc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("encryptedCvc")
    @ExcludeMissing
    fun _encryptedCvc(): JsonField<EncryptedCvc> = encryptedCvc

    /**
     * Returns the raw JSON value of [encryptedPan].
     *
     * Unlike [encryptedPan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("encryptedPan")
    @ExcludeMissing
    fun _encryptedPan(): JsonField<EncryptedPan> = encryptedPan

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
         * Returns a mutable builder for constructing an instance of [CardRetrieveSecretsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .encryptedCvc()
         * .encryptedPan()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CardRetrieveSecretsResponse]. */
    class Builder internal constructor() {

        private var encryptedCvc: JsonField<EncryptedCvc>? = null
        private var encryptedPan: JsonField<EncryptedPan>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardRetrieveSecretsResponse: CardRetrieveSecretsResponse) = apply {
            encryptedCvc = cardRetrieveSecretsResponse.encryptedCvc
            encryptedPan = cardRetrieveSecretsResponse.encryptedPan
            additionalProperties = cardRetrieveSecretsResponse.additionalProperties.toMutableMap()
        }

        /** The encrypted CVC */
        fun encryptedCvc(encryptedCvc: EncryptedCvc) = encryptedCvc(JsonField.of(encryptedCvc))

        /**
         * Sets [Builder.encryptedCvc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryptedCvc] with a well-typed [EncryptedCvc] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun encryptedCvc(encryptedCvc: JsonField<EncryptedCvc>) = apply {
            this.encryptedCvc = encryptedCvc
        }

        /** The encrypted PAN */
        fun encryptedPan(encryptedPan: EncryptedPan) = encryptedPan(JsonField.of(encryptedPan))

        /**
         * Sets [Builder.encryptedPan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryptedPan] with a well-typed [EncryptedPan] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun encryptedPan(encryptedPan: JsonField<EncryptedPan>) = apply {
            this.encryptedPan = encryptedPan
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
         * Returns an immutable instance of [CardRetrieveSecretsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .encryptedCvc()
         * .encryptedPan()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardRetrieveSecretsResponse =
            CardRetrieveSecretsResponse(
                checkRequired("encryptedCvc", encryptedCvc),
                checkRequired("encryptedPan", encryptedPan),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardRetrieveSecretsResponse = apply {
        if (validated) {
            return@apply
        }

        encryptedCvc().validate()
        encryptedPan().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: RainInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (encryptedCvc.asKnown()?.validity() ?: 0) + (encryptedPan.asKnown()?.validity() ?: 0)

    /** The encrypted CVC */
    class EncryptedCvc
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
         * The encrypted data
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): String = data.getRequired("data")

        /**
         * The initialization vector
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
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
             * Returns a mutable builder for constructing an instance of [EncryptedCvc].
             *
             * The following fields are required:
             * ```kotlin
             * .data()
             * .iv()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [EncryptedCvc]. */
        class Builder internal constructor() {

            private var data: JsonField<String>? = null
            private var iv: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(encryptedCvc: EncryptedCvc) = apply {
                data = encryptedCvc.data
                iv = encryptedCvc.iv
                additionalProperties = encryptedCvc.additionalProperties.toMutableMap()
            }

            /** The encrypted data */
            fun data(data: String) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<String>) = apply { this.data = data }

            /** The initialization vector */
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
             * Returns an immutable instance of [EncryptedCvc].
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
            fun build(): EncryptedCvc =
                EncryptedCvc(
                    checkRequired("data", data),
                    checkRequired("iv", iv),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EncryptedCvc = apply {
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
            } catch (e: RainInvalidDataException) {
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

            return other is EncryptedCvc &&
                data == other.data &&
                iv == other.iv &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, iv, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EncryptedCvc{data=$data, iv=$iv, additionalProperties=$additionalProperties}"
    }

    /** The encrypted PAN */
    class EncryptedPan
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
         * The encrypted data
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): String = data.getRequired("data")

        /**
         * The initialization vector
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
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
             * Returns a mutable builder for constructing an instance of [EncryptedPan].
             *
             * The following fields are required:
             * ```kotlin
             * .data()
             * .iv()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [EncryptedPan]. */
        class Builder internal constructor() {

            private var data: JsonField<String>? = null
            private var iv: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(encryptedPan: EncryptedPan) = apply {
                data = encryptedPan.data
                iv = encryptedPan.iv
                additionalProperties = encryptedPan.additionalProperties.toMutableMap()
            }

            /** The encrypted data */
            fun data(data: String) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<String>) = apply { this.data = data }

            /** The initialization vector */
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
             * Returns an immutable instance of [EncryptedPan].
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
            fun build(): EncryptedPan =
                EncryptedPan(
                    checkRequired("data", data),
                    checkRequired("iv", iv),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EncryptedPan = apply {
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
            } catch (e: RainInvalidDataException) {
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

            return other is EncryptedPan &&
                data == other.data &&
                iv == other.iv &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, iv, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EncryptedPan{data=$data, iv=$iv, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardRetrieveSecretsResponse &&
            encryptedCvc == other.encryptedCvc &&
            encryptedPan == other.encryptedPan &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(encryptedCvc, encryptedPan, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardRetrieveSecretsResponse{encryptedCvc=$encryptedCvc, encryptedPan=$encryptedPan, additionalProperties=$additionalProperties}"
}
