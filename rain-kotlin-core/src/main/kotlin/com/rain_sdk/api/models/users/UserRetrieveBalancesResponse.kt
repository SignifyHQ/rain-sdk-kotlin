// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.users

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

class UserRetrieveBalancesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val balanceDue: JsonField<Long>,
    private val creditLimit: JsonField<Long>,
    private val pendingCharges: JsonField<Long>,
    private val postedCharges: JsonField<Long>,
    private val spendingPower: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("balanceDue") @ExcludeMissing balanceDue: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("creditLimit")
        @ExcludeMissing
        creditLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pendingCharges")
        @ExcludeMissing
        pendingCharges: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("postedCharges")
        @ExcludeMissing
        postedCharges: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("spendingPower")
        @ExcludeMissing
        spendingPower: JsonField<Long> = JsonMissing.of(),
    ) : this(balanceDue, creditLimit, pendingCharges, postedCharges, spendingPower, mutableMapOf())

    /**
     * Balance due of the user, in cents
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balanceDue(): Long = balanceDue.getRequired("balanceDue")

    /**
     * Credit limit of the user, in cents
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditLimit(): Long = creditLimit.getRequired("creditLimit")

    /**
     * Pending charges of the user, in cents
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pendingCharges(): Long = pendingCharges.getRequired("pendingCharges")

    /**
     * Posted charges of the user, in cents
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postedCharges(): Long = postedCharges.getRequired("postedCharges")

    /**
     * The amount of money the user can spend, in cents
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spendingPower(): Long = spendingPower.getRequired("spendingPower")

    /**
     * Returns the raw JSON value of [balanceDue].
     *
     * Unlike [balanceDue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balanceDue") @ExcludeMissing fun _balanceDue(): JsonField<Long> = balanceDue

    /**
     * Returns the raw JSON value of [creditLimit].
     *
     * Unlike [creditLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditLimit") @ExcludeMissing fun _creditLimit(): JsonField<Long> = creditLimit

    /**
     * Returns the raw JSON value of [pendingCharges].
     *
     * Unlike [pendingCharges], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pendingCharges")
    @ExcludeMissing
    fun _pendingCharges(): JsonField<Long> = pendingCharges

    /**
     * Returns the raw JSON value of [postedCharges].
     *
     * Unlike [postedCharges], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postedCharges")
    @ExcludeMissing
    fun _postedCharges(): JsonField<Long> = postedCharges

    /**
     * Returns the raw JSON value of [spendingPower].
     *
     * Unlike [spendingPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spendingPower")
    @ExcludeMissing
    fun _spendingPower(): JsonField<Long> = spendingPower

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
         * Returns a mutable builder for constructing an instance of [UserRetrieveBalancesResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .balanceDue()
         * .creditLimit()
         * .pendingCharges()
         * .postedCharges()
         * .spendingPower()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UserRetrieveBalancesResponse]. */
    class Builder internal constructor() {

        private var balanceDue: JsonField<Long>? = null
        private var creditLimit: JsonField<Long>? = null
        private var pendingCharges: JsonField<Long>? = null
        private var postedCharges: JsonField<Long>? = null
        private var spendingPower: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userRetrieveBalancesResponse: UserRetrieveBalancesResponse) = apply {
            balanceDue = userRetrieveBalancesResponse.balanceDue
            creditLimit = userRetrieveBalancesResponse.creditLimit
            pendingCharges = userRetrieveBalancesResponse.pendingCharges
            postedCharges = userRetrieveBalancesResponse.postedCharges
            spendingPower = userRetrieveBalancesResponse.spendingPower
            additionalProperties = userRetrieveBalancesResponse.additionalProperties.toMutableMap()
        }

        /** Balance due of the user, in cents */
        fun balanceDue(balanceDue: Long) = balanceDue(JsonField.of(balanceDue))

        /**
         * Sets [Builder.balanceDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceDue] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun balanceDue(balanceDue: JsonField<Long>) = apply { this.balanceDue = balanceDue }

        /** Credit limit of the user, in cents */
        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        /**
         * Sets [Builder.creditLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Pending charges of the user, in cents */
        fun pendingCharges(pendingCharges: Long) = pendingCharges(JsonField.of(pendingCharges))

        /**
         * Sets [Builder.pendingCharges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingCharges] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pendingCharges(pendingCharges: JsonField<Long>) = apply {
            this.pendingCharges = pendingCharges
        }

        /** Posted charges of the user, in cents */
        fun postedCharges(postedCharges: Long) = postedCharges(JsonField.of(postedCharges))

        /**
         * Sets [Builder.postedCharges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postedCharges] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postedCharges(postedCharges: JsonField<Long>) = apply {
            this.postedCharges = postedCharges
        }

        /** The amount of money the user can spend, in cents */
        fun spendingPower(spendingPower: Long) = spendingPower(JsonField.of(spendingPower))

        /**
         * Sets [Builder.spendingPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendingPower] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spendingPower(spendingPower: JsonField<Long>) = apply {
            this.spendingPower = spendingPower
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
         * Returns an immutable instance of [UserRetrieveBalancesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .balanceDue()
         * .creditLimit()
         * .pendingCharges()
         * .postedCharges()
         * .spendingPower()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserRetrieveBalancesResponse =
            UserRetrieveBalancesResponse(
                checkRequired("balanceDue", balanceDue),
                checkRequired("creditLimit", creditLimit),
                checkRequired("pendingCharges", pendingCharges),
                checkRequired("postedCharges", postedCharges),
                checkRequired("spendingPower", spendingPower),
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
    fun validate(): UserRetrieveBalancesResponse = apply {
        if (validated) {
            return@apply
        }

        balanceDue()
        creditLimit()
        pendingCharges()
        postedCharges()
        spendingPower()
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
        (if (balanceDue.asKnown() == null) 0 else 1) +
            (if (creditLimit.asKnown() == null) 0 else 1) +
            (if (pendingCharges.asKnown() == null) 0 else 1) +
            (if (postedCharges.asKnown() == null) 0 else 1) +
            (if (spendingPower.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserRetrieveBalancesResponse &&
            balanceDue == other.balanceDue &&
            creditLimit == other.creditLimit &&
            pendingCharges == other.pendingCharges &&
            postedCharges == other.postedCharges &&
            spendingPower == other.spendingPower &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            balanceDue,
            creditLimit,
            pendingCharges,
            postedCharges,
            spendingPower,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserRetrieveBalancesResponse{balanceDue=$balanceDue, creditLimit=$creditLimit, pendingCharges=$pendingCharges, postedCharges=$postedCharges, spendingPower=$spendingPower, additionalProperties=$additionalProperties}"
}
