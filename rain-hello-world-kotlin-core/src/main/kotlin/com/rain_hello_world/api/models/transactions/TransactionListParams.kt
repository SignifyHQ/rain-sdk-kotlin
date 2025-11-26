// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.transactions

import com.fasterxml.jackson.annotation.JsonCreator
import com.rain_hello_world.api.core.Enum
import com.rain_hello_world.api.core.JsonField
import com.rain_hello_world.api.core.Params
import com.rain_hello_world.api.core.http.Headers
import com.rain_hello_world.api.core.http.QueryParams
import com.rain_hello_world.api.core.toImmutable
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * This endpoint retrieves all transactions associated with corporate cards, users, or specific
 * cards.
 */
class TransactionListParams
private constructor(
    private val authorizedAfter: OffsetDateTime?,
    private val authorizedBefore: OffsetDateTime?,
    private val cardId: String?,
    private val companyId: String?,
    private val cursor: String?,
    private val limit: Long?,
    private val postedAfter: OffsetDateTime?,
    private val postedBefore: OffsetDateTime?,
    private val transactionHash: String?,
    private val type: List<Type>?,
    private val userId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter transactions authorized after a specific date */
    fun authorizedAfter(): OffsetDateTime? = authorizedAfter

    /** Filter transactions authorized before a specific date */
    fun authorizedBefore(): OffsetDateTime? = authorizedBefore

    /** The ID of the card to get transactions for */
    fun cardId(): String? = cardId

    /** For corporate cards, the identifier of the company to get transactions for */
    fun companyId(): String? = companyId

    /** The ID of the resource after which to start fetching */
    fun cursor(): String? = cursor

    /** The number of resources to fetch */
    fun limit(): Long? = limit

    /** Filter transactions posted after a specific date */
    fun postedAfter(): OffsetDateTime? = postedAfter

    /** Filter transactions posted before a specific date */
    fun postedBefore(): OffsetDateTime? = postedBefore

    /** The hash of the transaction to retrieve */
    fun transactionHash(): String? = transactionHash

    /** The type of transactions to retrieve */
    fun type(): List<Type>? = type

    /** The ID of the user to get transactions for */
    fun userId(): String? = userId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): TransactionListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TransactionListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TransactionListParams]. */
    class Builder internal constructor() {

        private var authorizedAfter: OffsetDateTime? = null
        private var authorizedBefore: OffsetDateTime? = null
        private var cardId: String? = null
        private var companyId: String? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var postedAfter: OffsetDateTime? = null
        private var postedBefore: OffsetDateTime? = null
        private var transactionHash: String? = null
        private var type: MutableList<Type>? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionListParams: TransactionListParams) = apply {
            authorizedAfter = transactionListParams.authorizedAfter
            authorizedBefore = transactionListParams.authorizedBefore
            cardId = transactionListParams.cardId
            companyId = transactionListParams.companyId
            cursor = transactionListParams.cursor
            limit = transactionListParams.limit
            postedAfter = transactionListParams.postedAfter
            postedBefore = transactionListParams.postedBefore
            transactionHash = transactionListParams.transactionHash
            type = transactionListParams.type?.toMutableList()
            userId = transactionListParams.userId
            additionalHeaders = transactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionListParams.additionalQueryParams.toBuilder()
        }

        /** Filter transactions authorized after a specific date */
        fun authorizedAfter(authorizedAfter: OffsetDateTime?) = apply {
            this.authorizedAfter = authorizedAfter
        }

        /** Filter transactions authorized before a specific date */
        fun authorizedBefore(authorizedBefore: OffsetDateTime?) = apply {
            this.authorizedBefore = authorizedBefore
        }

        /** The ID of the card to get transactions for */
        fun cardId(cardId: String?) = apply { this.cardId = cardId }

        /** For corporate cards, the identifier of the company to get transactions for */
        fun companyId(companyId: String?) = apply { this.companyId = companyId }

        /** The ID of the resource after which to start fetching */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** The number of resources to fetch */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Filter transactions posted after a specific date */
        fun postedAfter(postedAfter: OffsetDateTime?) = apply { this.postedAfter = postedAfter }

        /** Filter transactions posted before a specific date */
        fun postedBefore(postedBefore: OffsetDateTime?) = apply { this.postedBefore = postedBefore }

        /** The hash of the transaction to retrieve */
        fun transactionHash(transactionHash: String?) = apply {
            this.transactionHash = transactionHash
        }

        /** The type of transactions to retrieve */
        fun type(type: List<Type>?) = apply { this.type = type?.toMutableList() }

        /**
         * Adds a single [Type] to [Builder.type].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addType(type: Type) = apply {
            this.type = (this.type ?: mutableListOf()).apply { add(type) }
        }

        /** The ID of the user to get transactions for */
        fun userId(userId: String?) = apply { this.userId = userId }

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
         * Returns an immutable instance of [TransactionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TransactionListParams =
            TransactionListParams(
                authorizedAfter,
                authorizedBefore,
                cardId,
                companyId,
                cursor,
                limit,
                postedAfter,
                postedBefore,
                transactionHash,
                type?.toImmutable(),
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                authorizedAfter?.let {
                    put("authorizedAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                authorizedBefore?.let {
                    put("authorizedBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                cardId?.let { put("cardId", it) }
                companyId?.let { put("companyId", it) }
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                postedAfter?.let {
                    put("postedAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                postedBefore?.let {
                    put("postedBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                transactionHash?.let { put("transactionHash", it) }
                type?.let { put("type", it.joinToString(",") { it.toString() }) }
                userId?.let { put("userId", it) }
                putAll(additionalQueryParams)
            }
            .build()

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

            val SPEND = of("spend")

            val COLLATERAL = of("collateral")

            val PAYMENT = of("payment")

            val FEE = of("fee")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SPEND,
            COLLATERAL,
            PAYMENT,
            FEE,
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
            SPEND,
            COLLATERAL,
            PAYMENT,
            FEE,
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
                SPEND -> Value.SPEND
                COLLATERAL -> Value.COLLATERAL
                PAYMENT -> Value.PAYMENT
                FEE -> Value.FEE
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
                SPEND -> Known.SPEND
                COLLATERAL -> Known.COLLATERAL
                PAYMENT -> Known.PAYMENT
                FEE -> Known.FEE
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionListParams &&
            authorizedAfter == other.authorizedAfter &&
            authorizedBefore == other.authorizedBefore &&
            cardId == other.cardId &&
            companyId == other.companyId &&
            cursor == other.cursor &&
            limit == other.limit &&
            postedAfter == other.postedAfter &&
            postedBefore == other.postedBefore &&
            transactionHash == other.transactionHash &&
            type == other.type &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            authorizedAfter,
            authorizedBefore,
            cardId,
            companyId,
            cursor,
            limit,
            postedAfter,
            postedBefore,
            transactionHash,
            type,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TransactionListParams{authorizedAfter=$authorizedAfter, authorizedBefore=$authorizedBefore, cardId=$cardId, companyId=$companyId, cursor=$cursor, limit=$limit, postedAfter=$postedAfter, postedBefore=$postedBefore, transactionHash=$transactionHash, type=$type, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
