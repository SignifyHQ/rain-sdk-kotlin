// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async.applications

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponse
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.applications.company.CompanyCreateParams
import com.rain_hello_world.api.models.applications.company.CompanyReapplyParams
import com.rain_hello_world.api.models.applications.company.CompanyRetrieveParams
import com.rain_hello_world.api.models.applications.company.CompanyRetrieveResponse
import com.rain_hello_world.api.models.applications.company.CompanyUpdateParams
import com.rain_hello_world.api.models.applications.company.CompanyUploadDocumentParams
import com.rain_hello_world.api.models.applications.company.IssuingCompany
import com.rain_hello_world.api.services.async.applications.company.UboServiceAsync

interface CompanyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompanyServiceAsync

    fun ubo(): UboServiceAsync

    /**
     * Submits an application to create a corporate account. The application requires details about
     * the company, its legal entity, representatives, and beneficial owners. The initial user must
     * provide a wallet address.
     */
    suspend fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany

    /**
     * Retrieves the current status and details of a company's corporate application, including the
     * company's ultimate beneficial owners and application progress.
     */
    suspend fun retrieve(
        companyId: String,
        params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyRetrieveResponse =
        retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CompanyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        companyId: String,
        requestOptions: RequestOptions,
    ): CompanyRetrieveResponse = retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

    /**
     * Updates the information for an existing corporate account application. The company's details,
     * including name, address, and legal entity information, can be modified through this endpoint.
     */
    suspend fun update(
        companyId: String,
        params: CompanyUpdateParams = CompanyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany = update(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany

    /** @see update */
    suspend fun update(companyId: String, requestOptions: RequestOptions): IssuingCompany =
        update(companyId, CompanyUpdateParams.none(), requestOptions)

    /**
     * Allows a company to reapply or respond to a request for information after submitting their
     * corporate application. This endpoint is typically used when additional information or
     * corrections are needed.
     */
    @Deprecated("deprecated")
    suspend fun reapply(
        companyId: String,
        params: CompanyReapplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany = reapply(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see reapply */
    @Deprecated("deprecated")
    suspend fun reapply(
        params: CompanyReapplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany

    /**
     * Uploads a document that supports a company's corporate application. This is typically used to
     * provide additional documentation, such as proof of address, incorporation certificates, or
     * other required legal documents.
     */
    suspend fun uploadDocument(
        companyId: String,
        params: CompanyUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = uploadDocument(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see uploadDocument */
    suspend fun uploadDocument(
        params: CompanyUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [CompanyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CompanyServiceAsync.WithRawResponse

        fun ubo(): UboServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /applications/company`, but is otherwise the same
         * as [CompanyServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany>

        /**
         * Returns a raw HTTP response for `get /applications/company/{companyId}`, but is otherwise
         * the same as [CompanyServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            companyId: String,
            params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyRetrieveResponse> =
            retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CompanyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            companyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyRetrieveResponse> =
            retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /applications/company/{companyId}`, but is
         * otherwise the same as [CompanyServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            companyId: String,
            params: CompanyUpdateParams = CompanyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany> =
            update(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            companyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCompany> =
            update(companyId, CompanyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /applications/company/{companyId}/reapply`, but is
         * otherwise the same as [CompanyServiceAsync.reapply].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun reapply(
            companyId: String,
            params: CompanyReapplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany> =
            reapply(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see reapply */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun reapply(
            params: CompanyReapplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany>

        /**
         * Returns a raw HTTP response for `put /applications/company/{companyId}/document`, but is
         * otherwise the same as [CompanyServiceAsync.uploadDocument].
         */
        @MustBeClosed
        suspend fun uploadDocument(
            companyId: String,
            params: CompanyUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            uploadDocument(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see uploadDocument */
        @MustBeClosed
        suspend fun uploadDocument(
            params: CompanyUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
