// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.transactions

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
import com.rain_hello_world.api.core.BaseDeserializer
import com.rain_hello_world.api.core.BaseSerializer
import com.rain_hello_world.api.core.Enum
import com.rain_hello_world.api.core.ExcludeMissing
import com.rain_hello_world.api.core.JsonField
import com.rain_hello_world.api.core.JsonMissing
import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.core.allMaxBy
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.core.getOrThrow
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Represents a transaction of type 'spend'. This includes details such as the transaction amount,
 * merchant, and the associated user.
 */
@JsonDeserialize(using = IssuingTransaction.Deserializer::class)
@JsonSerialize(using = IssuingTransaction.Serializer::class)
class IssuingTransaction
private constructor(
    private val unionMember0: UnionMember0? = null,
    private val unionMember1: UnionMember1? = null,
    private val unionMember2: UnionMember2? = null,
    private val unionMember3: UnionMember3? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Represents a transaction of type 'spend'. This includes details such as the transaction
     * amount, merchant, and the associated user.
     */
    fun unionMember0(): UnionMember0? = unionMember0

    /** Represents a collateral transaction, where a user provides collateral for a transaction. */
    fun unionMember1(): UnionMember1? = unionMember1

    /**
     * Represents a payment transaction, where a payment is made for a particular service or
     * product.
     */
    fun unionMember2(): UnionMember2? = unionMember2

    /** Represents a fee transaction, where a fee is charged for a service or product. */
    fun unionMember3(): UnionMember3? = unionMember3

    fun isUnionMember0(): Boolean = unionMember0 != null

    fun isUnionMember1(): Boolean = unionMember1 != null

    fun isUnionMember2(): Boolean = unionMember2 != null

    fun isUnionMember3(): Boolean = unionMember3 != null

    /**
     * Represents a transaction of type 'spend'. This includes details such as the transaction
     * amount, merchant, and the associated user.
     */
    fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

    /** Represents a collateral transaction, where a user provides collateral for a transaction. */
    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

    /**
     * Represents a payment transaction, where a payment is made for a particular service or
     * product.
     */
    fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

    /** Represents a fee transaction, where a fee is charged for a service or product. */
    fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
            unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
            unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): IssuingTransaction = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUnionMember0(unionMember0: UnionMember0) {
                    unionMember0.validate()
                }

                override fun visitUnionMember1(unionMember1: UnionMember1) {
                    unionMember1.validate()
                }

                override fun visitUnionMember2(unionMember2: UnionMember2) {
                    unionMember2.validate()
                }

                override fun visitUnionMember3(unionMember3: UnionMember3) {
                    unionMember3.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitUnionMember0(unionMember0: UnionMember0) = unionMember0.validity()

                override fun visitUnionMember1(unionMember1: UnionMember1) = unionMember1.validity()

                override fun visitUnionMember2(unionMember2: UnionMember2) = unionMember2.validity()

                override fun visitUnionMember3(unionMember3: UnionMember3) = unionMember3.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IssuingTransaction &&
            unionMember0 == other.unionMember0 &&
            unionMember1 == other.unionMember1 &&
            unionMember2 == other.unionMember2 &&
            unionMember3 == other.unionMember3
    }

    override fun hashCode(): Int =
        Objects.hash(unionMember0, unionMember1, unionMember2, unionMember3)

    override fun toString(): String =
        when {
            unionMember0 != null -> "IssuingTransaction{unionMember0=$unionMember0}"
            unionMember1 != null -> "IssuingTransaction{unionMember1=$unionMember1}"
            unionMember2 != null -> "IssuingTransaction{unionMember2=$unionMember2}"
            unionMember3 != null -> "IssuingTransaction{unionMember3=$unionMember3}"
            _json != null -> "IssuingTransaction{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid IssuingTransaction")
        }

    companion object {

        /**
         * Represents a transaction of type 'spend'. This includes details such as the transaction
         * amount, merchant, and the associated user.
         */
        fun ofUnionMember0(unionMember0: UnionMember0) =
            IssuingTransaction(unionMember0 = unionMember0)

        /**
         * Represents a collateral transaction, where a user provides collateral for a transaction.
         */
        fun ofUnionMember1(unionMember1: UnionMember1) =
            IssuingTransaction(unionMember1 = unionMember1)

        /**
         * Represents a payment transaction, where a payment is made for a particular service or
         * product.
         */
        fun ofUnionMember2(unionMember2: UnionMember2) =
            IssuingTransaction(unionMember2 = unionMember2)

        /** Represents a fee transaction, where a fee is charged for a service or product. */
        fun ofUnionMember3(unionMember3: UnionMember3) =
            IssuingTransaction(unionMember3 = unionMember3)
    }

    /**
     * An interface that defines how to map each variant of [IssuingTransaction] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /**
         * Represents a transaction of type 'spend'. This includes details such as the transaction
         * amount, merchant, and the associated user.
         */
        fun visitUnionMember0(unionMember0: UnionMember0): T

        /**
         * Represents a collateral transaction, where a user provides collateral for a transaction.
         */
        fun visitUnionMember1(unionMember1: UnionMember1): T

        /**
         * Represents a payment transaction, where a payment is made for a particular service or
         * product.
         */
        fun visitUnionMember2(unionMember2: UnionMember2): T

        /** Represents a fee transaction, where a fee is charged for a service or product. */
        fun visitUnionMember3(unionMember3: UnionMember3): T

        /**
         * Maps an unknown variant of [IssuingTransaction] to a value of type [T].
         *
         * An instance of [IssuingTransaction] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws RainHelloWorldInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw RainHelloWorldInvalidDataException("Unknown IssuingTransaction: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<IssuingTransaction>(IssuingTransaction::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): IssuingTransaction {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                            IssuingTransaction(unionMember0 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                            IssuingTransaction(unionMember1 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                            IssuingTransaction(unionMember2 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember3>())?.let {
                            IssuingTransaction(unionMember3 = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> IssuingTransaction(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<IssuingTransaction>(IssuingTransaction::class) {

        override fun serialize(
            value: IssuingTransaction,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid IssuingTransaction")
            }
        }
    }

    /**
     * Represents a transaction of type 'spend'. This includes details such as the transaction
     * amount, merchant, and the associated user.
     */
    class UnionMember0
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val spend: JsonField<Spend>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spend") @ExcludeMissing spend: JsonField<Spend> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(id, spend, type, mutableMapOf())

        /**
         * The unique identifier of the transaction
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Details specific to a spend transaction, including merchant, amount, and user
         * information.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun spend(): Spend = spend.getRequired("spend")

        /**
         * The type of transaction
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [spend].
         *
         * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Spend> = spend

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [UnionMember0].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .spend()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UnionMember0]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var spend: JsonField<Spend>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unionMember0: UnionMember0) = apply {
                id = unionMember0.id
                spend = unionMember0.spend
                type = unionMember0.type
                additionalProperties = unionMember0.additionalProperties.toMutableMap()
            }

            /** The unique identifier of the transaction */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Details specific to a spend transaction, including merchant, amount, and user
             * information.
             */
            fun spend(spend: Spend) = spend(JsonField.of(spend))

            /**
             * Sets [Builder.spend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spend] with a well-typed [Spend] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun spend(spend: JsonField<Spend>) = apply { this.spend = spend }

            /** The type of transaction */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember0].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .spend()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember0 =
                UnionMember0(
                    checkRequired("id", id),
                    checkRequired("spend", spend),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember0 = apply {
            if (validated) {
                return@apply
            }

            id()
            spend().validate()
            type().validate()
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
            (if (id.asKnown() == null) 0 else 1) +
                (spend.asKnown()?.validity() ?: 0) +
                (type.asKnown()?.validity() ?: 0)

        /**
         * Details specific to a spend transaction, including merchant, amount, and user
         * information.
         */
        class Spend
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val authorizedAt: JsonField<String>,
            private val cardId: JsonField<String>,
            private val cardType: JsonField<CardType>,
            private val currency: JsonField<String>,
            private val merchantCategory: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantName: JsonField<String>,
            private val receipt: JsonField<Boolean>,
            private val status: JsonField<Status>,
            private val userEmail: JsonField<String>,
            private val userFirstName: JsonField<String>,
            private val userId: JsonField<String>,
            private val userLastName: JsonField<String>,
            private val authorizationMethod: JsonField<String>,
            private val authorizedAmount: JsonField<Long>,
            private val companyId: JsonField<String>,
            private val declinedReason: JsonField<String>,
            private val enrichedMerchantCategory: JsonField<String>,
            private val enrichedMerchantIcon: JsonField<String>,
            private val enrichedMerchantName: JsonField<String>,
            private val localAmount: JsonField<Long>,
            private val localCurrency: JsonField<String>,
            private val memo: JsonField<String>,
            private val postedAt: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("authorizedAt")
                @ExcludeMissing
                authorizedAt: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cardId")
                @ExcludeMissing
                cardId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cardType")
                @ExcludeMissing
                cardType: JsonField<CardType> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("merchantCategory")
                @ExcludeMissing
                merchantCategory: JsonField<String> = JsonMissing.of(),
                @JsonProperty("merchantCategoryCode")
                @ExcludeMissing
                merchantCategoryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("merchantName")
                @ExcludeMissing
                merchantName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("receipt")
                @ExcludeMissing
                receipt: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("userEmail")
                @ExcludeMissing
                userEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("userFirstName")
                @ExcludeMissing
                userFirstName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("userId")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("userLastName")
                @ExcludeMissing
                userLastName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("authorizationMethod")
                @ExcludeMissing
                authorizationMethod: JsonField<String> = JsonMissing.of(),
                @JsonProperty("authorizedAmount")
                @ExcludeMissing
                authorizedAmount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("companyId")
                @ExcludeMissing
                companyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("declinedReason")
                @ExcludeMissing
                declinedReason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("enrichedMerchantCategory")
                @ExcludeMissing
                enrichedMerchantCategory: JsonField<String> = JsonMissing.of(),
                @JsonProperty("enrichedMerchantIcon")
                @ExcludeMissing
                enrichedMerchantIcon: JsonField<String> = JsonMissing.of(),
                @JsonProperty("enrichedMerchantName")
                @ExcludeMissing
                enrichedMerchantName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("localAmount")
                @ExcludeMissing
                localAmount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("localCurrency")
                @ExcludeMissing
                localCurrency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postedAt")
                @ExcludeMissing
                postedAt: JsonField<String> = JsonMissing.of(),
            ) : this(
                amount,
                authorizedAt,
                cardId,
                cardType,
                currency,
                merchantCategory,
                merchantCategoryCode,
                merchantName,
                receipt,
                status,
                userEmail,
                userFirstName,
                userId,
                userLastName,
                authorizationMethod,
                authorizedAmount,
                companyId,
                declinedReason,
                enrichedMerchantCategory,
                enrichedMerchantIcon,
                enrichedMerchantName,
                localAmount,
                localCurrency,
                memo,
                postedAt,
                mutableMapOf(),
            )

            /**
             * The amount of the transaction, in cents
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The time at which the transaction was authorized
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun authorizedAt(): String = authorizedAt.getRequired("authorizedAt")

            /**
             * The unique identifier of the card used for the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardId(): String = cardId.getRequired("cardId")

            /**
             * The type of card used for the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardType(): CardType = cardType.getRequired("cardType")

            /**
             * The currency of the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The category of the merchant (e.g., electronics, food)
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun merchantCategory(): String = merchantCategory.getRequired("merchantCategory")

            /**
             * The merchant's category code
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun merchantCategoryCode(): String =
                merchantCategoryCode.getRequired("merchantCategoryCode")

            /**
             * The name of the merchant where the transaction took place
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun merchantName(): String = merchantName.getRequired("merchantName")

            /**
             * Indicates whether a receipt was generated for the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun receipt(): Boolean = receipt.getRequired("receipt")

            /**
             * The status of the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * The email address of the user who made the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun userEmail(): String = userEmail.getRequired("userEmail")

            /**
             * The first name of the user who made the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun userFirstName(): String = userFirstName.getRequired("userFirstName")

            /**
             * The identifier of the user who made the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun userId(): String = userId.getRequired("userId")

            /**
             * The last name of the user who made the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun userLastName(): String = userLastName.getRequired("userLastName")

            /**
             * The method used for authorization of the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun authorizationMethod(): String? =
                authorizationMethod.getNullable("authorizationMethod")

            /**
             * The authorized amount of the transaction, in cents
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun authorizedAmount(): Long? = authorizedAmount.getNullable("authorizedAmount")

            /**
             * The identifier of the company under which the transaction was made
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun companyId(): String? = companyId.getNullable("companyId")

            /**
             * The reason why the transaction was declined
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun declinedReason(): String? = declinedReason.getNullable("declinedReason")

            /**
             * An enriched category of the merchant, providing further details
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun enrichedMerchantCategory(): String? =
                enrichedMerchantCategory.getNullable("enrichedMerchantCategory")

            /**
             * The enriched icon of the merchant
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun enrichedMerchantIcon(): String? =
                enrichedMerchantIcon.getNullable("enrichedMerchantIcon")

            /**
             * An enriched name of the merchant, possibly with additional information
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun enrichedMerchantName(): String? =
                enrichedMerchantName.getNullable("enrichedMerchantName")

            /**
             * The amount of the transaction in local currency, in cents
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun localAmount(): Long? = localAmount.getNullable("localAmount")

            /**
             * The local currency of the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun localCurrency(): String? = localCurrency.getNullable("localCurrency")

            /**
             * A memo or note associated with the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun memo(): String? = memo.getNullable("memo")

            /**
             * The time at which the transaction was posted
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun postedAt(): String? = postedAt.getNullable("postedAt")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [authorizedAt].
             *
             * Unlike [authorizedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("authorizedAt")
            @ExcludeMissing
            fun _authorizedAt(): JsonField<String> = authorizedAt

            /**
             * Returns the raw JSON value of [cardId].
             *
             * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cardId") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

            /**
             * Returns the raw JSON value of [cardType].
             *
             * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cardType")
            @ExcludeMissing
            fun _cardType(): JsonField<CardType> = cardType

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [merchantCategory].
             *
             * Unlike [merchantCategory], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("merchantCategory")
            @ExcludeMissing
            fun _merchantCategory(): JsonField<String> = merchantCategory

            /**
             * Returns the raw JSON value of [merchantCategoryCode].
             *
             * Unlike [merchantCategoryCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("merchantCategoryCode")
            @ExcludeMissing
            fun _merchantCategoryCode(): JsonField<String> = merchantCategoryCode

            /**
             * Returns the raw JSON value of [merchantName].
             *
             * Unlike [merchantName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("merchantName")
            @ExcludeMissing
            fun _merchantName(): JsonField<String> = merchantName

            /**
             * Returns the raw JSON value of [receipt].
             *
             * Unlike [receipt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("receipt") @ExcludeMissing fun _receipt(): JsonField<Boolean> = receipt

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [userEmail].
             *
             * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("userEmail")
            @ExcludeMissing
            fun _userEmail(): JsonField<String> = userEmail

            /**
             * Returns the raw JSON value of [userFirstName].
             *
             * Unlike [userFirstName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("userFirstName")
            @ExcludeMissing
            fun _userFirstName(): JsonField<String> = userFirstName

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

            /**
             * Returns the raw JSON value of [userLastName].
             *
             * Unlike [userLastName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("userLastName")
            @ExcludeMissing
            fun _userLastName(): JsonField<String> = userLastName

            /**
             * Returns the raw JSON value of [authorizationMethod].
             *
             * Unlike [authorizationMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("authorizationMethod")
            @ExcludeMissing
            fun _authorizationMethod(): JsonField<String> = authorizationMethod

            /**
             * Returns the raw JSON value of [authorizedAmount].
             *
             * Unlike [authorizedAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("authorizedAmount")
            @ExcludeMissing
            fun _authorizedAmount(): JsonField<Long> = authorizedAmount

            /**
             * Returns the raw JSON value of [companyId].
             *
             * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("companyId")
            @ExcludeMissing
            fun _companyId(): JsonField<String> = companyId

            /**
             * Returns the raw JSON value of [declinedReason].
             *
             * Unlike [declinedReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("declinedReason")
            @ExcludeMissing
            fun _declinedReason(): JsonField<String> = declinedReason

            /**
             * Returns the raw JSON value of [enrichedMerchantCategory].
             *
             * Unlike [enrichedMerchantCategory], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("enrichedMerchantCategory")
            @ExcludeMissing
            fun _enrichedMerchantCategory(): JsonField<String> = enrichedMerchantCategory

            /**
             * Returns the raw JSON value of [enrichedMerchantIcon].
             *
             * Unlike [enrichedMerchantIcon], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("enrichedMerchantIcon")
            @ExcludeMissing
            fun _enrichedMerchantIcon(): JsonField<String> = enrichedMerchantIcon

            /**
             * Returns the raw JSON value of [enrichedMerchantName].
             *
             * Unlike [enrichedMerchantName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("enrichedMerchantName")
            @ExcludeMissing
            fun _enrichedMerchantName(): JsonField<String> = enrichedMerchantName

            /**
             * Returns the raw JSON value of [localAmount].
             *
             * Unlike [localAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("localAmount")
            @ExcludeMissing
            fun _localAmount(): JsonField<Long> = localAmount

            /**
             * Returns the raw JSON value of [localCurrency].
             *
             * Unlike [localCurrency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("localCurrency")
            @ExcludeMissing
            fun _localCurrency(): JsonField<String> = localCurrency

            /**
             * Returns the raw JSON value of [memo].
             *
             * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

            /**
             * Returns the raw JSON value of [postedAt].
             *
             * Unlike [postedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postedAt") @ExcludeMissing fun _postedAt(): JsonField<String> = postedAt

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
                 * Returns a mutable builder for constructing an instance of [Spend].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .authorizedAt()
                 * .cardId()
                 * .cardType()
                 * .currency()
                 * .merchantCategory()
                 * .merchantCategoryCode()
                 * .merchantName()
                 * .receipt()
                 * .status()
                 * .userEmail()
                 * .userFirstName()
                 * .userId()
                 * .userLastName()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Spend]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var authorizedAt: JsonField<String>? = null
                private var cardId: JsonField<String>? = null
                private var cardType: JsonField<CardType>? = null
                private var currency: JsonField<String>? = null
                private var merchantCategory: JsonField<String>? = null
                private var merchantCategoryCode: JsonField<String>? = null
                private var merchantName: JsonField<String>? = null
                private var receipt: JsonField<Boolean>? = null
                private var status: JsonField<Status>? = null
                private var userEmail: JsonField<String>? = null
                private var userFirstName: JsonField<String>? = null
                private var userId: JsonField<String>? = null
                private var userLastName: JsonField<String>? = null
                private var authorizationMethod: JsonField<String> = JsonMissing.of()
                private var authorizedAmount: JsonField<Long> = JsonMissing.of()
                private var companyId: JsonField<String> = JsonMissing.of()
                private var declinedReason: JsonField<String> = JsonMissing.of()
                private var enrichedMerchantCategory: JsonField<String> = JsonMissing.of()
                private var enrichedMerchantIcon: JsonField<String> = JsonMissing.of()
                private var enrichedMerchantName: JsonField<String> = JsonMissing.of()
                private var localAmount: JsonField<Long> = JsonMissing.of()
                private var localCurrency: JsonField<String> = JsonMissing.of()
                private var memo: JsonField<String> = JsonMissing.of()
                private var postedAt: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(spend: Spend) = apply {
                    amount = spend.amount
                    authorizedAt = spend.authorizedAt
                    cardId = spend.cardId
                    cardType = spend.cardType
                    currency = spend.currency
                    merchantCategory = spend.merchantCategory
                    merchantCategoryCode = spend.merchantCategoryCode
                    merchantName = spend.merchantName
                    receipt = spend.receipt
                    status = spend.status
                    userEmail = spend.userEmail
                    userFirstName = spend.userFirstName
                    userId = spend.userId
                    userLastName = spend.userLastName
                    authorizationMethod = spend.authorizationMethod
                    authorizedAmount = spend.authorizedAmount
                    companyId = spend.companyId
                    declinedReason = spend.declinedReason
                    enrichedMerchantCategory = spend.enrichedMerchantCategory
                    enrichedMerchantIcon = spend.enrichedMerchantIcon
                    enrichedMerchantName = spend.enrichedMerchantName
                    localAmount = spend.localAmount
                    localCurrency = spend.localCurrency
                    memo = spend.memo
                    postedAt = spend.postedAt
                    additionalProperties = spend.additionalProperties.toMutableMap()
                }

                /** The amount of the transaction, in cents */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The time at which the transaction was authorized */
                fun authorizedAt(authorizedAt: String) = authorizedAt(JsonField.of(authorizedAt))

                /**
                 * Sets [Builder.authorizedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authorizedAt] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authorizedAt(authorizedAt: JsonField<String>) = apply {
                    this.authorizedAt = authorizedAt
                }

                /** The unique identifier of the card used for the transaction */
                fun cardId(cardId: String) = cardId(JsonField.of(cardId))

                /**
                 * Sets [Builder.cardId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

                /** The type of card used for the transaction */
                fun cardType(cardType: CardType) = cardType(JsonField.of(cardType))

                /**
                 * Sets [Builder.cardType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardType] with a well-typed [CardType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardType(cardType: JsonField<CardType>) = apply { this.cardType = cardType }

                /** The currency of the transaction */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The category of the merchant (e.g., electronics, food) */
                fun merchantCategory(merchantCategory: String) =
                    merchantCategory(JsonField.of(merchantCategory))

                /**
                 * Sets [Builder.merchantCategory] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantCategory] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun merchantCategory(merchantCategory: JsonField<String>) = apply {
                    this.merchantCategory = merchantCategory
                }

                /** The merchant's category code */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /**
                 * Sets [Builder.merchantCategoryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantCategoryCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                    this.merchantCategoryCode = merchantCategoryCode
                }

                /** The name of the merchant where the transaction took place */
                fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

                /**
                 * Sets [Builder.merchantName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun merchantName(merchantName: JsonField<String>) = apply {
                    this.merchantName = merchantName
                }

                /** Indicates whether a receipt was generated for the transaction */
                fun receipt(receipt: Boolean) = receipt(JsonField.of(receipt))

                /**
                 * Sets [Builder.receipt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receipt] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun receipt(receipt: JsonField<Boolean>) = apply { this.receipt = receipt }

                /** The status of the transaction */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** The email address of the user who made the transaction */
                fun userEmail(userEmail: String) = userEmail(JsonField.of(userEmail))

                /**
                 * Sets [Builder.userEmail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userEmail] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

                /** The first name of the user who made the transaction */
                fun userFirstName(userFirstName: String) =
                    userFirstName(JsonField.of(userFirstName))

                /**
                 * Sets [Builder.userFirstName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userFirstName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userFirstName(userFirstName: JsonField<String>) = apply {
                    this.userFirstName = userFirstName
                }

                /** The identifier of the user who made the transaction */
                fun userId(userId: String) = userId(JsonField.of(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                /** The last name of the user who made the transaction */
                fun userLastName(userLastName: String) = userLastName(JsonField.of(userLastName))

                /**
                 * Sets [Builder.userLastName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userLastName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userLastName(userLastName: JsonField<String>) = apply {
                    this.userLastName = userLastName
                }

                /** The method used for authorization of the transaction */
                fun authorizationMethod(authorizationMethod: String) =
                    authorizationMethod(JsonField.of(authorizationMethod))

                /**
                 * Sets [Builder.authorizationMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authorizationMethod] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun authorizationMethod(authorizationMethod: JsonField<String>) = apply {
                    this.authorizationMethod = authorizationMethod
                }

                /** The authorized amount of the transaction, in cents */
                fun authorizedAmount(authorizedAmount: Long) =
                    authorizedAmount(JsonField.of(authorizedAmount))

                /**
                 * Sets [Builder.authorizedAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authorizedAmount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authorizedAmount(authorizedAmount: JsonField<Long>) = apply {
                    this.authorizedAmount = authorizedAmount
                }

                /** The identifier of the company under which the transaction was made */
                fun companyId(companyId: String) = companyId(JsonField.of(companyId))

                /**
                 * Sets [Builder.companyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

                /** The reason why the transaction was declined */
                fun declinedReason(declinedReason: String) =
                    declinedReason(JsonField.of(declinedReason))

                /**
                 * Sets [Builder.declinedReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.declinedReason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun declinedReason(declinedReason: JsonField<String>) = apply {
                    this.declinedReason = declinedReason
                }

                /** An enriched category of the merchant, providing further details */
                fun enrichedMerchantCategory(enrichedMerchantCategory: String) =
                    enrichedMerchantCategory(JsonField.of(enrichedMerchantCategory))

                /**
                 * Sets [Builder.enrichedMerchantCategory] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enrichedMerchantCategory] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun enrichedMerchantCategory(enrichedMerchantCategory: JsonField<String>) = apply {
                    this.enrichedMerchantCategory = enrichedMerchantCategory
                }

                /** The enriched icon of the merchant */
                fun enrichedMerchantIcon(enrichedMerchantIcon: String) =
                    enrichedMerchantIcon(JsonField.of(enrichedMerchantIcon))

                /**
                 * Sets [Builder.enrichedMerchantIcon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enrichedMerchantIcon] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun enrichedMerchantIcon(enrichedMerchantIcon: JsonField<String>) = apply {
                    this.enrichedMerchantIcon = enrichedMerchantIcon
                }

                /** An enriched name of the merchant, possibly with additional information */
                fun enrichedMerchantName(enrichedMerchantName: String) =
                    enrichedMerchantName(JsonField.of(enrichedMerchantName))

                /**
                 * Sets [Builder.enrichedMerchantName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enrichedMerchantName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun enrichedMerchantName(enrichedMerchantName: JsonField<String>) = apply {
                    this.enrichedMerchantName = enrichedMerchantName
                }

                /** The amount of the transaction in local currency, in cents */
                fun localAmount(localAmount: Long) = localAmount(JsonField.of(localAmount))

                /**
                 * Sets [Builder.localAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.localAmount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun localAmount(localAmount: JsonField<Long>) = apply {
                    this.localAmount = localAmount
                }

                /** The local currency of the transaction */
                fun localCurrency(localCurrency: String) =
                    localCurrency(JsonField.of(localCurrency))

                /**
                 * Sets [Builder.localCurrency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.localCurrency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun localCurrency(localCurrency: JsonField<String>) = apply {
                    this.localCurrency = localCurrency
                }

                /** A memo or note associated with the transaction */
                fun memo(memo: String) = memo(JsonField.of(memo))

                /**
                 * Sets [Builder.memo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memo] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun memo(memo: JsonField<String>) = apply { this.memo = memo }

                /** The time at which the transaction was posted */
                fun postedAt(postedAt: String) = postedAt(JsonField.of(postedAt))

                /**
                 * Sets [Builder.postedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postedAt] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postedAt(postedAt: JsonField<String>) = apply { this.postedAt = postedAt }

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
                 * Returns an immutable instance of [Spend].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .authorizedAt()
                 * .cardId()
                 * .cardType()
                 * .currency()
                 * .merchantCategory()
                 * .merchantCategoryCode()
                 * .merchantName()
                 * .receipt()
                 * .status()
                 * .userEmail()
                 * .userFirstName()
                 * .userId()
                 * .userLastName()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Spend =
                    Spend(
                        checkRequired("amount", amount),
                        checkRequired("authorizedAt", authorizedAt),
                        checkRequired("cardId", cardId),
                        checkRequired("cardType", cardType),
                        checkRequired("currency", currency),
                        checkRequired("merchantCategory", merchantCategory),
                        checkRequired("merchantCategoryCode", merchantCategoryCode),
                        checkRequired("merchantName", merchantName),
                        checkRequired("receipt", receipt),
                        checkRequired("status", status),
                        checkRequired("userEmail", userEmail),
                        checkRequired("userFirstName", userFirstName),
                        checkRequired("userId", userId),
                        checkRequired("userLastName", userLastName),
                        authorizationMethod,
                        authorizedAmount,
                        companyId,
                        declinedReason,
                        enrichedMerchantCategory,
                        enrichedMerchantIcon,
                        enrichedMerchantName,
                        localAmount,
                        localCurrency,
                        memo,
                        postedAt,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Spend = apply {
                if (validated) {
                    return@apply
                }

                amount()
                authorizedAt()
                cardId()
                cardType().validate()
                currency()
                merchantCategory()
                merchantCategoryCode()
                merchantName()
                receipt()
                status().validate()
                userEmail()
                userFirstName()
                userId()
                userLastName()
                authorizationMethod()
                authorizedAmount()
                companyId()
                declinedReason()
                enrichedMerchantCategory()
                enrichedMerchantIcon()
                enrichedMerchantName()
                localAmount()
                localCurrency()
                memo()
                postedAt()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (authorizedAt.asKnown() == null) 0 else 1) +
                    (if (cardId.asKnown() == null) 0 else 1) +
                    (cardType.asKnown()?.validity() ?: 0) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (merchantCategory.asKnown() == null) 0 else 1) +
                    (if (merchantCategoryCode.asKnown() == null) 0 else 1) +
                    (if (merchantName.asKnown() == null) 0 else 1) +
                    (if (receipt.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (if (userEmail.asKnown() == null) 0 else 1) +
                    (if (userFirstName.asKnown() == null) 0 else 1) +
                    (if (userId.asKnown() == null) 0 else 1) +
                    (if (userLastName.asKnown() == null) 0 else 1) +
                    (if (authorizationMethod.asKnown() == null) 0 else 1) +
                    (if (authorizedAmount.asKnown() == null) 0 else 1) +
                    (if (companyId.asKnown() == null) 0 else 1) +
                    (if (declinedReason.asKnown() == null) 0 else 1) +
                    (if (enrichedMerchantCategory.asKnown() == null) 0 else 1) +
                    (if (enrichedMerchantIcon.asKnown() == null) 0 else 1) +
                    (if (enrichedMerchantName.asKnown() == null) 0 else 1) +
                    (if (localAmount.asKnown() == null) 0 else 1) +
                    (if (localCurrency.asKnown() == null) 0 else 1) +
                    (if (memo.asKnown() == null) 0 else 1) +
                    (if (postedAt.asKnown() == null) 0 else 1)

            /** The type of card used for the transaction */
            class CardType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PHYSICAL = of("physical")

                    val VIRTUAL = of("virtual")

                    fun of(value: String) = CardType(JsonField.of(value))
                }

                /** An enum containing [CardType]'s known values. */
                enum class Known {
                    PHYSICAL,
                    VIRTUAL,
                }

                /**
                 * An enum containing [CardType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [CardType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PHYSICAL,
                    VIRTUAL,
                    /**
                     * An enum member indicating that [CardType] was instantiated with an unknown
                     * value.
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
                        PHYSICAL -> Value.PHYSICAL
                        VIRTUAL -> Value.VIRTUAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws RainHelloWorldInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        PHYSICAL -> Known.PHYSICAL
                        VIRTUAL -> Known.VIRTUAL
                        else -> throw RainHelloWorldInvalidDataException("Unknown CardType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws RainHelloWorldInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw RainHelloWorldInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): CardType = apply {
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

                    return other is CardType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The status of the transaction */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PENDING = of("pending")

                    val REVERSED = of("reversed")

                    val DECLINED = of("declined")

                    val COMPLETED = of("completed")

                    fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    PENDING,
                    REVERSED,
                    DECLINED,
                    COMPLETED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PENDING,
                    REVERSED,
                    DECLINED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
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
                        PENDING -> Value.PENDING
                        REVERSED -> Value.REVERSED
                        DECLINED -> Value.DECLINED
                        COMPLETED -> Value.COMPLETED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws RainHelloWorldInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        PENDING -> Known.PENDING
                        REVERSED -> Known.REVERSED
                        DECLINED -> Known.DECLINED
                        COMPLETED -> Known.COMPLETED
                        else -> throw RainHelloWorldInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws RainHelloWorldInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw RainHelloWorldInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Status = apply {
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Spend &&
                    amount == other.amount &&
                    authorizedAt == other.authorizedAt &&
                    cardId == other.cardId &&
                    cardType == other.cardType &&
                    currency == other.currency &&
                    merchantCategory == other.merchantCategory &&
                    merchantCategoryCode == other.merchantCategoryCode &&
                    merchantName == other.merchantName &&
                    receipt == other.receipt &&
                    status == other.status &&
                    userEmail == other.userEmail &&
                    userFirstName == other.userFirstName &&
                    userId == other.userId &&
                    userLastName == other.userLastName &&
                    authorizationMethod == other.authorizationMethod &&
                    authorizedAmount == other.authorizedAmount &&
                    companyId == other.companyId &&
                    declinedReason == other.declinedReason &&
                    enrichedMerchantCategory == other.enrichedMerchantCategory &&
                    enrichedMerchantIcon == other.enrichedMerchantIcon &&
                    enrichedMerchantName == other.enrichedMerchantName &&
                    localAmount == other.localAmount &&
                    localCurrency == other.localCurrency &&
                    memo == other.memo &&
                    postedAt == other.postedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    authorizedAt,
                    cardId,
                    cardType,
                    currency,
                    merchantCategory,
                    merchantCategoryCode,
                    merchantName,
                    receipt,
                    status,
                    userEmail,
                    userFirstName,
                    userId,
                    userLastName,
                    authorizationMethod,
                    authorizedAmount,
                    companyId,
                    declinedReason,
                    enrichedMerchantCategory,
                    enrichedMerchantIcon,
                    enrichedMerchantName,
                    localAmount,
                    localCurrency,
                    memo,
                    postedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Spend{amount=$amount, authorizedAt=$authorizedAt, cardId=$cardId, cardType=$cardType, currency=$currency, merchantCategory=$merchantCategory, merchantCategoryCode=$merchantCategoryCode, merchantName=$merchantName, receipt=$receipt, status=$status, userEmail=$userEmail, userFirstName=$userFirstName, userId=$userId, userLastName=$userLastName, authorizationMethod=$authorizationMethod, authorizedAmount=$authorizedAmount, companyId=$companyId, declinedReason=$declinedReason, enrichedMerchantCategory=$enrichedMerchantCategory, enrichedMerchantIcon=$enrichedMerchantIcon, enrichedMerchantName=$enrichedMerchantName, localAmount=$localAmount, localCurrency=$localCurrency, memo=$memo, postedAt=$postedAt, additionalProperties=$additionalProperties}"
        }

        /** The type of transaction */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val SPEND = of("spend")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                SPEND
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SPEND,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    SPEND -> Value.SPEND
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
                    SPEND -> Known.SPEND
                    else -> throw RainHelloWorldInvalidDataException("Unknown Type: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember0 &&
                id == other.id &&
                spend == other.spend &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, spend, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember0{id=$id, spend=$spend, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Represents a collateral transaction, where a user provides collateral for a transaction. */
    class UnionMember1
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val collateral: JsonField<Collateral>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("collateral")
            @ExcludeMissing
            collateral: JsonField<Collateral> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(id, collateral, type, mutableMapOf())

        /**
         * The unique identifier of the transaction
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Details of the collateral transaction, including amount, currency, and transaction
         * details.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun collateral(): Collateral = collateral.getRequired("collateral")

        /**
         * The type of transaction, in this case, a collateral transaction
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [collateral].
         *
         * Unlike [collateral], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("collateral")
        @ExcludeMissing
        fun _collateral(): JsonField<Collateral> = collateral

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * .id()
             * .collateral()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UnionMember1]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var collateral: JsonField<Collateral>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unionMember1: UnionMember1) = apply {
                id = unionMember1.id
                collateral = unionMember1.collateral
                type = unionMember1.type
                additionalProperties = unionMember1.additionalProperties.toMutableMap()
            }

            /** The unique identifier of the transaction */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Details of the collateral transaction, including amount, currency, and transaction
             * details.
             */
            fun collateral(collateral: Collateral) = collateral(JsonField.of(collateral))

            /**
             * Sets [Builder.collateral] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collateral] with a well-typed [Collateral] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collateral(collateral: JsonField<Collateral>) = apply {
                this.collateral = collateral
            }

            /** The type of transaction, in this case, a collateral transaction */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember1].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .collateral()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember1 =
                UnionMember1(
                    checkRequired("id", id),
                    checkRequired("collateral", collateral),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember1 = apply {
            if (validated) {
                return@apply
            }

            id()
            collateral().validate()
            type().validate()
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
            (if (id.asKnown() == null) 0 else 1) +
                (collateral.asKnown()?.validity() ?: 0) +
                (type.asKnown()?.validity() ?: 0)

        /**
         * Details of the collateral transaction, including amount, currency, and transaction
         * details.
         */
        class Collateral
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val chainId: JsonField<Long>,
            private val currency: JsonField<String>,
            private val transactionHash: JsonField<String>,
            private val walletAddress: JsonField<String>,
            private val companyId: JsonField<String>,
            private val memo: JsonField<String>,
            private val postedAt: JsonField<OffsetDateTime>,
            private val userId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("chainId")
                @ExcludeMissing
                chainId: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transactionHash")
                @ExcludeMissing
                transactionHash: JsonField<String> = JsonMissing.of(),
                @JsonProperty("walletAddress")
                @ExcludeMissing
                walletAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("companyId")
                @ExcludeMissing
                companyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postedAt")
                @ExcludeMissing
                postedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            ) : this(
                amount,
                chainId,
                currency,
                transactionHash,
                walletAddress,
                companyId,
                memo,
                postedAt,
                userId,
                mutableMapOf(),
            )

            /**
             * The amount of the collateral transaction, in cents
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * The chain ID (base-10 number) that the collateral transaction is on
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun chainId(): Long = chainId.getRequired("chainId")

            /**
             * The currency of the collateral transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The hash of the collateral transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transactionHash(): String = transactionHash.getRequired("transactionHash")

            /**
             * The wallet address the collateral was added from
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun walletAddress(): String = walletAddress.getRequired("walletAddress")

            /**
             * The identifier of the company under which the collateral transaction was made
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun companyId(): String? = companyId.getNullable("companyId")

            /**
             * A memo or note associated with the collateral transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun memo(): String? = memo.getNullable("memo")

            /**
             * The time at which the collateral transaction was posted
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun postedAt(): OffsetDateTime? = postedAt.getNullable("postedAt")

            /**
             * The identifier of the user who provided the collateral
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun userId(): String? = userId.getNullable("userId")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [chainId].
             *
             * Unlike [chainId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chainId") @ExcludeMissing fun _chainId(): JsonField<Long> = chainId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [transactionHash].
             *
             * Unlike [transactionHash], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transactionHash")
            @ExcludeMissing
            fun _transactionHash(): JsonField<String> = transactionHash

            /**
             * Returns the raw JSON value of [walletAddress].
             *
             * Unlike [walletAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("walletAddress")
            @ExcludeMissing
            fun _walletAddress(): JsonField<String> = walletAddress

            /**
             * Returns the raw JSON value of [companyId].
             *
             * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("companyId")
            @ExcludeMissing
            fun _companyId(): JsonField<String> = companyId

            /**
             * Returns the raw JSON value of [memo].
             *
             * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

            /**
             * Returns the raw JSON value of [postedAt].
             *
             * Unlike [postedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postedAt")
            @ExcludeMissing
            fun _postedAt(): JsonField<OffsetDateTime> = postedAt

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

                /**
                 * Returns a mutable builder for constructing an instance of [Collateral].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .chainId()
                 * .currency()
                 * .transactionHash()
                 * .walletAddress()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Collateral]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var chainId: JsonField<Long>? = null
                private var currency: JsonField<String>? = null
                private var transactionHash: JsonField<String>? = null
                private var walletAddress: JsonField<String>? = null
                private var companyId: JsonField<String> = JsonMissing.of()
                private var memo: JsonField<String> = JsonMissing.of()
                private var postedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(collateral: Collateral) = apply {
                    amount = collateral.amount
                    chainId = collateral.chainId
                    currency = collateral.currency
                    transactionHash = collateral.transactionHash
                    walletAddress = collateral.walletAddress
                    companyId = collateral.companyId
                    memo = collateral.memo
                    postedAt = collateral.postedAt
                    userId = collateral.userId
                    additionalProperties = collateral.additionalProperties.toMutableMap()
                }

                /** The amount of the collateral transaction, in cents */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** The chain ID (base-10 number) that the collateral transaction is on */
                fun chainId(chainId: Long) = chainId(JsonField.of(chainId))

                /**
                 * Sets [Builder.chainId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chainId] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun chainId(chainId: JsonField<Long>) = apply { this.chainId = chainId }

                /** The currency of the collateral transaction */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The hash of the collateral transaction */
                fun transactionHash(transactionHash: String) =
                    transactionHash(JsonField.of(transactionHash))

                /**
                 * Sets [Builder.transactionHash] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionHash] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun transactionHash(transactionHash: JsonField<String>) = apply {
                    this.transactionHash = transactionHash
                }

                /** The wallet address the collateral was added from */
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

                /** The identifier of the company under which the collateral transaction was made */
                fun companyId(companyId: String) = companyId(JsonField.of(companyId))

                /**
                 * Sets [Builder.companyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

                /** A memo or note associated with the collateral transaction */
                fun memo(memo: String) = memo(JsonField.of(memo))

                /**
                 * Sets [Builder.memo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memo] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun memo(memo: JsonField<String>) = apply { this.memo = memo }

                /** The time at which the collateral transaction was posted */
                fun postedAt(postedAt: OffsetDateTime) = postedAt(JsonField.of(postedAt))

                /**
                 * Sets [Builder.postedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun postedAt(postedAt: JsonField<OffsetDateTime>) = apply {
                    this.postedAt = postedAt
                }

                /** The identifier of the user who provided the collateral */
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
                 * Returns an immutable instance of [Collateral].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .chainId()
                 * .currency()
                 * .transactionHash()
                 * .walletAddress()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Collateral =
                    Collateral(
                        checkRequired("amount", amount),
                        checkRequired("chainId", chainId),
                        checkRequired("currency", currency),
                        checkRequired("transactionHash", transactionHash),
                        checkRequired("walletAddress", walletAddress),
                        companyId,
                        memo,
                        postedAt,
                        userId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Collateral = apply {
                if (validated) {
                    return@apply
                }

                amount()
                chainId()
                currency()
                transactionHash()
                walletAddress()
                companyId()
                memo()
                postedAt()
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
            internal fun validity(): Int =
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (chainId.asKnown() == null) 0 else 1) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (transactionHash.asKnown() == null) 0 else 1) +
                    (if (walletAddress.asKnown() == null) 0 else 1) +
                    (if (companyId.asKnown() == null) 0 else 1) +
                    (if (memo.asKnown() == null) 0 else 1) +
                    (if (postedAt.asKnown() == null) 0 else 1) +
                    (if (userId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Collateral &&
                    amount == other.amount &&
                    chainId == other.chainId &&
                    currency == other.currency &&
                    transactionHash == other.transactionHash &&
                    walletAddress == other.walletAddress &&
                    companyId == other.companyId &&
                    memo == other.memo &&
                    postedAt == other.postedAt &&
                    userId == other.userId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    chainId,
                    currency,
                    transactionHash,
                    walletAddress,
                    companyId,
                    memo,
                    postedAt,
                    userId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Collateral{amount=$amount, chainId=$chainId, currency=$currency, transactionHash=$transactionHash, walletAddress=$walletAddress, companyId=$companyId, memo=$memo, postedAt=$postedAt, userId=$userId, additionalProperties=$additionalProperties}"
        }

        /** The type of transaction, in this case, a collateral transaction */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val COLLATERAL = of("collateral")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                COLLATERAL
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COLLATERAL,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    COLLATERAL -> Value.COLLATERAL
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
                    COLLATERAL -> Known.COLLATERAL
                    else -> throw RainHelloWorldInvalidDataException("Unknown Type: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember1 &&
                id == other.id &&
                collateral == other.collateral &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, collateral, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember1{id=$id, collateral=$collateral, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Represents a payment transaction, where a payment is made for a particular service or
     * product.
     */
    class UnionMember2
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val payment: JsonField<Payment>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment") @ExcludeMissing payment: JsonField<Payment> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(id, payment, type, mutableMapOf())

        /**
         * The unique identifier of the payment transaction
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Details of the payment transaction, including amount, currency, and status.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payment(): Payment = payment.getRequired("payment")

        /**
         * The type of transaction
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [payment].
         *
         * Unlike [payment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment") @ExcludeMissing fun _payment(): JsonField<Payment> = payment

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [UnionMember2].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .payment()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UnionMember2]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var payment: JsonField<Payment>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unionMember2: UnionMember2) = apply {
                id = unionMember2.id
                payment = unionMember2.payment
                type = unionMember2.type
                additionalProperties = unionMember2.additionalProperties.toMutableMap()
            }

            /** The unique identifier of the payment transaction */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Details of the payment transaction, including amount, currency, and status. */
            fun payment(payment: Payment) = payment(JsonField.of(payment))

            /**
             * Sets [Builder.payment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payment] with a well-typed [Payment] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payment(payment: JsonField<Payment>) = apply { this.payment = payment }

            /** The type of transaction */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember2].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .payment()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember2 =
                UnionMember2(
                    checkRequired("id", id),
                    checkRequired("payment", payment),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember2 = apply {
            if (validated) {
                return@apply
            }

            id()
            payment().validate()
            type().validate()
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
            (if (id.asKnown() == null) 0 else 1) +
                (payment.asKnown()?.validity() ?: 0) +
                (type.asKnown()?.validity() ?: 0)

        /** Details of the payment transaction, including amount, currency, and status. */
        class Payment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<String>,
            private val status: JsonField<Status>,
            private val chainId: JsonField<Long>,
            private val companyId: JsonField<String>,
            private val memo: JsonField<String>,
            private val postedAt: JsonField<String>,
            private val transactionHash: JsonField<String>,
            private val userId: JsonField<String>,
            private val walletAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("chainId")
                @ExcludeMissing
                chainId: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("companyId")
                @ExcludeMissing
                companyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postedAt")
                @ExcludeMissing
                postedAt: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transactionHash")
                @ExcludeMissing
                transactionHash: JsonField<String> = JsonMissing.of(),
                @JsonProperty("userId")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("walletAddress")
                @ExcludeMissing
                walletAddress: JsonField<String> = JsonMissing.of(),
            ) : this(
                amount,
                currency,
                status,
                chainId,
                companyId,
                memo,
                postedAt,
                transactionHash,
                userId,
                walletAddress,
                mutableMapOf(),
            )

            /**
             * The amount of the transaction, in cents
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The currency of the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The status of the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * The chain ID (base-10 number) that the payment transaction is on
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun chainId(): Long? = chainId.getNullable("chainId")

            /**
             * The identifier of the company under which the payment transaction was made
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun companyId(): String? = companyId.getNullable("companyId")

            /**
             * The memo or note associated with the transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun memo(): String? = memo.getNullable("memo")

            /**
             * The time at which the payment transaction was posted
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun postedAt(): String? = postedAt.getNullable("postedAt")

            /**
             * The hash of the payment transaction
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun transactionHash(): String? = transactionHash.getNullable("transactionHash")

            /**
             * The identifier of the user who made the payment
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun userId(): String? = userId.getNullable("userId")

            /**
             * The wallet address from which the payment was made
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun walletAddress(): String? = walletAddress.getNullable("walletAddress")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [chainId].
             *
             * Unlike [chainId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chainId") @ExcludeMissing fun _chainId(): JsonField<Long> = chainId

            /**
             * Returns the raw JSON value of [companyId].
             *
             * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("companyId")
            @ExcludeMissing
            fun _companyId(): JsonField<String> = companyId

            /**
             * Returns the raw JSON value of [memo].
             *
             * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

            /**
             * Returns the raw JSON value of [postedAt].
             *
             * Unlike [postedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postedAt") @ExcludeMissing fun _postedAt(): JsonField<String> = postedAt

            /**
             * Returns the raw JSON value of [transactionHash].
             *
             * Unlike [transactionHash], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transactionHash")
            @ExcludeMissing
            fun _transactionHash(): JsonField<String> = transactionHash

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
                 * Returns a mutable builder for constructing an instance of [Payment].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .currency()
                 * .status()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Payment]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<String>? = null
                private var status: JsonField<Status>? = null
                private var chainId: JsonField<Long> = JsonMissing.of()
                private var companyId: JsonField<String> = JsonMissing.of()
                private var memo: JsonField<String> = JsonMissing.of()
                private var postedAt: JsonField<String> = JsonMissing.of()
                private var transactionHash: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var walletAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(payment: Payment) = apply {
                    amount = payment.amount
                    currency = payment.currency
                    status = payment.status
                    chainId = payment.chainId
                    companyId = payment.companyId
                    memo = payment.memo
                    postedAt = payment.postedAt
                    transactionHash = payment.transactionHash
                    userId = payment.userId
                    walletAddress = payment.walletAddress
                    additionalProperties = payment.additionalProperties.toMutableMap()
                }

                /** The amount of the transaction, in cents */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The currency of the transaction */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The status of the transaction */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** The chain ID (base-10 number) that the payment transaction is on */
                fun chainId(chainId: Long) = chainId(JsonField.of(chainId))

                /**
                 * Sets [Builder.chainId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chainId] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun chainId(chainId: JsonField<Long>) = apply { this.chainId = chainId }

                /** The identifier of the company under which the payment transaction was made */
                fun companyId(companyId: String) = companyId(JsonField.of(companyId))

                /**
                 * Sets [Builder.companyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

                /** The memo or note associated with the transaction */
                fun memo(memo: String) = memo(JsonField.of(memo))

                /**
                 * Sets [Builder.memo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memo] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun memo(memo: JsonField<String>) = apply { this.memo = memo }

                /** The time at which the payment transaction was posted */
                fun postedAt(postedAt: String) = postedAt(JsonField.of(postedAt))

                /**
                 * Sets [Builder.postedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postedAt] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postedAt(postedAt: JsonField<String>) = apply { this.postedAt = postedAt }

                /** The hash of the payment transaction */
                fun transactionHash(transactionHash: String) =
                    transactionHash(JsonField.of(transactionHash))

                /**
                 * Sets [Builder.transactionHash] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionHash] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun transactionHash(transactionHash: JsonField<String>) = apply {
                    this.transactionHash = transactionHash
                }

                /** The identifier of the user who made the payment */
                fun userId(userId: String) = userId(JsonField.of(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                /** The wallet address from which the payment was made */
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
                 * Returns an immutable instance of [Payment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .currency()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Payment =
                    Payment(
                        checkRequired("amount", amount),
                        checkRequired("currency", currency),
                        checkRequired("status", status),
                        chainId,
                        companyId,
                        memo,
                        postedAt,
                        transactionHash,
                        userId,
                        walletAddress,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Payment = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
                status().validate()
                chainId()
                companyId()
                memo()
                postedAt()
                transactionHash()
                userId()
                walletAddress()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (if (chainId.asKnown() == null) 0 else 1) +
                    (if (companyId.asKnown() == null) 0 else 1) +
                    (if (memo.asKnown() == null) 0 else 1) +
                    (if (postedAt.asKnown() == null) 0 else 1) +
                    (if (transactionHash.asKnown() == null) 0 else 1) +
                    (if (userId.asKnown() == null) 0 else 1) +
                    (if (walletAddress.asKnown() == null) 0 else 1)

            /** The status of the transaction */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PENDING = of("pending")

                    val COMPLETED = of("completed")

                    fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    PENDING,
                    COMPLETED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PENDING,
                    COMPLETED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
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
                        PENDING -> Value.PENDING
                        COMPLETED -> Value.COMPLETED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws RainHelloWorldInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        PENDING -> Known.PENDING
                        COMPLETED -> Known.COMPLETED
                        else -> throw RainHelloWorldInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws RainHelloWorldInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw RainHelloWorldInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Status = apply {
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payment &&
                    amount == other.amount &&
                    currency == other.currency &&
                    status == other.status &&
                    chainId == other.chainId &&
                    companyId == other.companyId &&
                    memo == other.memo &&
                    postedAt == other.postedAt &&
                    transactionHash == other.transactionHash &&
                    userId == other.userId &&
                    walletAddress == other.walletAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    currency,
                    status,
                    chainId,
                    companyId,
                    memo,
                    postedAt,
                    transactionHash,
                    userId,
                    walletAddress,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payment{amount=$amount, currency=$currency, status=$status, chainId=$chainId, companyId=$companyId, memo=$memo, postedAt=$postedAt, transactionHash=$transactionHash, userId=$userId, walletAddress=$walletAddress, additionalProperties=$additionalProperties}"
        }

        /** The type of transaction */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val PAYMENT = of("payment")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PAYMENT
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PAYMENT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    PAYMENT -> Value.PAYMENT
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
                    PAYMENT -> Known.PAYMENT
                    else -> throw RainHelloWorldInvalidDataException("Unknown Type: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember2 &&
                id == other.id &&
                payment == other.payment &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, payment, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember2{id=$id, payment=$payment, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Represents a fee transaction, where a fee is charged for a service or product. */
    class UnionMember3
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val fee: JsonField<Fee>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fee") @ExcludeMissing fee: JsonField<Fee> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(id, fee, type, mutableMapOf())

        /**
         * The identifier of the fee transaction
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Details of the fee transaction, including amount, description, and status.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fee(): Fee = fee.getRequired("fee")

        /**
         * The type of transaction, in this case, a fee transaction
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [fee].
         *
         * Unlike [fee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fee") @ExcludeMissing fun _fee(): JsonField<Fee> = fee

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [UnionMember3].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .fee()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UnionMember3]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var fee: JsonField<Fee>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unionMember3: UnionMember3) = apply {
                id = unionMember3.id
                fee = unionMember3.fee
                type = unionMember3.type
                additionalProperties = unionMember3.additionalProperties.toMutableMap()
            }

            /** The identifier of the fee transaction */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Details of the fee transaction, including amount, description, and status. */
            fun fee(fee: Fee) = fee(JsonField.of(fee))

            /**
             * Sets [Builder.fee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fee] with a well-typed [Fee] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fee(fee: JsonField<Fee>) = apply { this.fee = fee }

            /** The type of transaction, in this case, a fee transaction */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [UnionMember3].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .fee()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember3 =
                UnionMember3(
                    checkRequired("id", id),
                    checkRequired("fee", fee),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember3 = apply {
            if (validated) {
                return@apply
            }

            id()
            fee().validate()
            type().validate()
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
            (if (id.asKnown() == null) 0 else 1) +
                (fee.asKnown()?.validity() ?: 0) +
                (type.asKnown()?.validity() ?: 0)

        /** Details of the fee transaction, including amount, description, and status. */
        class Fee
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val companyId: JsonField<String>,
            private val description: JsonField<String>,
            private val postedAt: JsonField<OffsetDateTime>,
            private val userId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("companyId")
                @ExcludeMissing
                companyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postedAt")
                @ExcludeMissing
                postedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, companyId, description, postedAt, userId, mutableMapOf())

            /**
             * The amount of the fee, in cents
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The identifier of the company to which the fee was charged
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun companyId(): String? = companyId.getNullable("companyId")

            /**
             * The description of the fee
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * The time at which the fee was posted
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun postedAt(): OffsetDateTime? = postedAt.getNullable("postedAt")

            /**
             * The identifier of the user to whom the fee was charged
             *
             * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun userId(): String? = userId.getNullable("userId")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [companyId].
             *
             * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("companyId")
            @ExcludeMissing
            fun _companyId(): JsonField<String> = companyId

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [postedAt].
             *
             * Unlike [postedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postedAt")
            @ExcludeMissing
            fun _postedAt(): JsonField<OffsetDateTime> = postedAt

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

                /**
                 * Returns a mutable builder for constructing an instance of [Fee].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Fee]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var companyId: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var postedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fee: Fee) = apply {
                    amount = fee.amount
                    companyId = fee.companyId
                    description = fee.description
                    postedAt = fee.postedAt
                    userId = fee.userId
                    additionalProperties = fee.additionalProperties.toMutableMap()
                }

                /** The amount of the fee, in cents */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The identifier of the company to which the fee was charged */
                fun companyId(companyId: String) = companyId(JsonField.of(companyId))

                /**
                 * Sets [Builder.companyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

                /** The description of the fee */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** The time at which the fee was posted */
                fun postedAt(postedAt: OffsetDateTime) = postedAt(JsonField.of(postedAt))

                /**
                 * Sets [Builder.postedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun postedAt(postedAt: JsonField<OffsetDateTime>) = apply {
                    this.postedAt = postedAt
                }

                /** The identifier of the user to whom the fee was charged */
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
                 * Returns an immutable instance of [Fee].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Fee =
                    Fee(
                        checkRequired("amount", amount),
                        companyId,
                        description,
                        postedAt,
                        userId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Fee = apply {
                if (validated) {
                    return@apply
                }

                amount()
                companyId()
                description()
                postedAt()
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
            internal fun validity(): Int =
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (companyId.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (postedAt.asKnown() == null) 0 else 1) +
                    (if (userId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Fee &&
                    amount == other.amount &&
                    companyId == other.companyId &&
                    description == other.description &&
                    postedAt == other.postedAt &&
                    userId == other.userId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, companyId, description, postedAt, userId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Fee{amount=$amount, companyId=$companyId, description=$description, postedAt=$postedAt, userId=$userId, additionalProperties=$additionalProperties}"
        }

        /** The type of transaction, in this case, a fee transaction */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val FEE = of("fee")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                FEE
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FEE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    FEE -> Value.FEE
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
                    FEE -> Known.FEE
                    else -> throw RainHelloWorldInvalidDataException("Unknown Type: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember3 &&
                id == other.id &&
                fee == other.fee &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, fee, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember3{id=$id, fee=$fee, type=$type, additionalProperties=$additionalProperties}"
    }
}
