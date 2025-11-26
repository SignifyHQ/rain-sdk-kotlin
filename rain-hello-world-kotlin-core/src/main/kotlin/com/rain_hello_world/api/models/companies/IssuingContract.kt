// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.companies

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

/** Represents an issuing contract with details about its deployment and token handling. */
class IssuingContract
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val chainId: JsonField<Long>,
    private val contractVersion: JsonField<Long>,
    private val controllerAddress: JsonField<String>,
    private val proxyAddress: JsonField<String>,
    private val tokens: JsonField<List<Token>>,
    private val depositAddress: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chainId") @ExcludeMissing chainId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("contractVersion")
        @ExcludeMissing
        contractVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("controllerAddress")
        @ExcludeMissing
        controllerAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proxyAddress")
        @ExcludeMissing
        proxyAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tokens") @ExcludeMissing tokens: JsonField<List<Token>> = JsonMissing.of(),
        @JsonProperty("depositAddress")
        @ExcludeMissing
        depositAddress: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        chainId,
        contractVersion,
        controllerAddress,
        proxyAddress,
        tokens,
        depositAddress,
        mutableMapOf(),
    )

    /**
     * The contract's unique identifier
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The chain ID (base-10 number) that the smart contract is deployed on
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chainId(): Long = chainId.getRequired("chainId")

    /**
     * Version of the contract
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contractVersion(): Long = contractVersion.getRequired("contractVersion")

    /**
     * The address of the contract's controller
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun controllerAddress(): String = controllerAddress.getRequired("controllerAddress")

    /**
     * The proxy address of the contract
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun proxyAddress(): String = proxyAddress.getRequired("proxyAddress")

    /**
     * Tokens that the contract accepts for transactions
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokens(): List<Token> = tokens.getRequired("tokens")

    /**
     * The address where funds should be deposited
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun depositAddress(): String? = depositAddress.getNullable("depositAddress")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [chainId].
     *
     * Unlike [chainId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chainId") @ExcludeMissing fun _chainId(): JsonField<Long> = chainId

    /**
     * Returns the raw JSON value of [contractVersion].
     *
     * Unlike [contractVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contractVersion")
    @ExcludeMissing
    fun _contractVersion(): JsonField<Long> = contractVersion

    /**
     * Returns the raw JSON value of [controllerAddress].
     *
     * Unlike [controllerAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("controllerAddress")
    @ExcludeMissing
    fun _controllerAddress(): JsonField<String> = controllerAddress

    /**
     * Returns the raw JSON value of [proxyAddress].
     *
     * Unlike [proxyAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("proxyAddress")
    @ExcludeMissing
    fun _proxyAddress(): JsonField<String> = proxyAddress

    /**
     * Returns the raw JSON value of [tokens].
     *
     * Unlike [tokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tokens") @ExcludeMissing fun _tokens(): JsonField<List<Token>> = tokens

    /**
     * Returns the raw JSON value of [depositAddress].
     *
     * Unlike [depositAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depositAddress")
    @ExcludeMissing
    fun _depositAddress(): JsonField<String> = depositAddress

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
         * Returns a mutable builder for constructing an instance of [IssuingContract].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .chainId()
         * .contractVersion()
         * .controllerAddress()
         * .proxyAddress()
         * .tokens()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IssuingContract]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var chainId: JsonField<Long>? = null
        private var contractVersion: JsonField<Long>? = null
        private var controllerAddress: JsonField<String>? = null
        private var proxyAddress: JsonField<String>? = null
        private var tokens: JsonField<MutableList<Token>>? = null
        private var depositAddress: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(issuingContract: IssuingContract) = apply {
            id = issuingContract.id
            chainId = issuingContract.chainId
            contractVersion = issuingContract.contractVersion
            controllerAddress = issuingContract.controllerAddress
            proxyAddress = issuingContract.proxyAddress
            tokens = issuingContract.tokens.map { it.toMutableList() }
            depositAddress = issuingContract.depositAddress
            additionalProperties = issuingContract.additionalProperties.toMutableMap()
        }

        /** The contract's unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The chain ID (base-10 number) that the smart contract is deployed on */
        fun chainId(chainId: Long) = chainId(JsonField.of(chainId))

        /**
         * Sets [Builder.chainId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chainId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chainId(chainId: JsonField<Long>) = apply { this.chainId = chainId }

        /** Version of the contract */
        fun contractVersion(contractVersion: Long) = contractVersion(JsonField.of(contractVersion))

        /**
         * Sets [Builder.contractVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractVersion] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractVersion(contractVersion: JsonField<Long>) = apply {
            this.contractVersion = contractVersion
        }

        /** The address of the contract's controller */
        fun controllerAddress(controllerAddress: String) =
            controllerAddress(JsonField.of(controllerAddress))

        /**
         * Sets [Builder.controllerAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.controllerAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun controllerAddress(controllerAddress: JsonField<String>) = apply {
            this.controllerAddress = controllerAddress
        }

        /** The proxy address of the contract */
        fun proxyAddress(proxyAddress: String) = proxyAddress(JsonField.of(proxyAddress))

        /**
         * Sets [Builder.proxyAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proxyAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun proxyAddress(proxyAddress: JsonField<String>) = apply {
            this.proxyAddress = proxyAddress
        }

        /** Tokens that the contract accepts for transactions */
        fun tokens(tokens: List<Token>) = tokens(JsonField.of(tokens))

        /**
         * Sets [Builder.tokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokens] with a well-typed `List<Token>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokens(tokens: JsonField<List<Token>>) = apply {
            this.tokens = tokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [Token] to [tokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToken(token: Token) = apply {
            tokens =
                (tokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tokens", it).add(token)
                }
        }

        /** The address where funds should be deposited */
        fun depositAddress(depositAddress: String) = depositAddress(JsonField.of(depositAddress))

        /**
         * Sets [Builder.depositAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depositAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun depositAddress(depositAddress: JsonField<String>) = apply {
            this.depositAddress = depositAddress
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
         * Returns an immutable instance of [IssuingContract].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .chainId()
         * .contractVersion()
         * .controllerAddress()
         * .proxyAddress()
         * .tokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IssuingContract =
            IssuingContract(
                checkRequired("id", id),
                checkRequired("chainId", chainId),
                checkRequired("contractVersion", contractVersion),
                checkRequired("controllerAddress", controllerAddress),
                checkRequired("proxyAddress", proxyAddress),
                checkRequired("tokens", tokens).map { it.toImmutable() },
                depositAddress,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IssuingContract = apply {
        if (validated) {
            return@apply
        }

        id()
        chainId()
        contractVersion()
        controllerAddress()
        proxyAddress()
        tokens().forEach { it.validate() }
        depositAddress()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (chainId.asKnown() == null) 0 else 1) +
            (if (contractVersion.asKnown() == null) 0 else 1) +
            (if (controllerAddress.asKnown() == null) 0 else 1) +
            (if (proxyAddress.asKnown() == null) 0 else 1) +
            (tokens.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (depositAddress.asKnown() == null) 0 else 1)

    class Token
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<String>,
        private val advanceRate: JsonField<Double>,
        private val balance: JsonField<String>,
        private val exchangeRate: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("advanceRate")
            @ExcludeMissing
            advanceRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("balance") @ExcludeMissing balance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exchangeRate")
            @ExcludeMissing
            exchangeRate: JsonField<Double> = JsonMissing.of(),
        ) : this(address, advanceRate, balance, exchangeRate, mutableMapOf())

        /**
         * The address of the token contract
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): String = address.getRequired("address")

        /**
         * The advance rate for the token
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun advanceRate(): Double? = advanceRate.getNullable("advanceRate")

        /**
         * The balance of the token
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun balance(): String? = balance.getNullable("balance")

        /**
         * The exchange rate for the token
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun exchangeRate(): Double? = exchangeRate.getNullable("exchangeRate")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [advanceRate].
         *
         * Unlike [advanceRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("advanceRate")
        @ExcludeMissing
        fun _advanceRate(): JsonField<Double> = advanceRate

        /**
         * Returns the raw JSON value of [balance].
         *
         * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<String> = balance

        /**
         * Returns the raw JSON value of [exchangeRate].
         *
         * Unlike [exchangeRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exchangeRate")
        @ExcludeMissing
        fun _exchangeRate(): JsonField<Double> = exchangeRate

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
             * Returns a mutable builder for constructing an instance of [Token].
             *
             * The following fields are required:
             * ```kotlin
             * .address()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Token]. */
        class Builder internal constructor() {

            private var address: JsonField<String>? = null
            private var advanceRate: JsonField<Double> = JsonMissing.of()
            private var balance: JsonField<String> = JsonMissing.of()
            private var exchangeRate: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(token: Token) = apply {
                address = token.address
                advanceRate = token.advanceRate
                balance = token.balance
                exchangeRate = token.exchangeRate
                additionalProperties = token.additionalProperties.toMutableMap()
            }

            /** The address of the token contract */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** The advance rate for the token */
            fun advanceRate(advanceRate: Double) = advanceRate(JsonField.of(advanceRate))

            /**
             * Sets [Builder.advanceRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.advanceRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun advanceRate(advanceRate: JsonField<Double>) = apply {
                this.advanceRate = advanceRate
            }

            /** The balance of the token */
            fun balance(balance: String) = balance(JsonField.of(balance))

            /**
             * Sets [Builder.balance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balance] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balance(balance: JsonField<String>) = apply { this.balance = balance }

            /** The exchange rate for the token */
            fun exchangeRate(exchangeRate: Double) = exchangeRate(JsonField.of(exchangeRate))

            /**
             * Sets [Builder.exchangeRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exchangeRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exchangeRate(exchangeRate: JsonField<Double>) = apply {
                this.exchangeRate = exchangeRate
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
             * Returns an immutable instance of [Token].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .address()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Token =
                Token(
                    checkRequired("address", address),
                    advanceRate,
                    balance,
                    exchangeRate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Token = apply {
            if (validated) {
                return@apply
            }

            address()
            advanceRate()
            balance()
            exchangeRate()
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
            (if (address.asKnown() == null) 0 else 1) +
                (if (advanceRate.asKnown() == null) 0 else 1) +
                (if (balance.asKnown() == null) 0 else 1) +
                (if (exchangeRate.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Token &&
                address == other.address &&
                advanceRate == other.advanceRate &&
                balance == other.balance &&
                exchangeRate == other.exchangeRate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address, advanceRate, balance, exchangeRate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Token{address=$address, advanceRate=$advanceRate, balance=$balance, exchangeRate=$exchangeRate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IssuingContract &&
            id == other.id &&
            chainId == other.chainId &&
            contractVersion == other.contractVersion &&
            controllerAddress == other.controllerAddress &&
            proxyAddress == other.proxyAddress &&
            tokens == other.tokens &&
            depositAddress == other.depositAddress &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            chainId,
            contractVersion,
            controllerAddress,
            proxyAddress,
            tokens,
            depositAddress,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IssuingContract{id=$id, chainId=$chainId, contractVersion=$contractVersion, controllerAddress=$controllerAddress, proxyAddress=$proxyAddress, tokens=$tokens, depositAddress=$depositAddress, additionalProperties=$additionalProperties}"
}
