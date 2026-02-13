// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.TestServerExtension
import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.applications.company.PhysicalAddress
import com.rain_sdk.api.models.companies.CompanyChargeParams
import com.rain_sdk.api.models.companies.CompanyCreateUserParams
import com.rain_sdk.api.models.companies.CompanyInitiatePaymentParams
import com.rain_sdk.api.models.companies.CompanyListParams
import com.rain_sdk.api.models.companies.CompanyUpdateParams
import com.rain_sdk.api.models.companies.IssuingChargeCreateBody
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompanyServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val issuingCompany = companyService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingCompany.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val issuingCompany =
            companyService.update(
                CompanyUpdateParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    .name("name")
                    .build()
            )

        issuingCompany.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val issuingCompanies =
            companyService.list(CompanyListParams.builder().cursor("cursor").limit(1L).build())

        issuingCompanies.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun charge() {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val issuingChargeCreateResponse =
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

        issuingChargeCreateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createUser() {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val issuingUser =
            companyService.createUser(
                CompanyCreateUserParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .email("email")
                    .firstName("firstName")
                    .isTermsOfServiceAccepted(true)
                    .lastName("lastName")
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
                    .birthDate(LocalDate.parse("2019-12-27"))
                    .phoneCountryCode("phoneCountryCode")
                    .phoneNumber("phoneNumber")
                    .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .build()
            )

        issuingUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun initiatePayment() {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val response =
            companyService.initiatePayment(
                CompanyInitiatePaymentParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .chainId(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveBalances() {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val response = companyService.retrieveBalances("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveContracts() {
        val client =
            RainOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyService = client.companies()

        val issuingContracts =
            companyService.retrieveContracts("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingContracts.forEach { it.validate() }
    }
}
