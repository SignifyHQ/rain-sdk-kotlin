// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.jsonMapper
import com.rain_sdk.api.errors.RainInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class IssuingTransactionTest {

    @Test
    fun ofSpend() {
        val spend =
            IssuingTransaction.Spend.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .spend(
                    IssuingTransaction.Spend.InnerSpend.builder()
                        .amount(0L)
                        .authorizedAt("authorizedAt")
                        .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cardType(IssuingTransaction.Spend.InnerSpend.CardType.PHYSICAL)
                        .currency("currency")
                        .merchantCategory("merchantCategory")
                        .merchantCategoryCode("merchantCategoryCode")
                        .merchantName("merchantName")
                        .receipt(true)
                        .status(IssuingTransaction.Spend.InnerSpend.Status.PENDING)
                        .userEmail("userEmail")
                        .userFirstName("userFirstName")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userLastName("userLastName")
                        .authorizationMethod("authorizationMethod")
                        .authorizedAmount(0L)
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .declinedReason("declinedReason")
                        .enrichedMerchantCategory("enrichedMerchantCategory")
                        .enrichedMerchantIcon("enrichedMerchantIcon")
                        .enrichedMerchantName("enrichedMerchantName")
                        .localAmount(0L)
                        .localCurrency("localCurrency")
                        .memo("memo")
                        .postedAt("postedAt")
                        .build()
                )
                .build()

        val issuingTransaction = IssuingTransaction.ofSpend(spend)

        assertThat(issuingTransaction.spend()).isEqualTo(spend)
        assertThat(issuingTransaction.collateral()).isNull()
        assertThat(issuingTransaction.payment()).isNull()
        assertThat(issuingTransaction.fee()).isNull()
    }

    @Test
    fun ofSpendRoundtrip() {
        val jsonMapper = jsonMapper()
        val issuingTransaction =
            IssuingTransaction.ofSpend(
                IssuingTransaction.Spend.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .spend(
                        IssuingTransaction.Spend.InnerSpend.builder()
                            .amount(0L)
                            .authorizedAt("authorizedAt")
                            .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .cardType(IssuingTransaction.Spend.InnerSpend.CardType.PHYSICAL)
                            .currency("currency")
                            .merchantCategory("merchantCategory")
                            .merchantCategoryCode("merchantCategoryCode")
                            .merchantName("merchantName")
                            .receipt(true)
                            .status(IssuingTransaction.Spend.InnerSpend.Status.PENDING)
                            .userEmail("userEmail")
                            .userFirstName("userFirstName")
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .userLastName("userLastName")
                            .authorizationMethod("authorizationMethod")
                            .authorizedAmount(0L)
                            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .declinedReason("declinedReason")
                            .enrichedMerchantCategory("enrichedMerchantCategory")
                            .enrichedMerchantIcon("enrichedMerchantIcon")
                            .enrichedMerchantName("enrichedMerchantName")
                            .localAmount(0L)
                            .localCurrency("localCurrency")
                            .memo("memo")
                            .postedAt("postedAt")
                            .build()
                    )
                    .build()
            )

        val roundtrippedIssuingTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingTransaction),
                jacksonTypeRef<IssuingTransaction>(),
            )

        assertThat(roundtrippedIssuingTransaction).isEqualTo(issuingTransaction)
    }

    @Test
    fun ofCollateral() {
        val collateral =
            IssuingTransaction.Collateral.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .collateral(
                    IssuingTransaction.Collateral.InnerCollateral.builder()
                        .amount(0.0)
                        .chainId(0L)
                        .currency("currency")
                        .transactionHash(
                            "0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDac3CccFB21EceaaA012Aa1C26"
                        )
                        .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .memo("memo")
                        .postedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val issuingTransaction = IssuingTransaction.ofCollateral(collateral)

        assertThat(issuingTransaction.spend()).isNull()
        assertThat(issuingTransaction.collateral()).isEqualTo(collateral)
        assertThat(issuingTransaction.payment()).isNull()
        assertThat(issuingTransaction.fee()).isNull()
    }

    @Test
    fun ofCollateralRoundtrip() {
        val jsonMapper = jsonMapper()
        val issuingTransaction =
            IssuingTransaction.ofCollateral(
                IssuingTransaction.Collateral.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .collateral(
                        IssuingTransaction.Collateral.InnerCollateral.builder()
                            .amount(0.0)
                            .chainId(0L)
                            .currency("currency")
                            .transactionHash(
                                "0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDac3CccFB21EceaaA012Aa1C26"
                            )
                            .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .memo("memo")
                            .postedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )

        val roundtrippedIssuingTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingTransaction),
                jacksonTypeRef<IssuingTransaction>(),
            )

        assertThat(roundtrippedIssuingTransaction).isEqualTo(issuingTransaction)
    }

    @Test
    fun ofPayment() {
        val payment =
            IssuingTransaction.Payment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .payment(
                    IssuingTransaction.Payment.InnerPayment.builder()
                        .amount(0L)
                        .currency("currency")
                        .status(IssuingTransaction.Payment.InnerPayment.Status.PENDING)
                        .chainId(0L)
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .memo("memo")
                        .postedAt("postedAt")
                        .transactionHash(
                            "0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDac3CccFB21EceaaA012Aa1C26"
                        )
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                        .build()
                )
                .build()

        val issuingTransaction = IssuingTransaction.ofPayment(payment)

        assertThat(issuingTransaction.spend()).isNull()
        assertThat(issuingTransaction.collateral()).isNull()
        assertThat(issuingTransaction.payment()).isEqualTo(payment)
        assertThat(issuingTransaction.fee()).isNull()
    }

    @Test
    fun ofPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val issuingTransaction =
            IssuingTransaction.ofPayment(
                IssuingTransaction.Payment.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .payment(
                        IssuingTransaction.Payment.InnerPayment.builder()
                            .amount(0L)
                            .currency("currency")
                            .status(IssuingTransaction.Payment.InnerPayment.Status.PENDING)
                            .chainId(0L)
                            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .memo("memo")
                            .postedAt("postedAt")
                            .transactionHash(
                                "0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDac3CccFB21EceaaA012Aa1C26"
                            )
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                            .build()
                    )
                    .build()
            )

        val roundtrippedIssuingTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingTransaction),
                jacksonTypeRef<IssuingTransaction>(),
            )

        assertThat(roundtrippedIssuingTransaction).isEqualTo(issuingTransaction)
    }

    @Test
    fun ofFee() {
        val fee =
            IssuingTransaction.Fee.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fee(
                    IssuingTransaction.Fee.InnerFee.builder()
                        .amount(0L)
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .postedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val issuingTransaction = IssuingTransaction.ofFee(fee)

        assertThat(issuingTransaction.spend()).isNull()
        assertThat(issuingTransaction.collateral()).isNull()
        assertThat(issuingTransaction.payment()).isNull()
        assertThat(issuingTransaction.fee()).isEqualTo(fee)
    }

    @Test
    fun ofFeeRoundtrip() {
        val jsonMapper = jsonMapper()
        val issuingTransaction =
            IssuingTransaction.ofFee(
                IssuingTransaction.Fee.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fee(
                        IssuingTransaction.Fee.InnerFee.builder()
                            .amount(0L)
                            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .description("description")
                            .postedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )

        val roundtrippedIssuingTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingTransaction),
                jacksonTypeRef<IssuingTransaction>(),
            )

        assertThat(roundtrippedIssuingTransaction).isEqualTo(issuingTransaction)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val issuingTransaction =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<IssuingTransaction>())

        val e = assertThrows<RainInvalidDataException> { issuingTransaction.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
