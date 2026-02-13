// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.cards

import com.rain_sdk.api.models.applications.company.PhysicalAddress
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdateParamsTest {

    @Test
    fun create() {
        CardUpdateParams.builder()
            .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .billing(
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
            .configuration(
                CardUpdateParams.Configuration.builder().virtualCardArt("virtualCardArt").build()
            )
            .limit(
                IssuingCardLimit.builder()
                    .amount(0L)
                    .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                    .build()
            )
            .status(IssuingCardStatus.NOT_ACTIVATED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardUpdateParams.builder().cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardUpdateParams.builder()
                .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .billing(
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
                .configuration(
                    CardUpdateParams.Configuration.builder()
                        .virtualCardArt("virtualCardArt")
                        .build()
                )
                .limit(
                    IssuingCardLimit.builder()
                        .amount(0L)
                        .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                        .build()
                )
                .status(IssuingCardStatus.NOT_ACTIVATED)
                .build()

        val body = params._body()

        assertThat(body.billing())
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
        assertThat(body.configuration())
            .isEqualTo(
                CardUpdateParams.Configuration.builder().virtualCardArt("virtualCardArt").build()
            )
        assertThat(body.limit())
            .isEqualTo(
                IssuingCardLimit.builder()
                    .amount(0L)
                    .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                    .build()
            )
        assertThat(body.status()).isEqualTo(IssuingCardStatus.NOT_ACTIVATED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardUpdateParams.builder().cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
