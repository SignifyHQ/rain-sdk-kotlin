// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.cards

import com.fasterxml.jackson.annotation.JsonCreator
import com.rain_sdk.api.core.Enum
import com.rain_sdk.api.core.JsonField
import com.rain_sdk.api.errors.RainInvalidDataException

/** The current status of the card */
class IssuingCardStatus @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val NOT_ACTIVATED = of("notActivated")

        val ACTIVE = of("active")

        val LOCKED = of("locked")

        val CANCELED = of("canceled")

        fun of(value: String) = IssuingCardStatus(JsonField.of(value))
    }

    /** An enum containing [IssuingCardStatus]'s known values. */
    enum class Known {
        NOT_ACTIVATED,
        ACTIVE,
        LOCKED,
        CANCELED,
    }

    /**
     * An enum containing [IssuingCardStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [IssuingCardStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        NOT_ACTIVATED,
        ACTIVE,
        LOCKED,
        CANCELED,
        /**
         * An enum member indicating that [IssuingCardStatus] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            NOT_ACTIVATED -> Value.NOT_ACTIVATED
            ACTIVE -> Value.ACTIVE
            LOCKED -> Value.LOCKED
            CANCELED -> Value.CANCELED
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws RainInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            NOT_ACTIVATED -> Known.NOT_ACTIVATED
            ACTIVE -> Known.ACTIVE
            LOCKED -> Known.LOCKED
            CANCELED -> Known.CANCELED
            else -> throw RainInvalidDataException("Unknown IssuingCardStatus: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws RainInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw RainInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws RainInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): IssuingCardStatus = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IssuingCardStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
