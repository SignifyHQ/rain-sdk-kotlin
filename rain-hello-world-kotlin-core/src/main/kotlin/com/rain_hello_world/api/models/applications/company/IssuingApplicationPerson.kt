// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.applications.company

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

class IssuingApplicationPerson
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val address: JsonField<PhysicalAddress>,
    private val birthDate: JsonField<LocalDate>,
    private val countryOfIssue: JsonField<String>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val nationalId: JsonField<String>,
    private val id: JsonField<String>,
    private val phoneCountryCode: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        address: JsonField<PhysicalAddress> = JsonMissing.of(),
        @JsonProperty("birthDate")
        @ExcludeMissing
        birthDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("countryOfIssue")
        @ExcludeMissing
        countryOfIssue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nationalId")
        @ExcludeMissing
        nationalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneCountryCode")
        @ExcludeMissing
        phoneCountryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        address,
        birthDate,
        countryOfIssue,
        email,
        firstName,
        lastName,
        nationalId,
        id,
        phoneCountryCode,
        phoneNumber,
        mutableMapOf(),
    )

    /**
     * The person's address
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): PhysicalAddress = address.getRequired("address")

    /**
     * The person's birth date
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

    /**
     * The 2-digit country code of the person's national ID issuer
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryOfIssue(): String = countryOfIssue.getRequired("countryOfIssue")

    /**
     * The user's email address
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * The person's first name
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = firstName.getRequired("firstName")

    /**
     * The person's last name
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = lastName.getRequired("lastName")

    /**
     * The person's national ID number. For the US, this is a 9-digit SSN
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nationalId(): String = nationalId.getRequired("nationalId")

    /**
     * The person's unique identifier
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * The country code for the phone number
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneCountryCode(): String? = phoneCountryCode.getNullable("phoneCountryCode")

    /**
     * The phone number of the person
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<PhysicalAddress> = address

    /**
     * Returns the raw JSON value of [birthDate].
     *
     * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("birthDate") @ExcludeMissing fun _birthDate(): JsonField<LocalDate> = birthDate

    /**
     * Returns the raw JSON value of [countryOfIssue].
     *
     * Unlike [countryOfIssue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryOfIssue")
    @ExcludeMissing
    fun _countryOfIssue(): JsonField<String> = countryOfIssue

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [nationalId].
     *
     * Unlike [nationalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nationalId") @ExcludeMissing fun _nationalId(): JsonField<String> = nationalId

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [phoneCountryCode].
     *
     * Unlike [phoneCountryCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("phoneCountryCode")
    @ExcludeMissing
    fun _phoneCountryCode(): JsonField<String> = phoneCountryCode

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

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
         * Returns a mutable builder for constructing an instance of [IssuingApplicationPerson].
         *
         * The following fields are required:
         * ```kotlin
         * .address()
         * .birthDate()
         * .countryOfIssue()
         * .email()
         * .firstName()
         * .lastName()
         * .nationalId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IssuingApplicationPerson]. */
    class Builder internal constructor() {

        private var address: JsonField<PhysicalAddress>? = null
        private var birthDate: JsonField<LocalDate>? = null
        private var countryOfIssue: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var lastName: JsonField<String>? = null
        private var nationalId: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var phoneCountryCode: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(issuingApplicationPerson: IssuingApplicationPerson) = apply {
            address = issuingApplicationPerson.address
            birthDate = issuingApplicationPerson.birthDate
            countryOfIssue = issuingApplicationPerson.countryOfIssue
            email = issuingApplicationPerson.email
            firstName = issuingApplicationPerson.firstName
            lastName = issuingApplicationPerson.lastName
            nationalId = issuingApplicationPerson.nationalId
            id = issuingApplicationPerson.id
            phoneCountryCode = issuingApplicationPerson.phoneCountryCode
            phoneNumber = issuingApplicationPerson.phoneNumber
            additionalProperties = issuingApplicationPerson.additionalProperties.toMutableMap()
        }

        /** The person's address */
        fun address(address: PhysicalAddress) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [PhysicalAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun address(address: JsonField<PhysicalAddress>) = apply { this.address = address }

        /** The person's birth date */
        fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

        /**
         * Sets [Builder.birthDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.birthDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun birthDate(birthDate: JsonField<LocalDate>) = apply { this.birthDate = birthDate }

        /** The 2-digit country code of the person's national ID issuer */
        fun countryOfIssue(countryOfIssue: String) = countryOfIssue(JsonField.of(countryOfIssue))

        /**
         * Sets [Builder.countryOfIssue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryOfIssue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryOfIssue(countryOfIssue: JsonField<String>) = apply {
            this.countryOfIssue = countryOfIssue
        }

        /** The user's email address */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The person's first name */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The person's last name */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The person's national ID number. For the US, this is a 9-digit SSN */
        fun nationalId(nationalId: String) = nationalId(JsonField.of(nationalId))

        /**
         * Sets [Builder.nationalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nationalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nationalId(nationalId: JsonField<String>) = apply { this.nationalId = nationalId }

        /** The person's unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The country code for the phone number */
        fun phoneCountryCode(phoneCountryCode: String) =
            phoneCountryCode(JsonField.of(phoneCountryCode))

        /**
         * Sets [Builder.phoneCountryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneCountryCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneCountryCode(phoneCountryCode: JsonField<String>) = apply {
            this.phoneCountryCode = phoneCountryCode
        }

        /** The phone number of the person */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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
         * Returns an immutable instance of [IssuingApplicationPerson].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .address()
         * .birthDate()
         * .countryOfIssue()
         * .email()
         * .firstName()
         * .lastName()
         * .nationalId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IssuingApplicationPerson =
            IssuingApplicationPerson(
                checkRequired("address", address),
                checkRequired("birthDate", birthDate),
                checkRequired("countryOfIssue", countryOfIssue),
                checkRequired("email", email),
                checkRequired("firstName", firstName),
                checkRequired("lastName", lastName),
                checkRequired("nationalId", nationalId),
                id,
                phoneCountryCode,
                phoneNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IssuingApplicationPerson = apply {
        if (validated) {
            return@apply
        }

        address().validate()
        birthDate()
        countryOfIssue()
        email()
        firstName()
        lastName()
        nationalId()
        id()
        phoneCountryCode()
        phoneNumber()
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
    internal fun validity(): Int =
        (address.asKnown()?.validity() ?: 0) +
            (if (birthDate.asKnown() == null) 0 else 1) +
            (if (countryOfIssue.asKnown() == null) 0 else 1) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (firstName.asKnown() == null) 0 else 1) +
            (if (lastName.asKnown() == null) 0 else 1) +
            (if (nationalId.asKnown() == null) 0 else 1) +
            (if (id.asKnown() == null) 0 else 1) +
            (if (phoneCountryCode.asKnown() == null) 0 else 1) +
            (if (phoneNumber.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IssuingApplicationPerson &&
            address == other.address &&
            birthDate == other.birthDate &&
            countryOfIssue == other.countryOfIssue &&
            email == other.email &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            nationalId == other.nationalId &&
            id == other.id &&
            phoneCountryCode == other.phoneCountryCode &&
            phoneNumber == other.phoneNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            address,
            birthDate,
            countryOfIssue,
            email,
            firstName,
            lastName,
            nationalId,
            id,
            phoneCountryCode,
            phoneNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IssuingApplicationPerson{address=$address, birthDate=$birthDate, countryOfIssue=$countryOfIssue, email=$email, firstName=$firstName, lastName=$lastName, nationalId=$nationalId, id=$id, phoneCountryCode=$phoneCountryCode, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}
