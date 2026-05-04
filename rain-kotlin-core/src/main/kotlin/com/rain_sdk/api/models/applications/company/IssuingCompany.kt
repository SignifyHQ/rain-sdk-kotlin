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
import com.rain_sdk.api.core.checkKnown
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.toImmutable
import com.rain_sdk.api.errors.RainInvalidDataException
import java.util.Collections
import java.util.Objects

/** The details of an issuing application. */
class IssuingCompany
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val applicationStatus: JsonField<IssuingApplication.ApplicationStatus>,
    private val applicationCompletionLink: JsonField<IssuingApplication.ApplicationCompletionLink>,
    private val applicationExternalVerificationLink:
        JsonField<IssuingApplication.ApplicationExternalVerificationLink>,
    private val applicationReason: JsonField<String>,
    private val id: JsonField<String>,
    private val address: JsonField<PhysicalAddress>,
    private val name: JsonField<String>,
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
        @JsonProperty("address")
        @ExcludeMissing
        address: JsonField<PhysicalAddress> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ultimateBeneficialOwners")
        @ExcludeMissing
        ultimateBeneficialOwners: JsonField<List<UltimateBeneficialOwner>> = JsonMissing.of(),
    ) : this(
        applicationStatus,
        applicationCompletionLink,
        applicationExternalVerificationLink,
        applicationReason,
        id,
        address,
        name,
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
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applicationStatus(): IssuingApplication.ApplicationStatus =
        applicationStatus.getRequired("applicationStatus")

    /**
     * The link to the application completion page
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun applicationCompletionLink(): IssuingApplication.ApplicationCompletionLink? =
        applicationCompletionLink.getNullable("applicationCompletionLink")

    /**
     * The link to the external verification page for the application
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun applicationExternalVerificationLink():
        IssuingApplication.ApplicationExternalVerificationLink? =
        applicationExternalVerificationLink.getNullable("applicationExternalVerificationLink")

    /**
     * The reason behind the current application status
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun applicationReason(): String? = applicationReason.getNullable("applicationReason")

    /**
     * The company's unique identifier
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The company's physical address
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): PhysicalAddress = address.getRequired("address")

    /**
     * The company's name on the Rain platform
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The company's ultimate beneficial owners (UBOs)
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun ultimateBeneficialOwners(): List<UltimateBeneficialOwner>? =
        ultimateBeneficialOwners.getNullable("ultimateBeneficialOwners")

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
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<PhysicalAddress> = address

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [IssuingCompany].
         *
         * The following fields are required:
         * ```kotlin
         * .applicationStatus()
         * .id()
         * .address()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IssuingCompany]. */
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
        private var address: JsonField<PhysicalAddress>? = null
        private var name: JsonField<String>? = null
        private var ultimateBeneficialOwners: JsonField<MutableList<UltimateBeneficialOwner>>? =
            null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(issuingCompany: IssuingCompany) = apply {
            applicationStatus = issuingCompany.applicationStatus
            applicationCompletionLink = issuingCompany.applicationCompletionLink
            applicationExternalVerificationLink = issuingCompany.applicationExternalVerificationLink
            applicationReason = issuingCompany.applicationReason
            id = issuingCompany.id
            address = issuingCompany.address
            name = issuingCompany.name
            ultimateBeneficialOwners =
                issuingCompany.ultimateBeneficialOwners.map { it.toMutableList() }
            additionalProperties = issuingCompany.additionalProperties.toMutableMap()
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

        /** The company's unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The company's physical address */
        fun address(address: PhysicalAddress) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [PhysicalAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun address(address: JsonField<PhysicalAddress>) = apply { this.address = address }

        /** The company's name on the Rain platform */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [IssuingCompany].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .applicationStatus()
         * .id()
         * .address()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IssuingCompany =
            IssuingCompany(
                checkRequired("applicationStatus", applicationStatus),
                applicationCompletionLink,
                applicationExternalVerificationLink,
                applicationReason,
                checkRequired("id", id),
                checkRequired("address", address),
                checkRequired("name", name),
                (ultimateBeneficialOwners ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): IssuingCompany = apply {
        if (validated) {
            return@apply
        }

        applicationStatus().validate()
        applicationCompletionLink()?.validate()
        applicationExternalVerificationLink()?.validate()
        applicationReason()
        id()
        address().validate()
        name()
        ultimateBeneficialOwners()?.forEach { it.validate() }
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
        (applicationStatus.asKnown()?.validity() ?: 0) +
            (applicationCompletionLink.asKnown()?.validity() ?: 0) +
            (applicationExternalVerificationLink.asKnown()?.validity() ?: 0) +
            (if (applicationReason.asKnown() == null) 0 else 1) +
            (if (id.asKnown() == null) 0 else 1) +
            (address.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
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
        ) : this(
            applicationStatus,
            applicationCompletionLink,
            applicationExternalVerificationLink,
            applicationReason,
            id,
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
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun applicationStatus(): IssuingApplication.ApplicationStatus =
            applicationStatus.getRequired("applicationStatus")

        /**
         * The link to the application completion page
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun applicationCompletionLink(): IssuingApplication.ApplicationCompletionLink? =
            applicationCompletionLink.getNullable("applicationCompletionLink")

        /**
         * The link to the external verification page for the application
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun applicationExternalVerificationLink():
            IssuingApplication.ApplicationExternalVerificationLink? =
            applicationExternalVerificationLink.getNullable("applicationExternalVerificationLink")

        /**
         * The reason behind the current application status
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun applicationReason(): String? = applicationReason.getNullable("applicationReason")

        /**
         * The UBO's unique identifier
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ultimateBeneficialOwner: UltimateBeneficialOwner) = apply {
                applicationStatus = ultimateBeneficialOwner.applicationStatus
                applicationCompletionLink = ultimateBeneficialOwner.applicationCompletionLink
                applicationExternalVerificationLink =
                    ultimateBeneficialOwner.applicationExternalVerificationLink
                applicationReason = ultimateBeneficialOwner.applicationReason
                id = ultimateBeneficialOwner.id
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
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): UltimateBeneficialOwner = apply {
            if (validated) {
                return@apply
            }

            applicationStatus().validate()
            applicationCompletionLink()?.validate()
            applicationExternalVerificationLink()?.validate()
            applicationReason()
            id()
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
            (applicationStatus.asKnown()?.validity() ?: 0) +
                (applicationCompletionLink.asKnown()?.validity() ?: 0) +
                (applicationExternalVerificationLink.asKnown()?.validity() ?: 0) +
                (if (applicationReason.asKnown() == null) 0 else 1) +
                (if (id.asKnown() == null) 0 else 1)

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
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                applicationStatus,
                applicationCompletionLink,
                applicationExternalVerificationLink,
                applicationReason,
                id,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UltimateBeneficialOwner{applicationStatus=$applicationStatus, applicationCompletionLink=$applicationCompletionLink, applicationExternalVerificationLink=$applicationExternalVerificationLink, applicationReason=$applicationReason, id=$id, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IssuingCompany &&
            applicationStatus == other.applicationStatus &&
            applicationCompletionLink == other.applicationCompletionLink &&
            applicationExternalVerificationLink == other.applicationExternalVerificationLink &&
            applicationReason == other.applicationReason &&
            id == other.id &&
            address == other.address &&
            name == other.name &&
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
            address,
            name,
            ultimateBeneficialOwners,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IssuingCompany{applicationStatus=$applicationStatus, applicationCompletionLink=$applicationCompletionLink, applicationExternalVerificationLink=$applicationExternalVerificationLink, applicationReason=$applicationReason, id=$id, address=$address, name=$name, ultimateBeneficialOwners=$ultimateBeneficialOwners, additionalProperties=$additionalProperties}"
}
