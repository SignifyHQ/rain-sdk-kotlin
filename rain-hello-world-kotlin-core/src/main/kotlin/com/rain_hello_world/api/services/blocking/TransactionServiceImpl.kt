// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking

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
import com.rain_hello_world.api.models.disputes.IssuingDispute
import com.rain_hello_world.api.models.transactions.IssuingTransaction
import com.rain_hello_world.api.models.transactions.TransactionCreateDisputeParams
import com.rain_hello_world.api.models.transactions.TransactionListParams
import com.rain_hello_world.api.models.transactions.TransactionRetrieveParams
import com.rain_hello_world.api.models.transactions.TransactionUpdateParams
import com.rain_hello_world.api.services.blocking.transactions.ReceiptService
import com.rain_hello_world.api.services.blocking.transactions.ReceiptServiceImpl

class TransactionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionService {

    private val withRawResponse: TransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val receipt: ReceiptService by lazy { ReceiptServiceImpl(clientOptions) }

    override fun withRawResponse(): TransactionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionService =
        TransactionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun receipt(): ReceiptService = receipt

    override fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): IssuingTransaction =
        // get /transactions/{transactionId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: TransactionUpdateParams, requestOptions: RequestOptions) {
        // patch /transactions/{transactionId}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): List<IssuingTransaction> =
        // get /transactions
        withRawResponse().list(params, requestOptions).parse()

    override fun createDispute(
        params: TransactionCreateDisputeParams,
        requestOptions: RequestOptions,
    ): IssuingDispute =
        // post /transactions/{transactionId}/disputes
        withRawResponse().createDispute(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val receipt: ReceiptService.WithRawResponse by lazy {
            ReceiptServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionService.WithRawResponse =
            TransactionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun receipt(): ReceiptService.WithRawResponse = receipt

        private val retrieveHandler: Handler<IssuingTransaction> =
            jsonHandler<IssuingTransaction>(clientOptions.jsonMapper)

        override fun retrieve(
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

        override fun update(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<List<IssuingTransaction>> =
            jsonHandler<List<IssuingTransaction>>(clientOptions.jsonMapper)

        override fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingTransaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions")
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

        private val createDisputeHandler: Handler<IssuingDispute> =
            jsonHandler<IssuingDispute>(clientOptions.jsonMapper)

        override fun createDispute(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
