// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.services.blocking.applications.CompanyService
import com.rain_sdk.api.services.blocking.applications.UserService

interface ApplicationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApplicationService

    fun company(): CompanyService

    fun user(): UserService

    /**
     * A view of [ApplicationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ApplicationService.WithRawResponse

        fun company(): CompanyService.WithRawResponse

        fun user(): UserService.WithRawResponse
    }
}
