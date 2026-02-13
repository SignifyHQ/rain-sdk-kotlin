// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.client

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.getPackageVersion
import com.rain_sdk.api.services.blocking.ApplicationService
import com.rain_sdk.api.services.blocking.ApplicationServiceImpl
import com.rain_sdk.api.services.blocking.BalanceService
import com.rain_sdk.api.services.blocking.BalanceServiceImpl
import com.rain_sdk.api.services.blocking.CardService
import com.rain_sdk.api.services.blocking.CardServiceImpl
import com.rain_sdk.api.services.blocking.CompanyService
import com.rain_sdk.api.services.blocking.CompanyServiceImpl
import com.rain_sdk.api.services.blocking.ContractService
import com.rain_sdk.api.services.blocking.ContractServiceImpl
import com.rain_sdk.api.services.blocking.DisputeService
import com.rain_sdk.api.services.blocking.DisputeServiceImpl
import com.rain_sdk.api.services.blocking.KeyService
import com.rain_sdk.api.services.blocking.KeyServiceImpl
import com.rain_sdk.api.services.blocking.PaymentService
import com.rain_sdk.api.services.blocking.PaymentServiceImpl
import com.rain_sdk.api.services.blocking.SignatureService
import com.rain_sdk.api.services.blocking.SignatureServiceImpl
import com.rain_sdk.api.services.blocking.TransactionService
import com.rain_sdk.api.services.blocking.TransactionServiceImpl
import com.rain_sdk.api.services.blocking.UserService
import com.rain_sdk.api.services.blocking.UserServiceImpl

class RainClientImpl(private val clientOptions: ClientOptions) : RainClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: RainClientAsync by lazy { RainClientAsyncImpl(clientOptions) }

    private val withRawResponse: RainClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val applications: ApplicationService by lazy {
        ApplicationServiceImpl(clientOptionsWithUserAgent)
    }

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptionsWithUserAgent) }

    private val cards: CardService by lazy { CardServiceImpl(clientOptionsWithUserAgent) }

    private val companies: CompanyService by lazy { CompanyServiceImpl(clientOptionsWithUserAgent) }

    private val contracts: ContractService by lazy {
        ContractServiceImpl(clientOptionsWithUserAgent)
    }

    private val disputes: DisputeService by lazy { DisputeServiceImpl(clientOptionsWithUserAgent) }

    private val keys: KeyService by lazy { KeyServiceImpl(clientOptionsWithUserAgent) }

    private val payments: PaymentService by lazy { PaymentServiceImpl(clientOptionsWithUserAgent) }

    private val signatures: SignatureService by lazy {
        SignatureServiceImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionService by lazy {
        TransactionServiceImpl(clientOptionsWithUserAgent)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): RainClientAsync = async

    override fun withRawResponse(): RainClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RainClient =
        RainClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun applications(): ApplicationService = applications

    override fun balances(): BalanceService = balances

    override fun cards(): CardService = cards

    override fun companies(): CompanyService = companies

    override fun contracts(): ContractService = contracts

    override fun disputes(): DisputeService = disputes

    override fun keys(): KeyService = keys

    override fun payments(): PaymentService = payments

    override fun signatures(): SignatureService = signatures

    override fun transactions(): TransactionService = transactions

    override fun users(): UserService = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RainClient.WithRawResponse {

        private val applications: ApplicationService.WithRawResponse by lazy {
            ApplicationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val balances: BalanceService.WithRawResponse by lazy {
            BalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cards: CardService.WithRawResponse by lazy {
            CardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val companies: CompanyService.WithRawResponse by lazy {
            CompanyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val contracts: ContractService.WithRawResponse by lazy {
            ContractServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val disputes: DisputeService.WithRawResponse by lazy {
            DisputeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val keys: KeyService.WithRawResponse by lazy {
            KeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val payments: PaymentService.WithRawResponse by lazy {
            PaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val signatures: SignatureService.WithRawResponse by lazy {
            SignatureServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionService.WithRawResponse by lazy {
            TransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RainClient.WithRawResponse =
            RainClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun applications(): ApplicationService.WithRawResponse = applications

        override fun balances(): BalanceService.WithRawResponse = balances

        override fun cards(): CardService.WithRawResponse = cards

        override fun companies(): CompanyService.WithRawResponse = companies

        override fun contracts(): ContractService.WithRawResponse = contracts

        override fun disputes(): DisputeService.WithRawResponse = disputes

        override fun keys(): KeyService.WithRawResponse = keys

        override fun payments(): PaymentService.WithRawResponse = payments

        override fun signatures(): SignatureService.WithRawResponse = signatures

        override fun transactions(): TransactionService.WithRawResponse = transactions

        override fun users(): UserService.WithRawResponse = users
    }
}
