// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.applications.company

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalAddressTest {

    @Test
    fun create() {
        val physicalAddress =
            PhysicalAddress.builder()
                .city("city")
                .country("country")
                .countryCode("xx")
                .line1("line1")
                .postalCode("postalCode")
                .region("region")
                .line2("line2")
                .build()

        assertThat(physicalAddress.city()).isEqualTo("city")
        assertThat(physicalAddress.country()).isEqualTo("country")
        assertThat(physicalAddress.countryCode()).isEqualTo("xx")
        assertThat(physicalAddress.line1()).isEqualTo("line1")
        assertThat(physicalAddress.postalCode()).isEqualTo("postalCode")
        assertThat(physicalAddress.region()).isEqualTo("region")
        assertThat(physicalAddress.line2()).isEqualTo("line2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val physicalAddress =
            PhysicalAddress.builder()
                .city("city")
                .country("country")
                .countryCode("xx")
                .line1("line1")
                .postalCode("postalCode")
                .region("region")
                .line2("line2")
                .build()

        val roundtrippedPhysicalAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(physicalAddress),
                jacksonTypeRef<PhysicalAddress>(),
            )

        assertThat(roundtrippedPhysicalAddress).isEqualTo(physicalAddress)
    }
}
