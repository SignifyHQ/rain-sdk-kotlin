// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.applications.company.IssuingCompany
import com.rain_hello_world.api.models.applications.user.IssuingUser
import com.rain_hello_world.api.models.companies.CompanyChargeParams
import com.rain_hello_world.api.models.companies.CompanyCreateUserParams
import com.rain_hello_world.api.models.companies.CompanyInitiatePaymentParams
import com.rain_hello_world.api.models.companies.CompanyInitiatePaymentResponse
import com.rain_hello_world.api.models.companies.CompanyListParams
import com.rain_hello_world.api.models.companies.CompanyRetrieveBalancesParams
import com.rain_hello_world.api.models.companies.CompanyRetrieveBalancesResponse
import com.rain_hello_world.api.models.companies.CompanyRetrieveContractsParams
import com.rain_hello_world.api.models.companies.CompanyRetrieveParams
import com.rain_hello_world.api.models.companies.CompanyUpdateParams
import com.rain_hello_world.api.models.companies.IssuingChargeCreateResponse
import com.rain_hello_world.api.models.companies.IssuingContract
import com.rain_hello_world.api.services.blocking.companies.SignatureService

interface CompanyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompanyService

    fun signatures(): SignatureService

    /** Retrieve detailed information about a specific company using its unique ID */
    fun retrieve(
        companyId: String,
        params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany = retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CompanyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany

    /** @see retrieve */
    fun retrieve(companyId: String, requestOptions: RequestOptions): IssuingCompany =
        retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

    /** Update the details of an existing company such as its name and address */
    fun update(
        companyId: String,
        params: CompanyUpdateParams = CompanyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany = update(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see update */
    fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCompany

    /** @see update */
    fun update(companyId: String, requestOptions: RequestOptions): IssuingCompany =
        update(companyId, CompanyUpdateParams.none(), requestOptions)

    /** Retrieves a list of all companies registered in the system */
    fun list(
        params: CompanyListParams = CompanyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingCompany>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<IssuingCompany> =
        list(CompanyListParams.none(), requestOptions)

    /** Initiate a custom fee charge for a company. */
    fun charge(
        companyId: String,
        params: CompanyChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingChargeCreateResponse =
        charge(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see charge */
    fun charge(
        params: CompanyChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingChargeCreateResponse

    /**
     * Creates a new user within a specific company. The user must provide details such as their
     * name, birthdate, and contact information.
     */
    fun createUser(
        companyId: String,
        params: CompanyCreateUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser = createUser(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see createUser */
    fun createUser(
        params: CompanyCreateUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /**
     * Initiate a payment for a specific company by providing the payment amount and wallet address.
     */
    fun initiatePayment(
        companyId: String,
        params: CompanyInitiatePaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyInitiatePaymentResponse =
        initiatePayment(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see initiatePayment */
    fun initiatePayment(
        params: CompanyInitiatePaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyInitiatePaymentResponse

    /**
     * Retrieve the current credit balances of a company, including credit limits, pending charges,
     * and the amount due.
     */
    fun retrieveBalances(
        companyId: String,
        params: CompanyRetrieveBalancesParams = CompanyRetrieveBalancesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyRetrieveBalancesResponse =
        retrieveBalances(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see retrieveBalances */
    fun retrieveBalances(
        params: CompanyRetrieveBalancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyRetrieveBalancesResponse

    /** @see retrieveBalances */
    fun retrieveBalances(
        companyId: String,
        requestOptions: RequestOptions,
    ): CompanyRetrieveBalancesResponse =
        retrieveBalances(companyId, CompanyRetrieveBalancesParams.none(), requestOptions)

    /** Retrieve the smart contract details associated with a company */
    fun retrieveContracts(
        companyId: String,
        params: CompanyRetrieveContractsParams = CompanyRetrieveContractsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingContract> =
        retrieveContracts(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see retrieveContracts */
    fun retrieveContracts(
        params: CompanyRetrieveContractsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingContract>

    /** @see retrieveContracts */
    fun retrieveContracts(
        companyId: String,
        requestOptions: RequestOptions,
    ): List<IssuingContract> =
        retrieveContracts(companyId, CompanyRetrieveContractsParams.none(), requestOptions)

    /** A view of [CompanyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompanyService.WithRawResponse

        fun signatures(): SignatureService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /companies/{companyId}`, but is otherwise the same
         * as [CompanyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            companyId: String,
            params: CompanyRetrieveParams = CompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany> =
            retrieve(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CompanyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            companyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCompany> =
            retrieve(companyId, CompanyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /companies/{companyId}`, but is otherwise the same
         * as [CompanyService.update].
         */
        @MustBeClosed
        fun update(
            companyId: String,
            params: CompanyUpdateParams = CompanyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany> =
            update(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCompany>

        /** @see update */
        @MustBeClosed
        fun update(
            companyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingCompany> =
            update(companyId, CompanyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /companies`, but is otherwise the same as
         * [CompanyService.list].
         */
        @MustBeClosed
        fun list(
            params: CompanyListParams = CompanyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingCompany>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<IssuingCompany>> =
            list(CompanyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /companies/{companyId}/charges`, but is otherwise
         * the same as [CompanyService.charge].
         */
        @MustBeClosed
        fun charge(
            companyId: String,
            params: CompanyChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingChargeCreateResponse> =
            charge(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see charge */
        @MustBeClosed
        fun charge(
            params: CompanyChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingChargeCreateResponse>

        /**
         * Returns a raw HTTP response for `post /companies/{companyId}/users`, but is otherwise the
         * same as [CompanyService.createUser].
         */
        @MustBeClosed
        fun createUser(
            companyId: String,
            params: CompanyCreateUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            createUser(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see createUser */
        @MustBeClosed
        fun createUser(
            params: CompanyCreateUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /**
         * Returns a raw HTTP response for `post /companies/{companyId}/payments`, but is otherwise
         * the same as [CompanyService.initiatePayment].
         */
        @MustBeClosed
        fun initiatePayment(
            companyId: String,
            params: CompanyInitiatePaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyInitiatePaymentResponse> =
            initiatePayment(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see initiatePayment */
        @MustBeClosed
        fun initiatePayment(
            params: CompanyInitiatePaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyInitiatePaymentResponse>

        /**
         * Returns a raw HTTP response for `get /companies/{companyId}/balances`, but is otherwise
         * the same as [CompanyService.retrieveBalances].
         */
        @MustBeClosed
        fun retrieveBalances(
            companyId: String,
            params: CompanyRetrieveBalancesParams = CompanyRetrieveBalancesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyRetrieveBalancesResponse> =
            retrieveBalances(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see retrieveBalances */
        @MustBeClosed
        fun retrieveBalances(
            params: CompanyRetrieveBalancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyRetrieveBalancesResponse>

        /** @see retrieveBalances */
        @MustBeClosed
        fun retrieveBalances(
            companyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyRetrieveBalancesResponse> =
            retrieveBalances(companyId, CompanyRetrieveBalancesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /companies/{companyId}/contracts`, but is otherwise
         * the same as [CompanyService.retrieveContracts].
         */
        @MustBeClosed
        fun retrieveContracts(
            companyId: String,
            params: CompanyRetrieveContractsParams = CompanyRetrieveContractsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingContract>> =
            retrieveContracts(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see retrieveContracts */
        @MustBeClosed
        fun retrieveContracts(
            params: CompanyRetrieveContractsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingContract>>

        /** @see retrieveContracts */
        @MustBeClosed
        fun retrieveContracts(
            companyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingContract>> =
            retrieveContracts(companyId, CompanyRetrieveContractsParams.none(), requestOptions)
    }
}
