// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.handlers.errorBodyHandler
import com.rain_sdk.api.core.handlers.errorHandler
import com.rain_sdk.api.core.handlers.jsonHandler
import com.rain_sdk.api.core.http.HttpMethod
import com.rain_sdk.api.core.http.HttpRequest
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.core.http.HttpResponse.Handler
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.core.http.parseable
import com.rain_sdk.api.core.prepare
import com.rain_sdk.api.models.companies.IssuingContract
import com.rain_sdk.api.models.contracts.ContractListParams

class ContractServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContractService {

    private val withRawResponse: ContractService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContractService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ContractService =
        ContractServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(
        params: ContractListParams,
        requestOptions: RequestOptions,
    ): List<IssuingContract> =
        // get /contracts
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContractService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ContractService.WithRawResponse =
            ContractServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<List<IssuingContract>> =
            jsonHandler<List<IssuingContract>>(clientOptions.jsonMapper)

        override fun list(
            params: ContractListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingContract>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("contracts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
