// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async.companies

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.companies.signatures.IssuingSignature
import com.rain_hello_world.api.models.companies.signatures.SignatureRetrievePaymentSignatureParams
import com.rain_hello_world.api.models.companies.signatures.SignatureRetrieveWithdrawalSignatureParams

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
     * Retrieve the payment signature for a company, which is required for completing payment
     * transactions.
     */
    suspend fun retrievePaymentSignature(
        companyId: String,
        params: SignatureRetrievePaymentSignatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingSignature =
        retrievePaymentSignature(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see retrievePaymentSignature */
    suspend fun retrievePaymentSignature(
        params: SignatureRetrievePaymentSignatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingSignature

    /**
     * Retrieve the withdrawal signature for a company, which is required for processing withdrawal
     * requests.
     */
    suspend fun retrieveWithdrawalSignature(
        companyId: String,
        params: SignatureRetrieveWithdrawalSignatureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingSignature =
        retrieveWithdrawalSignature(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see retrieveWithdrawalSignature */
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
         * Returns a raw HTTP response for `get /companies/{companyId}/signatures/payments`, but is
         * otherwise the same as [SignatureServiceAsync.retrievePaymentSignature].
         */
        @MustBeClosed
        suspend fun retrievePaymentSignature(
            companyId: String,
            params: SignatureRetrievePaymentSignatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingSignature> =
            retrievePaymentSignature(
                params.toBuilder().companyId(companyId).build(),
                requestOptions,
            )

        /** @see retrievePaymentSignature */
        @MustBeClosed
        suspend fun retrievePaymentSignature(
            params: SignatureRetrievePaymentSignatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingSignature>

        /**
         * Returns a raw HTTP response for `get /companies/{companyId}/signatures/withdrawals`, but
         * is otherwise the same as [SignatureServiceAsync.retrieveWithdrawalSignature].
         */
        @MustBeClosed
        suspend fun retrieveWithdrawalSignature(
            companyId: String,
            params: SignatureRetrieveWithdrawalSignatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingSignature> =
            retrieveWithdrawalSignature(
                params.toBuilder().companyId(companyId).build(),
                requestOptions,
            )

        /** @see retrieveWithdrawalSignature */
        @MustBeClosed
        suspend fun retrieveWithdrawalSignature(
            params: SignatureRetrieveWithdrawalSignatureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingSignature>
    }
}
