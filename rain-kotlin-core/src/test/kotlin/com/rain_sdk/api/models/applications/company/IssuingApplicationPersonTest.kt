// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.company

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssuingApplicationPersonTest {

    @Test
    fun create() {
        val issuingApplicationPerson =
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

        assertThat(issuingApplicationPerson.address())
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
        assertThat(issuingApplicationPerson.birthDate()).isEqualTo(LocalDate.parse("2000-01-01"))
        assertThat(issuingApplicationPerson.countryOfIssue()).isEqualTo("xx")
        assertThat(issuingApplicationPerson.email()).isEqualTo("email")
        assertThat(issuingApplicationPerson.firstName()).isEqualTo("firstName")
        assertThat(issuingApplicationPerson.lastName()).isEqualTo("lastName")
        assertThat(issuingApplicationPerson.nationalId()).isEqualTo("nationalId")
        assertThat(issuingApplicationPerson.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(issuingApplicationPerson.phoneCountryCode()).isEqualTo("1")
        assertThat(issuingApplicationPerson.phoneNumber()).isEqualTo("5555555555")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingApplicationPerson =
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

        val roundtrippedIssuingApplicationPerson =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingApplicationPerson),
                jacksonTypeRef<IssuingApplicationPerson>(),
            )

        assertThat(roundtrippedIssuingApplicationPerson).isEqualTo(issuingApplicationPerson)
    }
}
