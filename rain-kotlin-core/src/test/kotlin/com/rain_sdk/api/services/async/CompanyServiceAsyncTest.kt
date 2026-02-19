// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
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

internal class CompanyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val companyServiceAsync = client.companies()

        val issuingCompany = companyServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingCompany.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val companyServiceAsync = client.companies()

        val issuingCompany =
            companyServiceAsync.update(
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

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val companyServiceAsync = client.companies()

        val issuingCompanies =
            companyServiceAsync.list(CompanyListParams.builder().cursor("cursor").limit(1L).build())

        issuingCompanies.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun charge() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val companyServiceAsync = client.companies()

        val issuingChargeCreateResponse =
            companyServiceAsync.charge(
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

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun createUser() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val companyServiceAsync = client.companies()

        val issuingUser =
            companyServiceAsync.createUser(
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

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun initiatePayment() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val companyServiceAsync = client.companies()

        val response =
            companyServiceAsync.initiatePayment(
                CompanyInitiatePaymentParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .chainId(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveBalances() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val companyServiceAsync = client.companies()

        val response = companyServiceAsync.retrieveBalances("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveContracts() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val companyServiceAsync = client.companies()

        val issuingContracts =
            companyServiceAsync.retrieveContracts("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingContracts.forEach { it.validate() }
    }
}
