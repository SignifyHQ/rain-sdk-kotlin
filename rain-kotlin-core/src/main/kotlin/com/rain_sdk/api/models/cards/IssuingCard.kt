// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.cards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_sdk.api.core.Enum
import com.rain_sdk.api.core.ExcludeMissing
import com.rain_sdk.api.core.JsonField
import com.rain_sdk.api.core.JsonMissing
import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.checkKnown
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.toImmutable
import com.rain_sdk.api.errors.RainInvalidDataException
import java.util.Collections
import java.util.Objects

class IssuingCard
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val companyId: JsonField<String>,
    private val expirationMonth: JsonField<String>,
    private val expirationYear: JsonField<String>,
    private val last4: JsonField<String>,
    private val status: JsonField<IssuingCardStatus>,
    private val type: JsonField<Type>,
    private val userId: JsonField<String>,
    private val limit: JsonField<IssuingCardLimit>,
    private val tokenWallets: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("companyId") @ExcludeMissing companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expirationMonth")
        @ExcludeMissing
        expirationMonth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expirationYear")
        @ExcludeMissing
        expirationYear: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last4") @ExcludeMissing last4: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<IssuingCardStatus> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("limit")
        @ExcludeMissing
        limit: JsonField<IssuingCardLimit> = JsonMissing.of(),
        @JsonProperty("tokenWallets")
        @ExcludeMissing
        tokenWallets: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        companyId,
        expirationMonth,
        expirationYear,
        last4,
        status,
        type,
        userId,
        limit,
        tokenWallets,
        mutableMapOf(),
    )

    /**
     * The card's ID
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The ID of the company that issued the card
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun companyId(): String = companyId.getRequired("companyId")

    /**
     * The expiration month of the card
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expirationMonth(): String = expirationMonth.getRequired("expirationMonth")

    /**
     * The expiration year of the card
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expirationYear(): String = expirationYear.getRequired("expirationYear")

    /**
     * The last four digits of the card number
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun last4(): String = last4.getRequired("last4")

    /**
     * The card's current status
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): IssuingCardStatus = status.getRequired("status")

    /**
     * The type of the card (physical or virtual)
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The userID to whom the card was issued
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("userId")

    /**
     * The card's spending limit
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun limit(): IssuingCardLimit? = limit.getNullable("limit")

    /**
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun tokenWallets(): List<String>? = tokenWallets.getNullable("tokenWallets")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [companyId].
     *
     * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyId") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

    /**
     * Returns the raw JSON value of [expirationMonth].
     *
     * Unlike [expirationMonth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expirationMonth")
    @ExcludeMissing
    fun _expirationMonth(): JsonField<String> = expirationMonth

    /**
     * Returns the raw JSON value of [expirationYear].
     *
     * Unlike [expirationYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expirationYear")
    @ExcludeMissing
    fun _expirationYear(): JsonField<String> = expirationYear

    /**
     * Returns the raw JSON value of [last4].
     *
     * Unlike [last4], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last4") @ExcludeMissing fun _last4(): JsonField<String> = last4

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<IssuingCardStatus> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<IssuingCardLimit> = limit

    /**
     * Returns the raw JSON value of [tokenWallets].
     *
     * Unlike [tokenWallets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tokenWallets")
    @ExcludeMissing
    fun _tokenWallets(): JsonField<List<String>> = tokenWallets

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
         * Returns a mutable builder for constructing an instance of [IssuingCard].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .companyId()
         * .expirationMonth()
         * .expirationYear()
         * .last4()
         * .status()
         * .type()
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IssuingCard]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var companyId: JsonField<String>? = null
        private var expirationMonth: JsonField<String>? = null
        private var expirationYear: JsonField<String>? = null
        private var last4: JsonField<String>? = null
        private var status: JsonField<IssuingCardStatus>? = null
        private var type: JsonField<Type>? = null
        private var userId: JsonField<String>? = null
        private var limit: JsonField<IssuingCardLimit> = JsonMissing.of()
        private var tokenWallets: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(issuingCard: IssuingCard) = apply {
            id = issuingCard.id
            companyId = issuingCard.companyId
            expirationMonth = issuingCard.expirationMonth
            expirationYear = issuingCard.expirationYear
            last4 = issuingCard.last4
            status = issuingCard.status
            type = issuingCard.type
            userId = issuingCard.userId
            limit = issuingCard.limit
            tokenWallets = issuingCard.tokenWallets.map { it.toMutableList() }
            additionalProperties = issuingCard.additionalProperties.toMutableMap()
        }

        /** The card's ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The ID of the company that issued the card */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * Sets [Builder.companyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** The expiration month of the card */
        fun expirationMonth(expirationMonth: String) =
            expirationMonth(JsonField.of(expirationMonth))

        /**
         * Sets [Builder.expirationMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationMonth] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expirationMonth(expirationMonth: JsonField<String>) = apply {
            this.expirationMonth = expirationMonth
        }

        /** The expiration year of the card */
        fun expirationYear(expirationYear: String) = expirationYear(JsonField.of(expirationYear))

        /**
         * Sets [Builder.expirationYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationYear] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expirationYear(expirationYear: JsonField<String>) = apply {
            this.expirationYear = expirationYear
        }

        /** The last four digits of the card number */
        fun last4(last4: String) = last4(JsonField.of(last4))

        /**
         * Sets [Builder.last4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.last4] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun last4(last4: JsonField<String>) = apply { this.last4 = last4 }

        /** The card's current status */
        fun status(status: IssuingCardStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [IssuingCardStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<IssuingCardStatus>) = apply { this.status = status }

        /** The type of the card (physical or virtual) */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The userID to whom the card was issued */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** The card's spending limit */
        fun limit(limit: IssuingCardLimit) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [IssuingCardLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun limit(limit: JsonField<IssuingCardLimit>) = apply { this.limit = limit }

        fun tokenWallets(tokenWallets: List<String>) = tokenWallets(JsonField.of(tokenWallets))

        /**
         * Sets [Builder.tokenWallets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenWallets] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenWallets(tokenWallets: JsonField<List<String>>) = apply {
            this.tokenWallets = tokenWallets.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tokenWallets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTokenWallet(tokenWallet: String) = apply {
            tokenWallets =
                (tokenWallets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tokenWallets", it).add(tokenWallet)
                }
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
         * Returns an immutable instance of [IssuingCard].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .companyId()
         * .expirationMonth()
         * .expirationYear()
         * .last4()
         * .status()
         * .type()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IssuingCard =
            IssuingCard(
                checkRequired("id", id),
                checkRequired("companyId", companyId),
                checkRequired("expirationMonth", expirationMonth),
                checkRequired("expirationYear", expirationYear),
                checkRequired("last4", last4),
                checkRequired("status", status),
                checkRequired("type", type),
                checkRequired("userId", userId),
                limit,
                (tokenWallets ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): IssuingCard = apply {
        if (validated) {
            return@apply
        }

        id()
        companyId()
        expirationMonth()
        expirationYear()
        last4()
        status().validate()
        type().validate()
        userId()
        limit()?.validate()
        tokenWallets()
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
            (if (companyId.asKnown() == null) 0 else 1) +
            (if (expirationMonth.asKnown() == null) 0 else 1) +
            (if (expirationYear.asKnown() == null) 0 else 1) +
            (if (last4.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0) +
            (if (userId.asKnown() == null) 0 else 1) +
            (limit.asKnown()?.validity() ?: 0) +
            (tokenWallets.asKnown()?.size ?: 0)

    /** The type of the card (physical or virtual) */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PHYSICAL = of("physical")

            val VIRTUAL = of("virtual")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PHYSICAL,
            VIRTUAL,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PHYSICAL,
            VIRTUAL,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PHYSICAL -> Value.PHYSICAL
                VIRTUAL -> Value.VIRTUAL
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
                PHYSICAL -> Known.PHYSICAL
                VIRTUAL -> Known.VIRTUAL
                else -> throw RainInvalidDataException("Unknown Type: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws RainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IssuingCard &&
            id == other.id &&
            companyId == other.companyId &&
            expirationMonth == other.expirationMonth &&
            expirationYear == other.expirationYear &&
            last4 == other.last4 &&
            status == other.status &&
            type == other.type &&
            userId == other.userId &&
            limit == other.limit &&
            tokenWallets == other.tokenWallets &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            companyId,
            expirationMonth,
            expirationYear,
            last4,
            status,
            type,
            userId,
            limit,
            tokenWallets,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IssuingCard{id=$id, companyId=$companyId, expirationMonth=$expirationMonth, expirationYear=$expirationYear, last4=$last4, status=$status, type=$type, userId=$userId, limit=$limit, tokenWallets=$tokenWallets, additionalProperties=$additionalProperties}"
}
