// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async.cards

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.models.cards.pin.PinRetrieveParams
import com.rain_sdk.api.models.cards.pin.PinRetrieveResponse
import com.rain_sdk.api.models.cards.pin.PinUpdateParams

interface PinServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PinServiceAsync

    /** Retrieve the encrypted PIN for a specific card */
    suspend fun retrieve(
        cardId: String,
        params: PinRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PinRetrieveResponse = retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PinRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PinRetrieveResponse

    /** Updates the PIN of a specific card by setting the encrypted PIN */
    suspend fun update(
        cardId: String,
        params: PinUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: PinUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [PinServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PinServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cards/{cardId}/pin`, but is otherwise the same as
         * [PinServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            cardId: String,
            params: PinRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PinRetrieveResponse> =
            retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PinRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PinRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /cards/{cardId}/pin`, but is otherwise the same as
         * [PinServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            cardId: String,
            params: PinUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: PinUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
