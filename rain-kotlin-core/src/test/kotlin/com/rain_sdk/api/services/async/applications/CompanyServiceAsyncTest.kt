// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async.applications

import com.rain_sdk.api.TestServerExtension
import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import com.rain_sdk.api.models.applications.company.CompanyCreateParams
import com.rain_sdk.api.models.applications.company.CompanyReapplyParams
import com.rain_sdk.api.models.applications.company.CompanyUpdateParams
import com.rain_sdk.api.models.applications.company.CompanyUploadDocumentParams
import com.rain_sdk.api.models.applications.company.IssuingApplicationPerson
import com.rain_sdk.api.models.applications.company.PhysicalAddress
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompanyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            RainOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyServiceAsync = client.applications().company()

        val issuingCompany =
            companyServiceAsync.create(
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
                    .build()
            )

        issuingCompany.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            RainOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyServiceAsync = client.applications().company()

        val company = companyServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        company.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            RainOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyServiceAsync = client.applications().company()

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
                    .entity(
                        CompanyUpdateParams.Entity.builder()
                            .description("description")
                            .expectedSpend("expectedSpend")
                            .registrationNumber("registrationNumber")
                            .taxId("taxId")
                            .type("type")
                            .website("website")
                            .build()
                    )
                    .name("name")
                    .build()
            )

        issuingCompany.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun reapply() {
        val client =
            RainOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyServiceAsync = client.applications().company()

        val issuingCompany =
            companyServiceAsync.reapply(
                CompanyReapplyParams.builder()
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
                    .entity(
                        CompanyReapplyParams.Entity.builder()
                            .website("website")
                            .description("description")
                            .expectedSpend("expectedSpend")
                            .type("type")
                            .build()
                    )
                    .initialUser(
                        CompanyReapplyParams.InitialUser.builder()
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
                            .countryOfIssue("countryOfIssue")
                            .ipAddress("ipAddress")
                            .isTermsOfServiceAccepted(
                                CompanyReapplyParams.InitialUser.IsTermsOfServiceAccepted.TRUE
                            )
                            .nationalId("nationalId")
                            .role("role")
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
                    .build()
            )

        issuingCompany.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun uploadDocument() {
        val client =
            RainOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val companyServiceAsync = client.applications().company()

        companyServiceAsync.uploadDocument(
            CompanyUploadDocumentParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("some content".byteInputStream())
                .country("xxx")
                .name("name")
                .side(CompanyUploadDocumentParams.Side.FRONT)
                .type(CompanyUploadDocumentParams.Type.DIRECTORS_REGISTRY)
                .build()
        )
    }
}
