// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.users

import com.rain_hello_world.api.models.applications.company.PhysicalAddress
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
        UserUpdateParams.builder()
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
            .email("email")
            .firstName("firstName")
            .isActive(true)
            .isTermsOfServiceAccepted(true)
            .lastName("lastName")
            .phoneCountryCode("1")
            .phoneNumber("5555555555")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UserUpdateParams.builder().userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserUpdateParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .email("email")
                .firstName("firstName")
                .isActive(true)
                .isTermsOfServiceAccepted(true)
                .lastName("lastName")
                .phoneCountryCode("1")
                .phoneNumber("5555555555")
                .build()

        val body = params._body()

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
        assertThat(body.email()).isEqualTo("email")
        assertThat(body.firstName()).isEqualTo("firstName")
        assertThat(body.isActive()).isEqualTo(true)
        assertThat(body.isTermsOfServiceAccepted()).isEqualTo(true)
        assertThat(body.lastName()).isEqualTo("lastName")
        assertThat(body.phoneCountryCode()).isEqualTo("1")
        assertThat(body.phoneNumber()).isEqualTo("5555555555")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserUpdateParams.builder().userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
