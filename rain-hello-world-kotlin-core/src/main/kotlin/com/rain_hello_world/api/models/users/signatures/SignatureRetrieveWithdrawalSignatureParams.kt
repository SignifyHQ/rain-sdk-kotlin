// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.users.signatures

import com.rain_hello_world.api.core.Params
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.core.http.Headers
import com.rain_hello_world.api.core.http.QueryParams
import java.util.Objects

/**
 * This endpoint retrieves the withdrawal signature for a specific user. The signature is required
 * to authorize a withdrawal transaction for the user.
 */
class SignatureRetrieveWithdrawalSignatureParams
private constructor(
    private val userId: String?,
    private val token: String,
    private val adminAddress: String,
    private val amount: String,
    private val recipientAddress: String,
    private val chainId: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun userId(): String? = userId

    /**
     * The address of the token that the withdrawal should be made in, as a hex string for EVM or
     * base58 string for Solana
     */
    fun token(): String = token

    /**
     * The address of the admin making the payment, as a hex string for EVM or base58 string for
     * Solana
     */
    fun adminAddress(): String = adminAddress

    /** The amount of token that is being withdrawn */
    fun amount(): String = amount

    /**
     * The address the withdrawal should be sent to, as a hex string for EVM or base58 string for
     * Solana
     */
    fun recipientAddress(): String = recipientAddress

    /** The chain ID (base-10 number) that the smart contract is deployed on */
    fun chainId(): Long? = chainId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SignatureRetrieveWithdrawalSignatureParams].
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .adminAddress()
         * .amount()
         * .recipientAddress()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SignatureRetrieveWithdrawalSignatureParams]. */
    class Builder internal constructor() {

        private var userId: String? = null
        private var token: String? = null
        private var adminAddress: String? = null
        private var amount: String? = null
        private var recipientAddress: String? = null
        private var chainId: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            signatureRetrieveWithdrawalSignatureParams: SignatureRetrieveWithdrawalSignatureParams
        ) = apply {
            userId = signatureRetrieveWithdrawalSignatureParams.userId
            token = signatureRetrieveWithdrawalSignatureParams.token
            adminAddress = signatureRetrieveWithdrawalSignatureParams.adminAddress
            amount = signatureRetrieveWithdrawalSignatureParams.amount
            recipientAddress = signatureRetrieveWithdrawalSignatureParams.recipientAddress
            chainId = signatureRetrieveWithdrawalSignatureParams.chainId
            additionalHeaders =
                signatureRetrieveWithdrawalSignatureParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                signatureRetrieveWithdrawalSignatureParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: String?) = apply { this.userId = userId }

        /**
         * The address of the token that the withdrawal should be made in, as a hex string for EVM
         * or base58 string for Solana
         */
        fun token(token: String) = apply { this.token = token }

        /**
         * The address of the admin making the payment, as a hex string for EVM or base58 string for
         * Solana
         */
        fun adminAddress(adminAddress: String) = apply { this.adminAddress = adminAddress }

        /** The amount of token that is being withdrawn */
        fun amount(amount: String) = apply { this.amount = amount }

        /**
         * The address the withdrawal should be sent to, as a hex string for EVM or base58 string
         * for Solana
         */
        fun recipientAddress(recipientAddress: String) = apply {
            this.recipientAddress = recipientAddress
        }

        /** The chain ID (base-10 number) that the smart contract is deployed on */
        fun chainId(chainId: Long?) = apply { this.chainId = chainId }

        /**
         * Alias for [Builder.chainId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun chainId(chainId: Long) = chainId(chainId as Long?)

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
         * Returns an immutable instance of [SignatureRetrieveWithdrawalSignatureParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .adminAddress()
         * .amount()
         * .recipientAddress()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SignatureRetrieveWithdrawalSignatureParams =
            SignatureRetrieveWithdrawalSignatureParams(
                userId,
                checkRequired("token", token),
                checkRequired("adminAddress", adminAddress),
                checkRequired("amount", amount),
                checkRequired("recipientAddress", recipientAddress),
                chainId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> userId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("token", token)
                put("adminAddress", adminAddress)
                put("amount", amount)
                put("recipientAddress", recipientAddress)
                chainId?.let { put("chainId", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SignatureRetrieveWithdrawalSignatureParams &&
            userId == other.userId &&
            token == other.token &&
            adminAddress == other.adminAddress &&
            amount == other.amount &&
            recipientAddress == other.recipientAddress &&
            chainId == other.chainId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            userId,
            token,
            adminAddress,
            amount,
            recipientAddress,
            chainId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SignatureRetrieveWithdrawalSignatureParams{userId=$userId, token=$token, adminAddress=$adminAddress, amount=$amount, recipientAddress=$recipientAddress, chainId=$chainId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
