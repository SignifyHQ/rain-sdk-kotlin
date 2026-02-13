// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.models.cards.CardListParams
import com.rain_sdk.api.models.cards.CardRetrieveParams
import com.rain_sdk.api.models.cards.CardRetrieveSecretsParams
import com.rain_sdk.api.models.cards.CardRetrieveSecretsResponse
import com.rain_sdk.api.models.cards.CardUpdateParams
import com.rain_sdk.api.models.cards.IssuingCard
import com.rain_sdk.api.services.async.cards.PinServiceAsync

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync

    fun pin(): PinServiceAsync

    /** Retrieve detailed information for a specific card by its unique ID */
    suspend fun retrieve(
        cardId: String,
        params: CardRetrieveParams = CardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard = retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard

    /** @see retrieve */
    suspend fun retrieve(cardId: String, requestOptions: RequestOptions): IssuingCard =
        retrieve(cardId, CardRetrieveParams.none(), requestOptions)

    /**
     * Update details for an existing card, such as status, limit, billing address, and
     * configuration.
     */
    suspend fun update(
        cardId: String,
        params: CardUpdateParams = CardUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard

    /** @see update */
    suspend fun update(cardId: String, requestOptions: RequestOptions): IssuingCard =
        update(cardId, CardUpdateParams.none(), requestOptions)

    /**
     * Retrieves all cards associated with a user or company. You can filter by user or company ID
     * and card status.
     */
    suspend fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingCard>

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): List<IssuingCard> =
        list(CardListParams.none(), requestOptions)

    /** Retrieve the encrypted data for a specific card, including the encrypted PAN and CVC */
    suspend fun retrieveSecrets(
        cardId: String,
        params: CardRetrieveSecretsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardRetrieveSecretsResponse =
        retrieveSecrets(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see retrieveSecrets */
    suspend fun retrieveSecrets(
        params: CardRetrieveSecretsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardRetrieveSecretsResponse

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync.WithRawResponse

        fun pin(): PinServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cards/{cardId}`, but is otherwise the same as
         * [CardServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            cardId: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard> =
            retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            cardId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCard> =
            retrieve(cardId, CardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cards/{cardId}`, but is otherwise the same as
         * [CardServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            cardId: String,
            params: CardUpdateParams = CardUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard> =
            update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            cardId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCard> = update(cardId, CardUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingCard>>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<IssuingCard>> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{cardId}/secrets`, but is otherwise the same
         * as [CardServiceAsync.retrieveSecrets].
         */
        @MustBeClosed
        suspend fun retrieveSecrets(
            cardId: String,
            params: CardRetrieveSecretsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardRetrieveSecretsResponse> =
            retrieveSecrets(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see retrieveSecrets */
        @MustBeClosed
        suspend fun retrieveSecrets(
            params: CardRetrieveSecretsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardRetrieveSecretsResponse>
    }
}
