// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async.companies

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
import com.rain_hello_world.api.core.http.parseable
import com.rain_hello_world.api.core.prepareAsync
import com.rain_hello_world.api.models.companies.signatures.IssuingSignature
import com.rain_hello_world.api.models.companies.signatures.SignatureRetrievePaymentSignatureParams
import com.rain_hello_world.api.models.companies.signatures.SignatureRetrieveWithdrawalSignatureParams

class SignatureServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SignatureServiceAsync {

    private val withRawResponse: SignatureServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SignatureServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SignatureServiceAsync =
        SignatureServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrievePaymentSignature(
        params: SignatureRetrievePaymentSignatureParams,
        requestOptions: RequestOptions,
    ): IssuingSignature =
        // get /companies/{companyId}/signatures/payments
        withRawResponse().retrievePaymentSignature(params, requestOptions).parse()

    override suspend fun retrieveWithdrawalSignature(
        params: SignatureRetrieveWithdrawalSignatureParams,
        requestOptions: RequestOptions,
    ): IssuingSignature =
        // get /companies/{companyId}/signatures/withdrawals
        withRawResponse().retrieveWithdrawalSignature(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SignatureServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SignatureServiceAsync.WithRawResponse =
            SignatureServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrievePaymentSignatureHandler: Handler<IssuingSignature> =
            jsonHandler<IssuingSignature>(clientOptions.jsonMapper)

        override suspend fun retrievePaymentSignature(
            params: SignatureRetrievePaymentSignatureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingSignature> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0), "signatures", "payments")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrievePaymentSignatureHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveWithdrawalSignatureHandler: Handler<IssuingSignature> =
            jsonHandler<IssuingSignature>(clientOptions.jsonMapper)

        override suspend fun retrieveWithdrawalSignature(
            params: SignatureRetrieveWithdrawalSignatureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingSignature> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0), "signatures", "withdrawals")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveWithdrawalSignatureHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
