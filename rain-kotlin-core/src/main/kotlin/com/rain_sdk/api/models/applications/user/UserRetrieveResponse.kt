// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.user

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
import com.rain_sdk.api.models.applications.company.IssuingApplication
import java.util.Collections
import java.util.Objects

/** The details of an issuing application. */
class UserRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val applicationStatus: JsonField<IssuingApplication.ApplicationStatus>,
    private val applicationCompletionLink: JsonField<IssuingApplication.ApplicationCompletionLink>,
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
     * The identifier of the user's application
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
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
         * Returns a mutable builder for constructing an instance of [UserRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .applicationStatus()
         * .id()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UserRetrieveResponse]. */
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

        internal fun from(userRetrieveResponse: UserRetrieveResponse) = apply {
            applicationStatus = userRetrieveResponse.applicationStatus
            applicationCompletionLink = userRetrieveResponse.applicationCompletionLink
            applicationExternalVerificationLink =
                userRetrieveResponse.applicationExternalVerificationLink
            applicationReason = userRetrieveResponse.applicationReason
            id = userRetrieveResponse.id
            additionalProperties = userRetrieveResponse.additionalProperties.toMutableMap()
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

        /** The identifier of the user's application */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [UserRetrieveResponse].
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
        fun build(): UserRetrieveResponse =
            UserRetrieveResponse(
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws RainInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): UserRetrieveResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is UserRetrieveResponse &&
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
        "UserRetrieveResponse{applicationStatus=$applicationStatus, applicationCompletionLink=$applicationCompletionLink, applicationExternalVerificationLink=$applicationExternalVerificationLink, applicationReason=$applicationReason, id=$id, additionalProperties=$additionalProperties}"
}
