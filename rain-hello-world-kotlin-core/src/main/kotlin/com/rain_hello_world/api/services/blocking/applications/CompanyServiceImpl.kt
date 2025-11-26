// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking.applications

import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.core.handlers.emptyHandler
import com.rain_hello_world.api.core.handlers.errorBodyHandler
import com.rain_hello_world.api.core.handlers.errorHandler
import com.rain_hello_world.api.core.handlers.jsonHandler
import com.rain_hello_world.api.core.http.HttpMethod
import com.rain_hello_world.api.core.http.HttpRequest
import com.rain_hello_world.api.core.http.HttpResponse
import com.rain_hello_world.api.core.http.HttpResponse.Handler
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.core.http.json
import com.rain_hello_world.api.core.http.multipartFormData
import com.rain_hello_world.api.core.http.parseable
import com.rain_hello_world.api.core.prepare
import com.rain_hello_world.api.models.applications.company.CompanyCreateParams
import com.rain_hello_world.api.models.applications.company.CompanyReapplyParams
import com.rain_hello_world.api.models.applications.company.CompanyRetrieveParams
import com.rain_hello_world.api.models.applications.company.CompanyRetrieveResponse
import com.rain_hello_world.api.models.applications.company.CompanyUpdateParams
import com.rain_hello_world.api.models.applications.company.CompanyUploadDocumentParams
import com.rain_hello_world.api.models.applications.company.IssuingCompany
import com.rain_hello_world.api.services.blocking.applications.company.UboService
import com.rain_hello_world.api.services.blocking.applications.company.UboServiceImpl

class CompanyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CompanyService {

    private val withRawResponse: CompanyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ubo: UboService by lazy { UboServiceImpl(clientOptions) }

    override fun withRawResponse(): CompanyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompanyService =
        CompanyServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun ubo(): UboService = ubo

    override fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions,
    ): IssuingCompany =
        // post /applications/company
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CompanyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompanyRetrieveResponse =
        // get /applications/company/{companyId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions,
    ): IssuingCompany =
        // patch /applications/company/{companyId}
        withRawResponse().update(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun reapply(
        params: CompanyReapplyParams,
        requestOptions: RequestOptions,
    ): IssuingCompany =
        // put /applications/company/{companyId}/reapply
        withRawResponse().reapply(params, requestOptions).parse()

    override fun uploadDocument(
        params: CompanyUploadDocumentParams,
        requestOptions: RequestOptions,
    ) {
        // put /applications/company/{companyId}/document
        withRawResponse().uploadDocument(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompanyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val ubo: UboService.WithRawResponse by lazy {
            UboServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CompanyService.WithRawResponse =
            CompanyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun ubo(): UboService.WithRawResponse = ubo

        private val createHandler: Handler<IssuingCompany> =
            jsonHandler<IssuingCompany>(clientOptions.jsonMapper)

        override fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCompany> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "company")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<CompanyRetrieveResponse> =
            jsonHandler<CompanyRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CompanyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "company", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<IssuingCompany> =
            jsonHandler<IssuingCompany>(clientOptions.jsonMapper)

        override fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCompany> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "company", params._pathParam(0))
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

        private val reapplyHandler: Handler<IssuingCompany> =
            jsonHandler<IssuingCompany>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun reapply(
            params: CompanyReapplyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCompany> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "company", params._pathParam(0), "reapply")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { reapplyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadDocumentHandler: Handler<Void?> = emptyHandler()

        override fun uploadDocument(
            params: CompanyUploadDocumentParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "company", params._pathParam(0), "document")
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
