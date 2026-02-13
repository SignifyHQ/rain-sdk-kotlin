// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.models.disputes.IssuingDispute
import com.rain_sdk.api.models.transactions.IssuingTransaction
import com.rain_sdk.api.models.transactions.TransactionCreateDisputeParams
import com.rain_sdk.api.models.transactions.TransactionListParams
import com.rain_sdk.api.models.transactions.TransactionRetrieveParams
import com.rain_sdk.api.models.transactions.TransactionUpdateParams
import com.rain_sdk.api.services.async.transactions.ReceiptServiceAsync

interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionServiceAsync

    fun receipt(): ReceiptServiceAsync

    /**
     * This endpoint retrieves a transaction by its unique ID. The transaction information returned
     * includes details such as the transaction type, amount, and status.
     */
    suspend fun retrieve(
        transactionId: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingTransaction =
        retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingTransaction

    /** @see retrieve */
    suspend fun retrieve(
        transactionId: String,
        requestOptions: RequestOptions,
    ): IssuingTransaction =
        retrieve(transactionId, TransactionRetrieveParams.none(), requestOptions)

    /**
     * This endpoint allows updating a specific transaction by its ID. You can modify the
     * transaction's memo or other editable fields.
     */
    suspend fun update(
        transactionId: String,
        params: TransactionUpdateParams = TransactionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    suspend fun update(transactionId: String, requestOptions: RequestOptions) =
        update(transactionId, TransactionUpdateParams.none(), requestOptions)

    /**
     * This endpoint retrieves all transactions associated with corporate cards, users, or specific
     * cards.
     */
    suspend fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingTransaction>

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): List<IssuingTransaction> =
        list(TransactionListParams.none(), requestOptions)

    /**
     * This endpoint allows the creation of a dispute for a specific transaction. The dispute can
     * include textual evidence to support the claim.
     */
    suspend fun createDispute(
        transactionId: String,
        params: TransactionCreateDisputeParams = TransactionCreateDisputeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingDispute =
        createDispute(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see createDispute */
    suspend fun createDispute(
        params: TransactionCreateDisputeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingDispute

    /** @see createDispute */
    suspend fun createDispute(
        transactionId: String,
        requestOptions: RequestOptions,
    ): IssuingDispute =
        createDispute(transactionId, TransactionCreateDisputeParams.none(), requestOptions)

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionServiceAsync.WithRawResponse

        fun receipt(): ReceiptServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /transactions/{transactionId}`, but is otherwise the
         * same as [TransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            transactionId: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingTransaction> =
            retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingTransaction>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            transactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingTransaction> =
            retrieve(transactionId, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /transactions/{transactionId}`, but is otherwise
         * the same as [TransactionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            transactionId: String,
            params: TransactionUpdateParams = TransactionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: TransactionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        suspend fun update(transactionId: String, requestOptions: RequestOptions): HttpResponse =
            update(transactionId, TransactionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingTransaction>>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<IssuingTransaction>> =
            list(TransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /transactions/{transactionId}/disputes`, but is
         * otherwise the same as [TransactionServiceAsync.createDispute].
         */
        @MustBeClosed
        suspend fun createDispute(
            transactionId: String,
            params: TransactionCreateDisputeParams = TransactionCreateDisputeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingDispute> =
            createDispute(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see createDispute */
        @MustBeClosed
        suspend fun createDispute(
            params: TransactionCreateDisputeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingDispute>

        /** @see createDispute */
        @MustBeClosed
        suspend fun createDispute(
            transactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingDispute> =
            createDispute(transactionId, TransactionCreateDisputeParams.none(), requestOptions)
    }
}
