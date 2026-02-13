// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.user

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.BaseDeserializer
import com.rain_sdk.api.core.BaseSerializer
import com.rain_sdk.api.core.Enum
import com.rain_sdk.api.core.ExcludeMissing
import com.rain_sdk.api.core.JsonField
import com.rain_sdk.api.core.JsonMissing
import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.Params
import com.rain_sdk.api.core.allMaxBy
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.getOrThrow
import com.rain_sdk.api.core.http.Headers
import com.rain_sdk.api.core.http.QueryParams
import com.rain_sdk.api.errors.RainInvalidDataException
import com.rain_sdk.api.models.applications.company.IssuingApplicationPerson
import com.rain_sdk.api.models.applications.company.PhysicalAddress
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * Submits an application to create a consumer account for a user. The application can be submitted
 * using a Sumsub share token, Persona share token, or directly via API. The user must provide
 * details about their wallet, occupation, salary, and other account-related information.
 */
class UserCreateParams
private constructor(
    private val body: Body?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The user seeking to create an account. The user must have a wallet, and their wallet will be
     * linked as an owner on their Rain smart contract.
     */
    fun body(): Body? = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): UserCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UserCreateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [UserCreateParams]. */
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(userCreateParams: UserCreateParams) = apply {
            body = userCreateParams.body
            additionalHeaders = userCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = userCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The user seeking to create an account. The user must have a wallet, and their wallet will
         * be linked as an owner on their Rain smart contract.
         */
        fun body(body: Body?) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofUsingSumsubShareToken(usingSumsubShareToken)`. */
        fun body(usingSumsubShareToken: Body.UsingSumsubShareToken) =
            body(Body.ofUsingSumsubShareToken(usingSumsubShareToken))

        /** Alias for calling [body] with `Body.ofUnionMember1(unionMember1)`. */
        fun body(unionMember1: Body.UnionMember1) = body(Body.ofUnionMember1(unionMember1))

        /** Alias for calling [body] with `Body.ofUsingApi(usingApi)`. */
        fun body(usingApi: Body.UsingApi) = body(Body.ofUsingApi(usingApi))

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
         * Returns an immutable instance of [UserCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserCreateParams =
            UserCreateParams(body, additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body? = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * The user seeking to create an account. The user must have a wallet, and their wallet will be
     * linked as an owner on their Rain smart contract.
     */
    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val usingSumsubShareToken: UsingSumsubShareToken? = null,
        private val unionMember1: UnionMember1? = null,
        private val usingApi: UsingApi? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usingSumsubShareToken(): UsingSumsubShareToken? = usingSumsubShareToken

        fun unionMember1(): UnionMember1? = unionMember1

        /**
         * The user seeking to create an account. The user must have a wallet, and their wallet will
         * be linked as an owner on their Rain smart contract.
         */
        fun usingApi(): UsingApi? = usingApi

        fun isUsingSumsubShareToken(): Boolean = usingSumsubShareToken != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun isUsingApi(): Boolean = usingApi != null

        fun asUsingSumsubShareToken(): UsingSumsubShareToken =
            usingSumsubShareToken.getOrThrow("usingSumsubShareToken")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        /**
         * The user seeking to create an account. The user must have a wallet, and their wallet will
         * be linked as an owner on their Rain smart contract.
         */
        fun asUsingApi(): UsingApi = usingApi.getOrThrow("usingApi")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                usingSumsubShareToken != null ->
                    visitor.visitUsingSumsubShareToken(usingSumsubShareToken)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                usingApi != null -> visitor.visitUsingApi(usingApi)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUsingSumsubShareToken(
                        usingSumsubShareToken: UsingSumsubShareToken
                    ) {
                        usingSumsubShareToken.validate()
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }

                    override fun visitUsingApi(usingApi: UsingApi) {
                        usingApi.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUsingSumsubShareToken(
                        usingSumsubShareToken: UsingSumsubShareToken
                    ) = usingSumsubShareToken.validity()

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun visitUsingApi(usingApi: UsingApi) = usingApi.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                usingSumsubShareToken == other.usingSumsubShareToken &&
                unionMember1 == other.unionMember1 &&
                usingApi == other.usingApi
        }

        override fun hashCode(): Int = Objects.hash(usingSumsubShareToken, unionMember1, usingApi)

        override fun toString(): String =
            when {
                usingSumsubShareToken != null ->
                    "Body{usingSumsubShareToken=$usingSumsubShareToken}"
                unionMember1 != null -> "Body{unionMember1=$unionMember1}"
                usingApi != null -> "Body{usingApi=$usingApi}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            fun ofUsingSumsubShareToken(usingSumsubShareToken: UsingSumsubShareToken) =
                Body(usingSumsubShareToken = usingSumsubShareToken)

            fun ofUnionMember1(unionMember1: UnionMember1) = Body(unionMember1 = unionMember1)

            /**
             * The user seeking to create an account. The user must have a wallet, and their wallet
             * will be linked as an owner on their Rain smart contract.
             */
            fun ofUsingApi(usingApi: UsingApi) = Body(usingApi = usingApi)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUsingSumsubShareToken(usingSumsubShareToken: UsingSumsubShareToken): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * The user seeking to create an account. The user must have a wallet, and their wallet
             * will be linked as an owner on their Rain smart contract.
             */
            fun visitUsingApi(usingApi: UsingApi): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws RainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw RainInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UsingSumsubShareToken>())?.let {
                                Body(usingSumsubShareToken = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Body(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UsingApi>())?.let {
                                Body(usingApi = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.usingSumsubShareToken != null ->
                        generator.writeObject(value.usingSumsubShareToken)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value.usingApi != null -> generator.writeObject(value.usingApi)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class UsingSumsubShareToken
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountPurpose: JsonField<String>,
            private val annualSalary: JsonField<String>,
            private val expectedMonthlyVolume: JsonField<String>,
            private val ipAddress: JsonField<String>,
            private val isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>,
            private val occupation: JsonField<String>,
            private val sumsubShareToken: JsonField<String>,
            private val chainId: JsonField<String>,
            private val contractAddress: JsonField<String>,
            private val hasExistingDocuments: JsonField<Boolean>,
            private val solanaAddress: JsonField<String>,
            private val sourceKey: JsonField<String>,
            private val walletAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountPurpose")
                @ExcludeMissing
                accountPurpose: JsonField<String> = JsonMissing.of(),
                @JsonProperty("annualSalary")
                @ExcludeMissing
                annualSalary: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expectedMonthlyVolume")
                @ExcludeMissing
                expectedMonthlyVolume: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ipAddress")
                @ExcludeMissing
                ipAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("isTermsOfServiceAccepted")
                @ExcludeMissing
                isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted> = JsonMissing.of(),
                @JsonProperty("occupation")
                @ExcludeMissing
                occupation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sumsubShareToken")
                @ExcludeMissing
                sumsubShareToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("chainId")
                @ExcludeMissing
                chainId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contractAddress")
                @ExcludeMissing
                contractAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hasExistingDocuments")
                @ExcludeMissing
                hasExistingDocuments: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("solanaAddress")
                @ExcludeMissing
                solanaAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sourceKey")
                @ExcludeMissing
                sourceKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("walletAddress")
                @ExcludeMissing
                walletAddress: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountPurpose,
                annualSalary,
                expectedMonthlyVolume,
                ipAddress,
                isTermsOfServiceAccepted,
                occupation,
                sumsubShareToken,
                chainId,
                contractAddress,
                hasExistingDocuments,
                solanaAddress,
                sourceKey,
                walletAddress,
                mutableMapOf(),
            )

            /**
             * The purpose of the user's account
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountPurpose(): String = accountPurpose.getRequired("accountPurpose")

            /**
             * The user's annual salary
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun annualSalary(): String = annualSalary.getRequired("annualSalary")

            /**
             * The estimated monthly spending amount for the user
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun expectedMonthlyVolume(): String =
                expectedMonthlyVolume.getRequired("expectedMonthlyVolume")

            /**
             * This user's IP address
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ipAddress(): String = ipAddress.getRequired("ipAddress")

            /**
             * Indicates whether the user has accepted the terms of service
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isTermsOfServiceAccepted(): IsTermsOfServiceAccepted =
                isTermsOfServiceAccepted.getRequired("isTermsOfServiceAccepted")

            /**
             * The user's occupation
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun occupation(): String = occupation.getRequired("occupation")

            /**
             * The Sumsub share token used for user verification
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sumsubShareToken(): String = sumsubShareToken.getRequired("sumsubShareToken")

            /**
             * The chain ID of the user's external collateral contract, if applicable. Not required
             * when using Rain's collateral contracts.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun chainId(): String? = chainId.getNullable("chainId")

            /**
             * The address of the user's external collateral contract, if applicable. Not required
             * when using Rain's collateral contracts.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun contractAddress(): String? = contractAddress.getNullable("contractAddress")

            /**
             * Indicates whether the user will use existing documents for additional verification
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasExistingDocuments(): Boolean? =
                hasExistingDocuments.getNullable("hasExistingDocuments")

            /**
             * The user's Solana address. Either walletAddress or solanaAddress is required if using
             * a Rain-managed solution, but optional otherwise.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun solanaAddress(): String? = solanaAddress.getNullable("solanaAddress")

            /**
             * A unique identifier for the source of this user.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sourceKey(): String? = sourceKey.getNullable("sourceKey")

            /**
             * The user's Ethereum Virtual Machine (EVM) address. Either walletAddress or
             * solanaAddress is required if using a Rain-managed solution, but optional otherwise.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun walletAddress(): String? = walletAddress.getNullable("walletAddress")

            /**
             * Returns the raw JSON value of [accountPurpose].
             *
             * Unlike [accountPurpose], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("accountPurpose")
            @ExcludeMissing
            fun _accountPurpose(): JsonField<String> = accountPurpose

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
             * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ipAddress")
            @ExcludeMissing
            fun _ipAddress(): JsonField<String> = ipAddress

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
             * Returns the raw JSON value of [occupation].
             *
             * Unlike [occupation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("occupation")
            @ExcludeMissing
            fun _occupation(): JsonField<String> = occupation

            /**
             * Returns the raw JSON value of [sumsubShareToken].
             *
             * Unlike [sumsubShareToken], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("sumsubShareToken")
            @ExcludeMissing
            fun _sumsubShareToken(): JsonField<String> = sumsubShareToken

            /**
             * Returns the raw JSON value of [chainId].
             *
             * Unlike [chainId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chainId") @ExcludeMissing fun _chainId(): JsonField<String> = chainId

            /**
             * Returns the raw JSON value of [contractAddress].
             *
             * Unlike [contractAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("contractAddress")
            @ExcludeMissing
            fun _contractAddress(): JsonField<String> = contractAddress

            /**
             * Returns the raw JSON value of [hasExistingDocuments].
             *
             * Unlike [hasExistingDocuments], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hasExistingDocuments")
            @ExcludeMissing
            fun _hasExistingDocuments(): JsonField<Boolean> = hasExistingDocuments

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
             * Returns the raw JSON value of [sourceKey].
             *
             * Unlike [sourceKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sourceKey")
            @ExcludeMissing
            fun _sourceKey(): JsonField<String> = sourceKey

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
                 * Returns a mutable builder for constructing an instance of
                 * [UsingSumsubShareToken].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountPurpose()
                 * .annualSalary()
                 * .expectedMonthlyVolume()
                 * .ipAddress()
                 * .isTermsOfServiceAccepted()
                 * .occupation()
                 * .sumsubShareToken()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UsingSumsubShareToken]. */
            class Builder internal constructor() {

                private var accountPurpose: JsonField<String>? = null
                private var annualSalary: JsonField<String>? = null
                private var expectedMonthlyVolume: JsonField<String>? = null
                private var ipAddress: JsonField<String>? = null
                private var isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>? = null
                private var occupation: JsonField<String>? = null
                private var sumsubShareToken: JsonField<String>? = null
                private var chainId: JsonField<String> = JsonMissing.of()
                private var contractAddress: JsonField<String> = JsonMissing.of()
                private var hasExistingDocuments: JsonField<Boolean> = JsonMissing.of()
                private var solanaAddress: JsonField<String> = JsonMissing.of()
                private var sourceKey: JsonField<String> = JsonMissing.of()
                private var walletAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usingSumsubShareToken: UsingSumsubShareToken) = apply {
                    accountPurpose = usingSumsubShareToken.accountPurpose
                    annualSalary = usingSumsubShareToken.annualSalary
                    expectedMonthlyVolume = usingSumsubShareToken.expectedMonthlyVolume
                    ipAddress = usingSumsubShareToken.ipAddress
                    isTermsOfServiceAccepted = usingSumsubShareToken.isTermsOfServiceAccepted
                    occupation = usingSumsubShareToken.occupation
                    sumsubShareToken = usingSumsubShareToken.sumsubShareToken
                    chainId = usingSumsubShareToken.chainId
                    contractAddress = usingSumsubShareToken.contractAddress
                    hasExistingDocuments = usingSumsubShareToken.hasExistingDocuments
                    solanaAddress = usingSumsubShareToken.solanaAddress
                    sourceKey = usingSumsubShareToken.sourceKey
                    walletAddress = usingSumsubShareToken.walletAddress
                    additionalProperties = usingSumsubShareToken.additionalProperties.toMutableMap()
                }

                /** The purpose of the user's account */
                fun accountPurpose(accountPurpose: String) =
                    accountPurpose(JsonField.of(accountPurpose))

                /**
                 * Sets [Builder.accountPurpose] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountPurpose] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountPurpose(accountPurpose: JsonField<String>) = apply {
                    this.accountPurpose = accountPurpose
                }

                /** The user's annual salary */
                fun annualSalary(annualSalary: String) = annualSalary(JsonField.of(annualSalary))

                /**
                 * Sets [Builder.annualSalary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annualSalary] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun annualSalary(annualSalary: JsonField<String>) = apply {
                    this.annualSalary = annualSalary
                }

                /** The estimated monthly spending amount for the user */
                fun expectedMonthlyVolume(expectedMonthlyVolume: String) =
                    expectedMonthlyVolume(JsonField.of(expectedMonthlyVolume))

                /**
                 * Sets [Builder.expectedMonthlyVolume] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expectedMonthlyVolume] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun expectedMonthlyVolume(expectedMonthlyVolume: JsonField<String>) = apply {
                    this.expectedMonthlyVolume = expectedMonthlyVolume
                }

                /** This user's IP address */
                fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

                /**
                 * Sets [Builder.ipAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ipAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

                /** Indicates whether the user has accepted the terms of service */
                fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: IsTermsOfServiceAccepted) =
                    isTermsOfServiceAccepted(JsonField.of(isTermsOfServiceAccepted))

                /**
                 * Sets [Builder.isTermsOfServiceAccepted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isTermsOfServiceAccepted] with a well-typed
                 * [IsTermsOfServiceAccepted] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun isTermsOfServiceAccepted(
                    isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>
                ) = apply { this.isTermsOfServiceAccepted = isTermsOfServiceAccepted }

                /** The user's occupation */
                fun occupation(occupation: String) = occupation(JsonField.of(occupation))

                /**
                 * Sets [Builder.occupation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occupation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun occupation(occupation: JsonField<String>) = apply {
                    this.occupation = occupation
                }

                /** The Sumsub share token used for user verification */
                fun sumsubShareToken(sumsubShareToken: String) =
                    sumsubShareToken(JsonField.of(sumsubShareToken))

                /**
                 * Sets [Builder.sumsubShareToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sumsubShareToken] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sumsubShareToken(sumsubShareToken: JsonField<String>) = apply {
                    this.sumsubShareToken = sumsubShareToken
                }

                /**
                 * The chain ID of the user's external collateral contract, if applicable. Not
                 * required when using Rain's collateral contracts.
                 */
                fun chainId(chainId: String) = chainId(JsonField.of(chainId))

                /**
                 * Sets [Builder.chainId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chainId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chainId(chainId: JsonField<String>) = apply { this.chainId = chainId }

                /**
                 * The address of the user's external collateral contract, if applicable. Not
                 * required when using Rain's collateral contracts.
                 */
                fun contractAddress(contractAddress: String) =
                    contractAddress(JsonField.of(contractAddress))

                /**
                 * Sets [Builder.contractAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractAddress] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun contractAddress(contractAddress: JsonField<String>) = apply {
                    this.contractAddress = contractAddress
                }

                /**
                 * Indicates whether the user will use existing documents for additional
                 * verification
                 */
                fun hasExistingDocuments(hasExistingDocuments: Boolean) =
                    hasExistingDocuments(JsonField.of(hasExistingDocuments))

                /**
                 * Sets [Builder.hasExistingDocuments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasExistingDocuments] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun hasExistingDocuments(hasExistingDocuments: JsonField<Boolean>) = apply {
                    this.hasExistingDocuments = hasExistingDocuments
                }

                /**
                 * The user's Solana address. Either walletAddress or solanaAddress is required if
                 * using a Rain-managed solution, but optional otherwise.
                 */
                fun solanaAddress(solanaAddress: String) =
                    solanaAddress(JsonField.of(solanaAddress))

                /**
                 * Sets [Builder.solanaAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solanaAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun solanaAddress(solanaAddress: JsonField<String>) = apply {
                    this.solanaAddress = solanaAddress
                }

                /** A unique identifier for the source of this user. */
                fun sourceKey(sourceKey: String) = sourceKey(JsonField.of(sourceKey))

                /**
                 * Sets [Builder.sourceKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceKey(sourceKey: JsonField<String>) = apply { this.sourceKey = sourceKey }

                /**
                 * The user's Ethereum Virtual Machine (EVM) address. Either walletAddress or
                 * solanaAddress is required if using a Rain-managed solution, but optional
                 * otherwise.
                 */
                fun walletAddress(walletAddress: String) =
                    walletAddress(JsonField.of(walletAddress))

                /**
                 * Sets [Builder.walletAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.walletAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [UsingSumsubShareToken].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountPurpose()
                 * .annualSalary()
                 * .expectedMonthlyVolume()
                 * .ipAddress()
                 * .isTermsOfServiceAccepted()
                 * .occupation()
                 * .sumsubShareToken()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsingSumsubShareToken =
                    UsingSumsubShareToken(
                        checkRequired("accountPurpose", accountPurpose),
                        checkRequired("annualSalary", annualSalary),
                        checkRequired("expectedMonthlyVolume", expectedMonthlyVolume),
                        checkRequired("ipAddress", ipAddress),
                        checkRequired("isTermsOfServiceAccepted", isTermsOfServiceAccepted),
                        checkRequired("occupation", occupation),
                        checkRequired("sumsubShareToken", sumsubShareToken),
                        chainId,
                        contractAddress,
                        hasExistingDocuments,
                        solanaAddress,
                        sourceKey,
                        walletAddress,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsingSumsubShareToken = apply {
                if (validated) {
                    return@apply
                }

                accountPurpose()
                annualSalary()
                expectedMonthlyVolume()
                ipAddress()
                isTermsOfServiceAccepted().validate()
                occupation()
                sumsubShareToken()
                chainId()
                contractAddress()
                hasExistingDocuments()
                solanaAddress()
                sourceKey()
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
                (if (accountPurpose.asKnown() == null) 0 else 1) +
                    (if (annualSalary.asKnown() == null) 0 else 1) +
                    (if (expectedMonthlyVolume.asKnown() == null) 0 else 1) +
                    (if (ipAddress.asKnown() == null) 0 else 1) +
                    (isTermsOfServiceAccepted.asKnown()?.validity() ?: 0) +
                    (if (occupation.asKnown() == null) 0 else 1) +
                    (if (sumsubShareToken.asKnown() == null) 0 else 1) +
                    (if (chainId.asKnown() == null) 0 else 1) +
                    (if (contractAddress.asKnown() == null) 0 else 1) +
                    (if (hasExistingDocuments.asKnown() == null) 0 else 1) +
                    (if (solanaAddress.asKnown() == null) 0 else 1) +
                    (if (sourceKey.asKnown() == null) 0 else 1) +
                    (if (walletAddress.asKnown() == null) 0 else 1)

            /** Indicates whether the user has accepted the terms of service */
            class IsTermsOfServiceAccepted
            @JsonCreator
            private constructor(private val value: JsonField<Boolean>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An instance of [IsTermsOfServiceAccepted] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TRUE,
                    /**
                     * An enum member indicating that [IsTermsOfServiceAccepted] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                            throw RainInvalidDataException(
                                "Unknown IsTermsOfServiceAccepted: $value"
                            )
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

                return other is UsingSumsubShareToken &&
                    accountPurpose == other.accountPurpose &&
                    annualSalary == other.annualSalary &&
                    expectedMonthlyVolume == other.expectedMonthlyVolume &&
                    ipAddress == other.ipAddress &&
                    isTermsOfServiceAccepted == other.isTermsOfServiceAccepted &&
                    occupation == other.occupation &&
                    sumsubShareToken == other.sumsubShareToken &&
                    chainId == other.chainId &&
                    contractAddress == other.contractAddress &&
                    hasExistingDocuments == other.hasExistingDocuments &&
                    solanaAddress == other.solanaAddress &&
                    sourceKey == other.sourceKey &&
                    walletAddress == other.walletAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountPurpose,
                    annualSalary,
                    expectedMonthlyVolume,
                    ipAddress,
                    isTermsOfServiceAccepted,
                    occupation,
                    sumsubShareToken,
                    chainId,
                    contractAddress,
                    hasExistingDocuments,
                    solanaAddress,
                    sourceKey,
                    walletAddress,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsingSumsubShareToken{accountPurpose=$accountPurpose, annualSalary=$annualSalary, expectedMonthlyVolume=$expectedMonthlyVolume, ipAddress=$ipAddress, isTermsOfServiceAccepted=$isTermsOfServiceAccepted, occupation=$occupation, sumsubShareToken=$sumsubShareToken, chainId=$chainId, contractAddress=$contractAddress, hasExistingDocuments=$hasExistingDocuments, solanaAddress=$solanaAddress, sourceKey=$sourceKey, walletAddress=$walletAddress, additionalProperties=$additionalProperties}"
        }

        class UnionMember1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountPurpose: JsonField<String>,
            private val annualSalary: JsonField<String>,
            private val expectedMonthlyVolume: JsonField<String>,
            private val ipAddress: JsonField<String>,
            private val isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>,
            private val occupation: JsonField<String>,
            private val personaShareToken: JsonField<String>,
            private val chainId: JsonField<String>,
            private val contractAddress: JsonField<String>,
            private val hasExistingDocuments: JsonField<Boolean>,
            private val solanaAddress: JsonField<String>,
            private val sourceKey: JsonField<String>,
            private val walletAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountPurpose")
                @ExcludeMissing
                accountPurpose: JsonField<String> = JsonMissing.of(),
                @JsonProperty("annualSalary")
                @ExcludeMissing
                annualSalary: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expectedMonthlyVolume")
                @ExcludeMissing
                expectedMonthlyVolume: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ipAddress")
                @ExcludeMissing
                ipAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("isTermsOfServiceAccepted")
                @ExcludeMissing
                isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted> = JsonMissing.of(),
                @JsonProperty("occupation")
                @ExcludeMissing
                occupation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("personaShareToken")
                @ExcludeMissing
                personaShareToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("chainId")
                @ExcludeMissing
                chainId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contractAddress")
                @ExcludeMissing
                contractAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hasExistingDocuments")
                @ExcludeMissing
                hasExistingDocuments: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("solanaAddress")
                @ExcludeMissing
                solanaAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sourceKey")
                @ExcludeMissing
                sourceKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("walletAddress")
                @ExcludeMissing
                walletAddress: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountPurpose,
                annualSalary,
                expectedMonthlyVolume,
                ipAddress,
                isTermsOfServiceAccepted,
                occupation,
                personaShareToken,
                chainId,
                contractAddress,
                hasExistingDocuments,
                solanaAddress,
                sourceKey,
                walletAddress,
                mutableMapOf(),
            )

            /**
             * The purpose of the user's account
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountPurpose(): String = accountPurpose.getRequired("accountPurpose")

            /**
             * The user's annual salary
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun annualSalary(): String = annualSalary.getRequired("annualSalary")

            /**
             * The estimated monthly spending amount for the user
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun expectedMonthlyVolume(): String =
                expectedMonthlyVolume.getRequired("expectedMonthlyVolume")

            /**
             * This user's IP address
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ipAddress(): String = ipAddress.getRequired("ipAddress")

            /**
             * Indicates whether the user has accepted the terms of service
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isTermsOfServiceAccepted(): IsTermsOfServiceAccepted =
                isTermsOfServiceAccepted.getRequired("isTermsOfServiceAccepted")

            /**
             * The user's occupation
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun occupation(): String = occupation.getRequired("occupation")

            /**
             * The Persona inquiry ID
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun personaShareToken(): String = personaShareToken.getRequired("personaShareToken")

            /**
             * The chain ID of the user's external collateral contract, if applicable. Not required
             * when using Rain's collateral contracts.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun chainId(): String? = chainId.getNullable("chainId")

            /**
             * The address of the user's external collateral contract, if applicable. Not required
             * when using Rain's collateral contracts.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun contractAddress(): String? = contractAddress.getNullable("contractAddress")

            /**
             * Indicates whether the user will use existing documents for additional verification
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasExistingDocuments(): Boolean? =
                hasExistingDocuments.getNullable("hasExistingDocuments")

            /**
             * The user's Solana address. Either walletAddress or solanaAddress is required if using
             * a Rain-managed solution, but optional otherwise.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun solanaAddress(): String? = solanaAddress.getNullable("solanaAddress")

            /**
             * A unique identifier for the source of this user.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sourceKey(): String? = sourceKey.getNullable("sourceKey")

            /**
             * The user's Ethereum Virtual Machine (EVM) address. Either walletAddress or
             * solanaAddress is required if using a Rain-managed solution, but optional otherwise.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun walletAddress(): String? = walletAddress.getNullable("walletAddress")

            /**
             * Returns the raw JSON value of [accountPurpose].
             *
             * Unlike [accountPurpose], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("accountPurpose")
            @ExcludeMissing
            fun _accountPurpose(): JsonField<String> = accountPurpose

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
             * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ipAddress")
            @ExcludeMissing
            fun _ipAddress(): JsonField<String> = ipAddress

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
             * Returns the raw JSON value of [occupation].
             *
             * Unlike [occupation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("occupation")
            @ExcludeMissing
            fun _occupation(): JsonField<String> = occupation

            /**
             * Returns the raw JSON value of [personaShareToken].
             *
             * Unlike [personaShareToken], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("personaShareToken")
            @ExcludeMissing
            fun _personaShareToken(): JsonField<String> = personaShareToken

            /**
             * Returns the raw JSON value of [chainId].
             *
             * Unlike [chainId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chainId") @ExcludeMissing fun _chainId(): JsonField<String> = chainId

            /**
             * Returns the raw JSON value of [contractAddress].
             *
             * Unlike [contractAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("contractAddress")
            @ExcludeMissing
            fun _contractAddress(): JsonField<String> = contractAddress

            /**
             * Returns the raw JSON value of [hasExistingDocuments].
             *
             * Unlike [hasExistingDocuments], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hasExistingDocuments")
            @ExcludeMissing
            fun _hasExistingDocuments(): JsonField<Boolean> = hasExistingDocuments

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
             * Returns the raw JSON value of [sourceKey].
             *
             * Unlike [sourceKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sourceKey")
            @ExcludeMissing
            fun _sourceKey(): JsonField<String> = sourceKey

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
                 * Returns a mutable builder for constructing an instance of [UnionMember1].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountPurpose()
                 * .annualSalary()
                 * .expectedMonthlyVolume()
                 * .ipAddress()
                 * .isTermsOfServiceAccepted()
                 * .occupation()
                 * .personaShareToken()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var accountPurpose: JsonField<String>? = null
                private var annualSalary: JsonField<String>? = null
                private var expectedMonthlyVolume: JsonField<String>? = null
                private var ipAddress: JsonField<String>? = null
                private var isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>? = null
                private var occupation: JsonField<String>? = null
                private var personaShareToken: JsonField<String>? = null
                private var chainId: JsonField<String> = JsonMissing.of()
                private var contractAddress: JsonField<String> = JsonMissing.of()
                private var hasExistingDocuments: JsonField<Boolean> = JsonMissing.of()
                private var solanaAddress: JsonField<String> = JsonMissing.of()
                private var sourceKey: JsonField<String> = JsonMissing.of()
                private var walletAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    accountPurpose = unionMember1.accountPurpose
                    annualSalary = unionMember1.annualSalary
                    expectedMonthlyVolume = unionMember1.expectedMonthlyVolume
                    ipAddress = unionMember1.ipAddress
                    isTermsOfServiceAccepted = unionMember1.isTermsOfServiceAccepted
                    occupation = unionMember1.occupation
                    personaShareToken = unionMember1.personaShareToken
                    chainId = unionMember1.chainId
                    contractAddress = unionMember1.contractAddress
                    hasExistingDocuments = unionMember1.hasExistingDocuments
                    solanaAddress = unionMember1.solanaAddress
                    sourceKey = unionMember1.sourceKey
                    walletAddress = unionMember1.walletAddress
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                /** The purpose of the user's account */
                fun accountPurpose(accountPurpose: String) =
                    accountPurpose(JsonField.of(accountPurpose))

                /**
                 * Sets [Builder.accountPurpose] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountPurpose] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountPurpose(accountPurpose: JsonField<String>) = apply {
                    this.accountPurpose = accountPurpose
                }

                /** The user's annual salary */
                fun annualSalary(annualSalary: String) = annualSalary(JsonField.of(annualSalary))

                /**
                 * Sets [Builder.annualSalary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annualSalary] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun annualSalary(annualSalary: JsonField<String>) = apply {
                    this.annualSalary = annualSalary
                }

                /** The estimated monthly spending amount for the user */
                fun expectedMonthlyVolume(expectedMonthlyVolume: String) =
                    expectedMonthlyVolume(JsonField.of(expectedMonthlyVolume))

                /**
                 * Sets [Builder.expectedMonthlyVolume] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expectedMonthlyVolume] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun expectedMonthlyVolume(expectedMonthlyVolume: JsonField<String>) = apply {
                    this.expectedMonthlyVolume = expectedMonthlyVolume
                }

                /** This user's IP address */
                fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

                /**
                 * Sets [Builder.ipAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ipAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

                /** Indicates whether the user has accepted the terms of service */
                fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: IsTermsOfServiceAccepted) =
                    isTermsOfServiceAccepted(JsonField.of(isTermsOfServiceAccepted))

                /**
                 * Sets [Builder.isTermsOfServiceAccepted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isTermsOfServiceAccepted] with a well-typed
                 * [IsTermsOfServiceAccepted] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun isTermsOfServiceAccepted(
                    isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>
                ) = apply { this.isTermsOfServiceAccepted = isTermsOfServiceAccepted }

                /** The user's occupation */
                fun occupation(occupation: String) = occupation(JsonField.of(occupation))

                /**
                 * Sets [Builder.occupation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occupation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun occupation(occupation: JsonField<String>) = apply {
                    this.occupation = occupation
                }

                /** The Persona inquiry ID */
                fun personaShareToken(personaShareToken: String) =
                    personaShareToken(JsonField.of(personaShareToken))

                /**
                 * Sets [Builder.personaShareToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.personaShareToken] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun personaShareToken(personaShareToken: JsonField<String>) = apply {
                    this.personaShareToken = personaShareToken
                }

                /**
                 * The chain ID of the user's external collateral contract, if applicable. Not
                 * required when using Rain's collateral contracts.
                 */
                fun chainId(chainId: String) = chainId(JsonField.of(chainId))

                /**
                 * Sets [Builder.chainId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chainId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chainId(chainId: JsonField<String>) = apply { this.chainId = chainId }

                /**
                 * The address of the user's external collateral contract, if applicable. Not
                 * required when using Rain's collateral contracts.
                 */
                fun contractAddress(contractAddress: String) =
                    contractAddress(JsonField.of(contractAddress))

                /**
                 * Sets [Builder.contractAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractAddress] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun contractAddress(contractAddress: JsonField<String>) = apply {
                    this.contractAddress = contractAddress
                }

                /**
                 * Indicates whether the user will use existing documents for additional
                 * verification
                 */
                fun hasExistingDocuments(hasExistingDocuments: Boolean) =
                    hasExistingDocuments(JsonField.of(hasExistingDocuments))

                /**
                 * Sets [Builder.hasExistingDocuments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasExistingDocuments] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun hasExistingDocuments(hasExistingDocuments: JsonField<Boolean>) = apply {
                    this.hasExistingDocuments = hasExistingDocuments
                }

                /**
                 * The user's Solana address. Either walletAddress or solanaAddress is required if
                 * using a Rain-managed solution, but optional otherwise.
                 */
                fun solanaAddress(solanaAddress: String) =
                    solanaAddress(JsonField.of(solanaAddress))

                /**
                 * Sets [Builder.solanaAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solanaAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun solanaAddress(solanaAddress: JsonField<String>) = apply {
                    this.solanaAddress = solanaAddress
                }

                /** A unique identifier for the source of this user. */
                fun sourceKey(sourceKey: String) = sourceKey(JsonField.of(sourceKey))

                /**
                 * Sets [Builder.sourceKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceKey(sourceKey: JsonField<String>) = apply { this.sourceKey = sourceKey }

                /**
                 * The user's Ethereum Virtual Machine (EVM) address. Either walletAddress or
                 * solanaAddress is required if using a Rain-managed solution, but optional
                 * otherwise.
                 */
                fun walletAddress(walletAddress: String) =
                    walletAddress(JsonField.of(walletAddress))

                /**
                 * Sets [Builder.walletAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.walletAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountPurpose()
                 * .annualSalary()
                 * .expectedMonthlyVolume()
                 * .ipAddress()
                 * .isTermsOfServiceAccepted()
                 * .occupation()
                 * .personaShareToken()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember1 =
                    UnionMember1(
                        checkRequired("accountPurpose", accountPurpose),
                        checkRequired("annualSalary", annualSalary),
                        checkRequired("expectedMonthlyVolume", expectedMonthlyVolume),
                        checkRequired("ipAddress", ipAddress),
                        checkRequired("isTermsOfServiceAccepted", isTermsOfServiceAccepted),
                        checkRequired("occupation", occupation),
                        checkRequired("personaShareToken", personaShareToken),
                        chainId,
                        contractAddress,
                        hasExistingDocuments,
                        solanaAddress,
                        sourceKey,
                        walletAddress,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                accountPurpose()
                annualSalary()
                expectedMonthlyVolume()
                ipAddress()
                isTermsOfServiceAccepted().validate()
                occupation()
                personaShareToken()
                chainId()
                contractAddress()
                hasExistingDocuments()
                solanaAddress()
                sourceKey()
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
                (if (accountPurpose.asKnown() == null) 0 else 1) +
                    (if (annualSalary.asKnown() == null) 0 else 1) +
                    (if (expectedMonthlyVolume.asKnown() == null) 0 else 1) +
                    (if (ipAddress.asKnown() == null) 0 else 1) +
                    (isTermsOfServiceAccepted.asKnown()?.validity() ?: 0) +
                    (if (occupation.asKnown() == null) 0 else 1) +
                    (if (personaShareToken.asKnown() == null) 0 else 1) +
                    (if (chainId.asKnown() == null) 0 else 1) +
                    (if (contractAddress.asKnown() == null) 0 else 1) +
                    (if (hasExistingDocuments.asKnown() == null) 0 else 1) +
                    (if (solanaAddress.asKnown() == null) 0 else 1) +
                    (if (sourceKey.asKnown() == null) 0 else 1) +
                    (if (walletAddress.asKnown() == null) 0 else 1)

            /** Indicates whether the user has accepted the terms of service */
            class IsTermsOfServiceAccepted
            @JsonCreator
            private constructor(private val value: JsonField<Boolean>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An instance of [IsTermsOfServiceAccepted] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TRUE,
                    /**
                     * An enum member indicating that [IsTermsOfServiceAccepted] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                            throw RainInvalidDataException(
                                "Unknown IsTermsOfServiceAccepted: $value"
                            )
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

                return other is UnionMember1 &&
                    accountPurpose == other.accountPurpose &&
                    annualSalary == other.annualSalary &&
                    expectedMonthlyVolume == other.expectedMonthlyVolume &&
                    ipAddress == other.ipAddress &&
                    isTermsOfServiceAccepted == other.isTermsOfServiceAccepted &&
                    occupation == other.occupation &&
                    personaShareToken == other.personaShareToken &&
                    chainId == other.chainId &&
                    contractAddress == other.contractAddress &&
                    hasExistingDocuments == other.hasExistingDocuments &&
                    solanaAddress == other.solanaAddress &&
                    sourceKey == other.sourceKey &&
                    walletAddress == other.walletAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountPurpose,
                    annualSalary,
                    expectedMonthlyVolume,
                    ipAddress,
                    isTermsOfServiceAccepted,
                    occupation,
                    personaShareToken,
                    chainId,
                    contractAddress,
                    hasExistingDocuments,
                    solanaAddress,
                    sourceKey,
                    walletAddress,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{accountPurpose=$accountPurpose, annualSalary=$annualSalary, expectedMonthlyVolume=$expectedMonthlyVolume, ipAddress=$ipAddress, isTermsOfServiceAccepted=$isTermsOfServiceAccepted, occupation=$occupation, personaShareToken=$personaShareToken, chainId=$chainId, contractAddress=$contractAddress, hasExistingDocuments=$hasExistingDocuments, solanaAddress=$solanaAddress, sourceKey=$sourceKey, walletAddress=$walletAddress, additionalProperties=$additionalProperties}"
        }

        /**
         * The user seeking to create an account. The user must have a wallet, and their wallet will
         * be linked as an owner on their Rain smart contract.
         */
        class UsingApi
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
            private val accountPurpose: JsonField<String>,
            private val annualSalary: JsonField<String>,
            private val expectedMonthlyVolume: JsonField<String>,
            private val ipAddress: JsonField<String>,
            private val isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>,
            private val occupation: JsonField<String>,
            private val chainId: JsonField<String>,
            private val contractAddress: JsonField<String>,
            private val hasExistingDocuments: JsonField<Boolean>,
            private val solanaAddress: JsonField<String>,
            private val sourceKey: JsonField<String>,
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
                @JsonProperty("accountPurpose")
                @ExcludeMissing
                accountPurpose: JsonField<String> = JsonMissing.of(),
                @JsonProperty("annualSalary")
                @ExcludeMissing
                annualSalary: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expectedMonthlyVolume")
                @ExcludeMissing
                expectedMonthlyVolume: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ipAddress")
                @ExcludeMissing
                ipAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("isTermsOfServiceAccepted")
                @ExcludeMissing
                isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted> = JsonMissing.of(),
                @JsonProperty("occupation")
                @ExcludeMissing
                occupation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("chainId")
                @ExcludeMissing
                chainId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contractAddress")
                @ExcludeMissing
                contractAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hasExistingDocuments")
                @ExcludeMissing
                hasExistingDocuments: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("solanaAddress")
                @ExcludeMissing
                solanaAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sourceKey")
                @ExcludeMissing
                sourceKey: JsonField<String> = JsonMissing.of(),
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
                accountPurpose,
                annualSalary,
                expectedMonthlyVolume,
                ipAddress,
                isTermsOfServiceAccepted,
                occupation,
                chainId,
                contractAddress,
                hasExistingDocuments,
                solanaAddress,
                sourceKey,
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): PhysicalAddress = address.getRequired("address")

            /**
             * The person's birth date
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

            /**
             * The 2-digit country code of the person's national ID issuer
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun countryOfIssue(): String = countryOfIssue.getRequired("countryOfIssue")

            /**
             * The user's email address
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * The person's first name
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun firstName(): String = firstName.getRequired("firstName")

            /**
             * The person's last name
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lastName(): String = lastName.getRequired("lastName")

            /**
             * The person's national ID number. For the US, this is a 9-digit SSN
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun nationalId(): String = nationalId.getRequired("nationalId")

            /**
             * The person's unique identifier
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * The country code for the phone number
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneCountryCode(): String? = phoneCountryCode.getNullable("phoneCountryCode")

            /**
             * The phone number of the person
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

            /**
             * The purpose of the user's account
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountPurpose(): String = accountPurpose.getRequired("accountPurpose")

            /**
             * The user's annual salary
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun annualSalary(): String = annualSalary.getRequired("annualSalary")

            /**
             * The estimated monthly spending amount for the user
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun expectedMonthlyVolume(): String =
                expectedMonthlyVolume.getRequired("expectedMonthlyVolume")

            /**
             * This user's IP address
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ipAddress(): String = ipAddress.getRequired("ipAddress")

            /**
             * Indicates whether the user has accepted the terms of service
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isTermsOfServiceAccepted(): IsTermsOfServiceAccepted =
                isTermsOfServiceAccepted.getRequired("isTermsOfServiceAccepted")

            /**
             * The user's occupation
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun occupation(): String = occupation.getRequired("occupation")

            /**
             * The chain ID of the user's external collateral contract, if applicable. Not required
             * when using Rain's collateral contracts.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun chainId(): String? = chainId.getNullable("chainId")

            /**
             * The address of the user's external collateral contract, if applicable. Not required
             * when using Rain's collateral contracts.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun contractAddress(): String? = contractAddress.getNullable("contractAddress")

            /**
             * Indicates whether the user will use existing documents for additional verification
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasExistingDocuments(): Boolean? =
                hasExistingDocuments.getNullable("hasExistingDocuments")

            /**
             * The user's Solana address. Either walletAddress or solanaAddress is required if using
             * a Rain-managed solution, but optional otherwise.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun solanaAddress(): String? = solanaAddress.getNullable("solanaAddress")

            /**
             * A unique identifier for the source of this user.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sourceKey(): String? = sourceKey.getNullable("sourceKey")

            /**
             * The user's Ethereum Virtual Machine (EVM) address. Either walletAddress or
             * solanaAddress is required if using a Rain-managed solution, but optional otherwise.
             *
             * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("birthDate")
            @ExcludeMissing
            fun _birthDate(): JsonField<LocalDate> = birthDate

            /**
             * Returns the raw JSON value of [countryOfIssue].
             *
             * Unlike [countryOfIssue], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("firstName")
            @ExcludeMissing
            fun _firstName(): JsonField<String> = firstName

            /**
             * Returns the raw JSON value of [lastName].
             *
             * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

            /**
             * Returns the raw JSON value of [nationalId].
             *
             * Unlike [nationalId], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [phoneCountryCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("phoneCountryCode")
            @ExcludeMissing
            fun _phoneCountryCode(): JsonField<String> = phoneCountryCode

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [accountPurpose].
             *
             * Unlike [accountPurpose], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("accountPurpose")
            @ExcludeMissing
            fun _accountPurpose(): JsonField<String> = accountPurpose

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
             * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ipAddress")
            @ExcludeMissing
            fun _ipAddress(): JsonField<String> = ipAddress

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
             * Returns the raw JSON value of [occupation].
             *
             * Unlike [occupation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("occupation")
            @ExcludeMissing
            fun _occupation(): JsonField<String> = occupation

            /**
             * Returns the raw JSON value of [chainId].
             *
             * Unlike [chainId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chainId") @ExcludeMissing fun _chainId(): JsonField<String> = chainId

            /**
             * Returns the raw JSON value of [contractAddress].
             *
             * Unlike [contractAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("contractAddress")
            @ExcludeMissing
            fun _contractAddress(): JsonField<String> = contractAddress

            /**
             * Returns the raw JSON value of [hasExistingDocuments].
             *
             * Unlike [hasExistingDocuments], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hasExistingDocuments")
            @ExcludeMissing
            fun _hasExistingDocuments(): JsonField<Boolean> = hasExistingDocuments

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
             * Returns the raw JSON value of [sourceKey].
             *
             * Unlike [sourceKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sourceKey")
            @ExcludeMissing
            fun _sourceKey(): JsonField<String> = sourceKey

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
                 * Returns a mutable builder for constructing an instance of [UsingApi].
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
                 * .accountPurpose()
                 * .annualSalary()
                 * .expectedMonthlyVolume()
                 * .ipAddress()
                 * .isTermsOfServiceAccepted()
                 * .occupation()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UsingApi]. */
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
                private var accountPurpose: JsonField<String>? = null
                private var annualSalary: JsonField<String>? = null
                private var expectedMonthlyVolume: JsonField<String>? = null
                private var ipAddress: JsonField<String>? = null
                private var isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>? = null
                private var occupation: JsonField<String>? = null
                private var chainId: JsonField<String> = JsonMissing.of()
                private var contractAddress: JsonField<String> = JsonMissing.of()
                private var hasExistingDocuments: JsonField<Boolean> = JsonMissing.of()
                private var solanaAddress: JsonField<String> = JsonMissing.of()
                private var sourceKey: JsonField<String> = JsonMissing.of()
                private var walletAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usingApi: UsingApi) = apply {
                    address = usingApi.address
                    birthDate = usingApi.birthDate
                    countryOfIssue = usingApi.countryOfIssue
                    email = usingApi.email
                    firstName = usingApi.firstName
                    lastName = usingApi.lastName
                    nationalId = usingApi.nationalId
                    id = usingApi.id
                    phoneCountryCode = usingApi.phoneCountryCode
                    phoneNumber = usingApi.phoneNumber
                    accountPurpose = usingApi.accountPurpose
                    annualSalary = usingApi.annualSalary
                    expectedMonthlyVolume = usingApi.expectedMonthlyVolume
                    ipAddress = usingApi.ipAddress
                    isTermsOfServiceAccepted = usingApi.isTermsOfServiceAccepted
                    occupation = usingApi.occupation
                    chainId = usingApi.chainId
                    contractAddress = usingApi.contractAddress
                    hasExistingDocuments = usingApi.hasExistingDocuments
                    solanaAddress = usingApi.solanaAddress
                    sourceKey = usingApi.sourceKey
                    walletAddress = usingApi.walletAddress
                    additionalProperties = usingApi.additionalProperties.toMutableMap()
                }

                /** The person's address */
                fun address(address: PhysicalAddress) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [PhysicalAddress]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun address(address: JsonField<PhysicalAddress>) = apply { this.address = address }

                /** The person's birth date */
                fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                /**
                 * Sets [Builder.birthDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.birthDate] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                    this.birthDate = birthDate
                }

                /** The 2-digit country code of the person's national ID issuer */
                fun countryOfIssue(countryOfIssue: String) =
                    countryOfIssue(JsonField.of(countryOfIssue))

                /**
                 * Sets [Builder.countryOfIssue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryOfIssue] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.firstName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

                /** The person's last name */
                fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                /**
                 * Sets [Builder.lastName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                /** The person's national ID number. For the US, this is a 9-digit SSN */
                fun nationalId(nationalId: String) = nationalId(JsonField.of(nationalId))

                /**
                 * Sets [Builder.nationalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nationalId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun nationalId(nationalId: JsonField<String>) = apply {
                    this.nationalId = nationalId
                }

                /** The person's unique identifier */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The country code for the phone number */
                fun phoneCountryCode(phoneCountryCode: String) =
                    phoneCountryCode(JsonField.of(phoneCountryCode))

                /**
                 * Sets [Builder.phoneCountryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneCountryCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** The purpose of the user's account */
                fun accountPurpose(accountPurpose: String) =
                    accountPurpose(JsonField.of(accountPurpose))

                /**
                 * Sets [Builder.accountPurpose] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountPurpose] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountPurpose(accountPurpose: JsonField<String>) = apply {
                    this.accountPurpose = accountPurpose
                }

                /** The user's annual salary */
                fun annualSalary(annualSalary: String) = annualSalary(JsonField.of(annualSalary))

                /**
                 * Sets [Builder.annualSalary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annualSalary] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun annualSalary(annualSalary: JsonField<String>) = apply {
                    this.annualSalary = annualSalary
                }

                /** The estimated monthly spending amount for the user */
                fun expectedMonthlyVolume(expectedMonthlyVolume: String) =
                    expectedMonthlyVolume(JsonField.of(expectedMonthlyVolume))

                /**
                 * Sets [Builder.expectedMonthlyVolume] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expectedMonthlyVolume] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun expectedMonthlyVolume(expectedMonthlyVolume: JsonField<String>) = apply {
                    this.expectedMonthlyVolume = expectedMonthlyVolume
                }

                /** This user's IP address */
                fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

                /**
                 * Sets [Builder.ipAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ipAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

                /** Indicates whether the user has accepted the terms of service */
                fun isTermsOfServiceAccepted(isTermsOfServiceAccepted: IsTermsOfServiceAccepted) =
                    isTermsOfServiceAccepted(JsonField.of(isTermsOfServiceAccepted))

                /**
                 * Sets [Builder.isTermsOfServiceAccepted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isTermsOfServiceAccepted] with a well-typed
                 * [IsTermsOfServiceAccepted] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun isTermsOfServiceAccepted(
                    isTermsOfServiceAccepted: JsonField<IsTermsOfServiceAccepted>
                ) = apply { this.isTermsOfServiceAccepted = isTermsOfServiceAccepted }

                /** The user's occupation */
                fun occupation(occupation: String) = occupation(JsonField.of(occupation))

                /**
                 * Sets [Builder.occupation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occupation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun occupation(occupation: JsonField<String>) = apply {
                    this.occupation = occupation
                }

                /**
                 * The chain ID of the user's external collateral contract, if applicable. Not
                 * required when using Rain's collateral contracts.
                 */
                fun chainId(chainId: String) = chainId(JsonField.of(chainId))

                /**
                 * Sets [Builder.chainId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chainId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chainId(chainId: JsonField<String>) = apply { this.chainId = chainId }

                /**
                 * The address of the user's external collateral contract, if applicable. Not
                 * required when using Rain's collateral contracts.
                 */
                fun contractAddress(contractAddress: String) =
                    contractAddress(JsonField.of(contractAddress))

                /**
                 * Sets [Builder.contractAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractAddress] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun contractAddress(contractAddress: JsonField<String>) = apply {
                    this.contractAddress = contractAddress
                }

                /**
                 * Indicates whether the user will use existing documents for additional
                 * verification
                 */
                fun hasExistingDocuments(hasExistingDocuments: Boolean) =
                    hasExistingDocuments(JsonField.of(hasExistingDocuments))

                /**
                 * Sets [Builder.hasExistingDocuments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasExistingDocuments] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun hasExistingDocuments(hasExistingDocuments: JsonField<Boolean>) = apply {
                    this.hasExistingDocuments = hasExistingDocuments
                }

                /**
                 * The user's Solana address. Either walletAddress or solanaAddress is required if
                 * using a Rain-managed solution, but optional otherwise.
                 */
                fun solanaAddress(solanaAddress: String) =
                    solanaAddress(JsonField.of(solanaAddress))

                /**
                 * Sets [Builder.solanaAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solanaAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun solanaAddress(solanaAddress: JsonField<String>) = apply {
                    this.solanaAddress = solanaAddress
                }

                /** A unique identifier for the source of this user. */
                fun sourceKey(sourceKey: String) = sourceKey(JsonField.of(sourceKey))

                /**
                 * Sets [Builder.sourceKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceKey(sourceKey: JsonField<String>) = apply { this.sourceKey = sourceKey }

                /**
                 * The user's Ethereum Virtual Machine (EVM) address. Either walletAddress or
                 * solanaAddress is required if using a Rain-managed solution, but optional
                 * otherwise.
                 */
                fun walletAddress(walletAddress: String) =
                    walletAddress(JsonField.of(walletAddress))

                /**
                 * Sets [Builder.walletAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.walletAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [UsingApi].
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
                 * .accountPurpose()
                 * .annualSalary()
                 * .expectedMonthlyVolume()
                 * .ipAddress()
                 * .isTermsOfServiceAccepted()
                 * .occupation()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsingApi =
                    UsingApi(
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
                        checkRequired("accountPurpose", accountPurpose),
                        checkRequired("annualSalary", annualSalary),
                        checkRequired("expectedMonthlyVolume", expectedMonthlyVolume),
                        checkRequired("ipAddress", ipAddress),
                        checkRequired("isTermsOfServiceAccepted", isTermsOfServiceAccepted),
                        checkRequired("occupation", occupation),
                        chainId,
                        contractAddress,
                        hasExistingDocuments,
                        solanaAddress,
                        sourceKey,
                        walletAddress,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsingApi = apply {
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
                accountPurpose()
                annualSalary()
                expectedMonthlyVolume()
                ipAddress()
                isTermsOfServiceAccepted().validate()
                occupation()
                chainId()
                contractAddress()
                hasExistingDocuments()
                solanaAddress()
                sourceKey()
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
                    (if (accountPurpose.asKnown() == null) 0 else 1) +
                    (if (annualSalary.asKnown() == null) 0 else 1) +
                    (if (expectedMonthlyVolume.asKnown() == null) 0 else 1) +
                    (if (ipAddress.asKnown() == null) 0 else 1) +
                    (isTermsOfServiceAccepted.asKnown()?.validity() ?: 0) +
                    (if (occupation.asKnown() == null) 0 else 1) +
                    (if (chainId.asKnown() == null) 0 else 1) +
                    (if (contractAddress.asKnown() == null) 0 else 1) +
                    (if (hasExistingDocuments.asKnown() == null) 0 else 1) +
                    (if (solanaAddress.asKnown() == null) 0 else 1) +
                    (if (sourceKey.asKnown() == null) 0 else 1) +
                    (if (walletAddress.asKnown() == null) 0 else 1)

            /** Indicates whether the user has accepted the terms of service */
            class IsTermsOfServiceAccepted
            @JsonCreator
            private constructor(private val value: JsonField<Boolean>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An instance of [IsTermsOfServiceAccepted] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TRUE,
                    /**
                     * An enum member indicating that [IsTermsOfServiceAccepted] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                            throw RainInvalidDataException(
                                "Unknown IsTermsOfServiceAccepted: $value"
                            )
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

                return other is UsingApi &&
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
                    accountPurpose == other.accountPurpose &&
                    annualSalary == other.annualSalary &&
                    expectedMonthlyVolume == other.expectedMonthlyVolume &&
                    ipAddress == other.ipAddress &&
                    isTermsOfServiceAccepted == other.isTermsOfServiceAccepted &&
                    occupation == other.occupation &&
                    chainId == other.chainId &&
                    contractAddress == other.contractAddress &&
                    hasExistingDocuments == other.hasExistingDocuments &&
                    solanaAddress == other.solanaAddress &&
                    sourceKey == other.sourceKey &&
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
                    accountPurpose,
                    annualSalary,
                    expectedMonthlyVolume,
                    ipAddress,
                    isTermsOfServiceAccepted,
                    occupation,
                    chainId,
                    contractAddress,
                    hasExistingDocuments,
                    solanaAddress,
                    sourceKey,
                    walletAddress,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsingApi{address=$address, birthDate=$birthDate, countryOfIssue=$countryOfIssue, email=$email, firstName=$firstName, lastName=$lastName, nationalId=$nationalId, id=$id, phoneCountryCode=$phoneCountryCode, phoneNumber=$phoneNumber, accountPurpose=$accountPurpose, annualSalary=$annualSalary, expectedMonthlyVolume=$expectedMonthlyVolume, ipAddress=$ipAddress, isTermsOfServiceAccepted=$isTermsOfServiceAccepted, occupation=$occupation, chainId=$chainId, contractAddress=$contractAddress, hasExistingDocuments=$hasExistingDocuments, solanaAddress=$solanaAddress, sourceKey=$sourceKey, walletAddress=$walletAddress, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
