// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.models.companies.signatures.IssuingSignature
import com.rain_sdk.api.models.signatures.SignatureRetrievePaymentSignatureParams
import com.rain_sdk.api.models.signatures.SignatureRetrieveWithdrawalSignatureParams

interface SignatureServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SignatureServiceAsync

    /**
     * This endpoint retrieves the payment signature for an authorized user tenant. The signature is
     * used to authorize a payment transaction on a blockchain.
     */
    suspend fun retrievePaymentSignature(
        params: SignatureRetrievePaymentSignatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingSignature

    /**
     * This endpoint retrieves the withdrawal signature for an authorized user tenant. The signature
     * is used to authorize a withdrawal transaction on a blockchain.
     */
    suspend fun retrieveWithdrawalSignature(
        params: SignatureRetrieveWithdrawalSignatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingSignature

    /**
     * A view of [SignatureServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SignatureServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /signatures/payments`, but is otherwise the same as
         * [SignatureServiceAsync.retrievePaymentSignature].
         */
        @MustBeClosed
        suspend fun retrievePaymentSignature(
            params: SignatureRetrievePaymentSignatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingSignature>

        /**
         * Returns a raw HTTP response for `get /signatures/withdrawals`, but is otherwise the same
         * as [SignatureServiceAsync.retrieveWithdrawalSignature].
         */
        @MustBeClosed
        suspend fun retrieveWithdrawalSignature(
            params: SignatureRetrieveWithdrawalSignatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingSignature>
    }
}
