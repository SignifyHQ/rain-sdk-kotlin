// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.client

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.services.blocking.ApplicationService
import com.rain_sdk.api.services.blocking.BalanceService
import com.rain_sdk.api.services.blocking.CardService
import com.rain_sdk.api.services.blocking.CompanyService
import com.rain_sdk.api.services.blocking.ContractService
import com.rain_sdk.api.services.blocking.DisputeService
import com.rain_sdk.api.services.blocking.KeyService
import com.rain_sdk.api.services.blocking.PaymentService
import com.rain_sdk.api.services.blocking.SignatureService
import com.rain_sdk.api.services.blocking.TransactionService
import com.rain_sdk.api.services.blocking.UserService

/**
 * A client for interacting with the Rain REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface RainClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): RainClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RainClient

    fun applications(): ApplicationService

    fun balances(): BalanceService

    fun cards(): CardService

    fun companies(): CompanyService

    fun contracts(): ContractService

    fun disputes(): DisputeService

    fun keys(): KeyService

    fun payments(): PaymentService

    fun signatures(): SignatureService

    fun transactions(): TransactionService

    fun users(): UserService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [RainClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RainClient.WithRawResponse

        fun applications(): ApplicationService.WithRawResponse

        fun balances(): BalanceService.WithRawResponse

        fun cards(): CardService.WithRawResponse

        fun companies(): CompanyService.WithRawResponse

        fun contracts(): ContractService.WithRawResponse

        fun disputes(): DisputeService.WithRawResponse

        fun keys(): KeyService.WithRawResponse

        fun payments(): PaymentService.WithRawResponse

        fun signatures(): SignatureService.WithRawResponse

        fun transactions(): TransactionService.WithRawResponse

        fun users(): UserService.WithRawResponse
    }
}
