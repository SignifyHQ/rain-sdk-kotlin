// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.applications.user

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
import com.rain_hello_world.api.models.applications.company.IssuingApplication
import com.rain_hello_world.api.models.applications.company.PhysicalAddress
import java.util.Collections
import java.util.Objects

/** The details of an issuing application. */
class IssuingUser
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val applicationStatus: JsonField<IssuingApplication.ApplicationStatus>,
    private val applicationCompletionLink: JsonField<IssuingApplication.ApplicationCompletionLink>,
    private val applicationExternalVerificationLink:
        JsonField<IssuingApplication.ApplicationExternalVerificationLink>,
    private val applicationReason: JsonField<String>,
    private val id: JsonField<String>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val isTermsOfServiceAccepted: JsonField<Boolean>,
    private val lastName: JsonField<String>,
    private val address: JsonField<PhysicalAddress>,
    private val companyId: JsonField<String>,
    private val phoneCountryCode: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("applicationStatus")
        @ExcludeMissing
        applicationStatus: JsonField<IssuingApplication.ApplicationStatus> = JsonMissing.of(),
        @JsonProperty("applicationCompletionLink")
        @ExcludeMissing
        applicationCompletionLink: JsonField<IssuingApplication.ApplicationCompletionLink> =
            JsonMissing.of(),
        @JsonProperty("applicationExternalVerificationLink")
        @ExcludeMissing
        applicationExternalVerificationLink:
            JsonField<IssuingApplication.ApplicationExternalVerificationLink> =
            JsonMissing.of(),
        @JsonProperty("applicationReason")
        @ExcludeMissing
        applicationReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isActive") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isTermsOfServiceAccepted")
        @ExcludeMissing
        isTermsOfServiceAccepted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address")
        @ExcludeMissing
        address: JsonField<PhysicalAddress> = JsonMissing.of(),
        @JsonProperty("companyId") @ExcludeMissing companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneCountryCode")
        @ExcludeMissing
        phoneCountryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        applicationStatus,
        applicationCompletionLink,
        applicationExternalVerificationLink,
        applicationReason,
        id,
        email,
        firstName,
        isActive,
        isTermsOfServiceAccepted,
        lastName,
        address,
        companyId,
        phoneCountryCode,
        phoneNumber,
        mutableMapOf(),
    )

    fun toIssuingApplication(): IssuingApplication =
        IssuingApplication.builder()
            .applicationStatus(applicationStatus)
            .applicationCompletionLink(applicationCompletionLink)
            .applicationExternalVerificationLink(applicationExternalVerificationLink)
            .applicationReason(applicationReason)
            .build()

    /**
     * Represents the possible statuses of an application.
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applicationStatus(): IssuingApplication.ApplicationStatus =
        applicationStatus.getRequired("applicationStatus")

    /**
     * The link to the application completion page
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun applicationCompletionLink(): IssuingApplication.ApplicationCompletionLink? =
        applicationCompletionLink.getNullable("applicationCompletionLink")

    /**
     * The link to the external verification page for the application
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun applicationExternalVerificationLink():
        IssuingApplication.ApplicationExternalVerificationLink? =
        applicationExternalVerificationLink.getNullable("applicationExternalVerificationLink")

    /**
     * The reason behind the current application status
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun applicationReason(): String? = applicationReason.getNullable("applicationReason")

    /**
     * The user's unique identifier
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The user's email address
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * The user's first name
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = firstName.getRequired("firstName")

    /**
     * Indicates whether the user account is active
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isActive(): Boolean = isActive.getRequired("isActive")

    /**
     * Indicates whether the user has accepted the terms of service
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isTermsOfServiceAccepted(): Boolean =
        isTermsOfServiceAccepted.getRequired("isTermsOfServiceAccepted")

    /**
     * The user's last name
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = lastName.getRequired("lastName")

    /**
     * The user's address
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun address(): PhysicalAddress? = address.getNullable("address")

    /**
     * The identifier of the company the user belongs to, if applicable
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun companyId(): String? = companyId.getNullable("companyId")

    /**
     * The country code for the user's phone number
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneCountryCode(): String? = phoneCountryCode.getNullable("phoneCountryCode")

    /**
     * The user's phone number
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

    /**
     * Returns the raw JSON value of [applicationStatus].
     *
     * Unlike [applicationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applicationStatus")
    @ExcludeMissing
    fun _applicationStatus(): JsonField<IssuingApplication.ApplicationStatus> = applicationStatus

    /**
     * Returns the raw JSON value of [applicationCompletionLink].
     *
     * Unlike [applicationCompletionLink], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("applicationCompletionLink")
    @ExcludeMissing
    fun _applicationCompletionLink(): JsonField<IssuingApplication.ApplicationCompletionLink> =
        applicationCompletionLink

    /**
     * Returns the raw JSON value of [applicationExternalVerificationLink].
     *
     * Unlike [applicationExternalVerificationLink], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("applicationExternalVerificationLink")
    @ExcludeMissing
    fun _applicationExternalVerificationLink():
        JsonField<IssuingApplication.ApplicationExternalVerificationLink> =
        applicationExternalVerificationLink

    /**
     * Returns the raw JSON value of [applicationReason].
     *
     * Unlike [applicationReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applicationReason")
    @ExcludeMissing
    fun _applicationReason(): JsonField<String> = applicationReason

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [isTermsOfServiceAccepted].
     *
     * Unlike [isTermsOfServiceAccepted], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("isTermsOfServiceAccepted")
    @ExcludeMissing
    fun _isTermsOfServiceAccepted(): JsonField<Boolean> = isTermsOfServiceAccepted

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<PhysicalAddress> = address

    /**
     * Returns the raw JSON value of [companyId].
     *
     * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyId") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

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
         * Returns a mutable builder for constructing an instance of [IssuingUser].
         *
         * The following fields are required:
         * ```kotlin
         * .applicationStatus()
         * .id()
         * .email()
         * .firstName()
         * .isActive()
         * .isTermsOfServiceAccepted()
         * .lastName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IssuingUser]. */
    class Builder internal constructor() {

        private var applicationStatus: JsonField<IssuingApplication.ApplicationStatus>? = null
        private var applicationCompletionLink:
            JsonField<IssuingApplication.ApplicationCompletionLink> =
            JsonMissing.of()
        private var applicationExternalVerificationLink:
            JsonField<IssuingApplication.ApplicationExternalVerificationLink> =
            JsonMissing.of()
        private var applicationReason: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var isActive: JsonField<Boolean>? = null
        private var isTermsOfServiceAccepted: JsonField<Boolean>? = null
        private var lastName: JsonField<String>? = null
        private var address: JsonField<PhysicalAddress> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var phoneCountryCode: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(issuingUser: IssuingUser) = apply {
            applicationStatus = issuingUser.applicationStatus
            applicationCompletionLink = issuingUser.applicationCompletionLink
            applicationExternalVerificationLink = issuingUser.applicationExternalVerificationLink
            applicationReason = issuingUser.applicationReason
            id = issuingUser.id
            email = issuingUser.email
            firstName = issuingUser.firstName
            isActive = issuingUser.isActive
            isTermsOfServiceAccepted = issuingUser.isTermsOfServiceAccepted
            lastName = issuingUser.lastName
            address = issuingUser.address
            companyId = issuingUser.companyId
            phoneCountryCode = issuingUser.phoneCountryCode
            phoneNumber = issuingUser.phoneNumber
            additionalProperties = issuingUser.additionalProperties.toMutableMap()
        }

        /** Represents the possible statuses of an application. */
        fun applicationStatus(applicationStatus: IssuingApplication.ApplicationStatus) =
            applicationStatus(JsonField.of(applicationStatus))

        /**
         * Sets [Builder.applicationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationStatus] with a well-typed
         * [IssuingApplication.ApplicationStatus] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun applicationStatus(applicationStatus: JsonField<IssuingApplication.ApplicationStatus>) =
            apply {
                this.applicationStatus = applicationStatus
            }

        /** The link to the application completion page */
        fun applicationCompletionLink(
            applicationCompletionLink: IssuingApplication.ApplicationCompletionLink
        ) = applicationCompletionLink(JsonField.of(applicationCompletionLink))

        /**
         * Sets [Builder.applicationCompletionLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationCompletionLink] with a well-typed
         * [IssuingApplication.ApplicationCompletionLink] value instead. This method is primarily
         * for setting the field to an undocumented or not yet supported value.
         */
        fun applicationCompletionLink(
            applicationCompletionLink: JsonField<IssuingApplication.ApplicationCompletionLink>
        ) = apply { this.applicationCompletionLink = applicationCompletionLink }

        /** The link to the external verification page for the application */
        @Deprecated("deprecated")
        fun applicationExternalVerificationLink(
            applicationExternalVerificationLink:
                IssuingApplication.ApplicationExternalVerificationLink
        ) = applicationExternalVerificationLink(JsonField.of(applicationExternalVerificationLink))

        /**
         * Sets [Builder.applicationExternalVerificationLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationExternalVerificationLink] with a well-typed
         * [IssuingApplication.ApplicationExternalVerificationLink] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun applicationExternalVerificationLink(
            applicationExternalVerificationLink:
                JsonField<IssuingApplication.ApplicationExternalVerificationLink>
        ) = apply { this.applicationExternalVerificationLink = applicationExternalVerificationLink }

        /** The reason behind the current application status */
        fun applicationReason(applicationReason: String) =
            applicationReason(JsonField.of(applicationReason))

        /**
         * Sets [Builder.applicationReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun applicationReason(applicationReason: JsonField<String>) = apply {
            this.applicationReason = applicationReason
        }

        /** The user's unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The user's email address */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The user's first name */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** Indicates whether the user account is active */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** Indicates whether the user has accepted the terms of service */
        fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: Boolean) =
            isTermsOfServiceAccepted(JsonField.of(isTermsOfServiceAccepted))

        /**
         * Sets [Builder.isTermsOfServiceAccepted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTermsOfServiceAccepted] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: JsonField<Boolean>) = apply {
            this.isTermsOfServiceAccepted = isTermsOfServiceAccepted
        }

        /** The user's last name */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The user's address */
        fun address(address: PhysicalAddress) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [PhysicalAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun address(address: JsonField<PhysicalAddress>) = apply { this.address = address }

        /** The identifier of the company the user belongs to, if applicable */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * Sets [Builder.companyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** The country code for the user's phone number */
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

        /** The user's phone number */
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
         * Returns an immutable instance of [IssuingUser].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .applicationStatus()
         * .id()
         * .email()
         * .firstName()
         * .isActive()
         * .isTermsOfServiceAccepted()
         * .lastName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IssuingUser =
            IssuingUser(
                checkRequired("applicationStatus", applicationStatus),
                applicationCompletionLink,
                applicationExternalVerificationLink,
                applicationReason,
                checkRequired("id", id),
                checkRequired("email", email),
                checkRequired("firstName", firstName),
                checkRequired("isActive", isActive),
                checkRequired("isTermsOfServiceAccepted", isTermsOfServiceAccepted),
                checkRequired("lastName", lastName),
                address,
                companyId,
                phoneCountryCode,
                phoneNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IssuingUser = apply {
        if (validated) {
            return@apply
        }

        applicationStatus().validate()
        applicationCompletionLink()?.validate()
        applicationExternalVerificationLink()?.validate()
        applicationReason()
        id()
        email()
        firstName()
        isActive()
        isTermsOfServiceAccepted()
        lastName()
        address()?.validate()
        companyId()
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
        (applicationStatus.asKnown()?.validity() ?: 0) +
            (applicationCompletionLink.asKnown()?.validity() ?: 0) +
            (applicationExternalVerificationLink.asKnown()?.validity() ?: 0) +
            (if (applicationReason.asKnown() == null) 0 else 1) +
            (if (id.asKnown() == null) 0 else 1) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (firstName.asKnown() == null) 0 else 1) +
            (if (isActive.asKnown() == null) 0 else 1) +
            (if (isTermsOfServiceAccepted.asKnown() == null) 0 else 1) +
            (if (lastName.asKnown() == null) 0 else 1) +
            (address.asKnown()?.validity() ?: 0) +
            (if (companyId.asKnown() == null) 0 else 1) +
            (if (phoneCountryCode.asKnown() == null) 0 else 1) +
            (if (phoneNumber.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IssuingUser &&
            applicationStatus == other.applicationStatus &&
            applicationCompletionLink == other.applicationCompletionLink &&
            applicationExternalVerificationLink == other.applicationExternalVerificationLink &&
            applicationReason == other.applicationReason &&
            id == other.id &&
            email == other.email &&
            firstName == other.firstName &&
            isActive == other.isActive &&
            isTermsOfServiceAccepted == other.isTermsOfServiceAccepted &&
            lastName == other.lastName &&
            address == other.address &&
            companyId == other.companyId &&
            phoneCountryCode == other.phoneCountryCode &&
            phoneNumber == other.phoneNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            applicationStatus,
            applicationCompletionLink,
            applicationExternalVerificationLink,
            applicationReason,
            id,
            email,
            firstName,
            isActive,
            isTermsOfServiceAccepted,
            lastName,
            address,
            companyId,
            phoneCountryCode,
            phoneNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IssuingUser{applicationStatus=$applicationStatus, applicationCompletionLink=$applicationCompletionLink, applicationExternalVerificationLink=$applicationExternalVerificationLink, applicationReason=$applicationReason, id=$id, email=$email, firstName=$firstName, isActive=$isActive, isTermsOfServiceAccepted=$isTermsOfServiceAccepted, lastName=$lastName, address=$address, companyId=$companyId, phoneCountryCode=$phoneCountryCode, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}
