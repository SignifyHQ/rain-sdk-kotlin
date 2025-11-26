// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking.cards

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
import com.rain_hello_world.api.core.http.parseable
import com.rain_hello_world.api.core.prepare
import com.rain_hello_world.api.models.cards.pin.PinRetrieveParams
import com.rain_hello_world.api.models.cards.pin.PinRetrieveResponse
import com.rain_hello_world.api.models.cards.pin.PinUpdateParams

class PinServiceImpl internal constructor(private val clientOptions: ClientOptions) : PinService {

    private val withRawResponse: PinService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PinService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PinService =
        PinServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: PinRetrieveParams,
        requestOptions: RequestOptions,
    ): PinRetrieveResponse =
        // get /cards/{cardId}/pin
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: PinUpdateParams, requestOptions: RequestOptions) {
        // put /cards/{cardId}/pin
        withRawResponse().update(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PinService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PinService.WithRawResponse =
            PinServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<PinRetrieveResponse> =
            jsonHandler<PinRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PinRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PinRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0), "pin")
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: PinUpdateParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0), "pin")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }
    }
}
