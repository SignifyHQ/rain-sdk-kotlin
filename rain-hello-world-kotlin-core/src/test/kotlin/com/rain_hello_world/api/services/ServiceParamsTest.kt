// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.rain_hello_world.api.client.RainHelloWorldClient
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClient
import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.models.applications.company.CompanyCreateParams
import com.rain_hello_world.api.models.applications.company.IssuingApplicationPerson
import com.rain_hello_world.api.models.applications.company.PhysicalAddress
import java.time.LocalDate
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: RainHelloWorldClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            RainHelloWorldOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val companyService = client.applications().company()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        companyService.create(
            CompanyCreateParams.builder()
                .address(
                    PhysicalAddress.builder()
                        .city("city")
                        .country("country")
                        .countryCode("xx")
                        .line1("line1")
                        .postalCode("postalCode")
                        .region("region")
                        .line2("line2")
                        .build()
                )
                .entity(
                    CompanyCreateParams.Entity.builder()
                        .name("name")
                        .registrationNumber("registrationNumber")
                        .taxId("taxId")
                        .website("website")
                        .description("description")
                        .expectedSpend("expectedSpend")
                        .type("type")
                        .build()
                )
                .initialUser(
                    CompanyCreateParams.InitialUser.builder()
                        .address(
                            PhysicalAddress.builder()
                                .city("city")
                                .country("country")
                                .countryCode("xx")
                                .line1("line1")
                                .postalCode("postalCode")
                                .region("region")
                                .line2("line2")
                                .build()
                        )
                        .birthDate(LocalDate.parse("2000-01-01"))
                        .countryOfIssue("xx")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .nationalId("nationalId")
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .phoneCountryCode("1")
                        .phoneNumber("5555555555")
                        .ipAddress("ipAddress")
                        .isTermsOfServiceAccepted(
                            CompanyCreateParams.InitialUser.IsTermsOfServiceAccepted.TRUE
                        )
                        .role("role")
                        .solanaAddress("WRktL2iKFTHZg6qNBPzV1b1WLYwfnZ5JSHo2UV8L1R")
                        .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                        .build()
                )
                .name("name")
                .addRepresentative(
                    IssuingApplicationPerson.builder()
                        .address(
                            PhysicalAddress.builder()
                                .city("city")
                                .country("country")
                                .countryCode("xx")
                                .line1("line1")
                                .postalCode("postalCode")
                                .region("region")
                                .line2("line2")
                                .build()
                        )
                        .birthDate(LocalDate.parse("2000-01-01"))
                        .countryOfIssue("xx")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .nationalId("nationalId")
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .phoneCountryCode("1")
                        .phoneNumber("5555555555")
                        .build()
                )
                .addUltimateBeneficialOwner(
                    IssuingApplicationPerson.builder()
                        .address(
                            PhysicalAddress.builder()
                                .city("city")
                                .country("country")
                                .countryCode("xx")
                                .line1("line1")
                                .postalCode("postalCode")
                                .region("region")
                                .line2("line2")
                                .build()
                        )
                        .birthDate(LocalDate.parse("2000-01-01"))
                        .countryOfIssue("xx")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .nationalId("nationalId")
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .phoneCountryCode("1")
                        .phoneNumber("5555555555")
                        .build()
                )
                .chainId("chainId")
                .contractAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .sourceKey("x")
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
