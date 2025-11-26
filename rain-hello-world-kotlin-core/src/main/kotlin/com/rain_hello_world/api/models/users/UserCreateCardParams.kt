// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.users

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_hello_world.api.core.Enum
import com.rain_hello_world.api.core.ExcludeMissing
import com.rain_hello_world.api.core.JsonField
import com.rain_hello_world.api.core.JsonMissing
import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.core.Params
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.core.http.Headers
import com.rain_hello_world.api.core.http.QueryParams
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import com.rain_hello_world.api.models.applications.company.PhysicalAddress
import com.rain_hello_world.api.models.cards.IssuingCardLimit
import com.rain_hello_world.api.models.cards.IssuingCardStatus
import java.util.Collections
import java.util.Objects

/**
 * This endpoint allows the creation of a card for a specific user. The card can either be physical
 * or virtual and can include various configuration options such as the display name and limit.
 */
class UserCreateCardParams
private constructor(
    private val userId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun userId(): String? = userId

    /**
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * The address that will serve as the billing address for the card. Defaults to the shipping
     * address or team address if not explicitly provided.
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billing(): PhysicalAddress? = body.billing()

    /**
     * Configuration details for the card, including display name, product ID, and virtual card art
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun configuration(): Configuration? = body.configuration()

    /**
     * The initial credit limit for the card, expressed in cents
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun limit(): IssuingCardLimit? = body.limit()

    /**
     * The address to ship the card, if it is a physical card
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun shipping(): Shipping? = body.shipping()

    /**
     * The initial status of the card
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): IssuingCardStatus? = body.status()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [billing].
     *
     * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billing(): JsonField<PhysicalAddress> = body._billing()

    /**
     * Returns the raw JSON value of [configuration].
     *
     * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _configuration(): JsonField<Configuration> = body._configuration()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<IssuingCardLimit> = body._limit()

    /**
     * Returns the raw JSON value of [shipping].
     *
     * Unlike [shipping], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shipping(): JsonField<Shipping> = body._shipping()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<IssuingCardStatus> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserCreateCardParams].
         *
         * The following fields are required:
         * ```kotlin
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UserCreateCardParams]. */
    class Builder internal constructor() {

        private var userId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(userCreateCardParams: UserCreateCardParams) = apply {
            userId = userCreateCardParams.userId
            body = userCreateCardParams.body.toBuilder()
            additionalHeaders = userCreateCardParams.additionalHeaders.toBuilder()
            additionalQueryParams = userCreateCardParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: String?) = apply { this.userId = userId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [type]
         * - [billing]
         * - [configuration]
         * - [limit]
         * - [shipping]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * The address that will serve as the billing address for the card. Defaults to the shipping
         * address or team address if not explicitly provided.
         */
        fun billing(billing: PhysicalAddress) = apply { body.billing(billing) }

        /**
         * Sets [Builder.billing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billing] with a well-typed [PhysicalAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billing(billing: JsonField<PhysicalAddress>) = apply { body.billing(billing) }

        /**
         * Configuration details for the card, including display name, product ID, and virtual card
         * art
         */
        fun configuration(configuration: Configuration) = apply {
            body.configuration(configuration)
        }

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed [Configuration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configuration(configuration: JsonField<Configuration>) = apply {
            body.configuration(configuration)
        }

        /** The initial credit limit for the card, expressed in cents */
        fun limit(limit: IssuingCardLimit) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [IssuingCardLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun limit(limit: JsonField<IssuingCardLimit>) = apply { body.limit(limit) }

        /** The address to ship the card, if it is a physical card */
        fun shipping(shipping: Shipping) = apply { body.shipping(shipping) }

        /**
         * Sets [Builder.shipping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipping] with a well-typed [Shipping] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shipping(shipping: JsonField<Shipping>) = apply { body.shipping(shipping) }

        /** The initial status of the card */
        fun status(status: IssuingCardStatus) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [IssuingCardStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<IssuingCardStatus>) = apply { body.status(status) }

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
         * Returns an immutable instance of [UserCreateCardParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserCreateCardParams =
            UserCreateCardParams(
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
        private val type: JsonField<Type>,
        private val billing: JsonField<PhysicalAddress>,
        private val configuration: JsonField<Configuration>,
        private val limit: JsonField<IssuingCardLimit>,
        private val shipping: JsonField<Shipping>,
        private val status: JsonField<IssuingCardStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("billing")
            @ExcludeMissing
            billing: JsonField<PhysicalAddress> = JsonMissing.of(),
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<Configuration> = JsonMissing.of(),
            @JsonProperty("limit")
            @ExcludeMissing
            limit: JsonField<IssuingCardLimit> = JsonMissing.of(),
            @JsonProperty("shipping")
            @ExcludeMissing
            shipping: JsonField<Shipping> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<IssuingCardStatus> = JsonMissing.of(),
        ) : this(type, billing, configuration, limit, shipping, status, mutableMapOf())

        /**
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The address that will serve as the billing address for the card. Defaults to the shipping
         * address or team address if not explicitly provided.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun billing(): PhysicalAddress? = billing.getNullable("billing")

        /**
         * Configuration details for the card, including display name, product ID, and virtual card
         * art
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun configuration(): Configuration? = configuration.getNullable("configuration")

        /**
         * The initial credit limit for the card, expressed in cents
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun limit(): IssuingCardLimit? = limit.getNullable("limit")

        /**
         * The address to ship the card, if it is a physical card
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shipping(): Shipping? = shipping.getNullable("shipping")

        /**
         * The initial status of the card
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): IssuingCardStatus? = status.getNullable("status")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [billing].
         *
         * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billing")
        @ExcludeMissing
        fun _billing(): JsonField<PhysicalAddress> = billing

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<IssuingCardLimit> = limit

        /**
         * Returns the raw JSON value of [shipping].
         *
         * Unlike [shipping], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shipping") @ExcludeMissing fun _shipping(): JsonField<Shipping> = shipping

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<IssuingCardStatus> = status

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
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var billing: JsonField<PhysicalAddress> = JsonMissing.of()
            private var configuration: JsonField<Configuration> = JsonMissing.of()
            private var limit: JsonField<IssuingCardLimit> = JsonMissing.of()
            private var shipping: JsonField<Shipping> = JsonMissing.of()
            private var status: JsonField<IssuingCardStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                type = body.type
                billing = body.billing
                configuration = body.configuration
                limit = body.limit
                shipping = body.shipping
                status = body.status
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * The address that will serve as the billing address for the card. Defaults to the
             * shipping address or team address if not explicitly provided.
             */
            fun billing(billing: PhysicalAddress) = billing(JsonField.of(billing))

            /**
             * Sets [Builder.billing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billing] with a well-typed [PhysicalAddress] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billing(billing: JsonField<PhysicalAddress>) = apply { this.billing = billing }

            /**
             * Configuration details for the card, including display name, product ID, and virtual
             * card art
             */
            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed [Configuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
            }

            /** The initial credit limit for the card, expressed in cents */
            fun limit(limit: IssuingCardLimit) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [IssuingCardLimit] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limit(limit: JsonField<IssuingCardLimit>) = apply { this.limit = limit }

            /** The address to ship the card, if it is a physical card */
            fun shipping(shipping: Shipping) = shipping(JsonField.of(shipping))

            /**
             * Sets [Builder.shipping] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shipping] with a well-typed [Shipping] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shipping(shipping: JsonField<Shipping>) = apply { this.shipping = shipping }

            /** The initial status of the card */
            fun status(status: IssuingCardStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [IssuingCardStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<IssuingCardStatus>) = apply { this.status = status }

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
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("type", type),
                    billing,
                    configuration,
                    limit,
                    shipping,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            billing()?.validate()
            configuration()?.validate()
            limit()?.validate()
            shipping()?.validate()
            status()?.validate()
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
            (type.asKnown()?.validity() ?: 0) +
                (billing.asKnown()?.validity() ?: 0) +
                (configuration.asKnown()?.validity() ?: 0) +
                (limit.asKnown()?.validity() ?: 0) +
                (shipping.asKnown()?.validity() ?: 0) +
                (status.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                type == other.type &&
                billing == other.billing &&
                configuration == other.configuration &&
                limit == other.limit &&
                shipping == other.shipping &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                billing,
                configuration,
                limit,
                shipping,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{type=$type, billing=$billing, configuration=$configuration, limit=$limit, shipping=$shipping, status=$status, additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PHYSICAL = of("physical")

            val VIRTUAL = of("virtual")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PHYSICAL,
            VIRTUAL,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PHYSICAL,
            VIRTUAL,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PHYSICAL -> Value.PHYSICAL
                VIRTUAL -> Value.VIRTUAL
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
                PHYSICAL -> Known.PHYSICAL
                VIRTUAL -> Known.VIRTUAL
                else -> throw RainHelloWorldInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Configuration details for the card, including display name, product ID, and virtual card art
     */
    class Configuration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val productId: JsonField<String>,
        private val productRef: JsonField<String>,
        private val virtualCardArt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productId")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productRef")
            @ExcludeMissing
            productRef: JsonField<String> = JsonMissing.of(),
            @JsonProperty("virtualCardArt")
            @ExcludeMissing
            virtualCardArt: JsonField<String> = JsonMissing.of(),
        ) : this(displayName, productId, productRef, virtualCardArt, mutableMapOf())

        /**
         * The name to display on the card. If omitted, it will be the user's full name trimmed to
         * 30 characters.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun displayName(): String? = displayName.getNullable("displayName")

        /**
         * The product ID to use for the card, denoting its BIN range. Only relevant if custom
         * product IDs or product references are part of the user's contract.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun productId(): String? = productId.getNullable("productId")

        /**
         * The product reference to use for the card, denoting its appearance. Only relevant if
         * custom product IDs or product references are part of the user's contract.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun productRef(): String? = productRef.getNullable("productRef")

        /**
         * The virtual card art ID to use for the card, denoting its virtual appearance. Only
         * relevant if custom virtual card art IDs are part of the user's contract.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun virtualCardArt(): String? = virtualCardArt.getNullable("virtualCardArt")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [productRef].
         *
         * Unlike [productRef], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productRef")
        @ExcludeMissing
        fun _productRef(): JsonField<String> = productRef

        /**
         * Returns the raw JSON value of [virtualCardArt].
         *
         * Unlike [virtualCardArt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("virtualCardArt")
        @ExcludeMissing
        fun _virtualCardArt(): JsonField<String> = virtualCardArt

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

            /** Returns a mutable builder for constructing an instance of [Configuration]. */
            fun builder() = Builder()
        }

        /** A builder for [Configuration]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var productRef: JsonField<String> = JsonMissing.of()
            private var virtualCardArt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(configuration: Configuration) = apply {
                displayName = configuration.displayName
                productId = configuration.productId
                productRef = configuration.productRef
                virtualCardArt = configuration.virtualCardArt
                additionalProperties = configuration.additionalProperties.toMutableMap()
            }

            /**
             * The name to display on the card. If omitted, it will be the user's full name trimmed
             * to 30 characters.
             */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /**
             * The product ID to use for the card, denoting its BIN range. Only relevant if custom
             * product IDs or product references are part of the user's contract.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * The product reference to use for the card, denoting its appearance. Only relevant if
             * custom product IDs or product references are part of the user's contract.
             */
            fun productRef(productRef: String) = productRef(JsonField.of(productRef))

            /**
             * Sets [Builder.productRef] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productRef] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productRef(productRef: JsonField<String>) = apply { this.productRef = productRef }

            /**
             * The virtual card art ID to use for the card, denoting its virtual appearance. Only
             * relevant if custom virtual card art IDs are part of the user's contract.
             */
            fun virtualCardArt(virtualCardArt: String) =
                virtualCardArt(JsonField.of(virtualCardArt))

            /**
             * Sets [Builder.virtualCardArt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.virtualCardArt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun virtualCardArt(virtualCardArt: JsonField<String>) = apply {
                this.virtualCardArt = virtualCardArt
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
             * Returns an immutable instance of [Configuration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Configuration =
                Configuration(
                    displayName,
                    productId,
                    productRef,
                    virtualCardArt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Configuration = apply {
            if (validated) {
                return@apply
            }

            displayName()
            productId()
            productRef()
            virtualCardArt()
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
            (if (displayName.asKnown() == null) 0 else 1) +
                (if (productId.asKnown() == null) 0 else 1) +
                (if (productRef.asKnown() == null) 0 else 1) +
                (if (virtualCardArt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Configuration &&
                displayName == other.displayName &&
                productId == other.productId &&
                productRef == other.productRef &&
                virtualCardArt == other.virtualCardArt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(displayName, productId, productRef, virtualCardArt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Configuration{displayName=$displayName, productId=$productId, productRef=$productRef, virtualCardArt=$virtualCardArt, additionalProperties=$additionalProperties}"
    }

    /** The address to ship the card, if it is a physical card */
    class Shipping
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val line1: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val region: JsonField<String>,
        private val line2: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val method: JsonField<Method>,
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
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
        ) : this(
            city,
            country,
            countryCode,
            line1,
            postalCode,
            region,
            line2,
            phoneNumber,
            method,
            mutableMapOf(),
        )

        fun toPhysicalAddress(): PhysicalAddress =
            PhysicalAddress.builder()
                .city(city)
                .country(country)
                .countryCode(countryCode)
                .line1(line1)
                .postalCode(postalCode)
                .region(region)
                .line2(line2)
                .build()

        /**
         * The city of the address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * The full name of the country
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * The 2-letter country code of the address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): String = countryCode.getRequired("countryCode")

        /**
         * The first line of the street address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * The postal or zip code of the address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postalCode")

        /**
         * The region or state of the address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * The second line of the street address (optional)
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun line2(): String? = line2.getNullable("line2")

        /**
         * The phone number to use for shipping, if it is a physical card
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

        /**
         * The shipping method to use for the card. Standard and express are for US addresses, while
         * international is for non-US addresses.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun method(): Method? = method.getNullable("method")

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
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

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
        @JsonProperty("postalCode")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

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

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

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
             * Returns a mutable builder for constructing an instance of [Shipping].
             *
             * The following fields are required:
             * ```kotlin
             * .city()
             * .country()
             * .countryCode()
             * .line1()
             * .postalCode()
             * .region()
             * .phoneNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Shipping]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var countryCode: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String>? = null
            private var method: JsonField<Method> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shipping: Shipping) = apply {
                city = shipping.city
                country = shipping.country
                countryCode = shipping.countryCode
                line1 = shipping.line1
                postalCode = shipping.postalCode
                region = shipping.region
                line2 = shipping.line2
                phoneNumber = shipping.phoneNumber
                method = shipping.method
                additionalProperties = shipping.additionalProperties.toMutableMap()
            }

            /** The city of the address */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The full name of the country */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** The 2-letter country code of the address */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            /** The first line of the street address */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The postal or zip code of the address */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The region or state of the address */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The second line of the street address (optional) */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The phone number to use for shipping, if it is a physical card */
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

            /**
             * The shipping method to use for the card. Standard and express are for US addresses,
             * while international is for non-US addresses.
             */
            fun method(method: Method) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [Method] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<Method>) = apply { this.method = method }

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
             * Returns an immutable instance of [Shipping].
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
             * .phoneNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Shipping =
                Shipping(
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("countryCode", countryCode),
                    checkRequired("line1", line1),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    line2,
                    checkRequired("phoneNumber", phoneNumber),
                    method,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Shipping = apply {
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
            phoneNumber()
            method()?.validate()
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
            (if (city.asKnown() == null) 0 else 1) +
                (if (country.asKnown() == null) 0 else 1) +
                (if (countryCode.asKnown() == null) 0 else 1) +
                (if (line1.asKnown() == null) 0 else 1) +
                (if (postalCode.asKnown() == null) 0 else 1) +
                (if (region.asKnown() == null) 0 else 1) +
                (if (line2.asKnown() == null) 0 else 1) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (method.asKnown()?.validity() ?: 0)

        /**
         * The shipping method to use for the card. Standard and express are for US addresses, while
         * international is for non-US addresses.
         */
        class Method @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val STANDARD = of("standard")

                val EXPRESS = of("express")

                val INTERNATIONAL = of("international")

                fun of(value: String) = Method(JsonField.of(value))
            }

            /** An enum containing [Method]'s known values. */
            enum class Known {
                STANDARD,
                EXPRESS,
                INTERNATIONAL,
            }

            /**
             * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Method] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STANDARD,
                EXPRESS,
                INTERNATIONAL,
                /**
                 * An enum member indicating that [Method] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    STANDARD -> Value.STANDARD
                    EXPRESS -> Value.EXPRESS
                    INTERNATIONAL -> Value.INTERNATIONAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RainHelloWorldInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    STANDARD -> Known.STANDARD
                    EXPRESS -> Known.EXPRESS
                    INTERNATIONAL -> Known.INTERNATIONAL
                    else -> throw RainHelloWorldInvalidDataException("Unknown Method: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws RainHelloWorldInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw RainHelloWorldInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Method = apply {
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

                return other is Method && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Shipping &&
                city == other.city &&
                country == other.country &&
                countryCode == other.countryCode &&
                line1 == other.line1 &&
                postalCode == other.postalCode &&
                region == other.region &&
                line2 == other.line2 &&
                phoneNumber == other.phoneNumber &&
                method == other.method &&
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
                phoneNumber,
                method,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Shipping{city=$city, country=$country, countryCode=$countryCode, line1=$line1, postalCode=$postalCode, region=$region, line2=$line2, phoneNumber=$phoneNumber, method=$method, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserCreateCardParams &&
            userId == other.userId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(userId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserCreateCardParams{userId=$userId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
