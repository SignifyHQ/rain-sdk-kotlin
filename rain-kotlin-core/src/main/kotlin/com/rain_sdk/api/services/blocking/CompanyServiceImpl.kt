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
import com.rain_sdk.api.models.applications.company.IssuingCompany
import com.rain_sdk.api.models.applications.user.IssuingUser
import com.rain_sdk.api.models.companies.CompanyChargeParams
import com.rain_sdk.api.models.companies.CompanyCreateUserParams
import com.rain_sdk.api.models.companies.CompanyInitiatePaymentParams
import com.rain_sdk.api.models.companies.CompanyInitiatePaymentResponse
import com.rain_sdk.api.models.companies.CompanyListParams
import com.rain_sdk.api.models.companies.CompanyRetrieveBalancesParams
import com.rain_sdk.api.models.companies.CompanyRetrieveBalancesResponse
import com.rain_sdk.api.models.companies.CompanyRetrieveContractsParams
import com.rain_sdk.api.models.companies.CompanyRetrieveParams
import com.rain_sdk.api.models.companies.CompanyUpdateParams
import com.rain_sdk.api.models.companies.IssuingChargeCreateResponse
import com.rain_sdk.api.models.companies.IssuingContract
import com.rain_sdk.api.services.blocking.companies.SignatureService
import com.rain_sdk.api.services.blocking.companies.SignatureServiceImpl

class CompanyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CompanyService {

    private val withRawResponse: CompanyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val signatures: SignatureService by lazy { SignatureServiceImpl(clientOptions) }

    override fun withRawResponse(): CompanyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompanyService =
        CompanyServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun signatures(): SignatureService = signatures

    override fun retrieve(
        params: CompanyRetrieveParams,
        requestOptions: RequestOptions,
    ): IssuingCompany =
        // get /companies/{companyId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions,
    ): IssuingCompany =
        // patch /companies/{companyId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CompanyListParams,
        requestOptions: RequestOptions,
    ): List<IssuingCompany> =
        // get /companies
        withRawResponse().list(params, requestOptions).parse()

    override fun charge(
        params: CompanyChargeParams,
        requestOptions: RequestOptions,
    ): IssuingChargeCreateResponse =
        // post /companies/{companyId}/charges
        withRawResponse().charge(params, requestOptions).parse()

    override fun createUser(
        params: CompanyCreateUserParams,
        requestOptions: RequestOptions,
    ): IssuingUser =
        // post /companies/{companyId}/users
        withRawResponse().createUser(params, requestOptions).parse()

    override fun initiatePayment(
        params: CompanyInitiatePaymentParams,
        requestOptions: RequestOptions,
    ): CompanyInitiatePaymentResponse =
        // post /companies/{companyId}/payments
        withRawResponse().initiatePayment(params, requestOptions).parse()

    override fun retrieveBalances(
        params: CompanyRetrieveBalancesParams,
        requestOptions: RequestOptions,
    ): CompanyRetrieveBalancesResponse =
        // get /companies/{companyId}/balances
        withRawResponse().retrieveBalances(params, requestOptions).parse()

    override fun retrieveContracts(
        params: CompanyRetrieveContractsParams,
        requestOptions: RequestOptions,
    ): List<IssuingContract> =
        // get /companies/{companyId}/contracts
        withRawResponse().retrieveContracts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompanyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val signatures: SignatureService.WithRawResponse by lazy {
            SignatureServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CompanyService.WithRawResponse =
            CompanyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun signatures(): SignatureService.WithRawResponse = signatures

        private val retrieveHandler: Handler<IssuingCompany> =
            jsonHandler<IssuingCompany>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CompanyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCompany> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0))
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

        private val updateHandler: Handler<IssuingCompany> =
            jsonHandler<IssuingCompany>(clientOptions.jsonMapper)

        override fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCompany> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0))
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

        private val listHandler: Handler<List<IssuingCompany>> =
            jsonHandler<List<IssuingCompany>>(clientOptions.jsonMapper)

        override fun list(
            params: CompanyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingCompany>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies")
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

        private val chargeHandler: Handler<IssuingChargeCreateResponse> =
            jsonHandler<IssuingChargeCreateResponse>(clientOptions.jsonMapper)

        override fun charge(
            params: CompanyChargeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingChargeCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0), "charges")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { chargeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createUserHandler: Handler<IssuingUser> =
            jsonHandler<IssuingUser>(clientOptions.jsonMapper)

        override fun createUser(
            params: CompanyCreateUserParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingUser> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0), "users")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val initiatePaymentHandler: Handler<CompanyInitiatePaymentResponse> =
            jsonHandler<CompanyInitiatePaymentResponse>(clientOptions.jsonMapper)

        override fun initiatePayment(
            params: CompanyInitiatePaymentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyInitiatePaymentResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0), "payments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { initiatePaymentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveBalancesHandler: Handler<CompanyRetrieveBalancesResponse> =
            jsonHandler<CompanyRetrieveBalancesResponse>(clientOptions.jsonMapper)

        override fun retrieveBalances(
            params: CompanyRetrieveBalancesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyRetrieveBalancesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0), "balances")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveBalancesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveContractsHandler: Handler<List<IssuingContract>> =
            jsonHandler<List<IssuingContract>>(clientOptions.jsonMapper)

        override fun retrieveContracts(
            params: CompanyRetrieveContractsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingContract>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("companies", params._pathParam(0), "contracts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveContractsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
