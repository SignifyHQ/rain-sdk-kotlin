// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.models.balances.BalanceRetrieveParams
import com.rain_sdk.api.models.balances.BalanceRetrieveResponse

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceServiceAsync

    /**
     * Retrieves the credit balances for an authorized user tenant. This includes details such as
     * credit limit, pending charges, posted charges, balance due, and spending power.
     */
    suspend fun retrieve(
        params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(requestOptions: RequestOptions): BalanceRetrieveResponse =
        retrieve(BalanceRetrieveParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /balances`, but is otherwise the same as
         * [BalanceServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<BalanceRetrieveResponse> =
            retrieve(BalanceRetrieveParams.none(), requestOptions)
    }
}
