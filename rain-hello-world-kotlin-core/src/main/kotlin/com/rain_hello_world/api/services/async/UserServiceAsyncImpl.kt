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
import com.rain_hello_world.api.models.applications.user.IssuingUser
import com.rain_hello_world.api.models.cards.IssuingCard
import com.rain_hello_world.api.models.companies.IssuingChargeCreateResponse
import com.rain_hello_world.api.models.companies.IssuingContract
import com.rain_hello_world.api.models.users.UserCreateCardParams
import com.rain_hello_world.api.models.users.UserCreateChargeParams
import com.rain_hello_world.api.models.users.UserCreateParams
import com.rain_hello_world.api.models.users.UserDeleteParams
import com.rain_hello_world.api.models.users.UserInitiatePaymentParams
import com.rain_hello_world.api.models.users.UserInitiatePaymentResponse
import com.rain_hello_world.api.models.users.UserListParams
import com.rain_hello_world.api.models.users.UserRetrieveBalancesParams
import com.rain_hello_world.api.models.users.UserRetrieveBalancesResponse
import com.rain_hello_world.api.models.users.UserRetrieveContractsParams
import com.rain_hello_world.api.models.users.UserRetrieveParams
import com.rain_hello_world.api.models.users.UserUpdateParams
import com.rain_hello_world.api.services.async.users.SignatureServiceAsync
import com.rain_hello_world.api.services.async.users.SignatureServiceAsyncImpl

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val signatures: SignatureServiceAsync by lazy {
        SignatureServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync =
        UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun signatures(): SignatureServiceAsync = signatures

    override suspend fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions,
    ): IssuingUser =
        // post /users
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions,
    ): IssuingUser =
        // get /users/{userId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions,
    ): IssuingUser =
        // patch /users/{userId}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: UserListParams,
        requestOptions: RequestOptions,
    ): List<IssuingUser> =
        // get /users
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: UserDeleteParams, requestOptions: RequestOptions) {
        // delete /users/{userId}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun createCard(
        params: UserCreateCardParams,
        requestOptions: RequestOptions,
    ): IssuingCard =
        // post /users/{userId}/cards
        withRawResponse().createCard(params, requestOptions).parse()

    override suspend fun createCharge(
        params: UserCreateChargeParams,
        requestOptions: RequestOptions,
    ): IssuingChargeCreateResponse =
        // post /users/{userId}/charges
        withRawResponse().createCharge(params, requestOptions).parse()

    override suspend fun initiatePayment(
        params: UserInitiatePaymentParams,
        requestOptions: RequestOptions,
    ): UserInitiatePaymentResponse =
        // post /users/{userId}/payments
        withRawResponse().initiatePayment(params, requestOptions).parse()

    override suspend fun retrieveBalances(
        params: UserRetrieveBalancesParams,
        requestOptions: RequestOptions,
    ): UserRetrieveBalancesResponse =
        // get /users/{userId}/balances
        withRawResponse().retrieveBalances(params, requestOptions).parse()

    override suspend fun retrieveContracts(
        params: UserRetrieveContractsParams,
        requestOptions: RequestOptions,
    ): List<IssuingContract> =
        // get /users/{userId}/contracts
        withRawResponse().retrieveContracts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val signatures: SignatureServiceAsync.WithRawResponse by lazy {
            SignatureServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserServiceAsync.WithRawResponse =
            UserServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun signatures(): SignatureServiceAsync.WithRawResponse = signatures

        private val createHandler: Handler<IssuingUser> =
            jsonHandler<IssuingUser>(clientOptions.jsonMapper)

        override suspend fun create(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun retrieve(
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

        private val updateHandler: Handler<IssuingUser> =
            jsonHandler<IssuingUser>(clientOptions.jsonMapper)

        override suspend fun update(
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

        private val listHandler: Handler<List<IssuingUser>> =
            jsonHandler<List<IssuingUser>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingUser>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createCardHandler: Handler<IssuingCard> =
            jsonHandler<IssuingCard>(clientOptions.jsonMapper)

        override suspend fun createCard(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun createCharge(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun initiatePayment(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun retrieveBalances(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun retrieveContracts(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
