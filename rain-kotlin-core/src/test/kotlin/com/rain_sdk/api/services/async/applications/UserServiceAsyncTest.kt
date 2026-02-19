// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async.applications

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import com.rain_sdk.api.models.applications.company.PhysicalAddress
import com.rain_sdk.api.models.applications.user.UserCreateParams
import com.rain_sdk.api.models.applications.user.UserInitiateParams
import com.rain_sdk.api.models.applications.user.UserReapplyParams
import com.rain_sdk.api.models.applications.user.UserUpdateParams
import com.rain_sdk.api.models.applications.user.UserUploadDocumentParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.applications().user()

        val issuingUser =
            userServiceAsync.create(
                UserCreateParams.Body.UsingSumsubShareToken.builder()
                    .accountPurpose("accountPurpose")
                    .annualSalary("annualSalary")
                    .expectedMonthlyVolume("expectedMonthlyVolume")
                    .ipAddress("ipAddress")
                    .isTermsOfServiceAccepted(
                        UserCreateParams.Body.UsingSumsubShareToken.IsTermsOfServiceAccepted.TRUE
                    )
                    .occupation("occupation")
                    .sumsubShareToken("sumsubShareToken")
                    .chainId("chainId")
                    .contractAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .hasExistingDocuments(true)
                    .solanaAddress("WRktL2iKFTHZg6qNBPzV1b1WLYwfnZ5JSHo2UV8L1R")
                    .sourceKey("x")
                    .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .build()
            )

        issuingUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.applications().user()

        val user = userServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.applications().user()

        val issuingUser =
            userServiceAsync.update(
                UserUpdateParams.builder()
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountPurpose("accountPurpose")
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
                    .annualSalary("annualSalary")
                    .birthDate(LocalDate.parse("2000-01-01"))
                    .countryOfIssue("countryOfIssue")
                    .expectedMonthlyVolume("expectedMonthlyVolume")
                    .firstName("firstName")
                    .hasExistingDocuments(true)
                    .ipAddress("ipAddress")
                    .isTermsOfServiceAccepted(UserUpdateParams.IsTermsOfServiceAccepted.TRUE)
                    .lastName("lastName")
                    .nationalId("nationalId")
                    .occupation("occupation")
                    .build()
            )

        issuingUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun initiate() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.applications().user()

        val issuingUser =
            userServiceAsync.initiate(
                UserInitiateParams.builder()
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .build()
            )

        issuingUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun reapply() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.applications().user()

        val issuingUser =
            userServiceAsync.reapply(
                UserReapplyParams.builder()
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountPurpose("accountPurpose")
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
                    .annualSalary("annualSalary")
                    .birthDate(LocalDate.parse("2000-01-01"))
                    .countryOfIssue("countryOfIssue")
                    .expectedMonthlyVolume("expectedMonthlyVolume")
                    .ipAddress("ipAddress")
                    .isTermsOfServiceAccepted(UserReapplyParams.IsTermsOfServiceAccepted.TRUE)
                    .nationalId("nationalId")
                    .occupation("occupation")
                    .hasExistingDocuments(true)
                    .build()
            )

        issuingUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun uploadDocument() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.applications().user()

        userServiceAsync.uploadDocument(
            UserUploadDocumentParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .document("some content".byteInputStream())
                .country("xxx")
                .name("name")
                .side(UserUploadDocumentParams.Side.FRONT)
                .type(UserUploadDocumentParams.Type.ID_CARD)
                .build()
        )
    }
}
