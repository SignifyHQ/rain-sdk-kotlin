// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.rain_sdk.api.client.RainClient
import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.http.Headers
import com.rain_sdk.api.core.jsonMapper
import com.rain_sdk.api.errors.BadRequestException
import com.rain_sdk.api.errors.InternalServerException
import com.rain_sdk.api.errors.NotFoundException
import com.rain_sdk.api.errors.PermissionDeniedException
import com.rain_sdk.api.errors.RainException
import com.rain_sdk.api.errors.RateLimitException
import com.rain_sdk.api.errors.UnauthorizedException
import com.rain_sdk.api.errors.UnexpectedStatusCodeException
import com.rain_sdk.api.errors.UnprocessableEntityException
import com.rain_sdk.api.models.companies.CompanyChargeParams
import com.rain_sdk.api.models.companies.IssuingChargeCreateBody
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: RainClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            RainOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun companiesCharge400() {
        val companyService = client.companies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge400WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge401() {
        val companyService = client.companies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge401WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge403() {
        val companyService = client.companies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge403WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge404() {
        val companyService = client.companies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge404WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge422() {
        val companyService = client.companies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge422WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge429() {
        val companyService = client.companies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge429WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge500() {
        val companyService = client.companies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge500WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge999() {
        val companyService = client.companies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesCharge999WithRawResponse() {
        val companyService = client.companies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun companiesChargeInvalidJsonBody() {
        val companyService = client.companies()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<RainException> {
                companyService.charge(
                    CompanyChargeParams.builder()
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .issuingChargeCreateBody(
                            IssuingChargeCreateBody.builder()
                                .amount(1L)
                                .description("description")
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
