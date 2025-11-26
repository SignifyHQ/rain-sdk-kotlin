// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async

import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.checkRequired
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
import com.rain_hello_world.api.core.prepareAsync
import com.rain_hello_world.api.models.cards.CardListParams
import com.rain_hello_world.api.models.cards.CardRetrieveParams
import com.rain_hello_world.api.models.cards.CardRetrieveSecretsParams
import com.rain_hello_world.api.models.cards.CardRetrieveSecretsResponse
import com.rain_hello_world.api.models.cards.CardUpdateParams
import com.rain_hello_world.api.models.cards.IssuingCard
import com.rain_hello_world.api.services.async.cards.PinServiceAsync
import com.rain_hello_world.api.services.async.cards.PinServiceAsyncImpl

class CardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardServiceAsync {

    private val withRawResponse: CardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pin: PinServiceAsync by lazy { PinServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync =
        CardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun pin(): PinServiceAsync = pin

    override suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions,
    ): IssuingCard =
        // get /cards/{cardId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions,
    ): IssuingCard =
        // patch /cards/{cardId}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: CardListParams,
        requestOptions: RequestOptions,
    ): List<IssuingCard> =
        // get /cards
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun retrieveSecrets(
        params: CardRetrieveSecretsParams,
        requestOptions: RequestOptions,
    ): CardRetrieveSecretsResponse =
        // get /cards/{cardId}/secrets
        withRawResponse().retrieveSecrets(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val pin: PinServiceAsync.WithRawResponse by lazy {
            PinServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardServiceAsync.WithRawResponse =
            CardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun pin(): PinServiceAsync.WithRawResponse = pin

        private val retrieveHandler: Handler<IssuingCard> =
            jsonHandler<IssuingCard>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCard> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0))
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

        private val updateHandler: Handler<IssuingCard> =
            jsonHandler<IssuingCard>(clientOptions.jsonMapper)

        override suspend fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCard> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0))
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

        private val listHandler: Handler<List<IssuingCard>> =
            jsonHandler<List<IssuingCard>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingCard>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards")
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

        private val retrieveSecretsHandler: Handler<CardRetrieveSecretsResponse> =
            jsonHandler<CardRetrieveSecretsResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveSecrets(
            params: CardRetrieveSecretsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardRetrieveSecretsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0), "secrets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSecretsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
