// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.users

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
import com.rain_sdk.api.core.http.parseable
import com.rain_sdk.api.core.prepare
import com.rain_sdk.api.models.companies.signatures.IssuingSignature
import com.rain_sdk.api.models.users.signatures.SignatureRetrievePaymentSignatureParams
import com.rain_sdk.api.models.users.signatures.SignatureRetrieveWithdrawalSignatureParams

class SignatureServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SignatureService {

    private val withRawResponse: SignatureService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SignatureService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SignatureService =
        SignatureServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrievePaymentSignature(
        params: SignatureRetrievePaymentSignatureParams,
        requestOptions: RequestOptions,
    ): IssuingSignature =
        // get /users/{userId}/signatures/payments
        withRawResponse().retrievePaymentSignature(params, requestOptions).parse()

    override fun retrieveWithdrawalSignature(
        params: SignatureRetrieveWithdrawalSignatureParams,
        requestOptions: RequestOptions,
    ): IssuingSignature =
        // get /users/{userId}/signatures/withdrawals
        withRawResponse().retrieveWithdrawalSignature(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SignatureService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SignatureService.WithRawResponse =
            SignatureServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrievePaymentSignatureHandler: Handler<IssuingSignature> =
            jsonHandler<IssuingSignature>(clientOptions.jsonMapper)

        override fun retrievePaymentSignature(
            params: SignatureRetrievePaymentSignatureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingSignature> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "signatures", "payments")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieveWithdrawalSignature(
            params: SignatureRetrieveWithdrawalSignatureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingSignature> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "signatures", "withdrawals")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
