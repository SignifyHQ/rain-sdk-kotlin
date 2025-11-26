// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.users

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_hello_world.api.core.ExcludeMissing
import com.rain_hello_world.api.core.JsonField
import com.rain_hello_world.api.core.JsonMissing
import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.core.Params
import com.rain_hello_world.api.core.http.Headers
import com.rain_hello_world.api.core.http.QueryParams
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import com.rain_hello_world.api.models.applications.company.PhysicalAddress
import java.util.Collections
import java.util.Objects

/**
 * This endpoint allows the update of a specific user's information, such as their name, email, and
 * contact details.
 */
class UserUpdateParams
private constructor(
    private val userId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun userId(): String? = userId

    /**
     * The user's address
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun address(): PhysicalAddress? = body.address()

    /**
     * The user's email address
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): String? = body.email()

    /**
     * The user's first name
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun firstName(): String? = body.firstName()

    /**
     * Indicates whether the user is active
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isActive(): Boolean? = body.isActive()

    /**
     * Indicates whether the user has accepted the terms of service
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isTermsOfServiceAccepted(): Boolean? = body.isTermsOfServiceAccepted()

    /**
     * The user's last name
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lastName(): String? = body.lastName()

    /**
     * The user's phone country code
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneCountryCode(): String? = body.phoneCountryCode()

    /**
     * The user's phone number
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneNumber(): String? = body.phoneNumber()

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _address(): JsonField<PhysicalAddress> = body._address()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isActive(): JsonField<Boolean> = body._isActive()

    /**
     * Returns the raw JSON value of [isTermsOfServiceAccepted].
     *
     * Unlike [isTermsOfServiceAccepted], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _isTermsOfServiceAccepted(): JsonField<Boolean> = body._isTermsOfServiceAccepted()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [phoneCountryCode].
     *
     * Unlike [phoneCountryCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _phoneCountryCode(): JsonField<String> = body._phoneCountryCode()

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumber(): JsonField<String> = body._phoneNumber()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): UserUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UserUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [UserUpdateParams]. */
    class Builder internal constructor() {

        private var userId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(userUpdateParams: UserUpdateParams) = apply {
            userId = userUpdateParams.userId
            body = userUpdateParams.body.toBuilder()
            additionalHeaders = userUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = userUpdateParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: String?) = apply { this.userId = userId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [address]
         * - [email]
         * - [firstName]
         * - [isActive]
         * - [isTermsOfServiceAccepted]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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

        /** The user's email address */
        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** The user's first name */
        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        /** Indicates whether the user is active */
        fun isActive(isActive: Boolean) = apply { body.isActive(isActive) }

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { body.isActive(isActive) }

        /** Indicates whether the user has accepted the terms of service */
        fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: Boolean) = apply {
            body.isTermsOfServiceAccepted(isTermsOfServiceAccepted)
        }

        /**
         * Sets [Builder.isTermsOfServiceAccepted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTermsOfServiceAccepted] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: JsonField<Boolean>) = apply {
            body.isTermsOfServiceAccepted(isTermsOfServiceAccepted)
        }

        /** The user's last name */
        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        /** The user's phone country code */
        fun phoneCountryCode(phoneCountryCode: String) = apply {
            body.phoneCountryCode(phoneCountryCode)
        }

        /**
         * Sets [Builder.phoneCountryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneCountryCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneCountryCode(phoneCountryCode: JsonField<String>) = apply {
            body.phoneCountryCode(phoneCountryCode)
        }

        /** The user's phone number */
        fun phoneNumber(phoneNumber: String) = apply { body.phoneNumber(phoneNumber) }

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { body.phoneNumber(phoneNumber) }

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
         * Returns an immutable instance of [UserUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserUpdateParams =
            UserUpdateParams(
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

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<PhysicalAddress>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val isActive: JsonField<Boolean>,
        private val isTermsOfServiceAccepted: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val phoneCountryCode: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address")
            @ExcludeMissing
            address: JsonField<PhysicalAddress> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isActive")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isTermsOfServiceAccepted")
            @ExcludeMissing
            isTermsOfServiceAccepted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phoneCountryCode")
            @ExcludeMissing
            phoneCountryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            email,
            firstName,
            isActive,
            isTermsOfServiceAccepted,
            lastName,
            phoneCountryCode,
            phoneNumber,
            mutableMapOf(),
        )

        /**
         * The user's address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): PhysicalAddress? = address.getNullable("address")

        /**
         * The user's email address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * The user's first name
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun firstName(): String? = firstName.getNullable("firstName")

        /**
         * Indicates whether the user is active
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun isActive(): Boolean? = isActive.getNullable("isActive")

        /**
         * Indicates whether the user has accepted the terms of service
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun isTermsOfServiceAccepted(): Boolean? =
            isTermsOfServiceAccepted.getNullable("isTermsOfServiceAccepted")

        /**
         * The user's last name
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastName(): String? = lastName.getNullable("lastName")

        /**
         * The user's phone country code
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneCountryCode(): String? = phoneCountryCode.getNullable("phoneCountryCode")

        /**
         * The user's phone number
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address")
        @ExcludeMissing
        fun _address(): JsonField<PhysicalAddress> = address

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
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var address: JsonField<PhysicalAddress> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var isTermsOfServiceAccepted: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var phoneCountryCode: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                address = body.address
                email = body.email
                firstName = body.firstName
                isActive = body.isActive
                isTermsOfServiceAccepted = body.isTermsOfServiceAccepted
                lastName = body.lastName
                phoneCountryCode = body.phoneCountryCode
                phoneNumber = body.phoneNumber
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /** The user's email address */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The user's first name */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Indicates whether the user is active */
            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** Indicates whether the user has accepted the terms of service */
            fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: Boolean) =
                isTermsOfServiceAccepted(JsonField.of(isTermsOfServiceAccepted))

            /**
             * Sets [Builder.isTermsOfServiceAccepted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTermsOfServiceAccepted] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: JsonField<Boolean>) = apply {
                this.isTermsOfServiceAccepted = isTermsOfServiceAccepted
            }

            /** The user's last name */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** The user's phone country code */
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
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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
             */
            fun build(): Body =
                Body(
                    address,
                    email,
                    firstName,
                    isActive,
                    isTermsOfServiceAccepted,
                    lastName,
                    phoneCountryCode,
                    phoneNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            address()?.validate()
            email()
            firstName()
            isActive()
            isTermsOfServiceAccepted()
            lastName()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (address.asKnown()?.validity() ?: 0) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (firstName.asKnown() == null) 0 else 1) +
                (if (isActive.asKnown() == null) 0 else 1) +
                (if (isTermsOfServiceAccepted.asKnown() == null) 0 else 1) +
                (if (lastName.asKnown() == null) 0 else 1) +
                (if (phoneCountryCode.asKnown() == null) 0 else 1) +
                (if (phoneNumber.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                address == other.address &&
                email == other.email &&
                firstName == other.firstName &&
                isActive == other.isActive &&
                isTermsOfServiceAccepted == other.isTermsOfServiceAccepted &&
                lastName == other.lastName &&
                phoneCountryCode == other.phoneCountryCode &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                email,
                firstName,
                isActive,
                isTermsOfServiceAccepted,
                lastName,
                phoneCountryCode,
                phoneNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{address=$address, email=$email, firstName=$firstName, isActive=$isActive, isTermsOfServiceAccepted=$isTermsOfServiceAccepted, lastName=$lastName, phoneCountryCode=$phoneCountryCode, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserUpdateParams &&
            userId == other.userId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(userId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserUpdateParams{userId=$userId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
