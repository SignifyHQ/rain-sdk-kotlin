// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

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
import com.rain_sdk.api.core.http.parseable
import com.rain_sdk.api.core.prepareAsync
import com.rain_sdk.api.models.disputes.DisputeListParams
import com.rain_sdk.api.models.disputes.DisputeRetrieveParams
import com.rain_sdk.api.models.disputes.DisputeUpdateParams
import com.rain_sdk.api.models.disputes.IssuingDispute
import com.rain_sdk.api.services.async.disputes.EvidenceServiceAsync
import com.rain_sdk.api.services.async.disputes.EvidenceServiceAsyncImpl

class DisputeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DisputeServiceAsync {

    private val withRawResponse: DisputeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val evidence: EvidenceServiceAsync by lazy { EvidenceServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DisputeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DisputeServiceAsync =
        DisputeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun evidence(): EvidenceServiceAsync = evidence

    override suspend fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions,
    ): IssuingDispute =
        // get /disputes/{disputeId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: DisputeUpdateParams, requestOptions: RequestOptions) {
        // patch /disputes/{disputeId}
        withRawResponse().update(params, requestOptions)
    }

    override suspend fun list(
        params: DisputeListParams,
        requestOptions: RequestOptions,
    ): List<IssuingDispute> =
        // get /disputes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DisputeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val evidence: EvidenceServiceAsync.WithRawResponse by lazy {
            EvidenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DisputeServiceAsync.WithRawResponse =
            DisputeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun evidence(): EvidenceServiceAsync.WithRawResponse = evidence

        private val retrieveHandler: Handler<IssuingDispute> =
            jsonHandler<IssuingDispute>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingDispute> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeId", params.disputeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("disputes", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override suspend fun update(
            params: DisputeUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeId", params.disputeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("disputes", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<IssuingDispute>> =
            jsonHandler<List<IssuingDispute>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: DisputeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingDispute>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("disputes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
