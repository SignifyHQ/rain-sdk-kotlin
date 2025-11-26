// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.client

import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.services.async.ApplicationServiceAsync
import com.rain_hello_world.api.services.async.BalanceServiceAsync
import com.rain_hello_world.api.services.async.CardServiceAsync
import com.rain_hello_world.api.services.async.CompanyServiceAsync
import com.rain_hello_world.api.services.async.ContractServiceAsync
import com.rain_hello_world.api.services.async.DisputeServiceAsync
import com.rain_hello_world.api.services.async.KeyServiceAsync
import com.rain_hello_world.api.services.async.PaymentServiceAsync
import com.rain_hello_world.api.services.async.SignatureServiceAsync
import com.rain_hello_world.api.services.async.TransactionServiceAsync
import com.rain_hello_world.api.services.async.UserServiceAsync

/**
 * A client for interacting with the Rain Hello World REST API asynchronously. You can also switch
 * to synchronous execution via the [sync] method.
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
interface RainHelloWorldClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): RainHelloWorldClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RainHelloWorldClientAsync

    fun applications(): ApplicationServiceAsync

    fun balances(): BalanceServiceAsync

    fun cards(): CardServiceAsync

    fun companies(): CompanyServiceAsync

    fun contracts(): ContractServiceAsync

    fun disputes(): DisputeServiceAsync

    fun keys(): KeyServiceAsync

    fun payments(): PaymentServiceAsync

    fun signatures(): SignatureServiceAsync

    fun transactions(): TransactionServiceAsync

    fun users(): UserServiceAsync

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

    /**
     * A view of [RainHelloWorldClientAsync] that provides access to raw HTTP responses for each
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
        ): RainHelloWorldClientAsync.WithRawResponse

        fun applications(): ApplicationServiceAsync.WithRawResponse

        fun balances(): BalanceServiceAsync.WithRawResponse

        fun cards(): CardServiceAsync.WithRawResponse

        fun companies(): CompanyServiceAsync.WithRawResponse

        fun contracts(): ContractServiceAsync.WithRawResponse

        fun disputes(): DisputeServiceAsync.WithRawResponse

        fun keys(): KeyServiceAsync.WithRawResponse

        fun payments(): PaymentServiceAsync.WithRawResponse

        fun signatures(): SignatureServiceAsync.WithRawResponse

        fun transactions(): TransactionServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse
    }
}
