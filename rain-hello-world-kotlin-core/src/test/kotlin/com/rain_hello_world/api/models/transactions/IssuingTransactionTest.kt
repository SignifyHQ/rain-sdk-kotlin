// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.core.jsonMapper
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class IssuingTransactionTest {

    @Test
    fun ofUnionMember0() {
        val unionMember0 =
            IssuingTransaction.UnionMember0.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .spend(
                    IssuingTransaction.UnionMember0.Spend.builder()
                        .amount(0L)
                        .authorizedAt("authorizedAt")
                        .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cardType(IssuingTransaction.UnionMember0.Spend.CardType.PHYSICAL)
                        .currency("currency")
                        .merchantCategory("merchantCategory")
                        .merchantCategoryCode("merchantCategoryCode")
                        .merchantName("merchantName")
                        .receipt(true)
                        .status(IssuingTransaction.UnionMember0.Spend.Status.PENDING)
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
                .type(IssuingTransaction.UnionMember0.Type.SPEND)
                .build()

        val issuingTransaction = IssuingTransaction.ofUnionMember0(unionMember0)

        assertThat(issuingTransaction.unionMember0()).isEqualTo(unionMember0)
        assertThat(issuingTransaction.unionMember1()).isNull()
        assertThat(issuingTransaction.unionMember2()).isNull()
        assertThat(issuingTransaction.unionMember3()).isNull()
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingTransaction =
            IssuingTransaction.ofUnionMember0(
                IssuingTransaction.UnionMember0.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .spend(
                        IssuingTransaction.UnionMember0.Spend.builder()
                            .amount(0L)
                            .authorizedAt("authorizedAt")
                            .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .cardType(IssuingTransaction.UnionMember0.Spend.CardType.PHYSICAL)
                            .currency("currency")
                            .merchantCategory("merchantCategory")
                            .merchantCategoryCode("merchantCategoryCode")
                            .merchantName("merchantName")
                            .receipt(true)
                            .status(IssuingTransaction.UnionMember0.Spend.Status.PENDING)
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
                    .type(IssuingTransaction.UnionMember0.Type.SPEND)
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
    fun ofUnionMember1() {
        val unionMember1 =
            IssuingTransaction.UnionMember1.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .collateral(
                    IssuingTransaction.UnionMember1.Collateral.builder()
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
                .type(IssuingTransaction.UnionMember1.Type.COLLATERAL)
                .build()

        val issuingTransaction = IssuingTransaction.ofUnionMember1(unionMember1)

        assertThat(issuingTransaction.unionMember0()).isNull()
        assertThat(issuingTransaction.unionMember1()).isEqualTo(unionMember1)
        assertThat(issuingTransaction.unionMember2()).isNull()
        assertThat(issuingTransaction.unionMember3()).isNull()
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingTransaction =
            IssuingTransaction.ofUnionMember1(
                IssuingTransaction.UnionMember1.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .collateral(
                        IssuingTransaction.UnionMember1.Collateral.builder()
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
                    .type(IssuingTransaction.UnionMember1.Type.COLLATERAL)
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
    fun ofUnionMember2() {
        val unionMember2 =
            IssuingTransaction.UnionMember2.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .payment(
                    IssuingTransaction.UnionMember2.Payment.builder()
                        .amount(0L)
                        .currency("currency")
                        .status(IssuingTransaction.UnionMember2.Payment.Status.PENDING)
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
                .type(IssuingTransaction.UnionMember2.Type.PAYMENT)
                .build()

        val issuingTransaction = IssuingTransaction.ofUnionMember2(unionMember2)

        assertThat(issuingTransaction.unionMember0()).isNull()
        assertThat(issuingTransaction.unionMember1()).isNull()
        assertThat(issuingTransaction.unionMember2()).isEqualTo(unionMember2)
        assertThat(issuingTransaction.unionMember3()).isNull()
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingTransaction =
            IssuingTransaction.ofUnionMember2(
                IssuingTransaction.UnionMember2.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .payment(
                        IssuingTransaction.UnionMember2.Payment.builder()
                            .amount(0L)
                            .currency("currency")
                            .status(IssuingTransaction.UnionMember2.Payment.Status.PENDING)
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
                    .type(IssuingTransaction.UnionMember2.Type.PAYMENT)
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
    fun ofUnionMember3() {
        val unionMember3 =
            IssuingTransaction.UnionMember3.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fee(
                    IssuingTransaction.UnionMember3.Fee.builder()
                        .amount(0L)
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .postedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .type(IssuingTransaction.UnionMember3.Type.FEE)
                .build()

        val issuingTransaction = IssuingTransaction.ofUnionMember3(unionMember3)

        assertThat(issuingTransaction.unionMember0()).isNull()
        assertThat(issuingTransaction.unionMember1()).isNull()
        assertThat(issuingTransaction.unionMember2()).isNull()
        assertThat(issuingTransaction.unionMember3()).isEqualTo(unionMember3)
    }

    @Test
    fun ofUnionMember3Roundtrip() {
        val jsonMapper = jsonMapper()
        val issuingTransaction =
            IssuingTransaction.ofUnionMember3(
                IssuingTransaction.UnionMember3.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fee(
                        IssuingTransaction.UnionMember3.Fee.builder()
                            .amount(0L)
                            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .description("description")
                            .postedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .type(IssuingTransaction.UnionMember3.Type.FEE)
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

        val e = assertThrows<RainHelloWorldInvalidDataException> { issuingTransaction.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
