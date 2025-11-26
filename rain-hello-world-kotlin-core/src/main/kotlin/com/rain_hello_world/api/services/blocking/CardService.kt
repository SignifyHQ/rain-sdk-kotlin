// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.cards.CardListParams
import com.rain_hello_world.api.models.cards.CardRetrieveParams
import com.rain_hello_world.api.models.cards.CardRetrieveSecretsParams
import com.rain_hello_world.api.models.cards.CardRetrieveSecretsResponse
import com.rain_hello_world.api.models.cards.CardUpdateParams
import com.rain_hello_world.api.models.cards.IssuingCard
import com.rain_hello_world.api.services.blocking.cards.PinService

interface CardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardService

    fun pin(): PinService

    /** Retrieve detailed information for a specific card by its unique ID */
    fun retrieve(
        cardId: String,
        params: CardRetrieveParams = CardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard = retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard

    /** @see retrieve */
    fun retrieve(cardId: String, requestOptions: RequestOptions): IssuingCard =
        retrieve(cardId, CardRetrieveParams.none(), requestOptions)

    /**
     * Update details for an existing card, such as status, limit, billing address, and
     * configuration.
     */
    fun update(
        cardId: String,
        params: CardUpdateParams = CardUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard

    /** @see update */
    fun update(cardId: String, requestOptions: RequestOptions): IssuingCard =
        update(cardId, CardUpdateParams.none(), requestOptions)

    /**
     * Retrieves all cards associated with a user or company. You can filter by user or company ID
     * and card status.
     */
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingCard>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<IssuingCard> =
        list(CardListParams.none(), requestOptions)

    /** Retrieve the encrypted data for a specific card, including the encrypted PAN and CVC */
    fun retrieveSecrets(
        cardId: String,
        params: CardRetrieveSecretsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardRetrieveSecretsResponse =
        retrieveSecrets(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see retrieveSecrets */
    fun retrieveSecrets(
        params: CardRetrieveSecretsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardRetrieveSecretsResponse

    /** A view of [CardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardService.WithRawResponse

        fun pin(): PinService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cards/{cardId}`, but is otherwise the same as
         * [CardService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            cardId: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard> =
            retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(cardId: String, requestOptions: RequestOptions): HttpResponseFor<IssuingCard> =
            retrieve(cardId, CardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cards/{cardId}`, but is otherwise the same as
         * [CardService.update].
         */
        @MustBeClosed
        fun update(
            cardId: String,
            params: CardUpdateParams = CardUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard> =
            update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard>

        /** @see update */
        @MustBeClosed
        fun update(cardId: String, requestOptions: RequestOptions): HttpResponseFor<IssuingCard> =
            update(cardId, CardUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards`, but is otherwise the same as
         * [CardService.list].
         */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingCard>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<IssuingCard>> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{cardId}/secrets`, but is otherwise the same
         * as [CardService.retrieveSecrets].
         */
        @MustBeClosed
        fun retrieveSecrets(
            cardId: String,
            params: CardRetrieveSecretsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardRetrieveSecretsResponse> =
            retrieveSecrets(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see retrieveSecrets */
        @MustBeClosed
        fun retrieveSecrets(
            params: CardRetrieveSecretsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardRetrieveSecretsResponse>
    }
}
