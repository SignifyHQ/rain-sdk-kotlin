// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.client

import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.getPackageVersion
import com.rain_hello_world.api.services.async.ApplicationServiceAsync
import com.rain_hello_world.api.services.async.ApplicationServiceAsyncImpl
import com.rain_hello_world.api.services.async.BalanceServiceAsync
import com.rain_hello_world.api.services.async.BalanceServiceAsyncImpl
import com.rain_hello_world.api.services.async.CardServiceAsync
import com.rain_hello_world.api.services.async.CardServiceAsyncImpl
import com.rain_hello_world.api.services.async.CompanyServiceAsync
import com.rain_hello_world.api.services.async.CompanyServiceAsyncImpl
import com.rain_hello_world.api.services.async.ContractServiceAsync
import com.rain_hello_world.api.services.async.ContractServiceAsyncImpl
import com.rain_hello_world.api.services.async.DisputeServiceAsync
import com.rain_hello_world.api.services.async.DisputeServiceAsyncImpl
import com.rain_hello_world.api.services.async.KeyServiceAsync
import com.rain_hello_world.api.services.async.KeyServiceAsyncImpl
import com.rain_hello_world.api.services.async.PaymentServiceAsync
import com.rain_hello_world.api.services.async.PaymentServiceAsyncImpl
import com.rain_hello_world.api.services.async.SignatureServiceAsync
import com.rain_hello_world.api.services.async.SignatureServiceAsyncImpl
import com.rain_hello_world.api.services.async.TransactionServiceAsync
import com.rain_hello_world.api.services.async.TransactionServiceAsyncImpl
import com.rain_hello_world.api.services.async.UserServiceAsync
import com.rain_hello_world.api.services.async.UserServiceAsyncImpl

class RainHelloWorldClientAsyncImpl(private val clientOptions: ClientOptions) :
    RainHelloWorldClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: RainHelloWorldClient by lazy { RainHelloWorldClientImpl(clientOptions) }

    private val withRawResponse: RainHelloWorldClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val applications: ApplicationServiceAsync by lazy {
        ApplicationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val balances: BalanceServiceAsync by lazy {
        BalanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val companies: CompanyServiceAsync by lazy {
        CompanyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val contracts: ContractServiceAsync by lazy {
        ContractServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val disputes: DisputeServiceAsync by lazy {
        DisputeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val keys: KeyServiceAsync by lazy { KeyServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val payments: PaymentServiceAsync by lazy {
        PaymentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val signatures: SignatureServiceAsync by lazy {
        SignatureServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): RainHelloWorldClient = sync

    override fun withRawResponse(): RainHelloWorldClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RainHelloWorldClientAsync =
        RainHelloWorldClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun applications(): ApplicationServiceAsync = applications

    override fun balances(): BalanceServiceAsync = balances

    override fun cards(): CardServiceAsync = cards

    override fun companies(): CompanyServiceAsync = companies

    override fun contracts(): ContractServiceAsync = contracts

    override fun disputes(): DisputeServiceAsync = disputes

    override fun keys(): KeyServiceAsync = keys

    override fun payments(): PaymentServiceAsync = payments

    override fun signatures(): SignatureServiceAsync = signatures

    override fun transactions(): TransactionServiceAsync = transactions

    override fun users(): UserServiceAsync = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RainHelloWorldClientAsync.WithRawResponse {

        private val applications: ApplicationServiceAsync.WithRawResponse by lazy {
            ApplicationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val balances: BalanceServiceAsync.WithRawResponse by lazy {
            BalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cards: CardServiceAsync.WithRawResponse by lazy {
            CardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val companies: CompanyServiceAsync.WithRawResponse by lazy {
            CompanyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val contracts: ContractServiceAsync.WithRawResponse by lazy {
            ContractServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val disputes: DisputeServiceAsync.WithRawResponse by lazy {
            DisputeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val keys: KeyServiceAsync.WithRawResponse by lazy {
            KeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val payments: PaymentServiceAsync.WithRawResponse by lazy {
            PaymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val signatures: SignatureServiceAsync.WithRawResponse by lazy {
            SignatureServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionServiceAsync.WithRawResponse by lazy {
            TransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RainHelloWorldClientAsync.WithRawResponse =
            RainHelloWorldClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun applications(): ApplicationServiceAsync.WithRawResponse = applications

        override fun balances(): BalanceServiceAsync.WithRawResponse = balances

        override fun cards(): CardServiceAsync.WithRawResponse = cards

        override fun companies(): CompanyServiceAsync.WithRawResponse = companies

        override fun contracts(): ContractServiceAsync.WithRawResponse = contracts

        override fun disputes(): DisputeServiceAsync.WithRawResponse = disputes

        override fun keys(): KeyServiceAsync.WithRawResponse = keys

        override fun payments(): PaymentServiceAsync.WithRawResponse = payments

        override fun signatures(): SignatureServiceAsync.WithRawResponse = signatures

        override fun transactions(): TransactionServiceAsync.WithRawResponse = transactions

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
