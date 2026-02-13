// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.models.payments.PaymentInitiateParams
import com.rain_sdk.api.models.payments.PaymentInitiateResponse

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentServiceAsync

    /**
     * This endpoint initiates a payment for an authorized user tenant. The request includes the
     * amount to be transferred and the wallet address to send the payment from.
     */
    suspend fun initiate(
        params: PaymentInitiateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentInitiateResponse

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments`, but is otherwise the same as
         * [PaymentServiceAsync.initiate].
         */
        @MustBeClosed
        suspend fun initiate(
            params: PaymentInitiateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentInitiateResponse>
    }
}
