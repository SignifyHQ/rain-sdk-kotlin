// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.companies.signatures

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.BaseDeserializer
import com.rain_sdk.api.core.BaseSerializer
import com.rain_sdk.api.core.Enum
import com.rain_sdk.api.core.ExcludeMissing
import com.rain_sdk.api.core.JsonField
import com.rain_sdk.api.core.JsonMissing
import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.allMaxBy
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.getOrThrow
import com.rain_sdk.api.errors.RainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Indicates the signature is pending and provides the time after which a retry is possible. */
@JsonDeserialize(using = IssuingSignature.Deserializer::class)
@JsonSerialize(using = IssuingSignature.Serializer::class)
class IssuingSignature
private constructor(
    private val ifSignatureIsPending: IfSignatureIsPending? = null,
    private val ifSignatureIsReady: IfSignatureIsReady? = null,
    private val _json: JsonValue? = null,
) {

    /** Indicates the signature is pending and provides the time after which a retry is possible. */
    fun ifSignatureIsPending(): IfSignatureIsPending? = ifSignatureIsPending

    /**
     * Indicates that the signature is ready and includes the signature data and expiration time.
     */
    fun ifSignatureIsReady(): IfSignatureIsReady? = ifSignatureIsReady

    fun isIfSignatureIsPending(): Boolean = ifSignatureIsPending != null

    fun isIfSignatureIsReady(): Boolean = ifSignatureIsReady != null

    /** Indicates the signature is pending and provides the time after which a retry is possible. */
    fun asIfSignatureIsPending(): IfSignatureIsPending =
        ifSignatureIsPending.getOrThrow("ifSignatureIsPending")

    /**
     * Indicates that the signature is ready and includes the signature data and expiration time.
     */
    fun asIfSignatureIsReady(): IfSignatureIsReady =
        ifSignatureIsReady.getOrThrow("ifSignatureIsReady")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.rain_sdk.api.core.JsonValue
     *
     * val result: String? = issuingSignature.accept(object : IssuingSignature.Visitor<String?> {
     *     override fun visitIfSignatureIsPending(ifSignatureIsPending: IfSignatureIsPending): String? = ifSignatureIsPending.toString()
     *
     *     // ...
     *
     *     override fun unknown(json: JsonValue?): String? {
     *         // Or inspect the `json`.
     *         return null
     *     }
     * })
     * ```
     *
     * @throws RainInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and the
     *   current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            ifSignatureIsPending != null -> visitor.visitIfSignatureIsPending(ifSignatureIsPending)
            ifSignatureIsReady != null -> visitor.visitIfSignatureIsReady(ifSignatureIsReady)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws RainInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): IssuingSignature = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIfSignatureIsPending(ifSignatureIsPending: IfSignatureIsPending) {
                    ifSignatureIsPending.validate()
                }

                override fun visitIfSignatureIsReady(ifSignatureIsReady: IfSignatureIsReady) {
                    ifSignatureIsReady.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitIfSignatureIsPending(ifSignatureIsPending: IfSignatureIsPending) =
                    ifSignatureIsPending.validity()

                override fun visitIfSignatureIsReady(ifSignatureIsReady: IfSignatureIsReady) =
                    ifSignatureIsReady.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IssuingSignature &&
            ifSignatureIsPending == other.ifSignatureIsPending &&
            ifSignatureIsReady == other.ifSignatureIsReady
    }

    override fun hashCode(): Int = Objects.hash(ifSignatureIsPending, ifSignatureIsReady)

    override fun toString(): String =
        when {
            ifSignatureIsPending != null ->
                "IssuingSignature{ifSignatureIsPending=$ifSignatureIsPending}"
            ifSignatureIsReady != null -> "IssuingSignature{ifSignatureIsReady=$ifSignatureIsReady}"
            _json != null -> "IssuingSignature{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid IssuingSignature")
        }

    companion object {

        /**
         * Indicates the signature is pending and provides the time after which a retry is possible.
         */
        fun ofIfSignatureIsPending(ifSignatureIsPending: IfSignatureIsPending) =
            IssuingSignature(ifSignatureIsPending = ifSignatureIsPending)

        /**
         * Indicates that the signature is ready and includes the signature data and expiration
         * time.
         */
        fun ofIfSignatureIsReady(ifSignatureIsReady: IfSignatureIsReady) =
            IssuingSignature(ifSignatureIsReady = ifSignatureIsReady)
    }

    /**
     * An interface that defines how to map each variant of [IssuingSignature] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /**
         * Indicates the signature is pending and provides the time after which a retry is possible.
         */
        fun visitIfSignatureIsPending(ifSignatureIsPending: IfSignatureIsPending): T

        /**
         * Indicates that the signature is ready and includes the signature data and expiration
         * time.
         */
        fun visitIfSignatureIsReady(ifSignatureIsReady: IfSignatureIsReady): T

        /**
         * Maps an unknown variant of [IssuingSignature] to a value of type [T].
         *
         * An instance of [IssuingSignature] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws RainInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw RainInvalidDataException("Unknown IssuingSignature: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<IssuingSignature>(IssuingSignature::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): IssuingSignature {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<IfSignatureIsPending>())?.let {
                            IssuingSignature(ifSignatureIsPending = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IfSignatureIsReady>())?.let {
                            IssuingSignature(ifSignatureIsReady = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> IssuingSignature(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<IssuingSignature>(IssuingSignature::class) {

        override fun serialize(
            value: IssuingSignature,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.ifSignatureIsPending != null ->
                    generator.writeObject(value.ifSignatureIsPending)
                value.ifSignatureIsReady != null -> generator.writeObject(value.ifSignatureIsReady)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid IssuingSignature")
            }
        }
    }

    /** Indicates the signature is pending and provides the time after which a retry is possible. */
    class IfSignatureIsPending
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val retryAfter: JsonField<Long>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("retryAfter")
            @ExcludeMissing
            retryAfter: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(retryAfter, status, mutableMapOf())

        /**
         * The number of seconds after which the signature can be retried
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun retryAfter(): Long = retryAfter.getRequired("retryAfter")

        /**
         * The status of the signature
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Returns the raw JSON value of [retryAfter].
         *
         * Unlike [retryAfter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retryAfter") @ExcludeMissing fun _retryAfter(): JsonField<Long> = retryAfter

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
             * Returns a mutable builder for constructing an instance of [IfSignatureIsPending].
             *
             * The following fields are required:
             * ```kotlin
             * .retryAfter()
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [IfSignatureIsPending]. */
        class Builder internal constructor() {

            private var retryAfter: JsonField<Long>? = null
            private var status: JsonField<Status>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ifSignatureIsPending: IfSignatureIsPending) = apply {
                retryAfter = ifSignatureIsPending.retryAfter
                status = ifSignatureIsPending.status
                additionalProperties = ifSignatureIsPending.additionalProperties.toMutableMap()
            }

            /** The number of seconds after which the signature can be retried */
            fun retryAfter(retryAfter: Long) = retryAfter(JsonField.of(retryAfter))

            /**
             * Sets [Builder.retryAfter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retryAfter] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retryAfter(retryAfter: JsonField<Long>) = apply { this.retryAfter = retryAfter }

            /** The status of the signature */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [IfSignatureIsPending].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .retryAfter()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): IfSignatureIsPending =
                IfSignatureIsPending(
                    checkRequired("retryAfter", retryAfter),
                    checkRequired("status", status),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws RainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): IfSignatureIsPending = apply {
            if (validated) {
                return@apply
            }

            retryAfter()
            status().validate()
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
            (if (retryAfter.asKnown() == null) 0 else 1) + (status.asKnown()?.validity() ?: 0)

        /** The status of the signature */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PENDING = of("pending")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    else -> throw RainInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws RainInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw RainInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RainInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IfSignatureIsPending &&
                retryAfter == other.retryAfter &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(retryAfter, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IfSignatureIsPending{retryAfter=$retryAfter, status=$status, additionalProperties=$additionalProperties}"
    }

    /**
     * Indicates that the signature is ready and includes the signature data and expiration time.
     */
    class IfSignatureIsReady
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val signature: JsonField<Signature>,
        private val status: JsonField<Status>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("signature")
            @ExcludeMissing
            signature: JsonField<Signature> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("expiresAt")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(signature, status, expiresAt, mutableMapOf())

        /**
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun signature(): Signature = signature.getRequired("signature")

        /**
         * The status of the signature
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * The time at which the signature will expire
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expiresAt")

        /**
         * Returns the raw JSON value of [signature].
         *
         * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signature")
        @ExcludeMissing
        fun _signature(): JsonField<Signature> = signature

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiresAt")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

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
             * Returns a mutable builder for constructing an instance of [IfSignatureIsReady].
             *
             * The following fields are required:
             * ```kotlin
             * .signature()
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [IfSignatureIsReady]. */
        class Builder internal constructor() {

            private var signature: JsonField<Signature>? = null
            private var status: JsonField<Status>? = null
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ifSignatureIsReady: IfSignatureIsReady) = apply {
                signature = ifSignatureIsReady.signature
                status = ifSignatureIsReady.status
                expiresAt = ifSignatureIsReady.expiresAt
                additionalProperties = ifSignatureIsReady.additionalProperties.toMutableMap()
            }

            fun signature(signature: Signature) = signature(JsonField.of(signature))

            /**
             * Sets [Builder.signature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signature] with a well-typed [Signature] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signature(signature: JsonField<Signature>) = apply { this.signature = signature }

            /** The status of the signature */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The time at which the signature will expire */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
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
             * Returns an immutable instance of [IfSignatureIsReady].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .signature()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): IfSignatureIsReady =
                IfSignatureIsReady(
                    checkRequired("signature", signature),
                    checkRequired("status", status),
                    expiresAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws RainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): IfSignatureIsReady = apply {
            if (validated) {
                return@apply
            }

            signature().validate()
            status().validate()
            expiresAt()
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
            (signature.asKnown()?.validity() ?: 0) +
                (status.asKnown()?.validity() ?: 0) +
                (if (expiresAt.asKnown() == null) 0 else 1)

        class Signature
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val data: JsonField<String>,
            private val salt: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("data") @ExcludeMissing data: JsonField<String> = JsonMissing.of(),
                @JsonProperty("salt") @ExcludeMissing salt: JsonField<String> = JsonMissing.of(),
            ) : this(data, salt, mutableMapOf())

            /**
             * The actual signature data
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun data(): String = data.getRequired("data")

            /**
             * The salt used to generate the signature
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun salt(): String = salt.getRequired("salt")

            /**
             * Returns the raw JSON value of [data].
             *
             * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

            /**
             * Returns the raw JSON value of [salt].
             *
             * Unlike [salt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("salt") @ExcludeMissing fun _salt(): JsonField<String> = salt

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
                 * Returns a mutable builder for constructing an instance of [Signature].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .data()
                 * .salt()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Signature]. */
            class Builder internal constructor() {

                private var data: JsonField<String>? = null
                private var salt: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(signature: Signature) = apply {
                    data = signature.data
                    salt = signature.salt
                    additionalProperties = signature.additionalProperties.toMutableMap()
                }

                /** The actual signature data */
                fun data(data: String) = data(JsonField.of(data))

                /**
                 * Sets [Builder.data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.data] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun data(data: JsonField<String>) = apply { this.data = data }

                /** The salt used to generate the signature */
                fun salt(salt: String) = salt(JsonField.of(salt))

                /**
                 * Sets [Builder.salt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.salt] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun salt(salt: JsonField<String>) = apply { this.salt = salt }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Signature].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .data()
                 * .salt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Signature =
                    Signature(
                        checkRequired("data", data),
                        checkRequired("salt", salt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RainInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Signature = apply {
                if (validated) {
                    return@apply
                }

                data()
                salt()
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
                (if (data.asKnown() == null) 0 else 1) + (if (salt.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Signature &&
                    data == other.data &&
                    salt == other.salt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(data, salt, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Signature{data=$data, salt=$salt, additionalProperties=$additionalProperties}"
        }

        /** The status of the signature */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val READY = of("ready")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                READY
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                READY,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    READY -> Value.READY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    READY -> Known.READY
                    else -> throw RainInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws RainInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw RainInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RainInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IfSignatureIsReady &&
                signature == other.signature &&
                status == other.status &&
                expiresAt == other.expiresAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(signature, status, expiresAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IfSignatureIsReady{signature=$signature, status=$status, expiresAt=$expiresAt, additionalProperties=$additionalProperties}"
    }
}
