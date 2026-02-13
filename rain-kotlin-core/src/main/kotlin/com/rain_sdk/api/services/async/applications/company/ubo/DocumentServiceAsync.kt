// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async.applications.company.ubo

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.models.applications.company.ubo.document.DocumentUploadParams

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentServiceAsync

    /**
     * Uploads a document for a company's Ultimate Beneficial Owner (UBO) to support the company's
     * corporate application. This endpoint allows for the submission of various legal and
     * identification documents.
     */
    suspend fun upload(
        uboId: String,
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = upload(params.toBuilder().uboId(uboId).build(), requestOptions)

    /** @see upload */
    suspend fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /applications/company/{companyId}/ubo/{uboId}/document`, but is otherwise the same as
         * [DocumentServiceAsync.upload].
         */
        @MustBeClosed
        suspend fun upload(
            uboId: String,
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = upload(params.toBuilder().uboId(uboId).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        suspend fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
