// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking.applications.company

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponse
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.applications.company.IssuingCompany
import com.rain_hello_world.api.models.applications.company.ubo.UboUpdateParams
import com.rain_hello_world.api.models.applications.company.ubo.UboUploadDocumentParams
import com.rain_hello_world.api.services.blocking.applications.company.ubo.DocumentService

interface UboService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UboService

    fun document(): DocumentService

    /**
     * Updates the application information for a company's Ultimate Beneficial Owner (UBO). This
     * allows modification of the UBO's personal details such as name, birth date, national ID, and
     * address.
     */
    fun update(
        uboId: String,
        params: UboUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany = update(params.toBuilder().uboId(uboId).build(), requestOptions)

    /** @see update */
    fun update(
        params: UboUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany

    /**
     * This deprecated endpoint allows the upload of a document for a UBO to support a company's
     * corporate application. It is recommended to use the newer endpoint for document uploads.
     */
    @Deprecated("deprecated")
    fun uploadDocument(
        companyId: String,
        params: UboUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = uploadDocument(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see uploadDocument */
    @Deprecated("deprecated")
    fun uploadDocument(
        params: UboUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [UboService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UboService.WithRawResponse

        fun document(): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /applications/company/{companyId}/ubo/{uboId}`,
         * but is otherwise the same as [UboService.update].
         */
        @MustBeClosed
        fun update(
            uboId: String,
            params: UboUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany> =
            update(params.toBuilder().uboId(uboId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: UboUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany>

        /**
         * Returns a raw HTTP response for `put /applications/company/{companyId}/ubo/document`, but
         * is otherwise the same as [UboService.uploadDocument].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun uploadDocument(
            companyId: String,
            params: UboUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            uploadDocument(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see uploadDocument */
        @Deprecated("deprecated")
        @MustBeClosed
        fun uploadDocument(
            params: UboUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
