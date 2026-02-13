// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.core.http.HttpResponseFor
import com.rain_sdk.api.models.keys.KeyCreateParams
import com.rain_sdk.api.models.keys.KeyCreateResponse
import com.rain_sdk.api.models.keys.KeyDeleteParams

interface KeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): KeyServiceAsync

    /**
     * This endpoint allows for the creation of a new key with a specified name and expiration time.
     * The key is used for various security operations within the system.
     */
    suspend fun create(
        params: KeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyCreateResponse

    /** This endpoint allows for the deletion of a specific key using its unique ID. */
    suspend fun delete(
        keyId: String,
        params: KeyDeleteParams = KeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().keyId(keyId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: KeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(keyId: String, requestOptions: RequestOptions) =
        delete(keyId, KeyDeleteParams.none(), requestOptions)

    /** A view of [KeyServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): KeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /keys`, but is otherwise the same as
         * [KeyServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: KeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyCreateResponse>

        /**
         * Returns a raw HTTP response for `delete /keys/{keyId}`, but is otherwise the same as
         * [KeyServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            keyId: String,
            params: KeyDeleteParams = KeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().keyId(keyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: KeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(keyId: String, requestOptions: RequestOptions): HttpResponse =
            delete(keyId, KeyDeleteParams.none(), requestOptions)
    }
}
