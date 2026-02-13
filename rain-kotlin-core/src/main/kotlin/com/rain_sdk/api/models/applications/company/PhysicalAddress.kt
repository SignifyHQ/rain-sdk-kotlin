// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.company

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

/**
 * Represents a physical address with components like street, city, region, postal code, and
 * country.
 */
class PhysicalAddress
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val line1: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val region: JsonField<String>,
    private val line2: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postalCode")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
    ) : this(city, country, countryCode, line1, postalCode, region, line2, mutableMapOf())

    /**
     * The city of the address
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun city(): String = city.getRequired("city")

    /**
     * The full name of the country
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * The 2-letter country code of the address
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryCode(): String = countryCode.getRequired("countryCode")

    /**
     * The first line of the street address
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun line1(): String = line1.getRequired("line1")

    /**
     * The postal or zip code of the address
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postalCode(): String = postalCode.getRequired("postalCode")

    /**
     * The region or state of the address
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun region(): String = region.getRequired("region")

    /**
     * The second line of the street address (optional)
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun line2(): String? = line2.getNullable("line2")

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [line1].
     *
     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postalCode") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    /**
     * Returns the raw JSON value of [line2].
     *
     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
         * Returns a mutable builder for constructing an instance of [PhysicalAddress].
         *
         * The following fields are required:
         * ```kotlin
         * .city()
         * .country()
         * .countryCode()
         * .line1()
         * .postalCode()
         * .region()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PhysicalAddress]. */
    class Builder internal constructor() {

        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var countryCode: JsonField<String>? = null
        private var line1: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var region: JsonField<String>? = null
        private var line2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(physicalAddress: PhysicalAddress) = apply {
            city = physicalAddress.city
            country = physicalAddress.country
            countryCode = physicalAddress.countryCode
            line1 = physicalAddress.line1
            postalCode = physicalAddress.postalCode
            region = physicalAddress.region
            line2 = physicalAddress.line2
            additionalProperties = physicalAddress.additionalProperties.toMutableMap()
        }

        /** The city of the address */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** The full name of the country */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** The 2-letter country code of the address */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** The first line of the street address */
        fun line1(line1: String) = line1(JsonField.of(line1))

        /**
         * Sets [Builder.line1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

        /** The postal or zip code of the address */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /** The region or state of the address */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /** The second line of the street address (optional) */
        fun line2(line2: String) = line2(JsonField.of(line2))

        /**
         * Sets [Builder.line2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
         * Returns an immutable instance of [PhysicalAddress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .city()
         * .country()
         * .countryCode()
         * .line1()
         * .postalCode()
         * .region()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhysicalAddress =
            PhysicalAddress(
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("countryCode", countryCode),
                checkRequired("line1", line1),
                checkRequired("postalCode", postalCode),
                checkRequired("region", region),
                line2,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhysicalAddress = apply {
        if (validated) {
            return@apply
        }

        city()
        country()
        countryCode()
        line1()
        postalCode()
        region()
        line2()
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
        (if (city.asKnown() == null) 0 else 1) +
            (if (country.asKnown() == null) 0 else 1) +
            (if (countryCode.asKnown() == null) 0 else 1) +
            (if (line1.asKnown() == null) 0 else 1) +
            (if (postalCode.asKnown() == null) 0 else 1) +
            (if (region.asKnown() == null) 0 else 1) +
            (if (line2.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhysicalAddress &&
            city == other.city &&
            country == other.country &&
            countryCode == other.countryCode &&
            line1 == other.line1 &&
            postalCode == other.postalCode &&
            region == other.region &&
            line2 == other.line2 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            city,
            country,
            countryCode,
            line1,
            postalCode,
            region,
            line2,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhysicalAddress{city=$city, country=$country, countryCode=$countryCode, line1=$line1, postalCode=$postalCode, region=$region, line2=$line2, additionalProperties=$additionalProperties}"
}
