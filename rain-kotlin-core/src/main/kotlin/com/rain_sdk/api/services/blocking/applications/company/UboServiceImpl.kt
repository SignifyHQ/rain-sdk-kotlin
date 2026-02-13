// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.applications.company

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
import com.rain_sdk.api.core.prepare
import com.rain_sdk.api.models.applications.company.IssuingCompany
import com.rain_sdk.api.models.applications.company.ubo.UboUpdateParams
import com.rain_sdk.api.models.applications.company.ubo.UboUploadDocumentParams
import com.rain_sdk.api.services.blocking.applications.company.ubo.DocumentService
import com.rain_sdk.api.services.blocking.applications.company.ubo.DocumentServiceImpl

class UboServiceImpl internal constructor(private val clientOptions: ClientOptions) : UboService {

    private val withRawResponse: UboService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val document: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    override fun withRawResponse(): UboService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UboService =
        UboServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun document(): DocumentService = document

    override fun update(params: UboUpdateParams, requestOptions: RequestOptions): IssuingCompany =
        // patch /applications/company/{companyId}/ubo/{uboId}
        withRawResponse().update(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun uploadDocument(params: UboUploadDocumentParams, requestOptions: RequestOptions) {
        // put /applications/company/{companyId}/ubo/document
        withRawResponse().uploadDocument(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UboService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val document: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UboService.WithRawResponse =
            UboServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun document(): DocumentService.WithRawResponse = document

        private val updateHandler: Handler<IssuingCompany> =
            jsonHandler<IssuingCompany>(clientOptions.jsonMapper)

        override fun update(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
        override fun uploadDocument(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadDocumentHandler.handle(it) }
            }
        }
    }
}
