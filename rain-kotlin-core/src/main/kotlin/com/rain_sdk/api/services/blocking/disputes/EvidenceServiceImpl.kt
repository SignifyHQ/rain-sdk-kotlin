// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.disputes

import com.rain_sdk.api.core.ClientOptions
import com.rain_sdk.api.core.RequestOptions
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.handlers.emptyHandler
import com.rain_sdk.api.core.handlers.errorBodyHandler
import com.rain_sdk.api.core.handlers.errorHandler
import com.rain_sdk.api.core.http.HttpMethod
import com.rain_sdk.api.core.http.HttpRequest
import com.rain_sdk.api.core.http.HttpResponse
import com.rain_sdk.api.core.http.HttpResponse.Handler
import com.rain_sdk.api.core.http.multipartFormData
import com.rain_sdk.api.core.http.parseable
import com.rain_sdk.api.core.prepare
import com.rain_sdk.api.models.disputes.evidence.EvidenceListParams
import com.rain_sdk.api.models.disputes.evidence.EvidenceUploadParams

class EvidenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EvidenceService {

    private val withRawResponse: EvidenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EvidenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EvidenceService =
        EvidenceServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(params: EvidenceListParams, requestOptions: RequestOptions): HttpResponse =
        // get /disputes/{disputeId}/evidence
        withRawResponse().list(params, requestOptions)

    override fun upload(params: EvidenceUploadParams, requestOptions: RequestOptions) {
        // put /disputes/{disputeId}/evidence
        withRawResponse().upload(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EvidenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EvidenceService.WithRawResponse =
            EvidenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun list(
            params: EvidenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeId", params.disputeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("disputes", params._pathParam(0), "evidence")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val uploadHandler: Handler<Void?> = emptyHandler()

        override fun upload(
            params: EvidenceUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeId", params.disputeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("disputes", params._pathParam(0), "evidence")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadHandler.handle(it) }
            }
        }
    }
}
