// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.services.async.applications.CompanyServiceAsync
import com.rain_sdk.api.services.async.applications.UserServiceAsync

interface ApplicationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApplicationServiceAsync

    fun company(): CompanyServiceAsync

    fun user(): UserServiceAsync

    /**
     * A view of [ApplicationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ApplicationServiceAsync.WithRawResponse

        fun company(): CompanyServiceAsync.WithRawResponse

        fun user(): UserServiceAsync.WithRawResponse
    }
}
