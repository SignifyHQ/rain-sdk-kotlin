// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.cards

import com.rain_hello_world.api.core.Params
import com.rain_hello_world.api.core.http.Headers
import com.rain_hello_world.api.core.http.QueryParams
import java.util.Objects

/**
 * Retrieves all cards associated with a user or company. You can filter by user or company ID and
 * card status.
 */
class CardListParams
private constructor(
    private val companyId: String?,
    private val cursor: String?,
    private val limit: Long?,
    private val status: IssuingCardStatus?,
    private val userId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** For corporate cards, the identifier of the company to get cards for */
    fun companyId(): String? = companyId

    /** The ID of the resource after which to start fetching */
    fun cursor(): String? = cursor

    /** The number of resources to fetch */
    fun limit(): Long? = limit

    /** Filter cards by status */
    fun status(): IssuingCardStatus? = status

    /** The identifier of the user to get cards for */
    fun userId(): String? = userId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CardListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CardListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [CardListParams]. */
    class Builder internal constructor() {

        private var companyId: String? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var status: IssuingCardStatus? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(cardListParams: CardListParams) = apply {
            companyId = cardListParams.companyId
            cursor = cardListParams.cursor
            limit = cardListParams.limit
            status = cardListParams.status
            userId = cardListParams.userId
            additionalHeaders = cardListParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardListParams.additionalQueryParams.toBuilder()
        }

        /** For corporate cards, the identifier of the company to get cards for */
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

        /** Filter cards by status */
        fun status(status: IssuingCardStatus?) = apply { this.status = status }

        /** The identifier of the user to get cards for */
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
         * Returns an immutable instance of [CardListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardListParams =
            CardListParams(
                companyId,
                cursor,
                limit,
                status,
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                companyId?.let { put("companyId", it) }
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                status?.let { put("status", it.toString()) }
                userId?.let { put("userId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardListParams &&
            companyId == other.companyId &&
            cursor == other.cursor &&
            limit == other.limit &&
            status == other.status &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            companyId,
            cursor,
            limit,
            status,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CardListParams{companyId=$companyId, cursor=$cursor, limit=$limit, status=$status, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
