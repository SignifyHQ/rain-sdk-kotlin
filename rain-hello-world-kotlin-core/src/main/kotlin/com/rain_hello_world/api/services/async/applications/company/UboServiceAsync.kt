// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async.applications.company

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponse
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.applications.company.IssuingCompany
import com.rain_hello_world.api.models.applications.company.ubo.UboUpdateParams
import com.rain_hello_world.api.models.applications.company.ubo.UboUploadDocumentParams
import com.rain_hello_world.api.services.async.applications.company.ubo.DocumentServiceAsync

interface UboServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UboServiceAsync

    fun document(): DocumentServiceAsync

    /**
     * Updates the application information for a company's Ultimate Beneficial Owner (UBO). This
     * allows modification of the UBO's personal details such as name, birth date, national ID, and
     * address.
     */
    suspend fun update(
        uboId: String,
        params: UboUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany = update(params.toBuilder().uboId(uboId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: UboUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany

    /**
     * This deprecated endpoint allows the upload of a document for a UBO to support a company's
     * corporate application. It is recommended to use the newer endpoint for document uploads.
     */
    @Deprecated("deprecated")
    suspend fun uploadDocument(
        companyId: String,
        params: UboUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = uploadDocument(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see uploadDocument */
    @Deprecated("deprecated")
    suspend fun uploadDocument(
        params: UboUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [UboServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UboServiceAsync.WithRawResponse

        fun document(): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /applications/company/{companyId}/ubo/{uboId}`,
         * but is otherwise the same as [UboServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            uboId: String,
            params: UboUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany> =
            update(params.toBuilder().uboId(uboId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: UboUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany>

        /**
         * Returns a raw HTTP response for `put /applications/company/{companyId}/ubo/document`, but
         * is otherwise the same as [UboServiceAsync.uploadDocument].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun uploadDocument(
            companyId: String,
            params: UboUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            uploadDocument(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see uploadDocument */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun uploadDocument(
            params: UboUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
