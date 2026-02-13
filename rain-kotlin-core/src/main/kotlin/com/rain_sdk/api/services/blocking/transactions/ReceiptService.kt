// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.transactions

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.models.transactions.receipt.ReceiptRetrieveParams
import com.rain_sdk.api.models.transactions.receipt.ReceiptUploadParams

interface ReceiptService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReceiptService

    /**
     * This endpoint retrieves the receipt for a specific transaction. The receipt is returned as a
     * binary file, typically in PDF or similar format.
     */
    @MustBeClosed
    fun retrieve(
        transactionId: String,
        params: ReceiptRetrieveParams = ReceiptRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(
        params: ReceiptRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(transactionId: String, requestOptions: RequestOptions): HttpResponse =
        retrieve(transactionId, ReceiptRetrieveParams.none(), requestOptions)

    /**
     * This endpoint allows you to upload a receipt for a specific transaction. The receipt is
     * provided as a binary file, typically in PDF format.
     */
    fun upload(
        transactionId: String,
        params: ReceiptUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = upload(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see upload */
    fun upload(params: ReceiptUploadParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ReceiptService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReceiptService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /transactions/{transactionId}/receipt`, but is
         * otherwise the same as [ReceiptService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            transactionId: String,
            params: ReceiptRetrieveParams = ReceiptRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReceiptRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(transactionId: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(transactionId, ReceiptRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /transactions/{transactionId}/receipt`, but is
         * otherwise the same as [ReceiptService.upload].
         */
        @MustBeClosed
        fun upload(
            transactionId: String,
            params: ReceiptUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            upload(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: ReceiptUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
