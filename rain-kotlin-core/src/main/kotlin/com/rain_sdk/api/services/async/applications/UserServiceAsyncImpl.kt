// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async.applications

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
import com.rain_sdk.api.core.http.multipartFormData
import com.rain_sdk.api.core.http.parseable
import com.rain_sdk.api.core.prepareAsync
import com.rain_sdk.api.models.applications.user.IssuingUser
import com.rain_sdk.api.models.applications.user.UserCreateParams
import com.rain_sdk.api.models.applications.user.UserInitiateParams
import com.rain_sdk.api.models.applications.user.UserReapplyParams
import com.rain_sdk.api.models.applications.user.UserRetrieveParams
import com.rain_sdk.api.models.applications.user.UserRetrieveResponse
import com.rain_sdk.api.models.applications.user.UserUpdateParams
import com.rain_sdk.api.models.applications.user.UserUploadDocumentParams

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync =
        UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions,
    ): IssuingUser =
        // post /applications/user
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions,
    ): UserRetrieveResponse =
        // get /applications/user/{userId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions,
    ): IssuingUser =
        // patch /applications/user/{userId}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun initiate(
        params: UserInitiateParams,
        requestOptions: RequestOptions,
    ): IssuingUser =
        // post /applications/user/initiate
        withRawResponse().initiate(params, requestOptions).parse()

    @Deprecated("deprecated")
    override suspend fun reapply(
        params: UserReapplyParams,
        requestOptions: RequestOptions,
    ): IssuingUser =
        // put /applications/user/{userId}/reapply
        withRawResponse().reapply(params, requestOptions).parse()

    override suspend fun uploadDocument(
        params: UserUploadDocumentParams,
        requestOptions: RequestOptions,
    ) {
        // put /applications/user/{userId}/document
        withRawResponse().uploadDocument(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserServiceAsync.WithRawResponse =
            UserServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

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
                    .addPathSegments("applications", "user")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
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

        private val retrieveHandler: Handler<UserRetrieveResponse> =
            jsonHandler<UserRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "user", params._pathParam(0))
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
                    .addPathSegments("applications", "user", params._pathParam(0))
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

        private val initiateHandler: Handler<IssuingUser> =
            jsonHandler<IssuingUser>(clientOptions.jsonMapper)

        override suspend fun initiate(
            params: UserInitiateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingUser> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "user", "initiate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { initiateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val reapplyHandler: Handler<IssuingUser> =
            jsonHandler<IssuingUser>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override suspend fun reapply(
            params: UserReapplyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingUser> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "user", params._pathParam(0), "reapply")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { reapplyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadDocumentHandler: Handler<Void?> = emptyHandler()

        override suspend fun uploadDocument(
            params: UserUploadDocumentParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "user", params._pathParam(0), "document")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadDocumentHandler.handle(it) }
            }
        }
    }
}
