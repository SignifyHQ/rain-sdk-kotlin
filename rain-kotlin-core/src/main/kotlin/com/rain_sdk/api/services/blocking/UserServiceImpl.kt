// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.handlers.emptyHandler
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
import com.rain_sdk.api.models.applications.user.IssuingUser
import com.rain_sdk.api.models.cards.IssuingCard
import com.rain_sdk.api.models.companies.IssuingChargeCreateResponse
import com.rain_sdk.api.models.companies.IssuingContract
import com.rain_sdk.api.models.users.UserCreateCardParams
import com.rain_sdk.api.models.users.UserCreateChargeParams
import com.rain_sdk.api.models.users.UserCreateParams
import com.rain_sdk.api.models.users.UserDeleteParams
import com.rain_sdk.api.models.users.UserInitiatePaymentParams
import com.rain_sdk.api.models.users.UserInitiatePaymentResponse
import com.rain_sdk.api.models.users.UserListParams
import com.rain_sdk.api.models.users.UserRetrieveBalancesParams
import com.rain_sdk.api.models.users.UserRetrieveBalancesResponse
import com.rain_sdk.api.models.users.UserRetrieveContractsParams
import com.rain_sdk.api.models.users.UserRetrieveParams
import com.rain_sdk.api.models.users.UserUpdateParams
import com.rain_sdk.api.services.blocking.users.SignatureService
import com.rain_sdk.api.services.blocking.users.SignatureServiceImpl

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val signatures: SignatureService by lazy { SignatureServiceImpl(clientOptions) }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun signatures(): SignatureService = signatures

    override fun create(params: UserCreateParams, requestOptions: RequestOptions): IssuingUser =
        // post /users
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: UserRetrieveParams, requestOptions: RequestOptions): IssuingUser =
        // get /users/{userId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: UserUpdateParams, requestOptions: RequestOptions): IssuingUser =
        // patch /users/{userId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: UserListParams, requestOptions: RequestOptions): List<IssuingUser> =
        // get /users
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: UserDeleteParams, requestOptions: RequestOptions) {
        // delete /users/{userId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createCard(
        params: UserCreateCardParams,
        requestOptions: RequestOptions,
    ): IssuingCard =
        // post /users/{userId}/cards
        withRawResponse().createCard(params, requestOptions).parse()

    override fun createCharge(
        params: UserCreateChargeParams,
        requestOptions: RequestOptions,
    ): IssuingChargeCreateResponse =
        // post /users/{userId}/charges
        withRawResponse().createCharge(params, requestOptions).parse()

    override fun initiatePayment(
        params: UserInitiatePaymentParams,
        requestOptions: RequestOptions,
    ): UserInitiatePaymentResponse =
        // post /users/{userId}/payments
        withRawResponse().initiatePayment(params, requestOptions).parse()

    override fun retrieveBalances(
        params: UserRetrieveBalancesParams,
        requestOptions: RequestOptions,
    ): UserRetrieveBalancesResponse =
        // get /users/{userId}/balances
        withRawResponse().retrieveBalances(params, requestOptions).parse()

    override fun retrieveContracts(
        params: UserRetrieveContractsParams,
        requestOptions: RequestOptions,
    ): List<IssuingContract> =
        // get /users/{userId}/contracts
        withRawResponse().retrieveContracts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val signatures: SignatureService.WithRawResponse by lazy {
            SignatureServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun signatures(): SignatureService.WithRawResponse = signatures

        private val createHandler: Handler<IssuingUser> =
            jsonHandler<IssuingUser>(clientOptions.jsonMapper)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingUser> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<IssuingUser> =
            jsonHandler<IssuingUser>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingUser> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0))
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

        private val updateHandler: Handler<IssuingUser> =
            jsonHandler<IssuingUser>(clientOptions.jsonMapper)

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingUser> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0))
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

        private val listHandler: Handler<List<IssuingUser>> =
            jsonHandler<List<IssuingUser>>(clientOptions.jsonMapper)

        override fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingUser>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createCardHandler: Handler<IssuingCard> =
            jsonHandler<IssuingCard>(clientOptions.jsonMapper)

        override fun createCard(
            params: UserCreateCardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCard> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "cards")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createCardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createChargeHandler: Handler<IssuingChargeCreateResponse> =
            jsonHandler<IssuingChargeCreateResponse>(clientOptions.jsonMapper)

        override fun createCharge(
            params: UserCreateChargeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingChargeCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "charges")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createChargeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val initiatePaymentHandler: Handler<UserInitiatePaymentResponse> =
            jsonHandler<UserInitiatePaymentResponse>(clientOptions.jsonMapper)

        override fun initiatePayment(
            params: UserInitiatePaymentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserInitiatePaymentResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "payments")
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

        private val retrieveBalancesHandler: Handler<UserRetrieveBalancesResponse> =
            jsonHandler<UserRetrieveBalancesResponse>(clientOptions.jsonMapper)

        override fun retrieveBalances(
            params: UserRetrieveBalancesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveBalancesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "balances")
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
            params: UserRetrieveContractsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingContract>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0), "contracts")
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
