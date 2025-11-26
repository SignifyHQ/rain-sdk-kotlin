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
import com.rain_hello_world.api.core.checkKnown
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.core.toImmutable
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.util.Collections
import java.util.Objects

/** The details of an issuing application. */
class CompanyRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val applicationStatus: JsonField<IssuingApplication.ApplicationStatus>,
    private val applicationCompletionLink: JsonField<IssuingApplication.ApplicationCompletionLink>,
    private val applicationExternalVerificationLink:
        JsonField<IssuingApplication.ApplicationExternalVerificationLink>,
    private val applicationReason: JsonField<String>,
    private val id: JsonField<String>,
    private val ultimateBeneficialOwners: JsonField<List<UltimateBeneficialOwner>>,
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
        @JsonProperty("ultimateBeneficialOwners")
        @ExcludeMissing
        ultimateBeneficialOwners: JsonField<List<UltimateBeneficialOwner>> = JsonMissing.of(),
    ) : this(
        applicationStatus,
        applicationCompletionLink,
        applicationExternalVerificationLink,
        applicationReason,
        id,
        ultimateBeneficialOwners,
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
     * The identifier of the company application
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The company's ultimate beneficial owners (UBOs)
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ultimateBeneficialOwners(): List<UltimateBeneficialOwner> =
        ultimateBeneficialOwners.getRequired("ultimateBeneficialOwners")

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
     * Returns the raw JSON value of [ultimateBeneficialOwners].
     *
     * Unlike [ultimateBeneficialOwners], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ultimateBeneficialOwners")
    @ExcludeMissing
    fun _ultimateBeneficialOwners(): JsonField<List<UltimateBeneficialOwner>> =
        ultimateBeneficialOwners

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
         * Returns a mutable builder for constructing an instance of [CompanyRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .applicationStatus()
         * .id()
         * .ultimateBeneficialOwners()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CompanyRetrieveResponse]. */
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
        private var ultimateBeneficialOwners: JsonField<MutableList<UltimateBeneficialOwner>>? =
            null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(companyRetrieveResponse: CompanyRetrieveResponse) = apply {
            applicationStatus = companyRetrieveResponse.applicationStatus
            applicationCompletionLink = companyRetrieveResponse.applicationCompletionLink
            applicationExternalVerificationLink =
                companyRetrieveResponse.applicationExternalVerificationLink
            applicationReason = companyRetrieveResponse.applicationReason
            id = companyRetrieveResponse.id
            ultimateBeneficialOwners =
                companyRetrieveResponse.ultimateBeneficialOwners.map { it.toMutableList() }
            additionalProperties = companyRetrieveResponse.additionalProperties.toMutableMap()
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

        /** The identifier of the company application */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The company's ultimate beneficial owners (UBOs) */
        fun ultimateBeneficialOwners(ultimateBeneficialOwners: List<UltimateBeneficialOwner>) =
            ultimateBeneficialOwners(JsonField.of(ultimateBeneficialOwners))

        /**
         * Sets [Builder.ultimateBeneficialOwners] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateBeneficialOwners] with a well-typed
         * `List<UltimateBeneficialOwner>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun ultimateBeneficialOwners(
            ultimateBeneficialOwners: JsonField<List<UltimateBeneficialOwner>>
        ) = apply {
            this.ultimateBeneficialOwners = ultimateBeneficialOwners.map { it.toMutableList() }
        }

        /**
         * Adds a single [UltimateBeneficialOwner] to [ultimateBeneficialOwners].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUltimateBeneficialOwner(ultimateBeneficialOwner: UltimateBeneficialOwner) = apply {
            ultimateBeneficialOwners =
                (ultimateBeneficialOwners ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ultimateBeneficialOwners", it).add(ultimateBeneficialOwner)
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
         * Returns an immutable instance of [CompanyRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .applicationStatus()
         * .id()
         * .ultimateBeneficialOwners()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyRetrieveResponse =
            CompanyRetrieveResponse(
                checkRequired("applicationStatus", applicationStatus),
                applicationCompletionLink,
                applicationExternalVerificationLink,
                applicationReason,
                checkRequired("id", id),
                checkRequired("ultimateBeneficialOwners", ultimateBeneficialOwners).map {
                    it.toImmutable()
                },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CompanyRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        applicationStatus().validate()
        applicationCompletionLink()?.validate()
        applicationExternalVerificationLink()?.validate()
        applicationReason()
        id()
        ultimateBeneficialOwners().forEach { it.validate() }
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
            (ultimateBeneficialOwners.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /** The details of an issuing application. */
    class UltimateBeneficialOwner
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val applicationStatus: JsonField<IssuingApplication.ApplicationStatus>,
        private val applicationCompletionLink:
            JsonField<IssuingApplication.ApplicationCompletionLink>,
        private val applicationExternalVerificationLink:
            JsonField<IssuingApplication.ApplicationExternalVerificationLink>,
        private val applicationReason: JsonField<String>,
        private val id: JsonField<String>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
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
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        ) : this(
            applicationStatus,
            applicationCompletionLink,
            applicationExternalVerificationLink,
            applicationReason,
            id,
            email,
            firstName,
            lastName,
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
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun applicationCompletionLink(): IssuingApplication.ApplicationCompletionLink? =
            applicationCompletionLink.getNullable("applicationCompletionLink")

        /**
         * The link to the external verification page for the application
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun applicationExternalVerificationLink():
            IssuingApplication.ApplicationExternalVerificationLink? =
            applicationExternalVerificationLink.getNullable("applicationExternalVerificationLink")

        /**
         * The reason behind the current application status
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun applicationReason(): String? = applicationReason.getNullable("applicationReason")

        /**
         * The UBO's unique identifier
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The UBO's email address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * The UBO's first name
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun firstName(): String? = firstName.getNullable("firstName")

        /**
         * The UBO's last name
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastName(): String? = lastName.getNullable("lastName")

        /**
         * Returns the raw JSON value of [applicationStatus].
         *
         * Unlike [applicationStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applicationStatus")
        @ExcludeMissing
        fun _applicationStatus(): JsonField<IssuingApplication.ApplicationStatus> =
            applicationStatus

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
         * Unlike [applicationExternalVerificationLink], this method doesn't throw if the JSON field
         * has an unexpected type.
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
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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
             * Returns a mutable builder for constructing an instance of [UltimateBeneficialOwner].
             *
             * The following fields are required:
             * ```kotlin
             * .applicationStatus()
             * .id()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UltimateBeneficialOwner]. */
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
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ultimateBeneficialOwner: UltimateBeneficialOwner) = apply {
                applicationStatus = ultimateBeneficialOwner.applicationStatus
                applicationCompletionLink = ultimateBeneficialOwner.applicationCompletionLink
                applicationExternalVerificationLink =
                    ultimateBeneficialOwner.applicationExternalVerificationLink
                applicationReason = ultimateBeneficialOwner.applicationReason
                id = ultimateBeneficialOwner.id
                email = ultimateBeneficialOwner.email
                firstName = ultimateBeneficialOwner.firstName
                lastName = ultimateBeneficialOwner.lastName
                additionalProperties = ultimateBeneficialOwner.additionalProperties.toMutableMap()
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
            fun applicationStatus(
                applicationStatus: JsonField<IssuingApplication.ApplicationStatus>
            ) = apply { this.applicationStatus = applicationStatus }

            /** The link to the application completion page */
            fun applicationCompletionLink(
                applicationCompletionLink: IssuingApplication.ApplicationCompletionLink
            ) = applicationCompletionLink(JsonField.of(applicationCompletionLink))

            /**
             * Sets [Builder.applicationCompletionLink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicationCompletionLink] with a well-typed
             * [IssuingApplication.ApplicationCompletionLink] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun applicationCompletionLink(
                applicationCompletionLink: JsonField<IssuingApplication.ApplicationCompletionLink>
            ) = apply { this.applicationCompletionLink = applicationCompletionLink }

            /** The link to the external verification page for the application */
            @Deprecated("deprecated")
            fun applicationExternalVerificationLink(
                applicationExternalVerificationLink:
                    IssuingApplication.ApplicationExternalVerificationLink
            ) =
                applicationExternalVerificationLink(
                    JsonField.of(applicationExternalVerificationLink)
                )

            /**
             * Sets [Builder.applicationExternalVerificationLink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicationExternalVerificationLink] with a
             * well-typed [IssuingApplication.ApplicationExternalVerificationLink] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun applicationExternalVerificationLink(
                applicationExternalVerificationLink:
                    JsonField<IssuingApplication.ApplicationExternalVerificationLink>
            ) = apply {
                this.applicationExternalVerificationLink = applicationExternalVerificationLink
            }

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

            /** The UBO's unique identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The UBO's email address */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The UBO's first name */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The UBO's last name */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

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
             * Returns an immutable instance of [UltimateBeneficialOwner].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .applicationStatus()
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UltimateBeneficialOwner =
                UltimateBeneficialOwner(
                    checkRequired("applicationStatus", applicationStatus),
                    applicationCompletionLink,
                    applicationExternalVerificationLink,
                    applicationReason,
                    checkRequired("id", id),
                    email,
                    firstName,
                    lastName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UltimateBeneficialOwner = apply {
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
            lastName()
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
            (applicationStatus.asKnown()?.validity() ?: 0) +
                (applicationCompletionLink.asKnown()?.validity() ?: 0) +
                (applicationExternalVerificationLink.asKnown()?.validity() ?: 0) +
                (if (applicationReason.asKnown() == null) 0 else 1) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (firstName.asKnown() == null) 0 else 1) +
                (if (lastName.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UltimateBeneficialOwner &&
                applicationStatus == other.applicationStatus &&
                applicationCompletionLink == other.applicationCompletionLink &&
                applicationExternalVerificationLink == other.applicationExternalVerificationLink &&
                applicationReason == other.applicationReason &&
                id == other.id &&
                email == other.email &&
                firstName == other.firstName &&
                lastName == other.lastName &&
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
                lastName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UltimateBeneficialOwner{applicationStatus=$applicationStatus, applicationCompletionLink=$applicationCompletionLink, applicationExternalVerificationLink=$applicationExternalVerificationLink, applicationReason=$applicationReason, id=$id, email=$email, firstName=$firstName, lastName=$lastName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyRetrieveResponse &&
            applicationStatus == other.applicationStatus &&
            applicationCompletionLink == other.applicationCompletionLink &&
            applicationExternalVerificationLink == other.applicationExternalVerificationLink &&
            applicationReason == other.applicationReason &&
            id == other.id &&
            ultimateBeneficialOwners == other.ultimateBeneficialOwners &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            applicationStatus,
            applicationCompletionLink,
            applicationExternalVerificationLink,
            applicationReason,
            id,
            ultimateBeneficialOwners,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyRetrieveResponse{applicationStatus=$applicationStatus, applicationCompletionLink=$applicationCompletionLink, applicationExternalVerificationLink=$applicationExternalVerificationLink, applicationReason=$applicationReason, id=$id, ultimateBeneficialOwners=$ultimateBeneficialOwners, additionalProperties=$additionalProperties}"
}
