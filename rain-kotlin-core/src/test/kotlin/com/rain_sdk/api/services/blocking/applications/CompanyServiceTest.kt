// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking.applications

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.applications.company.CompanyCreateParams
import com.rain_sdk.api.models.applications.company.CompanyReapplyParams
import com.rain_sdk.api.models.applications.company.CompanyUpdateParams
import com.rain_sdk.api.models.applications.company.CompanyUploadDocumentParams
import com.rain_sdk.api.models.applications.company.IssuingApplicationPerson
import com.rain_sdk.api.models.applications.company.PhysicalAddress
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CompanyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val companyService = client.applications().company()

        val issuingCompany =
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
                    .build()
            )

        issuingCompany.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val companyService = client.applications().company()

        val company = companyService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        company.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val companyService = client.applications().company()

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

    @Disabled("Mock server tests are disabled")
    @Test
    fun reapply() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val companyService = client.applications().company()

        val issuingCompany =
            companyService.reapply(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadDocument() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val companyService = client.applications().company()

        companyService.uploadDocument(
            CompanyUploadDocumentParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("Example data".byteInputStream())
                .country("xxx")
                .name("name")
                .side(CompanyUploadDocumentParams.Side.FRONT)
                .type(CompanyUploadDocumentParams.Type.DIRECTORS_REGISTRY)
                .build()
        )
    }
}
