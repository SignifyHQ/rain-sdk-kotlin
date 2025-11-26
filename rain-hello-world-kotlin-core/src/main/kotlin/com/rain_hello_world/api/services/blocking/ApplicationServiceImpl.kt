// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking

import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.services.blocking.applications.CompanyService
import com.rain_hello_world.api.services.blocking.applications.CompanyServiceImpl
import com.rain_hello_world.api.services.blocking.applications.UserService
import com.rain_hello_world.api.services.blocking.applications.UserServiceImpl

class ApplicationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ApplicationService {

    private val withRawResponse: ApplicationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val company: CompanyService by lazy { CompanyServiceImpl(clientOptions) }

    private val user: UserService by lazy { UserServiceImpl(clientOptions) }

    override fun withRawResponse(): ApplicationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApplicationService =
        ApplicationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun company(): CompanyService = company

    override fun user(): UserService = user

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApplicationService.WithRawResponse {

        private val company: CompanyService.WithRawResponse by lazy {
            CompanyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ApplicationService.WithRawResponse =
            ApplicationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun company(): CompanyService.WithRawResponse = company

        override fun user(): UserService.WithRawResponse = user
    }
}
