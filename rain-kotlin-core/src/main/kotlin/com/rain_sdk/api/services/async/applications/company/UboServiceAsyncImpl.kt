// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async.applications.company

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.handlers.emptyHandler
import com.rain_sdk.api.core.handlers.errorBodyHandler
import com.rain_sdk.api.core.handlers.errorHandler
import com.rain_sdk.api.core.handlers.jsonHandler
import com.rain_sdk.api.core.http.HttpMethod
import com.rain_sdk.api.core.http.HttpRequest
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.core.http.HttpResponse.Handler
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.core.http.json
import com.rain_sdk.api.core.http.multipartFormData
import com.rain_sdk.api.core.http.parseable
import com.rain_sdk.api.core.prepareAsync
import com.rain_sdk.api.models.applications.company.IssuingCompany
import com.rain_sdk.api.models.applications.company.ubo.UboUpdateParams
import com.rain_sdk.api.models.applications.company.ubo.UboUploadDocumentParams
import com.rain_sdk.api.services.async.applications.company.ubo.DocumentServiceAsync
import com.rain_sdk.api.services.async.applications.company.ubo.DocumentServiceAsyncImpl

class UboServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UboServiceAsync {

    private val withRawResponse: UboServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val document: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): UboServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UboServiceAsync =
        UboServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun document(): DocumentServiceAsync = document

    override suspend fun update(
        params: UboUpdateParams,
        requestOptions: RequestOptions,
    ): IssuingCompany =
        // patch /applications/company/{companyId}/ubo/{uboId}
        withRawResponse().update(params, requestOptions).parse()

    @Deprecated("deprecated")
    override suspend fun uploadDocument(
        params: UboUploadDocumentParams,
        requestOptions: RequestOptions,
    ) {
        // put /applications/company/{companyId}/ubo/document
        withRawResponse().uploadDocument(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UboServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val document: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UboServiceAsync.WithRawResponse =
            UboServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun document(): DocumentServiceAsync.WithRawResponse = document

        private val updateHandler: Handler<IssuingCompany> =
            jsonHandler<IssuingCompany>(clientOptions.jsonMapper)

        override suspend fun update(
            params: UboUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCompany> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uboId", params.uboId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "company",
                        params._pathParam(0),
                        "ubo",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadDocumentHandler: Handler<Void?> = emptyHandler()

        @Deprecated("deprecated")
        override suspend fun uploadDocument(
            params: UboUploadDocumentParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "company",
                        params._pathParam(0),
                        "ubo",
                        "document",
                    )
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadDocumentHandler.handle(it) }
            }
        }
    }
}
