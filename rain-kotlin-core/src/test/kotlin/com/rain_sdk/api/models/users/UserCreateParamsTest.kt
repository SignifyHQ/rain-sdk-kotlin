// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.users

import com.rain_sdk.api.models.applications.company.PhysicalAddress
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Test
    fun create() {
        UserCreateParams.builder()
            .email("email")
            .firstName("firstName")
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
            .phoneCountryCode("1")
            .phoneNumber("5555555555")
            .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
            .build()
    }

    @Test
    fun body() {
        val params =
            UserCreateParams.builder()
                .email("email")
                .firstName("firstName")
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
                .phoneCountryCode("1")
                .phoneNumber("5555555555")
                .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.firstName()).isEqualTo("firstName")
        assertThat(body.lastName()).isEqualTo("lastName")
        assertThat(body.address())
            .isEqualTo(
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
        assertThat(body.phoneCountryCode()).isEqualTo("1")
        assertThat(body.phoneNumber()).isEqualTo("5555555555")
        assertThat(body.walletAddress()).isEqualTo("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserCreateParams.builder()
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.firstName()).isEqualTo("firstName")
        assertThat(body.lastName()).isEqualTo("lastName")
    }
}
