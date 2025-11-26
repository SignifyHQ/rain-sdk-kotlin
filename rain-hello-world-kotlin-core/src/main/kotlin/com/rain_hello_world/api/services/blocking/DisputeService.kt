// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponse
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.disputes.DisputeListParams
import com.rain_hello_world.api.models.disputes.DisputeRetrieveParams
import com.rain_hello_world.api.models.disputes.DisputeUpdateParams
import com.rain_hello_world.api.models.disputes.IssuingDispute
import com.rain_hello_world.api.services.blocking.disputes.EvidenceService

interface DisputeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DisputeService

    fun evidence(): EvidenceService

    /** Retrieve details of a specific dispute using its unique ID. */
    fun retrieve(
        disputeId: String,
        params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingDispute = retrieve(params.toBuilder().disputeId(disputeId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingDispute

    /** @see retrieve */
    fun retrieve(disputeId: String, requestOptions: RequestOptions): IssuingDispute =
        retrieve(disputeId, DisputeRetrieveParams.none(), requestOptions)

    /**
     * Update the status or evidence of a dispute, typically to mark it as canceled or add new
     * evidence.
     */
    fun update(
        disputeId: String,
        params: DisputeUpdateParams = DisputeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().disputeId(disputeId).build(), requestOptions)

    /** @see update */
    fun update(params: DisputeUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(disputeId: String, requestOptions: RequestOptions) =
        update(disputeId, DisputeUpdateParams.none(), requestOptions)

    /** Retrieve all disputes, optionally filtered by company, user, or transaction ID. */
    fun list(
        params: DisputeListParams = DisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingDispute>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<IssuingDispute> =
        list(DisputeListParams.none(), requestOptions)

    /** A view of [DisputeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DisputeService.WithRawResponse

        fun evidence(): EvidenceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /disputes/{disputeId}`, but is otherwise the same as
         * [DisputeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            disputeId: String,
            params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingDispute> =
            retrieve(params.toBuilder().disputeId(disputeId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingDispute>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            disputeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingDispute> =
            retrieve(disputeId, DisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /disputes/{disputeId}`, but is otherwise the same
         * as [DisputeService.update].
         */
        @MustBeClosed
        fun update(
            disputeId: String,
            params: DisputeUpdateParams = DisputeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().disputeId(disputeId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: DisputeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(disputeId: String, requestOptions: RequestOptions): HttpResponse =
            update(disputeId, DisputeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /disputes`, but is otherwise the same as
         * [DisputeService.list].
         */
        @MustBeClosed
        fun list(
            params: DisputeListParams = DisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingDispute>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<IssuingDispute>> =
            list(DisputeListParams.none(), requestOptions)
    }
}
