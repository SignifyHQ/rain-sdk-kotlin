// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponse
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.applications.user.IssuingUser
import com.rain_hello_world.api.models.cards.IssuingCard
import com.rain_hello_world.api.models.companies.IssuingChargeCreateResponse
import com.rain_hello_world.api.models.companies.IssuingContract
import com.rain_hello_world.api.models.users.UserCreateCardParams
import com.rain_hello_world.api.models.users.UserCreateChargeParams
import com.rain_hello_world.api.models.users.UserCreateParams
import com.rain_hello_world.api.models.users.UserDeleteParams
import com.rain_hello_world.api.models.users.UserInitiatePaymentParams
import com.rain_hello_world.api.models.users.UserInitiatePaymentResponse
import com.rain_hello_world.api.models.users.UserListParams
import com.rain_hello_world.api.models.users.UserRetrieveBalancesParams
import com.rain_hello_world.api.models.users.UserRetrieveBalancesResponse
import com.rain_hello_world.api.models.users.UserRetrieveContractsParams
import com.rain_hello_world.api.models.users.UserRetrieveParams
import com.rain_hello_world.api.models.users.UserUpdateParams
import com.rain_hello_world.api.services.async.users.SignatureServiceAsync

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync

    fun signatures(): SignatureServiceAsync

    /**
     * This endpoint allows the creation of a new authorized user with the necessary personal
     * details, including contact and wallet information.
     */
    suspend fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /**
     * This endpoint retrieves a specific user by their unique ID. The user details, including
     * contact and wallet information, are returned.
     */
    suspend fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser = retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /** @see retrieve */
    suspend fun retrieve(userId: String, requestOptions: RequestOptions): IssuingUser =
        retrieve(userId, UserRetrieveParams.none(), requestOptions)

    /**
     * This endpoint allows the update of a specific user's information, such as their name, email,
     * and contact details.
     */
    suspend fun update(
        userId: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser = update(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /** @see update */
    suspend fun update(userId: String, requestOptions: RequestOptions): IssuingUser =
        update(userId, UserUpdateParams.none(), requestOptions)

    /**
     * This endpoint retrieves all users associated with a specific company. The response will
     * return a list of users, including their personal and contact details.
     */
    suspend fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingUser>

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): List<IssuingUser> =
        list(UserListParams.none(), requestOptions)

    /**
     * This endpoint deletes a user by their unique ID. Once deleted, the user will no longer have
     * access to the system.
     */
    suspend fun delete(
        userId: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(userId: String, requestOptions: RequestOptions) =
        delete(userId, UserDeleteParams.none(), requestOptions)

    /**
     * This endpoint allows the creation of a card for a specific user. The card can either be
     * physical or virtual and can include various configuration options such as the display name
     * and limit.
     */
    suspend fun createCard(
        userId: String,
        params: UserCreateCardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard = createCard(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see createCard */
    suspend fun createCard(
        params: UserCreateCardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingCard

    /**
     * This endpoint allows creating a custom fee charge for a specific user. The fee can be defined
     * in the request body along with its details.
     */
    suspend fun createCharge(
        userId: String,
        params: UserCreateChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingChargeCreateResponse =
        createCharge(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see createCharge */
    suspend fun createCharge(
        params: UserCreateChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingChargeCreateResponse

    /**
     * This endpoint allows initiating a payment for a specific user. The payment is made from the
     * user's wallet address to the specified recipient address.
     */
    suspend fun initiatePayment(
        userId: String,
        params: UserInitiatePaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserInitiatePaymentResponse =
        initiatePayment(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see initiatePayment */
    suspend fun initiatePayment(
        params: UserInitiatePaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserInitiatePaymentResponse

    /**
     * This endpoint retrieves the credit balances for a specific user. It provides information
     * about the user's credit limit, pending charges, posted charges, balance due, and spending
     * power.
     */
    suspend fun retrieveBalances(
        userId: String,
        params: UserRetrieveBalancesParams = UserRetrieveBalancesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveBalancesResponse =
        retrieveBalances(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieveBalances */
    suspend fun retrieveBalances(
        params: UserRetrieveBalancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveBalancesResponse

    /** @see retrieveBalances */
    suspend fun retrieveBalances(
        userId: String,
        requestOptions: RequestOptions,
    ): UserRetrieveBalancesResponse =
        retrieveBalances(userId, UserRetrieveBalancesParams.none(), requestOptions)

    /**
     * This endpoint retrieves smart contract information for a specific user. It returns a list of
     * contracts associated with the user.
     */
    suspend fun retrieveContracts(
        userId: String,
        params: UserRetrieveContractsParams = UserRetrieveContractsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingContract> =
        retrieveContracts(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieveContracts */
    suspend fun retrieveContracts(
        params: UserRetrieveContractsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<IssuingContract>

    /** @see retrieveContracts */
    suspend fun retrieveContracts(
        userId: String,
        requestOptions: RequestOptions,
    ): List<IssuingContract> =
        retrieveContracts(userId, UserRetrieveContractsParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync.WithRawResponse

        fun signatures(): SignatureServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /users`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /**
         * Returns a raw HTTP response for `get /users/{userId}`, but is otherwise the same as
         * [UserServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingUser> =
            retrieve(userId, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /users/{userId}`, but is otherwise the same as
         * [UserServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            userId: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            update(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssuingUser> = update(userId, UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /users`, but is otherwise the same as
         * [UserServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingUser>>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<IssuingUser>> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /users/{userId}`, but is otherwise the same as
         * [UserServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            userId: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(userId: String, requestOptions: RequestOptions): HttpResponse =
            delete(userId, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /users/{userId}/cards`, but is otherwise the same
         * as [UserServiceAsync.createCard].
         */
        @MustBeClosed
        suspend fun createCard(
            userId: String,
            params: UserCreateCardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard> =
            createCard(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see createCard */
        @MustBeClosed
        suspend fun createCard(
            params: UserCreateCardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingCard>

        /**
         * Returns a raw HTTP response for `post /users/{userId}/charges`, but is otherwise the same
         * as [UserServiceAsync.createCharge].
         */
        @MustBeClosed
        suspend fun createCharge(
            userId: String,
            params: UserCreateChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingChargeCreateResponse> =
            createCharge(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see createCharge */
        @MustBeClosed
        suspend fun createCharge(
            params: UserCreateChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingChargeCreateResponse>

        /**
         * Returns a raw HTTP response for `post /users/{userId}/payments`, but is otherwise the
         * same as [UserServiceAsync.initiatePayment].
         */
        @MustBeClosed
        suspend fun initiatePayment(
            userId: String,
            params: UserInitiatePaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserInitiatePaymentResponse> =
            initiatePayment(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see initiatePayment */
        @MustBeClosed
        suspend fun initiatePayment(
            params: UserInitiatePaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserInitiatePaymentResponse>

        /**
         * Returns a raw HTTP response for `get /users/{userId}/balances`, but is otherwise the same
         * as [UserServiceAsync.retrieveBalances].
         */
        @MustBeClosed
        suspend fun retrieveBalances(
            userId: String,
            params: UserRetrieveBalancesParams = UserRetrieveBalancesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveBalancesResponse> =
            retrieveBalances(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieveBalances */
        @MustBeClosed
        suspend fun retrieveBalances(
            params: UserRetrieveBalancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveBalancesResponse>

        /** @see retrieveBalances */
        @MustBeClosed
        suspend fun retrieveBalances(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveBalancesResponse> =
            retrieveBalances(userId, UserRetrieveBalancesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /users/{userId}/contracts`, but is otherwise the
         * same as [UserServiceAsync.retrieveContracts].
         */
        @MustBeClosed
        suspend fun retrieveContracts(
            userId: String,
            params: UserRetrieveContractsParams = UserRetrieveContractsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingContract>> =
            retrieveContracts(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieveContracts */
        @MustBeClosed
        suspend fun retrieveContracts(
            params: UserRetrieveContractsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<IssuingContract>>

        /** @see retrieveContracts */
        @MustBeClosed
        suspend fun retrieveContracts(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<IssuingContract>> =
            retrieveContracts(userId, UserRetrieveContractsParams.none(), requestOptions)
    }
}
