// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.models.companies.IssuingContract
import com.rain_sdk.api.models.contracts.ContractListParams

interface ContractService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ContractService

    /** Retrieve the smart contract information for a specific authorized user tenant. */
    fun list(
        params: ContractListParams = ContractListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingContract>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<IssuingContract> =
        list(ContractListParams.none(), requestOptions)

    /** A view of [ContractService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ContractService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /contracts`, but is otherwise the same as
         * [ContractService.list].
         */
        @MustBeClosed
        fun list(
            params: ContractListParams = ContractListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingContract>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<IssuingContract>> =
            list(ContractListParams.none(), requestOptions)
    }
}
