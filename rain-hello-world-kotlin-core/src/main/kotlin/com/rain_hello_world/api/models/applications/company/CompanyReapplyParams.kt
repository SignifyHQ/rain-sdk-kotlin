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
import com.rain_hello_world.api.core.Params
import com.rain_hello_world.api.core.checkKnown
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.core.http.Headers
import com.rain_hello_world.api.core.http.QueryParams
import com.rain_hello_world.api.core.toImmutable
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * Allows a company to reapply or respond to a request for information after submitting their
 * corporate application. This endpoint is typically used when additional information or corrections
 * are needed.
 */
@Deprecated("deprecated")
class CompanyReapplyParams
private constructor(
    private val companyId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun companyId(): String? = companyId

    /**
     * The company's physical address
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): PhysicalAddress = body.address()

    /**
     * The company's legal entity details.
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entity(): Entity = body.entity()

    /**
     * The initial user of the company who will be the owner on the Rain smart contract. This user
     * must provide various personal details.
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initialUser(): InitialUser = body.initialUser()

    /**
     * The name of the company reapplying for the corporate application
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The company's representatives
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun representatives(): List<IssuingApplicationPerson> = body.representatives()

    /**
     * The company's ultimate beneficial owners (UBOs)
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ultimateBeneficialOwners(): List<IssuingApplicationPerson> = body.ultimateBeneficialOwners()

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _address(): JsonField<PhysicalAddress> = body._address()

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entity(): JsonField<Entity> = body._entity()

    /**
     * Returns the raw JSON value of [initialUser].
     *
     * Unlike [initialUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _initialUser(): JsonField<InitialUser> = body._initialUser()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [representatives].
     *
     * Unlike [representatives], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _representatives(): JsonField<List<IssuingApplicationPerson>> = body._representatives()

    /**
     * Returns the raw JSON value of [ultimateBeneficialOwners].
     *
     * Unlike [ultimateBeneficialOwners], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _ultimateBeneficialOwners(): JsonField<List<IssuingApplicationPerson>> =
        body._ultimateBeneficialOwners()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CompanyReapplyParams].
         *
         * The following fields are required:
         * ```kotlin
         * .address()
         * .entity()
         * .initialUser()
         * .name()
         * .representatives()
         * .ultimateBeneficialOwners()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CompanyReapplyParams]. */
    class Builder internal constructor() {

        private var companyId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(companyReapplyParams: CompanyReapplyParams) = apply {
            companyId = companyReapplyParams.companyId
            body = companyReapplyParams.body.toBuilder()
            additionalHeaders = companyReapplyParams.additionalHeaders.toBuilder()
            additionalQueryParams = companyReapplyParams.additionalQueryParams.toBuilder()
        }

        fun companyId(companyId: String?) = apply { this.companyId = companyId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [address]
         * - [entity]
         * - [initialUser]
         * - [name]
         * - [representatives]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The company's physical address */
        fun address(address: PhysicalAddress) = apply { body.address(address) }

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [PhysicalAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun address(address: JsonField<PhysicalAddress>) = apply { body.address(address) }

        /** The company's legal entity details. */
        fun entity(entity: Entity) = apply { body.entity(entity) }

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [Entity] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entity(entity: JsonField<Entity>) = apply { body.entity(entity) }

        /**
         * The initial user of the company who will be the owner on the Rain smart contract. This
         * user must provide various personal details.
         */
        fun initialUser(initialUser: InitialUser) = apply { body.initialUser(initialUser) }

        /**
         * Sets [Builder.initialUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialUser] with a well-typed [InitialUser] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initialUser(initialUser: JsonField<InitialUser>) = apply {
            body.initialUser(initialUser)
        }

        /** The name of the company reapplying for the corporate application */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The company's representatives */
        fun representatives(representatives: List<IssuingApplicationPerson>) = apply {
            body.representatives(representatives)
        }

        /**
         * Sets [Builder.representatives] to an arbitrary JSON value.
         *
         * You should usually call [Builder.representatives] with a well-typed
         * `List<IssuingApplicationPerson>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun representatives(representatives: JsonField<List<IssuingApplicationPerson>>) = apply {
            body.representatives(representatives)
        }

        /**
         * Adds a single [IssuingApplicationPerson] to [representatives].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRepresentative(representative: IssuingApplicationPerson) = apply {
            body.addRepresentative(representative)
        }

        /** The company's ultimate beneficial owners (UBOs) */
        fun ultimateBeneficialOwners(ultimateBeneficialOwners: List<IssuingApplicationPerson>) =
            apply {
                body.ultimateBeneficialOwners(ultimateBeneficialOwners)
            }

        /**
         * Sets [Builder.ultimateBeneficialOwners] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateBeneficialOwners] with a well-typed
         * `List<IssuingApplicationPerson>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun ultimateBeneficialOwners(
            ultimateBeneficialOwners: JsonField<List<IssuingApplicationPerson>>
        ) = apply { body.ultimateBeneficialOwners(ultimateBeneficialOwners) }

        /**
         * Adds a single [IssuingApplicationPerson] to [ultimateBeneficialOwners].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUltimateBeneficialOwner(ultimateBeneficialOwner: IssuingApplicationPerson) = apply {
            body.addUltimateBeneficialOwner(ultimateBeneficialOwner)
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
         * Returns an immutable instance of [CompanyReapplyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .address()
         * .entity()
         * .initialUser()
         * .name()
         * .representatives()
         * .ultimateBeneficialOwners()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyReapplyParams =
            CompanyReapplyParams(
                companyId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> companyId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<PhysicalAddress>,
        private val entity: JsonField<Entity>,
        private val initialUser: JsonField<InitialUser>,
        private val name: JsonField<String>,
        private val representatives: JsonField<List<IssuingApplicationPerson>>,
        private val ultimateBeneficialOwners: JsonField<List<IssuingApplicationPerson>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address")
            @ExcludeMissing
            address: JsonField<PhysicalAddress> = JsonMissing.of(),
            @JsonProperty("entity") @ExcludeMissing entity: JsonField<Entity> = JsonMissing.of(),
            @JsonProperty("initialUser")
            @ExcludeMissing
            initialUser: JsonField<InitialUser> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("representatives")
            @ExcludeMissing
            representatives: JsonField<List<IssuingApplicationPerson>> = JsonMissing.of(),
            @JsonProperty("ultimateBeneficialOwners")
            @ExcludeMissing
            ultimateBeneficialOwners: JsonField<List<IssuingApplicationPerson>> = JsonMissing.of(),
        ) : this(
            address,
            entity,
            initialUser,
            name,
            representatives,
            ultimateBeneficialOwners,
            mutableMapOf(),
        )

        /**
         * The company's physical address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): PhysicalAddress = address.getRequired("address")

        /**
         * The company's legal entity details.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entity(): Entity = entity.getRequired("entity")

        /**
         * The initial user of the company who will be the owner on the Rain smart contract. This
         * user must provide various personal details.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun initialUser(): InitialUser = initialUser.getRequired("initialUser")

        /**
         * The name of the company reapplying for the corporate application
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The company's representatives
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun representatives(): List<IssuingApplicationPerson> =
            representatives.getRequired("representatives")

        /**
         * The company's ultimate beneficial owners (UBOs)
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ultimateBeneficialOwners(): List<IssuingApplicationPerson> =
            ultimateBeneficialOwners.getRequired("ultimateBeneficialOwners")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address")
        @ExcludeMissing
        fun _address(): JsonField<PhysicalAddress> = address

        /**
         * Returns the raw JSON value of [entity].
         *
         * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

        /**
         * Returns the raw JSON value of [initialUser].
         *
         * Unlike [initialUser], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("initialUser")
        @ExcludeMissing
        fun _initialUser(): JsonField<InitialUser> = initialUser

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [representatives].
         *
         * Unlike [representatives], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("representatives")
        @ExcludeMissing
        fun _representatives(): JsonField<List<IssuingApplicationPerson>> = representatives

        /**
         * Returns the raw JSON value of [ultimateBeneficialOwners].
         *
         * Unlike [ultimateBeneficialOwners], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ultimateBeneficialOwners")
        @ExcludeMissing
        fun _ultimateBeneficialOwners(): JsonField<List<IssuingApplicationPerson>> =
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .address()
             * .entity()
             * .initialUser()
             * .name()
             * .representatives()
             * .ultimateBeneficialOwners()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var address: JsonField<PhysicalAddress>? = null
            private var entity: JsonField<Entity>? = null
            private var initialUser: JsonField<InitialUser>? = null
            private var name: JsonField<String>? = null
            private var representatives: JsonField<MutableList<IssuingApplicationPerson>>? = null
            private var ultimateBeneficialOwners:
                JsonField<MutableList<IssuingApplicationPerson>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                address = body.address
                entity = body.entity
                initialUser = body.initialUser
                name = body.name
                representatives = body.representatives.map { it.toMutableList() }
                ultimateBeneficialOwners = body.ultimateBeneficialOwners.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            /** The company's legal entity details. */
            fun entity(entity: Entity) = entity(JsonField.of(entity))

            /**
             * Sets [Builder.entity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entity] with a well-typed [Entity] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

            /**
             * The initial user of the company who will be the owner on the Rain smart contract.
             * This user must provide various personal details.
             */
            fun initialUser(initialUser: InitialUser) = initialUser(JsonField.of(initialUser))

            /**
             * Sets [Builder.initialUser] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initialUser] with a well-typed [InitialUser] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun initialUser(initialUser: JsonField<InitialUser>) = apply {
                this.initialUser = initialUser
            }

            /** The name of the company reapplying for the corporate application */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The company's representatives */
            fun representatives(representatives: List<IssuingApplicationPerson>) =
                representatives(JsonField.of(representatives))

            /**
             * Sets [Builder.representatives] to an arbitrary JSON value.
             *
             * You should usually call [Builder.representatives] with a well-typed
             * `List<IssuingApplicationPerson>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun representatives(representatives: JsonField<List<IssuingApplicationPerson>>) =
                apply {
                    this.representatives = representatives.map { it.toMutableList() }
                }

            /**
             * Adds a single [IssuingApplicationPerson] to [representatives].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRepresentative(representative: IssuingApplicationPerson) = apply {
                representatives =
                    (representatives ?: JsonField.of(mutableListOf())).also {
                        checkKnown("representatives", it).add(representative)
                    }
            }

            /** The company's ultimate beneficial owners (UBOs) */
            fun ultimateBeneficialOwners(ultimateBeneficialOwners: List<IssuingApplicationPerson>) =
                ultimateBeneficialOwners(JsonField.of(ultimateBeneficialOwners))

            /**
             * Sets [Builder.ultimateBeneficialOwners] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ultimateBeneficialOwners] with a well-typed
             * `List<IssuingApplicationPerson>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun ultimateBeneficialOwners(
                ultimateBeneficialOwners: JsonField<List<IssuingApplicationPerson>>
            ) = apply {
                this.ultimateBeneficialOwners = ultimateBeneficialOwners.map { it.toMutableList() }
            }

            /**
             * Adds a single [IssuingApplicationPerson] to [ultimateBeneficialOwners].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUltimateBeneficialOwner(ultimateBeneficialOwner: IssuingApplicationPerson) =
                apply {
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .address()
             * .entity()
             * .initialUser()
             * .name()
             * .representatives()
             * .ultimateBeneficialOwners()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("address", address),
                    checkRequired("entity", entity),
                    checkRequired("initialUser", initialUser),
                    checkRequired("name", name),
                    checkRequired("representatives", representatives).map { it.toImmutable() },
                    checkRequired("ultimateBeneficialOwners", ultimateBeneficialOwners).map {
                        it.toImmutable()
                    },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            entity().validate()
            initialUser().validate()
            name()
            representatives().forEach { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (address.asKnown()?.validity() ?: 0) +
                (entity.asKnown()?.validity() ?: 0) +
                (initialUser.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (representatives.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (ultimateBeneficialOwners.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                address == other.address &&
                entity == other.entity &&
                initialUser == other.initialUser &&
                name == other.name &&
                representatives == other.representatives &&
                ultimateBeneficialOwners == other.ultimateBeneficialOwners &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                entity,
                initialUser,
                name,
                representatives,
                ultimateBeneficialOwners,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{address=$address, entity=$entity, initialUser=$initialUser, name=$name, representatives=$representatives, ultimateBeneficialOwners=$ultimateBeneficialOwners, additionalProperties=$additionalProperties}"
    }

    /** The company's legal entity details. */
    class Entity
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val website: JsonField<String>,
        private val description: JsonField<String>,
        private val expectedSpend: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expectedSpend")
            @ExcludeMissing
            expectedSpend: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(website, description, expectedSpend, type, mutableMapOf())

        /**
         * The legal entity's website
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun website(): String = website.getRequired("website")

        /**
         * A brief description of the legal entity, and its activities
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * The estimated monthly spending by the legal entity
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expectedSpend(): String? = expectedSpend.getNullable("expectedSpend")

        /**
         * The type of legal entity (e.g., LLC, S Corp)
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): String? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [website].
         *
         * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [expectedSpend].
         *
         * Unlike [expectedSpend], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expectedSpend")
        @ExcludeMissing
        fun _expectedSpend(): JsonField<String> = expectedSpend

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
             * Returns a mutable builder for constructing an instance of [Entity].
             *
             * The following fields are required:
             * ```kotlin
             * .website()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Entity]. */
        class Builder internal constructor() {

            private var website: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var expectedSpend: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(entity: Entity) = apply {
                website = entity.website
                description = entity.description
                expectedSpend = entity.expectedSpend
                type = entity.type
                additionalProperties = entity.additionalProperties.toMutableMap()
            }

            /** The legal entity's website */
            fun website(website: String) = website(JsonField.of(website))

            /**
             * Sets [Builder.website] to an arbitrary JSON value.
             *
             * You should usually call [Builder.website] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun website(website: JsonField<String>) = apply { this.website = website }

            /** A brief description of the legal entity, and its activities */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The estimated monthly spending by the legal entity */
            fun expectedSpend(expectedSpend: String) = expectedSpend(JsonField.of(expectedSpend))

            /**
             * Sets [Builder.expectedSpend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expectedSpend] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expectedSpend(expectedSpend: JsonField<String>) = apply {
                this.expectedSpend = expectedSpend
            }

            /** The type of legal entity (e.g., LLC, S Corp) */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Entity].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .website()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Entity =
                Entity(
                    checkRequired("website", website),
                    description,
                    expectedSpend,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Entity = apply {
            if (validated) {
                return@apply
            }

            website()
            description()
            expectedSpend()
            type()
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
            (if (website.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (expectedSpend.asKnown() == null) 0 else 1) +
                (if (type.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entity &&
                website == other.website &&
                description == other.description &&
                expectedSpend == other.expectedSpend &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(website, description, expectedSpend, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entity{website=$website, description=$description, expectedSpend=$expectedSpend, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * The initial user of the company who will be the owner on the Rain smart contract. This user
     * must provide various personal details.
     */
    class InitialUser
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<PhysicalAddress>,
        private val birthDate: JsonField<LocalDate>,
        private val countryOfIssue: JsonField<String>,
        private val ipAddress: JsonField<String>,
        private val isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>,
        private val nationalId: JsonField<String>,
        private val role: JsonField<String>,
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
            @JsonProperty("ipAddress")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isTermsOfServiceAccepted")
            @ExcludeMissing
            isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted> = JsonMissing.of(),
            @JsonProperty("nationalId")
            @ExcludeMissing
            nationalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            birthDate,
            countryOfIssue,
            ipAddress,
            isTermsOfServiceAccepted,
            nationalId,
            role,
            mutableMapOf(),
        )

        /**
         * The user's address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): PhysicalAddress = address.getRequired("address")

        /**
         * The user's birth date
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

        /**
         * The 2-digit country code of the user's national ID issuer
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryOfIssue(): String = countryOfIssue.getRequired("countryOfIssue")

        /**
         * The user's IP address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ipAddress(): String = ipAddress.getRequired("ipAddress")

        /**
         * Indicates whether the user has accepted the terms of service
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isTermsOfServiceAccepted(): IsTermsOfServiceAccepted =
            isTermsOfServiceAccepted.getRequired("isTermsOfServiceAccepted")

        /**
         * The user's national ID number. For the US, this is a 9-digit SSN
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nationalId(): String = nationalId.getRequired("nationalId")

        /**
         * This user's role at their company (not their role on the Rain platform)
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun role(): String? = role.getNullable("role")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address")
        @ExcludeMissing
        fun _address(): JsonField<PhysicalAddress> = address

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
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

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
             * Returns a mutable builder for constructing an instance of [InitialUser].
             *
             * The following fields are required:
             * ```kotlin
             * .address()
             * .birthDate()
             * .countryOfIssue()
             * .ipAddress()
             * .isTermsOfServiceAccepted()
             * .nationalId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [InitialUser]. */
        class Builder internal constructor() {

            private var address: JsonField<PhysicalAddress>? = null
            private var birthDate: JsonField<LocalDate>? = null
            private var countryOfIssue: JsonField<String>? = null
            private var ipAddress: JsonField<String>? = null
            private var isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>? = null
            private var nationalId: JsonField<String>? = null
            private var role: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(initialUser: InitialUser) = apply {
                address = initialUser.address
                birthDate = initialUser.birthDate
                countryOfIssue = initialUser.countryOfIssue
                ipAddress = initialUser.ipAddress
                isTermsOfServiceAccepted = initialUser.isTermsOfServiceAccepted
                nationalId = initialUser.nationalId
                role = initialUser.role
                additionalProperties = initialUser.additionalProperties.toMutableMap()
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

            /** This user's role at their company (not their role on the Rain platform) */
            fun role(role: String) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun role(role: JsonField<String>) = apply { this.role = role }

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
             * Returns an immutable instance of [InitialUser].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .address()
             * .birthDate()
             * .countryOfIssue()
             * .ipAddress()
             * .isTermsOfServiceAccepted()
             * .nationalId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InitialUser =
                InitialUser(
                    checkRequired("address", address),
                    checkRequired("birthDate", birthDate),
                    checkRequired("countryOfIssue", countryOfIssue),
                    checkRequired("ipAddress", ipAddress),
                    checkRequired("isTermsOfServiceAccepted", isTermsOfServiceAccepted),
                    checkRequired("nationalId", nationalId),
                    role,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InitialUser = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            birthDate()
            countryOfIssue()
            ipAddress()
            isTermsOfServiceAccepted().validate()
            nationalId()
            role()
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
                (if (birthDate.asKnown() == null) 0 else 1) +
                (if (countryOfIssue.asKnown() == null) 0 else 1) +
                (if (ipAddress.asKnown() == null) 0 else 1) +
                (isTermsOfServiceAccepted.asKnown()?.validity() ?: 0) +
                (if (nationalId.asKnown() == null) 0 else 1) +
                (if (role.asKnown() == null) 0 else 1)

        /** Indicates whether the user has accepted the terms of service */
        class IsTermsOfServiceAccepted
        @JsonCreator
        private constructor(private val value: JsonField<Boolean>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [IsTermsOfServiceAccepted]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [IsTermsOfServiceAccepted] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRUE,
                /**
                 * An enum member indicating that [IsTermsOfServiceAccepted] was instantiated with
                 * an unknown value.
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
                    TRUE -> Value.TRUE
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
                    TRUE -> Known.TRUE
                    else ->
                        throw RainHelloWorldInvalidDataException(
                            "Unknown IsTermsOfServiceAccepted: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws RainHelloWorldInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asBoolean(): Boolean =
                _value().asBoolean()
                    ?: throw RainHelloWorldInvalidDataException("Value is not a Boolean")

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

                return other is IsTermsOfServiceAccepted && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InitialUser &&
                address == other.address &&
                birthDate == other.birthDate &&
                countryOfIssue == other.countryOfIssue &&
                ipAddress == other.ipAddress &&
                isTermsOfServiceAccepted == other.isTermsOfServiceAccepted &&
                nationalId == other.nationalId &&
                role == other.role &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                birthDate,
                countryOfIssue,
                ipAddress,
                isTermsOfServiceAccepted,
                nationalId,
                role,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InitialUser{address=$address, birthDate=$birthDate, countryOfIssue=$countryOfIssue, ipAddress=$ipAddress, isTermsOfServiceAccepted=$isTermsOfServiceAccepted, nationalId=$nationalId, role=$role, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyReapplyParams &&
            companyId == other.companyId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(companyId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CompanyReapplyParams{companyId=$companyId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
