// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.companies.IssuingContract
import com.rain_hello_world.api.models.contracts.ContractListParams

interface ContractServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ContractServiceAsync

    /** Retrieve the smart contract information for a specific authorized user tenant. */
    suspend fun list(
        params: ContractListParams = ContractListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingContract>

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): List<IssuingContract> =
        list(ContractListParams.none(), requestOptions)

    /**
     * A view of [ContractServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ContractServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /contracts`, but is otherwise the same as
         * [ContractServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ContractListParams = ContractListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingContract>>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<IssuingContract>> =
            list(ContractListParams.none(), requestOptions)
    }
}
