// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.applications

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.models.applications.user.IssuingUser
import com.rain_sdk.api.models.applications.user.UserCreateParams
import com.rain_sdk.api.models.applications.user.UserInitiateParams
import com.rain_sdk.api.models.applications.user.UserReapplyParams
import com.rain_sdk.api.models.applications.user.UserRetrieveParams
import com.rain_sdk.api.models.applications.user.UserRetrieveResponse
import com.rain_sdk.api.models.applications.user.UserUpdateParams
import com.rain_sdk.api.models.applications.user.UserUploadDocumentParams

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

    /**
     * Submits an application to create a consumer account for a user. The application can be
     * submitted using a Sumsub share token, Persona share token, or directly via API. The user must
     * provide details about their wallet, occupation, salary, and other account-related
     * information.
     */
    fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /** @see create */
    fun create(
        body: UserCreateParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser = create(UserCreateParams.builder().body(body).build(), requestOptions)

    /** @see create */
    fun create(
        usingSumsubShareToken: UserCreateParams.Body.UsingSumsubShareToken,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser =
        create(UserCreateParams.Body.ofUsingSumsubShareToken(usingSumsubShareToken), requestOptions)

    /** @see create */
    fun create(
        unionMember1: UserCreateParams.Body.UnionMember1,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser = create(UserCreateParams.Body.ofUnionMember1(unionMember1), requestOptions)

    /** @see create */
    fun create(
        usingApi: UserCreateParams.Body.UsingApi,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser = create(UserCreateParams.Body.ofUsingApi(usingApi), requestOptions)

    /** @see create */
    fun create(requestOptions: RequestOptions): IssuingUser =
        create(UserCreateParams.none(), requestOptions)

    /**
     * Retrieves the current status and details of a user's consumer application. This includes the
     * user's application progress and related information.
     */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse = retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse

    /** @see retrieve */
    fun retrieve(userId: String, requestOptions: RequestOptions): UserRetrieveResponse =
        retrieve(userId, UserRetrieveParams.none(), requestOptions)

    /**
     * Updates the application information for a user, including personal details such as name,
     * birth date, occupation, national ID, and account purpose.
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
     * Submits an initial application for creating a consumer account. This request gathers basic
     * personal details of the user, including their first and last name, email address, and
     * optional wallet address if using a Rain-managed solution or hosted completion flow.
     */
    fun initiate(
        params: UserInitiateParams = UserInitiateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /** @see initiate */
    fun initiate(requestOptions: RequestOptions): IssuingUser =
        initiate(UserInitiateParams.none(), requestOptions)

    /**
     * Allows a user to reapply or respond to a request for additional information regarding their
     * consumer application. This is used when the initial application needs updating or more
     * information is required.
     */
    @Deprecated("deprecated")
    fun reapply(
        userId: String,
        params: UserReapplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser = reapply(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see reapply */
    @Deprecated("deprecated")
    fun reapply(
        params: UserReapplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssuingUser

    /**
     * Uploads a document for a user to support their consumer application. This is used to provide
     * additional verification documents such as IDs, utility bills, and other required legal
     * documents.
     */
    fun uploadDocument(
        userId: String,
        params: UserUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = uploadDocument(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see uploadDocument */
    fun uploadDocument(
        params: UserUploadDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /applications/user`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed
        fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /** @see create */
        @MustBeClosed
        fun create(
            body: UserCreateParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            create(UserCreateParams.builder().body(body).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            usingSumsubShareToken: UserCreateParams.Body.UsingSumsubShareToken,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            create(
                UserCreateParams.Body.ofUsingSumsubShareToken(usingSumsubShareToken),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            unionMember1: UserCreateParams.Body.UnionMember1,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            create(UserCreateParams.Body.ofUnionMember1(unionMember1), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            usingApi: UserCreateParams.Body.UsingApi,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            create(UserCreateParams.Body.ofUsingApi(usingApi), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<IssuingUser> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/user/{userId}`, but is otherwise the
         * same as [UserService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(userId, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /applications/user/{userId}`, but is otherwise the
         * same as [UserService.update].
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
         * Returns a raw HTTP response for `post /applications/user/initiate`, but is otherwise the
         * same as [UserService.initiate].
         */
        @MustBeClosed
        fun initiate(
            params: UserInitiateParams = UserInitiateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /** @see initiate */
        @MustBeClosed
        fun initiate(requestOptions: RequestOptions): HttpResponseFor<IssuingUser> =
            initiate(UserInitiateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /applications/user/{userId}/reapply`, but is
         * otherwise the same as [UserService.reapply].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun reapply(
            userId: String,
            params: UserReapplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser> =
            reapply(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see reapply */
        @Deprecated("deprecated")
        @MustBeClosed
        fun reapply(
            params: UserReapplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssuingUser>

        /**
         * Returns a raw HTTP response for `put /applications/user/{userId}/document`, but is
         * otherwise the same as [UserService.uploadDocument].
         */
        @MustBeClosed
        fun uploadDocument(
            userId: String,
            params: UserUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = uploadDocument(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see uploadDocument */
        @MustBeClosed
        fun uploadDocument(
            params: UserUploadDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
