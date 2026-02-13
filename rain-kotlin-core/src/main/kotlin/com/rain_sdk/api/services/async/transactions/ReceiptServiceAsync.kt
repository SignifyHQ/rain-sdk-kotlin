// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async.transactions

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.models.transactions.receipt.ReceiptRetrieveParams
import com.rain_sdk.api.models.transactions.receipt.ReceiptUploadParams

interface ReceiptServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReceiptServiceAsync

    /**
     * This endpoint retrieves the receipt for a specific transaction. The receipt is returned as a
     * binary file, typically in PDF or similar format.
     */
    @MustBeClosed
    suspend fun retrieve(
        transactionId: String,
        params: ReceiptRetrieveParams = ReceiptRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see retrieve */
    @MustBeClosed
    suspend fun retrieve(
        params: ReceiptRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see retrieve */
    @MustBeClosed
    suspend fun retrieve(transactionId: String, requestOptions: RequestOptions): HttpResponse =
        retrieve(transactionId, ReceiptRetrieveParams.none(), requestOptions)

    /**
     * This endpoint allows you to upload a receipt for a specific transaction. The receipt is
     * provided as a binary file, typically in PDF format.
     */
    suspend fun upload(
        transactionId: String,
        params: ReceiptUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = upload(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see upload */
    suspend fun upload(
        params: ReceiptUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [ReceiptServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReceiptServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /transactions/{transactionId}/receipt`, but is
         * otherwise the same as [ReceiptServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            transactionId: String,
            params: ReceiptRetrieveParams = ReceiptRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ReceiptRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(transactionId: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(transactionId, ReceiptRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /transactions/{transactionId}/receipt`, but is
         * otherwise the same as [ReceiptServiceAsync.upload].
         */
        @MustBeClosed
        suspend fun upload(
            transactionId: String,
            params: ReceiptUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            upload(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        suspend fun upload(
            params: ReceiptUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
