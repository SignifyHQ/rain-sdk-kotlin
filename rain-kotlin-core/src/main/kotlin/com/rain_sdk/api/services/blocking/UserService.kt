// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.models.applications.user.IssuingUser
import com.rain_sdk.api.models.cards.IssuingCard
import com.rain_sdk.api.models.companies.IssuingChargeCreateResponse
import com.rain_sdk.api.models.companies.IssuingContract
import com.rain_sdk.api.models.users.UserCreateCardParams
import com.rain_sdk.api.models.users.UserCreateChargeParams
import com.rain_sdk.api.models.users.UserCreateParams
import com.rain_sdk.api.models.users.UserDeleteParams
import com.rain_sdk.api.models.users.UserInitiatePaymentParams
import com.rain_sdk.api.models.users.UserInitiatePaymentResponse
import com.rain_sdk.api.models.users.UserListParams
import com.rain_sdk.api.models.users.UserRetrieveBalancesParams
import com.rain_sdk.api.models.users.UserRetrieveBalancesResponse
import com.rain_sdk.api.models.users.UserRetrieveContractsParams
import com.rain_sdk.api.models.users.UserRetrieveParams
import com.rain_sdk.api.models.users.UserUpdateParams
import com.rain_sdk.api.services.blocking.users.SignatureService

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService

    fun signatures(): SignatureService

    /**
     * This endpoint allows the creation of a new authorized user with the necessary personal
     * details, including contact and wallet information.
     */
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /**
     * This endpoint retrieves a specific user by their unique ID. The user details, including
     * contact and wallet information, are returned.
     */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser = retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /** @see retrieve */
    fun retrieve(userId: String, requestOptions: RequestOptions): IssuingUser =
        retrieve(userId, UserRetrieveParams.none(), requestOptions)

    /**
     * This endpoint allows the update of a specific user's information, such as their name, email,
     * and contact details.
     */
    fun update(
        userId: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser = update(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see update */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /** @see update */
    fun update(userId: String, requestOptions: RequestOptions): IssuingUser =
        update(userId, UserUpdateParams.none(), requestOptions)

    /**
     * This endpoint retrieves all users associated with a specific company. The response will
     * return a list of users, including their personal and contact details.
     */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingUser>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<IssuingUser> =
        list(UserListParams.none(), requestOptions)

    /**
     * This endpoint deletes a user by their unique ID. Once deleted, the user will no longer have
     * access to the system.
     */
    fun delete(
        userId: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see delete */
    fun delete(params: UserDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(userId: String, requestOptions: RequestOptions) =
        delete(userId, UserDeleteParams.none(), requestOptions)

    /**
     * This endpoint allows the creation of a card for a specific user. The card can either be
     * physical or virtual and can include various configuration options such as the display name
     * and limit.
     */
    fun createCard(
        userId: String,
        params: UserCreateCardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard = createCard(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see createCard */
    fun createCard(
        params: UserCreateCardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard

    /**
     * This endpoint allows creating a custom fee charge for a specific user. The fee can be defined
     * in the request body along with its details.
     */
    fun createCharge(
        userId: String,
        params: UserCreateChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingChargeCreateResponse =
        createCharge(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see createCharge */
    fun createCharge(
        params: UserCreateChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingChargeCreateResponse

    /**
     * This endpoint allows initiating a payment for a specific user. The payment is made from the
     * user's wallet address to the specified recipient address.
     */
    fun initiatePayment(
        userId: String,
        params: UserInitiatePaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserInitiatePaymentResponse =
        initiatePayment(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see initiatePayment */
    fun initiatePayment(
        params: UserInitiatePaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserInitiatePaymentResponse

    /**
     * This endpoint retrieves the credit balances for a specific user. It provides information
     * about the user's credit limit, pending charges, posted charges, balance due, and spending
     * power.
     */
    fun retrieveBalances(
        userId: String,
        params: UserRetrieveBalancesParams = UserRetrieveBalancesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveBalancesResponse =
        retrieveBalances(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieveBalances */
    fun retrieveBalances(
        params: UserRetrieveBalancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveBalancesResponse

    /** @see retrieveBalances */
    fun retrieveBalances(
        userId: String,
        requestOptions: RequestOptions,
    ): UserRetrieveBalancesResponse =
        retrieveBalances(userId, UserRetrieveBalancesParams.none(), requestOptions)

    /**
     * This endpoint retrieves smart contract information for a specific user. It returns a list of
     * contracts associated with the user.
     */
    fun retrieveContracts(
        userId: String,
        params: UserRetrieveContractsParams = UserRetrieveContractsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingContract> =
        retrieveContracts(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieveContracts */
    fun retrieveContracts(
        params: UserRetrieveContractsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingContract>

    /** @see retrieveContracts */
    fun retrieveContracts(userId: String, requestOptions: RequestOptions): List<IssuingContract> =
        retrieveContracts(userId, UserRetrieveContractsParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService.WithRawResponse

        fun signatures(): SignatureService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /users`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed
        fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /**
         * Returns a raw HTTP response for `get /users/{userId}`, but is otherwise the same as
         * [UserService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(userId: String, requestOptions: RequestOptions): HttpResponseFor<IssuingUser> =
            retrieve(userId, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /users/{userId}`, but is otherwise the same as
         * [UserService.update].
         */
        @MustBeClosed
        fun update(
            userId: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            update(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /** @see update */
        @MustBeClosed
        fun update(userId: String, requestOptions: RequestOptions): HttpResponseFor<IssuingUser> =
            update(userId, UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /users`, but is otherwise the same as
         * [UserService.list].
         */
        @MustBeClosed
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingUser>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<IssuingUser>> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /users/{userId}`, but is otherwise the same as
         * [UserService.delete].
         */
        @MustBeClosed
        fun delete(
            userId: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(userId: String, requestOptions: RequestOptions): HttpResponse =
            delete(userId, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /users/{userId}/cards`, but is otherwise the same
         * as [UserService.createCard].
         */
        @MustBeClosed
        fun createCard(
            userId: String,
            params: UserCreateCardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard> =
            createCard(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see createCard */
        @MustBeClosed
        fun createCard(
            params: UserCreateCardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard>

        /**
         * Returns a raw HTTP response for `post /users/{userId}/charges`, but is otherwise the same
         * as [UserService.createCharge].
         */
        @MustBeClosed
        fun createCharge(
            userId: String,
            params: UserCreateChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingChargeCreateResponse> =
            createCharge(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see createCharge */
        @MustBeClosed
        fun createCharge(
            params: UserCreateChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingChargeCreateResponse>

        /**
         * Returns a raw HTTP response for `post /users/{userId}/payments`, but is otherwise the
         * same as [UserService.initiatePayment].
         */
        @MustBeClosed
        fun initiatePayment(
            userId: String,
            params: UserInitiatePaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserInitiatePaymentResponse> =
            initiatePayment(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see initiatePayment */
        @MustBeClosed
        fun initiatePayment(
            params: UserInitiatePaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserInitiatePaymentResponse>

        /**
         * Returns a raw HTTP response for `get /users/{userId}/balances`, but is otherwise the same
         * as [UserService.retrieveBalances].
         */
        @MustBeClosed
        fun retrieveBalances(
            userId: String,
            params: UserRetrieveBalancesParams = UserRetrieveBalancesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveBalancesResponse> =
            retrieveBalances(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieveBalances */
        @MustBeClosed
        fun retrieveBalances(
            params: UserRetrieveBalancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveBalancesResponse>

        /** @see retrieveBalances */
        @MustBeClosed
        fun retrieveBalances(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveBalancesResponse> =
            retrieveBalances(userId, UserRetrieveBalancesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /users/{userId}/contracts`, but is otherwise the
         * same as [UserService.retrieveContracts].
         */
        @MustBeClosed
        fun retrieveContracts(
            userId: String,
            params: UserRetrieveContractsParams = UserRetrieveContractsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingContract>> =
            retrieveContracts(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieveContracts */
        @MustBeClosed
        fun retrieveContracts(
            params: UserRetrieveContractsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingContract>>

        /** @see retrieveContracts */
        @MustBeClosed
        fun retrieveContracts(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingContract>> =
            retrieveContracts(userId, UserRetrieveContractsParams.none(), requestOptions)
    }
}
