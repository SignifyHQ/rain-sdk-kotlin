// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async.applications

import com.google.errorprone.annotations.MustBeClosed
import com.rain_hello_world.api.core.ClientOptions
import com.rain_hello_world.api.core.RequestOptions
import com.rain_hello_world.api.core.http.HttpResponse
import com.rain_hello_world.api.core.http.HttpResponseFor
import com.rain_hello_world.api.models.applications.user.IssuingUser
import com.rain_hello_world.api.models.applications.user.UserCreateParams
import com.rain_hello_world.api.models.applications.user.UserInitiateParams
import com.rain_hello_world.api.models.applications.user.UserReapplyParams
import com.rain_hello_world.api.models.applications.user.UserRetrieveParams
import com.rain_hello_world.api.models.applications.user.UserRetrieveResponse
import com.rain_hello_world.api.models.applications.user.UserUpdateParams
import com.rain_hello_world.api.models.applications.user.UserUploadDocumentParams

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

    /**
     * Submits an application to create a consumer account for a user. The application can be
     * submitted using a Sumsub share token, Persona share token, or directly via API. The user must
     * provide details about their wallet, occupation, salary, and other account-related
     * information.
     */
    suspend fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): IssuingUser =
        create(UserCreateParams.none(), requestOptions)

    /**
     * Retrieves the current status and details of a user's consumer application. This includes the
     * user's application progress and related information.
     */
    suspend fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse = retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(userId: String, requestOptions: RequestOptions): UserRetrieveResponse =
        retrieve(userId, UserRetrieveParams.none(), requestOptions)

    /**
     * Updates the application information for a user, including personal details such as name,
     * birth date, occupation, national ID, and account purpose.
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
     * Submits an initial application for creating a consumer account. This request gathers basic
     * personal details of the user, including their first and last name, email address, and
     * optional wallet address if using a Rain-managed solution or hosted completion flow.
     */
    suspend fun initiate(
        params: UserInitiateParams = UserInitiateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /** @see initiate */
    suspend fun initiate(requestOptions: RequestOptions): IssuingUser =
        initiate(UserInitiateParams.none(), requestOptions)

    /**
     * Allows a user to reapply or respond to a request for additional information regarding their
     * consumer application. This is used when the initial application needs updating or more
     * information is required.
     */
    @Deprecated("deprecated")
    suspend fun reapply(
        userId: String,
        params: UserReapplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser = reapply(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see reapply */
    @Deprecated("deprecated")
    suspend fun reapply(
        params: UserReapplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /**
     * Uploads a document for a user to support their consumer application. This is used to provide
     * additional verification documents such as IDs, utility bills, and other required legal
     * documents.
     */
    suspend fun uploadDocument(
        userId: String,
        params: UserUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = uploadDocument(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see uploadDocument */
    suspend fun uploadDocument(
        params: UserUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /applications/user`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<IssuingUser> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/user/{userId}`, but is otherwise the
         * same as [UserServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(userId, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /applications/user/{userId}`, but is otherwise the
         * same as [UserServiceAsync.update].
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
         * Returns a raw HTTP response for `post /applications/user/initiate`, but is otherwise the
         * same as [UserServiceAsync.initiate].
         */
        @MustBeClosed
        suspend fun initiate(
            params: UserInitiateParams = UserInitiateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /** @see initiate */
        @MustBeClosed
        suspend fun initiate(requestOptions: RequestOptions): HttpResponseFor<IssuingUser> =
            initiate(UserInitiateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /applications/user/{userId}/reapply`, but is
         * otherwise the same as [UserServiceAsync.reapply].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun reapply(
            userId: String,
            params: UserReapplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            reapply(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see reapply */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun reapply(
            params: UserReapplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /**
         * Returns a raw HTTP response for `put /applications/user/{userId}/document`, but is
         * otherwise the same as [UserServiceAsync.uploadDocument].
         */
        @MustBeClosed
        suspend fun uploadDocument(
            userId: String,
            params: UserUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = uploadDocument(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see uploadDocument */
        @MustBeClosed
        suspend fun uploadDocument(
            params: UserUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
