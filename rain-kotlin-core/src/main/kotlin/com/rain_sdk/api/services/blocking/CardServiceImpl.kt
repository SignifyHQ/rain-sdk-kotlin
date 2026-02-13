// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.checkRequired
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
import com.rain_sdk.api.core.prepare
import com.rain_sdk.api.models.cards.CardListParams
import com.rain_sdk.api.models.cards.CardRetrieveParams
import com.rain_sdk.api.models.cards.CardRetrieveSecretsParams
import com.rain_sdk.api.models.cards.CardRetrieveSecretsResponse
import com.rain_sdk.api.models.cards.CardUpdateParams
import com.rain_sdk.api.models.cards.IssuingCard
import com.rain_sdk.api.services.blocking.cards.PinService
import com.rain_sdk.api.services.blocking.cards.PinServiceImpl

class CardServiceImpl internal constructor(private val clientOptions: ClientOptions) : CardService {

    private val withRawResponse: CardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pin: PinService by lazy { PinServiceImpl(clientOptions) }

    override fun withRawResponse(): CardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardService =
        CardServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun pin(): PinService = pin

    override fun retrieve(params: CardRetrieveParams, requestOptions: RequestOptions): IssuingCard =
        // get /cards/{cardId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: CardUpdateParams, requestOptions: RequestOptions): IssuingCard =
        // patch /cards/{cardId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: CardListParams, requestOptions: RequestOptions): List<IssuingCard> =
        // get /cards
        withRawResponse().list(params, requestOptions).parse()

    override fun retrieveSecrets(
        params: CardRetrieveSecretsParams,
        requestOptions: RequestOptions,
    ): CardRetrieveSecretsResponse =
        // get /cards/{cardId}/secrets
        withRawResponse().retrieveSecrets(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val pin: PinService.WithRawResponse by lazy {
            PinServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardService.WithRawResponse =
            CardServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun pin(): PinService.WithRawResponse = pin

        private val retrieveHandler: Handler<IssuingCard> =
            jsonHandler<IssuingCard>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val updateHandler: Handler<IssuingCard> =
            jsonHandler<IssuingCard>(clientOptions.jsonMapper)

        override fun update(
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

        private val listHandler: Handler<List<IssuingCard>> =
            jsonHandler<List<IssuingCard>>(clientOptions.jsonMapper)

        override fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingCard>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards")
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

        private val retrieveSecretsHandler: Handler<CardRetrieveSecretsResponse> =
            jsonHandler<CardRetrieveSecretsResponse>(clientOptions.jsonMapper)

        override fun retrieveSecrets(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
