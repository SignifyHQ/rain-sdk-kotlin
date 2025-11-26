// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async

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
import com.rain_hello_world.api.core.prepareAsync
import com.rain_hello_world.api.models.disputes.IssuingDispute
import com.rain_hello_world.api.models.transactions.IssuingTransaction
import com.rain_hello_world.api.models.transactions.TransactionCreateDisputeParams
import com.rain_hello_world.api.models.transactions.TransactionListParams
import com.rain_hello_world.api.models.transactions.TransactionRetrieveParams
import com.rain_hello_world.api.models.transactions.TransactionUpdateParams
import com.rain_hello_world.api.services.async.transactions.ReceiptServiceAsync
import com.rain_hello_world.api.services.async.transactions.ReceiptServiceAsyncImpl

class TransactionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionServiceAsync {

    private val withRawResponse: TransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val receipt: ReceiptServiceAsync by lazy { ReceiptServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TransactionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionServiceAsync =
        TransactionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun receipt(): ReceiptServiceAsync = receipt

    override suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): IssuingTransaction =
        // get /transactions/{transactionId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: TransactionUpdateParams, requestOptions: RequestOptions) {
        // patch /transactions/{transactionId}
        withRawResponse().update(params, requestOptions)
    }

    override suspend fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): List<IssuingTransaction> =
        // get /transactions
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun createDispute(
        params: TransactionCreateDisputeParams,
        requestOptions: RequestOptions,
    ): IssuingDispute =
        // post /transactions/{transactionId}/disputes
        withRawResponse().createDispute(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val receipt: ReceiptServiceAsync.WithRawResponse by lazy {
            ReceiptServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionServiceAsync.WithRawResponse =
            TransactionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun receipt(): ReceiptServiceAsync.WithRawResponse = receipt

        private val retrieveHandler: Handler<IssuingTransaction> =
            jsonHandler<IssuingTransaction>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionId", params.transactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions", params._pathParam(0))
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
            params: TransactionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionId", params.transactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<IssuingTransaction>> =
            jsonHandler<List<IssuingTransaction>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingTransaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions")
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

        private val createDisputeHandler: Handler<IssuingDispute> =
            jsonHandler<IssuingDispute>(clientOptions.jsonMapper)

        override suspend fun createDispute(
            params: TransactionCreateDisputeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingDispute> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionId", params.transactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions", params._pathParam(0), "disputes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createDisputeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
