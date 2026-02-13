// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Test
    fun create() {
        UserCreateParams.builder()
            .body(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            UserCreateParams.builder()
                .body(
                    UserCreateParams.Body.UsingSumsubShareToken.builder()
                        .accountPurpose("accountPurpose")
                        .annualSalary("annualSalary")
                        .expectedMonthlyVolume("expectedMonthlyVolume")
                        .ipAddress("ipAddress")
                        .isTermsOfServiceAccepted(
                            UserCreateParams.Body.UsingSumsubShareToken.IsTermsOfServiceAccepted
                                .TRUE
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UserCreateParams.Body.ofUsingSumsubShareToken(
                    UserCreateParams.Body.UsingSumsubShareToken.builder()
                        .accountPurpose("accountPurpose")
                        .annualSalary("annualSalary")
                        .expectedMonthlyVolume("expectedMonthlyVolume")
                        .ipAddress("ipAddress")
                        .isTermsOfServiceAccepted(
                            UserCreateParams.Body.UsingSumsubShareToken.IsTermsOfServiceAccepted
                                .TRUE
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserCreateParams.builder().build()

        val body = params._body()
    }
}
