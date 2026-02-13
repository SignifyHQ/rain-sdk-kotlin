// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.companies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssuingContractTest {

    @Test
    fun create() {
        val issuingContract =
            IssuingContract.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chainId(0L)
                .contractVersion(0L)
                .controllerAddress("d8xALGQrTrnQKNiSFHpjQi7K1D2kBWAN")
                .proxyAddress("d8xALGQrTrnQKNiSFHpjQi7K1D2kBWAN")
                .addToken(
                    IssuingContract.Token.builder()
                        .address("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                        .advanceRate(0.0)
                        .balance("balance")
                        .exchangeRate(0.0)
                        .build()
                )
                .depositAddress("d8xALGQrTrnQKNiSFHpjQi7K1D2kBWAN")
                .build()

        assertThat(issuingContract.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(issuingContract.chainId()).isEqualTo(0L)
        assertThat(issuingContract.contractVersion()).isEqualTo(0L)
        assertThat(issuingContract.controllerAddress())
            .isEqualTo("d8xALGQrTrnQKNiSFHpjQi7K1D2kBWAN")
        assertThat(issuingContract.proxyAddress()).isEqualTo("d8xALGQrTrnQKNiSFHpjQi7K1D2kBWAN")
        assertThat(issuingContract.tokens())
            .containsExactly(
                IssuingContract.Token.builder()
                    .address("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .advanceRate(0.0)
                    .balance("balance")
                    .exchangeRate(0.0)
                    .build()
            )
        assertThat(issuingContract.depositAddress()).isEqualTo("d8xALGQrTrnQKNiSFHpjQi7K1D2kBWAN")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingContract =
            IssuingContract.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chainId(0L)
                .contractVersion(0L)
                .controllerAddress("d8xALGQrTrnQKNiSFHpjQi7K1D2kBWAN")
                .proxyAddress("d8xALGQrTrnQKNiSFHpjQi7K1D2kBWAN")
                .addToken(
                    IssuingContract.Token.builder()
                        .address("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                        .advanceRate(0.0)
                        .balance("balance")
                        .exchangeRate(0.0)
                        .build()
                )
                .depositAddress("d8xALGQrTrnQKNiSFHpjQi7K1D2kBWAN")
                .build()

        val roundtrippedIssuingContract =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingContract),
                jacksonTypeRef<IssuingContract>(),
            )

        assertThat(roundtrippedIssuingContract).isEqualTo(issuingContract)
    }
}
