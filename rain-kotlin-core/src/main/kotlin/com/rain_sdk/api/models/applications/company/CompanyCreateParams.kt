// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.company

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
import com.rain_sdk.api.core.checkKnown
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.http.Headers
import com.rain_sdk.api.core.http.QueryParams
import com.rain_sdk.api.core.toImmutable
import com.rain_sdk.api.errors.RainInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * Submits an application to create a corporate account. The application requires details about the
 * company, its legal entity, representatives, and beneficial owners. The initial user must provide
 * a wallet address.
 */
class CompanyCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The company's physical address
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): PhysicalAddress = body.address()

    /**
     * The company's legal entity details.
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entity(): Entity = body.entity()

    /**
     * The initial user of the company. This user must have a wallet address, and their wallet
     * address will be associated as an owner on the company's Rain smart contract.
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initialUser(): InitialUser = body.initialUser()

    /**
     * The name of the company requesting to create an account
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The company's representatives
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun representatives(): List<IssuingApplicationPerson> = body.representatives()

    /**
     * The company's ultimate beneficial owners (UBOs)
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ultimateBeneficialOwners(): List<IssuingApplicationPerson> = body.ultimateBeneficialOwners()

    /**
     * The chain ID of the external collateral contract, if used. Not required when using Rain's
     * collateral contracts.
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun chainId(): String? = body.chainId()

    /**
     * The address of the external collateral contract, if used. Not required when using Rain's
     * collateral contracts.
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun contractAddress(): String? = body.contractAddress()

    /**
     * A unique identifier for the origin of the user
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun sourceKey(): String? = body.sourceKey()

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

    /**
     * Returns the raw JSON value of [chainId].
     *
     * Unlike [chainId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _chainId(): JsonField<String> = body._chainId()

    /**
     * Returns the raw JSON value of [contractAddress].
     *
     * Unlike [contractAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contractAddress(): JsonField<String> = body._contractAddress()

    /**
     * Returns the raw JSON value of [sourceKey].
     *
     * Unlike [sourceKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sourceKey(): JsonField<String> = body._sourceKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CompanyCreateParams].
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

    /** A builder for [CompanyCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(companyCreateParams: CompanyCreateParams) = apply {
            body = companyCreateParams.body.toBuilder()
            additionalHeaders = companyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = companyCreateParams.additionalQueryParams.toBuilder()
        }

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
         * The initial user of the company. This user must have a wallet address, and their wallet
         * address will be associated as an owner on the company's Rain smart contract.
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

        /** The name of the company requesting to create an account */
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

        /**
         * The chain ID of the external collateral contract, if used. Not required when using Rain's
         * collateral contracts.
         */
        fun chainId(chainId: String) = apply { body.chainId(chainId) }

        /**
         * Sets [Builder.chainId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chainId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chainId(chainId: JsonField<String>) = apply { body.chainId(chainId) }

        /**
         * The address of the external collateral contract, if used. Not required when using Rain's
         * collateral contracts.
         */
        fun contractAddress(contractAddress: String) = apply {
            body.contractAddress(contractAddress)
        }

        /**
         * Sets [Builder.contractAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contractAddress(contractAddress: JsonField<String>) = apply {
            body.contractAddress(contractAddress)
        }

        /** A unique identifier for the origin of the user */
        fun sourceKey(sourceKey: String) = apply { body.sourceKey(sourceKey) }

        /**
         * Sets [Builder.sourceKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceKey(sourceKey: JsonField<String>) = apply { body.sourceKey(sourceKey) }

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
         * Returns an immutable instance of [CompanyCreateParams].
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
        fun build(): CompanyCreateParams =
            CompanyCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

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
        private val chainId: JsonField<String>,
        private val contractAddress: JsonField<String>,
        private val sourceKey: JsonField<String>,
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
            @JsonProperty("chainId") @ExcludeMissing chainId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contractAddress")
            @ExcludeMissing
            contractAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceKey")
            @ExcludeMissing
            sourceKey: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            entity,
            initialUser,
            name,
            representatives,
            ultimateBeneficialOwners,
            chainId,
            contractAddress,
            sourceKey,
            mutableMapOf(),
        )

        /**
         * The company's physical address
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): PhysicalAddress = address.getRequired("address")

        /**
         * The company's legal entity details.
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entity(): Entity = entity.getRequired("entity")

        /**
         * The initial user of the company. This user must have a wallet address, and their wallet
         * address will be associated as an owner on the company's Rain smart contract.
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun initialUser(): InitialUser = initialUser.getRequired("initialUser")

        /**
         * The name of the company requesting to create an account
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The company's representatives
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun representatives(): List<IssuingApplicationPerson> =
            representatives.getRequired("representatives")

        /**
         * The company's ultimate beneficial owners (UBOs)
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ultimateBeneficialOwners(): List<IssuingApplicationPerson> =
            ultimateBeneficialOwners.getRequired("ultimateBeneficialOwners")

        /**
         * The chain ID of the external collateral contract, if used. Not required when using Rain's
         * collateral contracts.
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chainId(): String? = chainId.getNullable("chainId")

        /**
         * The address of the external collateral contract, if used. Not required when using Rain's
         * collateral contracts.
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contractAddress(): String? = contractAddress.getNullable("contractAddress")

        /**
         * A unique identifier for the origin of the user
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sourceKey(): String? = sourceKey.getNullable("sourceKey")

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

        /**
         * Returns the raw JSON value of [chainId].
         *
         * Unlike [chainId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chainId") @ExcludeMissing fun _chainId(): JsonField<String> = chainId

        /**
         * Returns the raw JSON value of [contractAddress].
         *
         * Unlike [contractAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contractAddress")
        @ExcludeMissing
        fun _contractAddress(): JsonField<String> = contractAddress

        /**
         * Returns the raw JSON value of [sourceKey].
         *
         * Unlike [sourceKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceKey") @ExcludeMissing fun _sourceKey(): JsonField<String> = sourceKey

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
            private var chainId: JsonField<String> = JsonMissing.of()
            private var contractAddress: JsonField<String> = JsonMissing.of()
            private var sourceKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                address = body.address
                entity = body.entity
                initialUser = body.initialUser
                name = body.name
                representatives = body.representatives.map { it.toMutableList() }
                ultimateBeneficialOwners = body.ultimateBeneficialOwners.map { it.toMutableList() }
                chainId = body.chainId
                contractAddress = body.contractAddress
                sourceKey = body.sourceKey
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
             * The initial user of the company. This user must have a wallet address, and their
             * wallet address will be associated as an owner on the company's Rain smart contract.
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

            /** The name of the company requesting to create an account */
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

            /**
             * The chain ID of the external collateral contract, if used. Not required when using
             * Rain's collateral contracts.
             */
            fun chainId(chainId: String) = chainId(JsonField.of(chainId))

            /**
             * Sets [Builder.chainId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chainId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chainId(chainId: JsonField<String>) = apply { this.chainId = chainId }

            /**
             * The address of the external collateral contract, if used. Not required when using
             * Rain's collateral contracts.
             */
            fun contractAddress(contractAddress: String) =
                contractAddress(JsonField.of(contractAddress))

            /**
             * Sets [Builder.contractAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractAddress(contractAddress: JsonField<String>) = apply {
                this.contractAddress = contractAddress
            }

            /** A unique identifier for the origin of the user */
            fun sourceKey(sourceKey: String) = sourceKey(JsonField.of(sourceKey))

            /**
             * Sets [Builder.sourceKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceKey(sourceKey: JsonField<String>) = apply { this.sourceKey = sourceKey }

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
                    chainId,
                    contractAddress,
                    sourceKey,
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
            chainId()
            contractAddress()
            sourceKey()
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
            (address.asKnown()?.validity() ?: 0) +
                (entity.asKnown()?.validity() ?: 0) +
                (initialUser.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (representatives.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (ultimateBeneficialOwners.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (chainId.asKnown() == null) 0 else 1) +
                (if (contractAddress.asKnown() == null) 0 else 1) +
                (if (sourceKey.asKnown() == null) 0 else 1)

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
                chainId == other.chainId &&
                contractAddress == other.contractAddress &&
                sourceKey == other.sourceKey &&
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
                chainId,
                contractAddress,
                sourceKey,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{address=$address, entity=$entity, initialUser=$initialUser, name=$name, representatives=$representatives, ultimateBeneficialOwners=$ultimateBeneficialOwners, chainId=$chainId, contractAddress=$contractAddress, sourceKey=$sourceKey, additionalProperties=$additionalProperties}"
    }

    /** The company's legal entity details. */
    class Entity
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val registrationNumber: JsonField<String>,
        private val taxId: JsonField<String>,
        private val website: JsonField<String>,
        private val description: JsonField<String>,
        private val expectedSpend: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registrationNumber")
            @ExcludeMissing
            registrationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expectedSpend")
            @ExcludeMissing
            expectedSpend: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            registrationNumber,
            taxId,
            website,
            description,
            expectedSpend,
            type,
            mutableMapOf(),
        )

        /**
         * The legal entity's name
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The legal entity's registration number
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun registrationNumber(): String = registrationNumber.getRequired("registrationNumber")

        /**
         * The legal entity's national tax id
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxId(): String = taxId.getRequired("taxId")

        /**
         * The legal entity's website
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun website(): String = website.getRequired("website")

        /**
         * A brief description of the legal entity and its activities
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * The estimated monthly spending by the legal entity
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expectedSpend(): String? = expectedSpend.getNullable("expectedSpend")

        /**
         * The type of legal entity (e.g., LLC, S Corp)
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): String? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [registrationNumber].
         *
         * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("registrationNumber")
        @ExcludeMissing
        fun _registrationNumber(): JsonField<String> = registrationNumber

        /**
         * Returns the raw JSON value of [taxId].
         *
         * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taxId") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
             * .name()
             * .registrationNumber()
             * .taxId()
             * .website()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Entity]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var registrationNumber: JsonField<String>? = null
            private var taxId: JsonField<String>? = null
            private var website: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var expectedSpend: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(entity: Entity) = apply {
                name = entity.name
                registrationNumber = entity.registrationNumber
                taxId = entity.taxId
                website = entity.website
                description = entity.description
                expectedSpend = entity.expectedSpend
                type = entity.type
                additionalProperties = entity.additionalProperties.toMutableMap()
            }

            /** The legal entity's name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The legal entity's registration number */
            fun registrationNumber(registrationNumber: String) =
                registrationNumber(JsonField.of(registrationNumber))

            /**
             * Sets [Builder.registrationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registrationNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                this.registrationNumber = registrationNumber
            }

            /** The legal entity's national tax id */
            fun taxId(taxId: String) = taxId(JsonField.of(taxId))

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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

            /** A brief description of the legal entity and its activities */
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
             * .name()
             * .registrationNumber()
             * .taxId()
             * .website()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Entity =
                Entity(
                    checkRequired("name", name),
                    checkRequired("registrationNumber", registrationNumber),
                    checkRequired("taxId", taxId),
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

            name()
            registrationNumber()
            taxId()
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
            (if (name.asKnown() == null) 0 else 1) +
                (if (registrationNumber.asKnown() == null) 0 else 1) +
                (if (taxId.asKnown() == null) 0 else 1) +
                (if (website.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (expectedSpend.asKnown() == null) 0 else 1) +
                (if (type.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entity &&
                name == other.name &&
                registrationNumber == other.registrationNumber &&
                taxId == other.taxId &&
                website == other.website &&
                description == other.description &&
                expectedSpend == other.expectedSpend &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                registrationNumber,
                taxId,
                website,
                description,
                expectedSpend,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entity{name=$name, registrationNumber=$registrationNumber, taxId=$taxId, website=$website, description=$description, expectedSpend=$expectedSpend, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * The initial user of the company. This user must have a wallet address, and their wallet
     * address will be associated as an owner on the company's Rain smart contract.
     */
    class InitialUser
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
        private val ipAddress: JsonField<String>,
        private val isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>,
        private val role: JsonField<String>,
        private val solanaAddress: JsonField<String>,
        private val walletAddress: JsonField<String>,
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
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("ipAddress")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isTermsOfServiceAccepted")
            @ExcludeMissing
            isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
            @JsonProperty("solanaAddress")
            @ExcludeMissing
            solanaAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("walletAddress")
            @ExcludeMissing
            walletAddress: JsonField<String> = JsonMissing.of(),
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
            ipAddress,
            isTermsOfServiceAccepted,
            role,
            solanaAddress,
            walletAddress,
            mutableMapOf(),
        )

        fun toIssuingApplicationPerson(): IssuingApplicationPerson =
            IssuingApplicationPerson.builder()
                .address(address)
                .birthDate(birthDate)
                .countryOfIssue(countryOfIssue)
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .nationalId(nationalId)
                .id(id)
                .phoneCountryCode(phoneCountryCode)
                .phoneNumber(phoneNumber)
                .build()

        /**
         * The person's address
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): PhysicalAddress = address.getRequired("address")

        /**
         * The person's birth date
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

        /**
         * The 2-digit country code of the person's national ID issuer
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryOfIssue(): String = countryOfIssue.getRequired("countryOfIssue")

        /**
         * The user's email address
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * The person's first name
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstName(): String = firstName.getRequired("firstName")

        /**
         * The person's last name
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastName(): String = lastName.getRequired("lastName")

        /**
         * The person's national ID number. For the US, this is a 9-digit SSN
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nationalId(): String = nationalId.getRequired("nationalId")

        /**
         * The person's unique identifier
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): String? = id.getNullable("id")

        /**
         * The country code for the phone number
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneCountryCode(): String? = phoneCountryCode.getNullable("phoneCountryCode")

        /**
         * The phone number of the person
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

        /**
         * This user's IP address
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
         * This user's role at their company (not their role on the Rain platform)
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun role(): String? = role.getNullable("role")

        /**
         * The user's Solana address. Either this or a EVM address is required if using a
         * Rain-managed solution, but optional otherwise.
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun solanaAddress(): String? = solanaAddress.getNullable("solanaAddress")

        /**
         * The user's Ethereum Virtual Machine (EVM) address. Either this or a Solana address is
         * required if using a Rain-managed solution, but optional otherwise.
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun walletAddress(): String? = walletAddress.getNullable("walletAddress")

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
        @JsonProperty("nationalId")
        @ExcludeMissing
        fun _nationalId(): JsonField<String> = nationalId

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
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

        /**
         * Returns the raw JSON value of [solanaAddress].
         *
         * Unlike [solanaAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("solanaAddress")
        @ExcludeMissing
        fun _solanaAddress(): JsonField<String> = solanaAddress

        /**
         * Returns the raw JSON value of [walletAddress].
         *
         * Unlike [walletAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("walletAddress")
        @ExcludeMissing
        fun _walletAddress(): JsonField<String> = walletAddress

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
             * .email()
             * .firstName()
             * .lastName()
             * .nationalId()
             * .ipAddress()
             * .isTermsOfServiceAccepted()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [InitialUser]. */
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
            private var ipAddress: JsonField<String>? = null
            private var isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>? = null
            private var role: JsonField<String> = JsonMissing.of()
            private var solanaAddress: JsonField<String> = JsonMissing.of()
            private var walletAddress: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(initialUser: InitialUser) = apply {
                address = initialUser.address
                birthDate = initialUser.birthDate
                countryOfIssue = initialUser.countryOfIssue
                email = initialUser.email
                firstName = initialUser.firstName
                lastName = initialUser.lastName
                nationalId = initialUser.nationalId
                id = initialUser.id
                phoneCountryCode = initialUser.phoneCountryCode
                phoneNumber = initialUser.phoneNumber
                ipAddress = initialUser.ipAddress
                isTermsOfServiceAccepted = initialUser.isTermsOfServiceAccepted
                role = initialUser.role
                solanaAddress = initialUser.solanaAddress
                walletAddress = initialUser.walletAddress
                additionalProperties = initialUser.additionalProperties.toMutableMap()
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
             * You should usually call [Builder.birthDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthDate(birthDate: JsonField<LocalDate>) = apply { this.birthDate = birthDate }

            /** The 2-digit country code of the person's national ID issuer */
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

            /** The person's first name */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The person's last name */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** The person's national ID number. For the US, this is a 9-digit SSN */
            fun nationalId(nationalId: String) = nationalId(JsonField.of(nationalId))

            /**
             * Sets [Builder.nationalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nationalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nationalId(nationalId: JsonField<String>) = apply { this.nationalId = nationalId }

            /** The person's unique identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** This user's IP address */
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

            /**
             * The user's Solana address. Either this or a EVM address is required if using a
             * Rain-managed solution, but optional otherwise.
             */
            fun solanaAddress(solanaAddress: String) = solanaAddress(JsonField.of(solanaAddress))

            /**
             * Sets [Builder.solanaAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.solanaAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun solanaAddress(solanaAddress: JsonField<String>) = apply {
                this.solanaAddress = solanaAddress
            }

            /**
             * The user's Ethereum Virtual Machine (EVM) address. Either this or a Solana address is
             * required if using a Rain-managed solution, but optional otherwise.
             */
            fun walletAddress(walletAddress: String) = walletAddress(JsonField.of(walletAddress))

            /**
             * Sets [Builder.walletAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.walletAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun walletAddress(walletAddress: JsonField<String>) = apply {
                this.walletAddress = walletAddress
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
             * Returns an immutable instance of [InitialUser].
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
             * .ipAddress()
             * .isTermsOfServiceAccepted()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InitialUser =
                InitialUser(
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
                    checkRequired("ipAddress", ipAddress),
                    checkRequired("isTermsOfServiceAccepted", isTermsOfServiceAccepted),
                    role,
                    solanaAddress,
                    walletAddress,
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
            email()
            firstName()
            lastName()
            nationalId()
            id()
            phoneCountryCode()
            phoneNumber()
            ipAddress()
            isTermsOfServiceAccepted().validate()
            role()
            solanaAddress()
            walletAddress()
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
            (address.asKnown()?.validity() ?: 0) +
                (if (birthDate.asKnown() == null) 0 else 1) +
                (if (countryOfIssue.asKnown() == null) 0 else 1) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (firstName.asKnown() == null) 0 else 1) +
                (if (lastName.asKnown() == null) 0 else 1) +
                (if (nationalId.asKnown() == null) 0 else 1) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (phoneCountryCode.asKnown() == null) 0 else 1) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (ipAddress.asKnown() == null) 0 else 1) +
                (isTermsOfServiceAccepted.asKnown()?.validity() ?: 0) +
                (if (role.asKnown() == null) 0 else 1) +
                (if (solanaAddress.asKnown() == null) 0 else 1) +
                (if (walletAddress.asKnown() == null) 0 else 1)

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
             * @throws RainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TRUE -> Known.TRUE
                    else ->
                        throw RainInvalidDataException("Unknown IsTermsOfServiceAccepted: $value")
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

            return other is InitialUser &&
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
                ipAddress == other.ipAddress &&
                isTermsOfServiceAccepted == other.isTermsOfServiceAccepted &&
                role == other.role &&
                solanaAddress == other.solanaAddress &&
                walletAddress == other.walletAddress &&
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
                ipAddress,
                isTermsOfServiceAccepted,
                role,
                solanaAddress,
                walletAddress,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InitialUser{address=$address, birthDate=$birthDate, countryOfIssue=$countryOfIssue, email=$email, firstName=$firstName, lastName=$lastName, nationalId=$nationalId, id=$id, phoneCountryCode=$phoneCountryCode, phoneNumber=$phoneNumber, ipAddress=$ipAddress, isTermsOfServiceAccepted=$isTermsOfServiceAccepted, role=$role, solanaAddress=$solanaAddress, walletAddress=$walletAddress, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CompanyCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
