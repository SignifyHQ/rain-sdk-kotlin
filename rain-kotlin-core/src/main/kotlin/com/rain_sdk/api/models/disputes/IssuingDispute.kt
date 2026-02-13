// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.disputes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_sdk.api.core.Enum
import com.rain_sdk.api.core.ExcludeMissing
import com.rain_sdk.api.core.JsonField
import com.rain_sdk.api.core.JsonMissing
import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.errors.RainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Represents a dispute related to an issuing transaction. */
class IssuingDispute
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val transactionId: JsonField<String>,
    private val resolvedAt: JsonField<OffsetDateTime>,
    private val textEvidence: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resolvedAt")
        @ExcludeMissing
        resolvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("textEvidence")
        @ExcludeMissing
        textEvidence: JsonField<String> = JsonMissing.of(),
    ) : this(id, createdAt, status, transactionId, resolvedAt, textEvidence, mutableMapOf())

    /**
     * The dispute's unique identifier
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The date and time when the dispute was created
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The current status of the dispute
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The transaction's unique identifier
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionId(): String = transactionId.getRequired("transactionId")

    /**
     * The date and time when the dispute was resolved, if applicable
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun resolvedAt(): OffsetDateTime? = resolvedAt.getNullable("resolvedAt")

    /**
     * Textual evidence provided by the parties involved in the dispute
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun textEvidence(): String? = textEvidence.getNullable("textEvidence")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [resolvedAt].
     *
     * Unlike [resolvedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resolvedAt")
    @ExcludeMissing
    fun _resolvedAt(): JsonField<OffsetDateTime> = resolvedAt

    /**
     * Returns the raw JSON value of [textEvidence].
     *
     * Unlike [textEvidence], this method doesn't throw if the JSON field has an unexpected type.
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

        /**
         * Returns a mutable builder for constructing an instance of [IssuingDispute].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .status()
         * .transactionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IssuingDispute]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var transactionId: JsonField<String>? = null
        private var resolvedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var textEvidence: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(issuingDispute: IssuingDispute) = apply {
            id = issuingDispute.id
            createdAt = issuingDispute.createdAt
            status = issuingDispute.status
            transactionId = issuingDispute.transactionId
            resolvedAt = issuingDispute.resolvedAt
            textEvidence = issuingDispute.textEvidence
            additionalProperties = issuingDispute.additionalProperties.toMutableMap()
        }

        /** The dispute's unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date and time when the dispute was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The current status of the dispute */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The transaction's unique identifier */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The date and time when the dispute was resolved, if applicable */
        fun resolvedAt(resolvedAt: OffsetDateTime) = resolvedAt(JsonField.of(resolvedAt))

        /**
         * Sets [Builder.resolvedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolvedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolvedAt(resolvedAt: JsonField<OffsetDateTime>) = apply {
            this.resolvedAt = resolvedAt
        }

        /** Textual evidence provided by the parties involved in the dispute */
        fun textEvidence(textEvidence: String) = textEvidence(JsonField.of(textEvidence))

        /**
         * Sets [Builder.textEvidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textEvidence] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [IssuingDispute].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .status()
         * .transactionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IssuingDispute =
            IssuingDispute(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("status", status),
                checkRequired("transactionId", transactionId),
                resolvedAt,
                textEvidence,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IssuingDispute = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        status().validate()
        transactionId()
        resolvedAt()
        textEvidence()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (transactionId.asKnown() == null) 0 else 1) +
            (if (resolvedAt.asKnown() == null) 0 else 1) +
            (if (textEvidence.asKnown() == null) 0 else 1)

    /** The current status of the dispute */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("pending")

            val IN_REVIEW = of("inReview")

            val ACCEPTED = of("accepted")

            val REJECTED = of("rejected")

            val CANCELED = of("canceled")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            IN_REVIEW,
            ACCEPTED,
            REJECTED,
            CANCELED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            IN_REVIEW,
            ACCEPTED,
            REJECTED,
            CANCELED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                IN_REVIEW -> Value.IN_REVIEW
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                CANCELED -> Value.CANCELED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RainInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                IN_REVIEW -> Known.IN_REVIEW
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                CANCELED -> Known.CANCELED
                else -> throw RainInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw RainInvalidDataException("Value is not a String")

        private var validated: Boolean = false

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

        return other is IssuingDispute &&
            id == other.id &&
            createdAt == other.createdAt &&
            status == other.status &&
            transactionId == other.transactionId &&
            resolvedAt == other.resolvedAt &&
            textEvidence == other.textEvidence &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            status,
            transactionId,
            resolvedAt,
            textEvidence,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IssuingDispute{id=$id, createdAt=$createdAt, status=$status, transactionId=$transactionId, resolvedAt=$resolvedAt, textEvidence=$textEvidence, additionalProperties=$additionalProperties}"
}
