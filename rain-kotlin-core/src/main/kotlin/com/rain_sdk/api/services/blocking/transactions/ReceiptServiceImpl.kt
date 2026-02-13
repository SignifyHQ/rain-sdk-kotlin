// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.transactions

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.handlers.emptyHandler
import com.rain_sdk.api.core.handlers.errorBodyHandler
import com.rain_sdk.api.core.handlers.errorHandler
import com.rain_sdk.api.core.http.HttpMethod
import com.rain_sdk.api.core.http.HttpRequest
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.core.http.HttpResponse.Handler
import com.rain_sdk.api.core.http.multipartFormData
import com.rain_sdk.api.core.http.parseable
import com.rain_sdk.api.core.prepare
import com.rain_sdk.api.models.transactions.receipt.ReceiptRetrieveParams
import com.rain_sdk.api.models.transactions.receipt.ReceiptUploadParams

class ReceiptServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReceiptService {

    private val withRawResponse: ReceiptService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReceiptService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReceiptService =
        ReceiptServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: ReceiptRetrieveParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /transactions/{transactionId}/receipt
        withRawResponse().retrieve(params, requestOptions)

    override fun upload(params: ReceiptUploadParams, requestOptions: RequestOptions) {
        // put /transactions/{transactionId}/receipt
        withRawResponse().upload(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReceiptService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReceiptService.WithRawResponse =
            ReceiptServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun retrieve(
            params: ReceiptRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionId", params.transactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions", params._pathParam(0), "receipt")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val uploadHandler: Handler<Void?> = emptyHandler()

        override fun upload(
            params: ReceiptUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionId", params.transactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("transactions", params._pathParam(0), "receipt")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadHandler.handle(it) }
            }
        }
    }
}
