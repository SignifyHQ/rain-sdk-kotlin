// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.user

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_sdk.api.core.Enum
import com.rain_sdk.api.core.ExcludeMissing
import com.rain_sdk.api.core.JsonField
import com.rain_sdk.api.core.JsonMissing
import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.Params
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.http.Headers
import com.rain_sdk.api.core.http.QueryParams
import com.rain_sdk.api.errors.RainInvalidDataException
import com.rain_sdk.api.models.applications.company.PhysicalAddress
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * Allows a user to reapply or respond to a request for additional information regarding their
 * consumer application. This is used when the initial application needs updating or more
 * information is required.
 */
@Deprecated("deprecated")
class UserReapplyParams
private constructor(
    private val userId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun userId(): String? = userId

    /**
     * The purpose of the user's account
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountPurpose(): String = body.accountPurpose()

    /**
     * The user's address
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): PhysicalAddress = body.address()

    /**
     * The user's annual salary
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun annualSalary(): String = body.annualSalary()

    /**
     * The user's birth date
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun birthDate(): LocalDate = body.birthDate()

    /**
     * The 2-digit country code of the user's national ID issuer
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryOfIssue(): String = body.countryOfIssue()

    /**
     * The estimated monthly spending amount for the user
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expectedMonthlyVolume(): String = body.expectedMonthlyVolume()

    /**
     * The user's IP address
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ipAddress(): String = body.ipAddress()

    /**
     * Indicates whether the user has accepted the terms of service
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isTermsOfServiceAccepted(): IsTermsOfServiceAccepted = body.isTermsOfServiceAccepted()

    /**
     * The user's national ID number. For the US, this is a 9-digit SSN
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nationalId(): String = body.nationalId()

    /**
     * The user's occupation
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun occupation(): String = body.occupation()

    /**
     * Indicates whether the user will use existing documents for additional verification
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun hasExistingDocuments(): Boolean? = body.hasExistingDocuments()

    /**
     * Returns the raw JSON value of [accountPurpose].
     *
     * Unlike [accountPurpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountPurpose(): JsonField<String> = body._accountPurpose()

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _address(): JsonField<PhysicalAddress> = body._address()

    /**
     * Returns the raw JSON value of [annualSalary].
     *
     * Unlike [annualSalary], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _annualSalary(): JsonField<String> = body._annualSalary()

    /**
     * Returns the raw JSON value of [birthDate].
     *
     * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _birthDate(): JsonField<LocalDate> = body._birthDate()

    /**
     * Returns the raw JSON value of [countryOfIssue].
     *
     * Unlike [countryOfIssue], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _countryOfIssue(): JsonField<String> = body._countryOfIssue()

    /**
     * Returns the raw JSON value of [expectedMonthlyVolume].
     *
     * Unlike [expectedMonthlyVolume], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _expectedMonthlyVolume(): JsonField<String> = body._expectedMonthlyVolume()

    /**
     * Returns the raw JSON value of [ipAddress].
     *
     * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ipAddress(): JsonField<String> = body._ipAddress()

    /**
     * Returns the raw JSON value of [isTermsOfServiceAccepted].
     *
     * Unlike [isTermsOfServiceAccepted], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _isTermsOfServiceAccepted(): JsonField<IsTermsOfServiceAccepted> =
        body._isTermsOfServiceAccepted()

    /**
     * Returns the raw JSON value of [nationalId].
     *
     * Unlike [nationalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nationalId(): JsonField<String> = body._nationalId()

    /**
     * Returns the raw JSON value of [occupation].
     *
     * Unlike [occupation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _occupation(): JsonField<String> = body._occupation()

    /**
     * Returns the raw JSON value of [hasExistingDocuments].
     *
     * Unlike [hasExistingDocuments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _hasExistingDocuments(): JsonField<Boolean> = body._hasExistingDocuments()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserReapplyParams].
         *
         * The following fields are required:
         * ```kotlin
         * .accountPurpose()
         * .address()
         * .annualSalary()
         * .birthDate()
         * .countryOfIssue()
         * .expectedMonthlyVolume()
         * .ipAddress()
         * .isTermsOfServiceAccepted()
         * .nationalId()
         * .occupation()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UserReapplyParams]. */
    class Builder internal constructor() {

        private var userId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(userReapplyParams: UserReapplyParams) = apply {
            userId = userReapplyParams.userId
            body = userReapplyParams.body.toBuilder()
            additionalHeaders = userReapplyParams.additionalHeaders.toBuilder()
            additionalQueryParams = userReapplyParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: String?) = apply { this.userId = userId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountPurpose]
         * - [address]
         * - [annualSalary]
         * - [birthDate]
         * - [countryOfIssue]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The purpose of the user's account */
        fun accountPurpose(accountPurpose: String) = apply { body.accountPurpose(accountPurpose) }

        /**
         * Sets [Builder.accountPurpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountPurpose] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountPurpose(accountPurpose: JsonField<String>) = apply {
            body.accountPurpose(accountPurpose)
        }

        /** The user's address */
        fun address(address: PhysicalAddress) = apply { body.address(address) }

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [PhysicalAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun address(address: JsonField<PhysicalAddress>) = apply { body.address(address) }

        /** The user's annual salary */
        fun annualSalary(annualSalary: String) = apply { body.annualSalary(annualSalary) }

        /**
         * Sets [Builder.annualSalary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annualSalary] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun annualSalary(annualSalary: JsonField<String>) = apply {
            body.annualSalary(annualSalary)
        }

        /** The user's birth date */
        fun birthDate(birthDate: LocalDate) = apply { body.birthDate(birthDate) }

        /**
         * Sets [Builder.birthDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.birthDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun birthDate(birthDate: JsonField<LocalDate>) = apply { body.birthDate(birthDate) }

        /** The 2-digit country code of the user's national ID issuer */
        fun countryOfIssue(countryOfIssue: String) = apply { body.countryOfIssue(countryOfIssue) }

        /**
         * Sets [Builder.countryOfIssue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryOfIssue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryOfIssue(countryOfIssue: JsonField<String>) = apply {
            body.countryOfIssue(countryOfIssue)
        }

        /** The estimated monthly spending amount for the user */
        fun expectedMonthlyVolume(expectedMonthlyVolume: String) = apply {
            body.expectedMonthlyVolume(expectedMonthlyVolume)
        }

        /**
         * Sets [Builder.expectedMonthlyVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedMonthlyVolume] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expectedMonthlyVolume(expectedMonthlyVolume: JsonField<String>) = apply {
            body.expectedMonthlyVolume(expectedMonthlyVolume)
        }

        /** The user's IP address */
        fun ipAddress(ipAddress: String) = apply { body.ipAddress(ipAddress) }

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { body.ipAddress(ipAddress) }

        /** Indicates whether the user has accepted the terms of service */
        fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: IsTermsOfServiceAccepted) = apply {
            body.isTermsOfServiceAccepted(isTermsOfServiceAccepted)
        }

        /**
         * Sets [Builder.isTermsOfServiceAccepted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTermsOfServiceAccepted] with a well-typed
         * [IsTermsOfServiceAccepted] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun isTermsOfServiceAccepted(
            isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>
        ) = apply { body.isTermsOfServiceAccepted(isTermsOfServiceAccepted) }

        /** The user's national ID number. For the US, this is a 9-digit SSN */
        fun nationalId(nationalId: String) = apply { body.nationalId(nationalId) }

        /**
         * Sets [Builder.nationalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nationalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nationalId(nationalId: JsonField<String>) = apply { body.nationalId(nationalId) }

        /** The user's occupation */
        fun occupation(occupation: String) = apply { body.occupation(occupation) }

        /**
         * Sets [Builder.occupation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occupation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun occupation(occupation: JsonField<String>) = apply { body.occupation(occupation) }

        /** Indicates whether the user will use existing documents for additional verification */
        fun hasExistingDocuments(hasExistingDocuments: Boolean) = apply {
            body.hasExistingDocuments(hasExistingDocuments)
        }

        /**
         * Sets [Builder.hasExistingDocuments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasExistingDocuments] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasExistingDocuments(hasExistingDocuments: JsonField<Boolean>) = apply {
            body.hasExistingDocuments(hasExistingDocuments)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UserReapplyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountPurpose()
         * .address()
         * .annualSalary()
         * .birthDate()
         * .countryOfIssue()
         * .expectedMonthlyVolume()
         * .ipAddress()
         * .isTermsOfServiceAccepted()
         * .nationalId()
         * .occupation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserReapplyParams =
            UserReapplyParams(
                userId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> userId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * The user's details required to reapply. The user must have a wallet address, which will be an
     * owner on the company's Rain smart contract.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountPurpose: JsonField<String>,
        private val address: JsonField<PhysicalAddress>,
        private val annualSalary: JsonField<String>,
        private val birthDate: JsonField<LocalDate>,
        private val countryOfIssue: JsonField<String>,
        private val expectedMonthlyVolume: JsonField<String>,
        private val ipAddress: JsonField<String>,
        private val isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>,
        private val nationalId: JsonField<String>,
        private val occupation: JsonField<String>,
        private val hasExistingDocuments: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountPurpose")
            @ExcludeMissing
            accountPurpose: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address")
            @ExcludeMissing
            address: JsonField<PhysicalAddress> = JsonMissing.of(),
            @JsonProperty("annualSalary")
            @ExcludeMissing
            annualSalary: JsonField<String> = JsonMissing.of(),
            @JsonProperty("birthDate")
            @ExcludeMissing
            birthDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("countryOfIssue")
            @ExcludeMissing
            countryOfIssue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expectedMonthlyVolume")
            @ExcludeMissing
            expectedMonthlyVolume: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ipAddress")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isTermsOfServiceAccepted")
            @ExcludeMissing
            isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted> = JsonMissing.of(),
            @JsonProperty("nationalId")
            @ExcludeMissing
            nationalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("occupation")
            @ExcludeMissing
            occupation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hasExistingDocuments")
            @ExcludeMissing
            hasExistingDocuments: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            accountPurpose,
            address,
            annualSalary,
            birthDate,
            countryOfIssue,
            expectedMonthlyVolume,
            ipAddress,
            isTermsOfServiceAccepted,
            nationalId,
            occupation,
            hasExistingDocuments,
            mutableMapOf(),
        )

        /**
         * The purpose of the user's account
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountPurpose(): String = accountPurpose.getRequired("accountPurpose")

        /**
         * The user's address
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): PhysicalAddress = address.getRequired("address")

        /**
         * The user's annual salary
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun annualSalary(): String = annualSalary.getRequired("annualSalary")

        /**
         * The user's birth date
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

        /**
         * The 2-digit country code of the user's national ID issuer
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryOfIssue(): String = countryOfIssue.getRequired("countryOfIssue")

        /**
         * The estimated monthly spending amount for the user
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expectedMonthlyVolume(): String =
            expectedMonthlyVolume.getRequired("expectedMonthlyVolume")

        /**
         * The user's IP address
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ipAddress(): String = ipAddress.getRequired("ipAddress")

        /**
         * Indicates whether the user has accepted the terms of service
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isTermsOfServiceAccepted(): IsTermsOfServiceAccepted =
            isTermsOfServiceAccepted.getRequired("isTermsOfServiceAccepted")

        /**
         * The user's national ID number. For the US, this is a 9-digit SSN
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nationalId(): String = nationalId.getRequired("nationalId")

        /**
         * The user's occupation
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun occupation(): String = occupation.getRequired("occupation")

        /**
         * Indicates whether the user will use existing documents for additional verification
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasExistingDocuments(): Boolean? =
            hasExistingDocuments.getNullable("hasExistingDocuments")

        /**
         * Returns the raw JSON value of [accountPurpose].
         *
         * Unlike [accountPurpose], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("accountPurpose")
        @ExcludeMissing
        fun _accountPurpose(): JsonField<String> = accountPurpose

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address")
        @ExcludeMissing
        fun _address(): JsonField<PhysicalAddress> = address

        /**
         * Returns the raw JSON value of [annualSalary].
         *
         * Unlike [annualSalary], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("annualSalary")
        @ExcludeMissing
        fun _annualSalary(): JsonField<String> = annualSalary

        /**
         * Returns the raw JSON value of [birthDate].
         *
         * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birthDate")
        @ExcludeMissing
        fun _birthDate(): JsonField<LocalDate> = birthDate

        /**
         * Returns the raw JSON value of [countryOfIssue].
         *
         * Unlike [countryOfIssue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("countryOfIssue")
        @ExcludeMissing
        fun _countryOfIssue(): JsonField<String> = countryOfIssue

        /**
         * Returns the raw JSON value of [expectedMonthlyVolume].
         *
         * Unlike [expectedMonthlyVolume], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("expectedMonthlyVolume")
        @ExcludeMissing
        fun _expectedMonthlyVolume(): JsonField<String> = expectedMonthlyVolume

        /**
         * Returns the raw JSON value of [ipAddress].
         *
         * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ipAddress") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

        /**
         * Returns the raw JSON value of [isTermsOfServiceAccepted].
         *
         * Unlike [isTermsOfServiceAccepted], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("isTermsOfServiceAccepted")
        @ExcludeMissing
        fun _isTermsOfServiceAccepted(): JsonField<IsTermsOfServiceAccepted> =
            isTermsOfServiceAccepted

        /**
         * Returns the raw JSON value of [nationalId].
         *
         * Unlike [nationalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nationalId")
        @ExcludeMissing
        fun _nationalId(): JsonField<String> = nationalId

        /**
         * Returns the raw JSON value of [occupation].
         *
         * Unlike [occupation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("occupation")
        @ExcludeMissing
        fun _occupation(): JsonField<String> = occupation

        /**
         * Returns the raw JSON value of [hasExistingDocuments].
         *
         * Unlike [hasExistingDocuments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hasExistingDocuments")
        @ExcludeMissing
        fun _hasExistingDocuments(): JsonField<Boolean> = hasExistingDocuments

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .accountPurpose()
             * .address()
             * .annualSalary()
             * .birthDate()
             * .countryOfIssue()
             * .expectedMonthlyVolume()
             * .ipAddress()
             * .isTermsOfServiceAccepted()
             * .nationalId()
             * .occupation()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountPurpose: JsonField<String>? = null
            private var address: JsonField<PhysicalAddress>? = null
            private var annualSalary: JsonField<String>? = null
            private var birthDate: JsonField<LocalDate>? = null
            private var countryOfIssue: JsonField<String>? = null
            private var expectedMonthlyVolume: JsonField<String>? = null
            private var ipAddress: JsonField<String>? = null
            private var isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>? = null
            private var nationalId: JsonField<String>? = null
            private var occupation: JsonField<String>? = null
            private var hasExistingDocuments: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                accountPurpose = body.accountPurpose
                address = body.address
                annualSalary = body.annualSalary
                birthDate = body.birthDate
                countryOfIssue = body.countryOfIssue
                expectedMonthlyVolume = body.expectedMonthlyVolume
                ipAddress = body.ipAddress
                isTermsOfServiceAccepted = body.isTermsOfServiceAccepted
                nationalId = body.nationalId
                occupation = body.occupation
                hasExistingDocuments = body.hasExistingDocuments
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The purpose of the user's account */
            fun accountPurpose(accountPurpose: String) =
                accountPurpose(JsonField.of(accountPurpose))

            /**
             * Sets [Builder.accountPurpose] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountPurpose] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountPurpose(accountPurpose: JsonField<String>) = apply {
                this.accountPurpose = accountPurpose
            }

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

            /** The user's annual salary */
            fun annualSalary(annualSalary: String) = annualSalary(JsonField.of(annualSalary))

            /**
             * Sets [Builder.annualSalary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.annualSalary] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun annualSalary(annualSalary: JsonField<String>) = apply {
                this.annualSalary = annualSalary
            }

            /** The user's birth date */
            fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

            /**
             * Sets [Builder.birthDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthDate(birthDate: JsonField<LocalDate>) = apply { this.birthDate = birthDate }

            /** The 2-digit country code of the user's national ID issuer */
            fun countryOfIssue(countryOfIssue: String) =
                countryOfIssue(JsonField.of(countryOfIssue))

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

            /** The estimated monthly spending amount for the user */
            fun expectedMonthlyVolume(expectedMonthlyVolume: String) =
                expectedMonthlyVolume(JsonField.of(expectedMonthlyVolume))

            /**
             * Sets [Builder.expectedMonthlyVolume] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expectedMonthlyVolume] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun expectedMonthlyVolume(expectedMonthlyVolume: JsonField<String>) = apply {
                this.expectedMonthlyVolume = expectedMonthlyVolume
            }

            /** The user's IP address */
            fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

            /**
             * Sets [Builder.ipAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

            /** Indicates whether the user has accepted the terms of service */
            fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: IsTermsOfServiceAccepted) =
                isTermsOfServiceAccepted(JsonField.of(isTermsOfServiceAccepted))

            /**
             * Sets [Builder.isTermsOfServiceAccepted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTermsOfServiceAccepted] with a well-typed
             * [IsTermsOfServiceAccepted] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun isTermsOfServiceAccepted(
                isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>
            ) = apply { this.isTermsOfServiceAccepted = isTermsOfServiceAccepted }

            /** The user's national ID number. For the US, this is a 9-digit SSN */
            fun nationalId(nationalId: String) = nationalId(JsonField.of(nationalId))

            /**
             * Sets [Builder.nationalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nationalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nationalId(nationalId: JsonField<String>) = apply { this.nationalId = nationalId }

            /** The user's occupation */
            fun occupation(occupation: String) = occupation(JsonField.of(occupation))

            /**
             * Sets [Builder.occupation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.occupation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun occupation(occupation: JsonField<String>) = apply { this.occupation = occupation }

            /**
             * Indicates whether the user will use existing documents for additional verification
             */
            fun hasExistingDocuments(hasExistingDocuments: Boolean) =
                hasExistingDocuments(JsonField.of(hasExistingDocuments))

            /**
             * Sets [Builder.hasExistingDocuments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasExistingDocuments] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hasExistingDocuments(hasExistingDocuments: JsonField<Boolean>) = apply {
                this.hasExistingDocuments = hasExistingDocuments
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountPurpose()
             * .address()
             * .annualSalary()
             * .birthDate()
             * .countryOfIssue()
             * .expectedMonthlyVolume()
             * .ipAddress()
             * .isTermsOfServiceAccepted()
             * .nationalId()
             * .occupation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountPurpose", accountPurpose),
                    checkRequired("address", address),
                    checkRequired("annualSalary", annualSalary),
                    checkRequired("birthDate", birthDate),
                    checkRequired("countryOfIssue", countryOfIssue),
                    checkRequired("expectedMonthlyVolume", expectedMonthlyVolume),
                    checkRequired("ipAddress", ipAddress),
                    checkRequired("isTermsOfServiceAccepted", isTermsOfServiceAccepted),
                    checkRequired("nationalId", nationalId),
                    checkRequired("occupation", occupation),
                    hasExistingDocuments,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountPurpose()
            address().validate()
            annualSalary()
            birthDate()
            countryOfIssue()
            expectedMonthlyVolume()
            ipAddress()
            isTermsOfServiceAccepted().validate()
            nationalId()
            occupation()
            hasExistingDocuments()
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
            (if (accountPurpose.asKnown() == null) 0 else 1) +
                (address.asKnown()?.validity() ?: 0) +
                (if (annualSalary.asKnown() == null) 0 else 1) +
                (if (birthDate.asKnown() == null) 0 else 1) +
                (if (countryOfIssue.asKnown() == null) 0 else 1) +
                (if (expectedMonthlyVolume.asKnown() == null) 0 else 1) +
                (if (ipAddress.asKnown() == null) 0 else 1) +
                (isTermsOfServiceAccepted.asKnown()?.validity() ?: 0) +
                (if (nationalId.asKnown() == null) 0 else 1) +
                (if (occupation.asKnown() == null) 0 else 1) +
                (if (hasExistingDocuments.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountPurpose == other.accountPurpose &&
                address == other.address &&
                annualSalary == other.annualSalary &&
                birthDate == other.birthDate &&
                countryOfIssue == other.countryOfIssue &&
                expectedMonthlyVolume == other.expectedMonthlyVolume &&
                ipAddress == other.ipAddress &&
                isTermsOfServiceAccepted == other.isTermsOfServiceAccepted &&
                nationalId == other.nationalId &&
                occupation == other.occupation &&
                hasExistingDocuments == other.hasExistingDocuments &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountPurpose,
                address,
                annualSalary,
                birthDate,
                countryOfIssue,
                expectedMonthlyVolume,
                ipAddress,
                isTermsOfServiceAccepted,
                nationalId,
                occupation,
                hasExistingDocuments,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountPurpose=$accountPurpose, address=$address, annualSalary=$annualSalary, birthDate=$birthDate, countryOfIssue=$countryOfIssue, expectedMonthlyVolume=$expectedMonthlyVolume, ipAddress=$ipAddress, isTermsOfServiceAccepted=$isTermsOfServiceAccepted, nationalId=$nationalId, occupation=$occupation, hasExistingDocuments=$hasExistingDocuments, additionalProperties=$additionalProperties}"
    }

    /** Indicates whether the user has accepted the terms of service */
    class IsTermsOfServiceAccepted
    @JsonCreator
    private constructor(private val value: JsonField<Boolean>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            val TRUE = of(true)

            fun of(value: Boolean) = IsTermsOfServiceAccepted(JsonField.of(value))
        }

        /** An enum containing [IsTermsOfServiceAccepted]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [IsTermsOfServiceAccepted]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [IsTermsOfServiceAccepted] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [IsTermsOfServiceAccepted] was instantiated with an
             * unknown value.
             */
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
                TRUE -> Value.TRUE
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
                TRUE -> Known.TRUE
                else -> throw RainInvalidDataException("Unknown IsTermsOfServiceAccepted: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws RainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean() ?: throw RainInvalidDataException("Value is not a Boolean")

        private var validated: Boolean = false

        fun validate(): IsTermsOfServiceAccepted = apply {
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

            return other is IsTermsOfServiceAccepted && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserReapplyParams &&
            userId == other.userId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(userId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserReapplyParams{userId=$userId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
