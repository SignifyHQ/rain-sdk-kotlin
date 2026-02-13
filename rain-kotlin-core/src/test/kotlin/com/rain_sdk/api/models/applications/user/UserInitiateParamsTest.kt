// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserInitiateParamsTest {

    @Test
    fun create() {
        UserInitiateParams.builder()
            .email("email")
            .firstName("firstName")
            .lastName("lastName")
            .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
            .build()
    }

    @Test
    fun body() {
        val params =
            UserInitiateParams.builder()
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.firstName()).isEqualTo("firstName")
        assertThat(body.lastName()).isEqualTo("lastName")
        assertThat(body.walletAddress()).isEqualTo("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserInitiateParams.builder().build()

        val body = params._body()
    }
}
