// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.applications.company

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_hello_world.api.core.Enum
import com.rain_hello_world.api.core.ExcludeMissing
import com.rain_hello_world.api.core.JsonField
import com.rain_hello_world.api.core.JsonMissing
import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.util.Collections
import java.util.Objects

/** The details of an issuing application. */
class IssuingApplication
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val applicationStatus: JsonField<ApplicationStatus>,
    private val applicationCompletionLink: JsonField<ApplicationCompletionLink>,
    private val applicationExternalVerificationLink: JsonField<ApplicationExternalVerificationLink>,
    private val applicationReason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("applicationStatus")
        @ExcludeMissing
        applicationStatus: JsonField<ApplicationStatus> = JsonMissing.of(),
        @JsonProperty("applicationCompletionLink")
        @ExcludeMissing
        applicationCompletionLink: JsonField<ApplicationCompletionLink> = JsonMissing.of(),
        @JsonProperty("applicationExternalVerificationLink")
        @ExcludeMissing
        applicationExternalVerificationLink: JsonField<ApplicationExternalVerificationLink> =
            JsonMissing.of(),
        @JsonProperty("applicationReason")
        @ExcludeMissing
        applicationReason: JsonField<String> = JsonMissing.of(),
    ) : this(
        applicationStatus,
        applicationCompletionLink,
        applicationExternalVerificationLink,
        applicationReason,
        mutableMapOf(),
    )

    /**
     * Represents the possible statuses of an application.
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applicationStatus(): ApplicationStatus = applicationStatus.getRequired("applicationStatus")

    /**
     * The link to the application completion page
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun applicationCompletionLink(): ApplicationCompletionLink? =
        applicationCompletionLink.getNullable("applicationCompletionLink")

    /**
     * The link to the external verification page for the application
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun applicationExternalVerificationLink(): ApplicationExternalVerificationLink? =
        applicationExternalVerificationLink.getNullable("applicationExternalVerificationLink")

    /**
     * The reason behind the current application status
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun applicationReason(): String? = applicationReason.getNullable("applicationReason")

    /**
     * Returns the raw JSON value of [applicationStatus].
     *
     * Unlike [applicationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applicationStatus")
    @ExcludeMissing
    fun _applicationStatus(): JsonField<ApplicationStatus> = applicationStatus

    /**
     * Returns the raw JSON value of [applicationCompletionLink].
     *
     * Unlike [applicationCompletionLink], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("applicationCompletionLink")
    @ExcludeMissing
    fun _applicationCompletionLink(): JsonField<ApplicationCompletionLink> =
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
    fun _applicationExternalVerificationLink(): JsonField<ApplicationExternalVerificationLink> =
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
         * Returns a mutable builder for constructing an instance of [IssuingApplication].
         *
         * The following fields are required:
         * ```kotlin
         * .applicationStatus()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IssuingApplication]. */
    class Builder internal constructor() {

        private var applicationStatus: JsonField<ApplicationStatus>? = null
        private var applicationCompletionLink: JsonField<ApplicationCompletionLink> =
            JsonMissing.of()
        private var applicationExternalVerificationLink:
            JsonField<ApplicationExternalVerificationLink> =
            JsonMissing.of()
        private var applicationReason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(issuingApplication: IssuingApplication) = apply {
            applicationStatus = issuingApplication.applicationStatus
            applicationCompletionLink = issuingApplication.applicationCompletionLink
            applicationExternalVerificationLink =
                issuingApplication.applicationExternalVerificationLink
            applicationReason = issuingApplication.applicationReason
            additionalProperties = issuingApplication.additionalProperties.toMutableMap()
        }

        /** Represents the possible statuses of an application. */
        fun applicationStatus(applicationStatus: ApplicationStatus) =
            applicationStatus(JsonField.of(applicationStatus))

        /**
         * Sets [Builder.applicationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationStatus] with a well-typed [ApplicationStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applicationStatus(applicationStatus: JsonField<ApplicationStatus>) = apply {
            this.applicationStatus = applicationStatus
        }

        /** The link to the application completion page */
        fun applicationCompletionLink(applicationCompletionLink: ApplicationCompletionLink) =
            applicationCompletionLink(JsonField.of(applicationCompletionLink))

        /**
         * Sets [Builder.applicationCompletionLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationCompletionLink] with a well-typed
         * [ApplicationCompletionLink] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun applicationCompletionLink(
            applicationCompletionLink: JsonField<ApplicationCompletionLink>
        ) = apply { this.applicationCompletionLink = applicationCompletionLink }

        /** The link to the external verification page for the application */
        @Deprecated("deprecated")
        fun applicationExternalVerificationLink(
            applicationExternalVerificationLink: ApplicationExternalVerificationLink
        ) = applicationExternalVerificationLink(JsonField.of(applicationExternalVerificationLink))

        /**
         * Sets [Builder.applicationExternalVerificationLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationExternalVerificationLink] with a well-typed
         * [ApplicationExternalVerificationLink] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun applicationExternalVerificationLink(
            applicationExternalVerificationLink: JsonField<ApplicationExternalVerificationLink>
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
         * Returns an immutable instance of [IssuingApplication].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .applicationStatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IssuingApplication =
            IssuingApplication(
                checkRequired("applicationStatus", applicationStatus),
                applicationCompletionLink,
                applicationExternalVerificationLink,
                applicationReason,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IssuingApplication = apply {
        if (validated) {
            return@apply
        }

        applicationStatus().validate()
        applicationCompletionLink()?.validate()
        applicationExternalVerificationLink()?.validate()
        applicationReason()
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
            (if (applicationReason.asKnown() == null) 0 else 1)

    /** Represents the possible statuses of an application. */
    class ApplicationStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val APPROVED = of("approved")

            val PENDING = of("pending")

            val NEEDS_INFORMATION = of("needsInformation")

            val NEEDS_VERIFICATION = of("needsVerification")

            val MANUAL_REVIEW = of("manualReview")

            val DENIED = of("denied")

            val LOCKED = of("locked")

            val CANCELED = of("canceled")

            fun of(value: String) = ApplicationStatus(JsonField.of(value))
        }

        /** An enum containing [ApplicationStatus]'s known values. */
        enum class Known {
            APPROVED,
            PENDING,
            NEEDS_INFORMATION,
            NEEDS_VERIFICATION,
            MANUAL_REVIEW,
            DENIED,
            LOCKED,
            CANCELED,
        }

        /**
         * An enum containing [ApplicationStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ApplicationStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            PENDING,
            NEEDS_INFORMATION,
            NEEDS_VERIFICATION,
            MANUAL_REVIEW,
            DENIED,
            LOCKED,
            CANCELED,
            /**
             * An enum member indicating that [ApplicationStatus] was instantiated with an unknown
             * value.
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
                APPROVED -> Value.APPROVED
                PENDING -> Value.PENDING
                NEEDS_INFORMATION -> Value.NEEDS_INFORMATION
                NEEDS_VERIFICATION -> Value.NEEDS_VERIFICATION
                MANUAL_REVIEW -> Value.MANUAL_REVIEW
                DENIED -> Value.DENIED
                LOCKED -> Value.LOCKED
                CANCELED -> Value.CANCELED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RainHelloWorldInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                PENDING -> Known.PENDING
                NEEDS_INFORMATION -> Known.NEEDS_INFORMATION
                NEEDS_VERIFICATION -> Known.NEEDS_VERIFICATION
                MANUAL_REVIEW -> Known.MANUAL_REVIEW
                DENIED -> Known.DENIED
                LOCKED -> Known.LOCKED
                CANCELED -> Known.CANCELED
                else ->
                    throw RainHelloWorldInvalidDataException("Unknown ApplicationStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RainHelloWorldInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw RainHelloWorldInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): ApplicationStatus = apply {
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
            } catch (e: RainHelloWorldInvalidDataException) {
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

            return other is ApplicationStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The link to the application completion page */
    class ApplicationCompletionLink
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val params: JsonField<Params>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params") @ExcludeMissing params: JsonField<Params> = JsonMissing.of(),
        ) : this(url, params, mutableMapOf())

        /**
         * The URL for the completion page
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun params(): Params? = params.getNullable("params")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [params].
         *
         * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

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
             * Returns a mutable builder for constructing an instance of
             * [ApplicationCompletionLink].
             *
             * The following fields are required:
             * ```kotlin
             * .url()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ApplicationCompletionLink]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var params: JsonField<Params> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(applicationCompletionLink: ApplicationCompletionLink) = apply {
                url = applicationCompletionLink.url
                params = applicationCompletionLink.params
                additionalProperties = applicationCompletionLink.additionalProperties.toMutableMap()
            }

            /** The URL for the completion page */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            fun params(params: Params) = params(JsonField.of(params))

            /**
             * Sets [Builder.params] to an arbitrary JSON value.
             *
             * You should usually call [Builder.params] with a well-typed [Params] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun params(params: JsonField<Params>) = apply { this.params = params }

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
             * Returns an immutable instance of [ApplicationCompletionLink].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ApplicationCompletionLink =
                ApplicationCompletionLink(
                    checkRequired("url", url),
                    params,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ApplicationCompletionLink = apply {
            if (validated) {
                return@apply
            }

            url()
            params()?.validate()
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
            (if (url.asKnown() == null) 0 else 1) + (params.asKnown()?.validity() ?: 0)

        class Params
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val userId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of()
            ) : this(userId, mutableMapOf())

            /**
             * The user's unique identifier
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun userId(): String? = userId.getNullable("userId")

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

                /** Returns a mutable builder for constructing an instance of [Params]. */
                fun builder() = Builder()
            }

            /** A builder for [Params]. */
            class Builder internal constructor() {

                private var userId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(params: Params) = apply {
                    userId = params.userId
                    additionalProperties = params.additionalProperties.toMutableMap()
                }

                /** The user's unique identifier */
                fun userId(userId: String) = userId(JsonField.of(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Params].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Params = Params(userId, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Params = apply {
                if (validated) {
                    return@apply
                }

                userId()
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
            internal fun validity(): Int = (if (userId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Params &&
                    userId == other.userId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(userId, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Params{userId=$userId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ApplicationCompletionLink &&
                url == other.url &&
                params == other.params &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(url, params, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ApplicationCompletionLink{url=$url, params=$params, additionalProperties=$additionalProperties}"
    }

    /** The link to the external verification page for the application */
    @Deprecated("deprecated")
    class ApplicationExternalVerificationLink
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val params: JsonField<Params>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params") @ExcludeMissing params: JsonField<Params> = JsonMissing.of(),
        ) : this(url, params, mutableMapOf())

        /**
         * The URL for the external verification page
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun params(): Params? = params.getNullable("params")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [params].
         *
         * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

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
             * Returns a mutable builder for constructing an instance of
             * [ApplicationExternalVerificationLink].
             *
             * The following fields are required:
             * ```kotlin
             * .url()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ApplicationExternalVerificationLink]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var params: JsonField<Params> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                applicationExternalVerificationLink: ApplicationExternalVerificationLink
            ) = apply {
                url = applicationExternalVerificationLink.url
                params = applicationExternalVerificationLink.params
                additionalProperties =
                    applicationExternalVerificationLink.additionalProperties.toMutableMap()
            }

            /** The URL for the external verification page */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            fun params(params: Params) = params(JsonField.of(params))

            /**
             * Sets [Builder.params] to an arbitrary JSON value.
             *
             * You should usually call [Builder.params] with a well-typed [Params] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun params(params: JsonField<Params>) = apply { this.params = params }

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
             * Returns an immutable instance of [ApplicationExternalVerificationLink].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ApplicationExternalVerificationLink =
                ApplicationExternalVerificationLink(
                    checkRequired("url", url),
                    params,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ApplicationExternalVerificationLink = apply {
            if (validated) {
                return@apply
            }

            url()
            params()?.validate()
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
            (if (url.asKnown() == null) 0 else 1) + (params.asKnown()?.validity() ?: 0)

        class Params
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val userId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of()
            ) : this(userId, mutableMapOf())

            /**
             * The user's unique identifier
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun userId(): String? = userId.getNullable("userId")

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

                /** Returns a mutable builder for constructing an instance of [Params]. */
                fun builder() = Builder()
            }

            /** A builder for [Params]. */
            class Builder internal constructor() {

                private var userId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(params: Params) = apply {
                    userId = params.userId
                    additionalProperties = params.additionalProperties.toMutableMap()
                }

                /** The user's unique identifier */
                fun userId(userId: String) = userId(JsonField.of(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Params].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Params = Params(userId, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Params = apply {
                if (validated) {
                    return@apply
                }

                userId()
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
            internal fun validity(): Int = (if (userId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Params &&
                    userId == other.userId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(userId, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Params{userId=$userId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ApplicationExternalVerificationLink &&
                url == other.url &&
                params == other.params &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(url, params, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ApplicationExternalVerificationLink{url=$url, params=$params, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IssuingApplication &&
            applicationStatus == other.applicationStatus &&
            applicationCompletionLink == other.applicationCompletionLink &&
            applicationExternalVerificationLink == other.applicationExternalVerificationLink &&
            applicationReason == other.applicationReason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            applicationStatus,
            applicationCompletionLink,
            applicationExternalVerificationLink,
            applicationReason,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IssuingApplication{applicationStatus=$applicationStatus, applicationCompletionLink=$applicationCompletionLink, applicationExternalVerificationLink=$applicationExternalVerificationLink, applicationReason=$applicationReason, additionalProperties=$additionalProperties}"
}
