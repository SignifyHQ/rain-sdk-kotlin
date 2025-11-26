// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssuingCardTest {

    @Test
    fun create() {
        val issuingCard =
            IssuingCard.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expirationMonth("expirationMonth")
                .expirationYear("expirationYear")
                .last4("last4")
                .status(IssuingCardStatus.NOT_ACTIVATED)
                .type(IssuingCard.Type.PHYSICAL)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(
                    IssuingCardLimit.builder()
                        .amount(0L)
                        .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                        .build()
                )
                .addTokenWallet("string")
                .build()

        assertThat(issuingCard.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(issuingCard.companyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(issuingCard.expirationMonth()).isEqualTo("expirationMonth")
        assertThat(issuingCard.expirationYear()).isEqualTo("expirationYear")
        assertThat(issuingCard.last4()).isEqualTo("last4")
        assertThat(issuingCard.status()).isEqualTo(IssuingCardStatus.NOT_ACTIVATED)
        assertThat(issuingCard.type()).isEqualTo(IssuingCard.Type.PHYSICAL)
        assertThat(issuingCard.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(issuingCard.limit())
            .isEqualTo(
                IssuingCardLimit.builder()
                    .amount(0L)
                    .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                    .build()
            )
        assertThat(issuingCard.tokenWallets()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingCard =
            IssuingCard.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expirationMonth("expirationMonth")
                .expirationYear("expirationYear")
                .last4("last4")
                .status(IssuingCardStatus.NOT_ACTIVATED)
                .type(IssuingCard.Type.PHYSICAL)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(
                    IssuingCardLimit.builder()
                        .amount(0L)
                        .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                        .build()
                )
                .addTokenWallet("string")
                .build()

        val roundtrippedIssuingCard =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingCard),
                jacksonTypeRef<IssuingCard>(),
            )

        assertThat(roundtrippedIssuingCard).isEqualTo(issuingCard)
    }
}
