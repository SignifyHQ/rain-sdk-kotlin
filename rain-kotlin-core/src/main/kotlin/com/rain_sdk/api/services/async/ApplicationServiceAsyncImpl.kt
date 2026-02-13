// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.services.async.applications.CompanyServiceAsync
import com.rain_sdk.api.services.async.applications.CompanyServiceAsyncImpl
import com.rain_sdk.api.services.async.applications.UserServiceAsync
import com.rain_sdk.api.services.async.applications.UserServiceAsyncImpl

class ApplicationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ApplicationServiceAsync {

    private val withRawResponse: ApplicationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val company: CompanyServiceAsync by lazy { CompanyServiceAsyncImpl(clientOptions) }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ApplicationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApplicationServiceAsync =
        ApplicationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun company(): CompanyServiceAsync = company

    override fun user(): UserServiceAsync = user

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApplicationServiceAsync.WithRawResponse {

        private val company: CompanyServiceAsync.WithRawResponse by lazy {
            CompanyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ApplicationServiceAsync.WithRawResponse =
            ApplicationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun company(): CompanyServiceAsync.WithRawResponse = company

        override fun user(): UserServiceAsync.WithRawResponse = user
    }
}
