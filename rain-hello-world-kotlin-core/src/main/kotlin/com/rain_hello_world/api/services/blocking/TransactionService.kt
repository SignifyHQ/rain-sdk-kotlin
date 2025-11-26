// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponse
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.disputes.IssuingDispute
import com.rain_hello_world.api.models.transactions.IssuingTransaction
import com.rain_hello_world.api.models.transactions.TransactionCreateDisputeParams
import com.rain_hello_world.api.models.transactions.TransactionListParams
import com.rain_hello_world.api.models.transactions.TransactionRetrieveParams
import com.rain_hello_world.api.models.transactions.TransactionUpdateParams
import com.rain_hello_world.api.services.blocking.transactions.ReceiptService

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionService

    fun receipt(): ReceiptService

    /**
     * This endpoint retrieves a transaction by its unique ID. The transaction information returned
     * includes details such as the transaction type, amount, and status.
     */
    fun retrieve(
        transactionId: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingTransaction =
        retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingTransaction

    /** @see retrieve */
    fun retrieve(transactionId: String, requestOptions: RequestOptions): IssuingTransaction =
        retrieve(transactionId, TransactionRetrieveParams.none(), requestOptions)

    /**
     * This endpoint allows updating a specific transaction by its ID. You can modify the
     * transaction's memo or other editable fields.
     */
    fun update(
        transactionId: String,
        params: TransactionUpdateParams = TransactionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see update */
    fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    fun update(transactionId: String, requestOptions: RequestOptions) =
        update(transactionId, TransactionUpdateParams.none(), requestOptions)

    /**
     * This endpoint retrieves all transactions associated with corporate cards, users, or specific
     * cards.
     */
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingTransaction>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<IssuingTransaction> =
        list(TransactionListParams.none(), requestOptions)

    /**
     * This endpoint allows the creation of a dispute for a specific transaction. The dispute can
     * include textual evidence to support the claim.
     */
    fun createDispute(
        transactionId: String,
        params: TransactionCreateDisputeParams = TransactionCreateDisputeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingDispute =
        createDispute(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see createDispute */
    fun createDispute(
        params: TransactionCreateDisputeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingDispute

    /** @see createDispute */
    fun createDispute(transactionId: String, requestOptions: RequestOptions): IssuingDispute =
        createDispute(transactionId, TransactionCreateDisputeParams.none(), requestOptions)

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionService.WithRawResponse

        fun receipt(): ReceiptService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /transactions/{transactionId}`, but is otherwise the
         * same as [TransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            transactionId: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingTransaction> =
            retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingTransaction>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            transactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingTransaction> =
            retrieve(transactionId, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /transactions/{transactionId}`, but is otherwise
         * the same as [TransactionService.update].
         */
        @MustBeClosed
        fun update(
            transactionId: String,
            params: TransactionUpdateParams = TransactionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: TransactionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(transactionId: String, requestOptions: RequestOptions): HttpResponse =
            update(transactionId, TransactionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /transactions`, but is otherwise the same as
         * [TransactionService.list].
         */
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingTransaction>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<IssuingTransaction>> =
            list(TransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /transactions/{transactionId}/disputes`, but is
         * otherwise the same as [TransactionService.createDispute].
         */
        @MustBeClosed
        fun createDispute(
            transactionId: String,
            params: TransactionCreateDisputeParams = TransactionCreateDisputeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingDispute> =
            createDispute(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see createDispute */
        @MustBeClosed
        fun createDispute(
            params: TransactionCreateDisputeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingDispute>

        /** @see createDispute */
        @MustBeClosed
        fun createDispute(
            transactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingDispute> =
            createDispute(transactionId, TransactionCreateDisputeParams.none(), requestOptions)
    }
}
