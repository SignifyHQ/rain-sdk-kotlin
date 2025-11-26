// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async

import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.handlers.errorBodyHandler
import com.rain_hello_world.api.core.handlers.errorHandler
import com.rain_hello_world.api.core.handlers.jsonHandler
import com.rain_hello_world.api.core.http.HttpMethod
import com.rain_hello_world.api.core.http.HttpRequest
import com.rain_hello_world.api.core.http.HttpResponse
import com.rain_hello_world.api.core.http.HttpResponse.Handler
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.core.http.parseable
import com.rain_hello_world.api.core.prepareAsync
import com.rain_hello_world.api.models.companies.IssuingContract
import com.rain_hello_world.api.models.contracts.ContractListParams

class ContractServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ContractServiceAsync {

    private val withRawResponse: ContractServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContractServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ContractServiceAsync =
        ContractServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: ContractListParams,
        requestOptions: RequestOptions,
    ): List<IssuingContract> =
        // get /contracts
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContractServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ContractServiceAsync.WithRawResponse =
            ContractServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<List<IssuingContract>> =
            jsonHandler<List<IssuingContract>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: ContractListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingContract>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("contracts")
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
