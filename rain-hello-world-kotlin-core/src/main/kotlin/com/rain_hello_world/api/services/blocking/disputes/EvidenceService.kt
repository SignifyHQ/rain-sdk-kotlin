// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking.disputes

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponse
import com.rain_hello_world.api.models.disputes.evidence.EvidenceListParams
import com.rain_hello_world.api.models.disputes.evidence.EvidenceUploadParams

interface EvidenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EvidenceService

    /** Retrieve the file evidence associated with a dispute. */
    @MustBeClosed
    fun list(
        disputeId: String,
        params: EvidenceListParams = EvidenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = list(params.toBuilder().disputeId(disputeId).build(), requestOptions)

    /** @see list */
    @MustBeClosed
    fun list(
        params: EvidenceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see list */
    @MustBeClosed
    fun list(disputeId: String, requestOptions: RequestOptions): HttpResponse =
        list(disputeId, EvidenceListParams.none(), requestOptions)

    /** Upload a file that will serve as evidence for a dispute. */
    fun upload(
        disputeId: String,
        params: EvidenceUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = upload(params.toBuilder().disputeId(disputeId).build(), requestOptions)

    /** @see upload */
    fun upload(params: EvidenceUploadParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [EvidenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EvidenceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /disputes/{disputeId}/evidence`, but is otherwise
         * the same as [EvidenceService.list].
         */
        @MustBeClosed
        fun list(
            disputeId: String,
            params: EvidenceListParams = EvidenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = list(params.toBuilder().disputeId(disputeId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: EvidenceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(disputeId: String, requestOptions: RequestOptions): HttpResponse =
            list(disputeId, EvidenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /disputes/{disputeId}/evidence`, but is otherwise
         * the same as [EvidenceService.upload].
         */
        @MustBeClosed
        fun upload(
            disputeId: String,
            params: EvidenceUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = upload(params.toBuilder().disputeId(disputeId).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: EvidenceUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
