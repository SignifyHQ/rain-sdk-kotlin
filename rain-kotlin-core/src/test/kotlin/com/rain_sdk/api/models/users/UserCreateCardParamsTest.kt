// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.users

import com.rain_sdk.api.models.applications.company.PhysicalAddress
import com.rain_sdk.api.models.cards.IssuingCardLimit
import com.rain_sdk.api.models.cards.IssuingCardStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateCardParamsTest {

    @Test
    fun create() {
        UserCreateCardParams.builder()
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(UserCreateCardParams.Type.PHYSICAL)
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
                UserCreateCardParams.Configuration.builder()
                    .displayName("displayName")
                    .productId("productId")
                    .productRef("productRef")
                    .virtualCardArt("virtualCardArt")
                    .build()
            )
            .limit(
                IssuingCardLimit.builder()
                    .amount(0L)
                    .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                    .build()
            )
            .shipping(
                UserCreateCardParams.Shipping.builder()
                    .city("city")
                    .country("country")
                    .countryCode("xx")
                    .line1("line1")
                    .postalCode("postalCode")
                    .region("region")
                    .line2("line2")
                    .phoneNumber("phoneNumber")
                    .method(UserCreateCardParams.Shipping.Method.STANDARD)
                    .build()
            )
            .status(IssuingCardStatus.NOT_ACTIVATED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UserCreateCardParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(UserCreateCardParams.Type.PHYSICAL)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserCreateCardParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(UserCreateCardParams.Type.PHYSICAL)
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
                    UserCreateCardParams.Configuration.builder()
                        .displayName("displayName")
                        .productId("productId")
                        .productRef("productRef")
                        .virtualCardArt("virtualCardArt")
                        .build()
                )
                .limit(
                    IssuingCardLimit.builder()
                        .amount(0L)
                        .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                        .build()
                )
                .shipping(
                    UserCreateCardParams.Shipping.builder()
                        .city("city")
                        .country("country")
                        .countryCode("xx")
                        .line1("line1")
                        .postalCode("postalCode")
                        .region("region")
                        .line2("line2")
                        .phoneNumber("phoneNumber")
                        .method(UserCreateCardParams.Shipping.Method.STANDARD)
                        .build()
                )
                .status(IssuingCardStatus.NOT_ACTIVATED)
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(UserCreateCardParams.Type.PHYSICAL)
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
                UserCreateCardParams.Configuration.builder()
                    .displayName("displayName")
                    .productId("productId")
                    .productRef("productRef")
                    .virtualCardArt("virtualCardArt")
                    .build()
            )
        assertThat(body.limit())
            .isEqualTo(
                IssuingCardLimit.builder()
                    .amount(0L)
                    .frequency(IssuingCardLimit.Frequency.PER24_HOUR_PERIOD)
                    .build()
            )
        assertThat(body.shipping())
            .isEqualTo(
                UserCreateCardParams.Shipping.builder()
                    .city("city")
                    .country("country")
                    .countryCode("xx")
                    .line1("line1")
                    .postalCode("postalCode")
                    .region("region")
                    .line2("line2")
                    .phoneNumber("phoneNumber")
                    .method(UserCreateCardParams.Shipping.Method.STANDARD)
                    .build()
            )
        assertThat(body.status()).isEqualTo(IssuingCardStatus.NOT_ACTIVATED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserCreateCardParams.builder()
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(UserCreateCardParams.Type.PHYSICAL)
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(UserCreateCardParams.Type.PHYSICAL)
    }
}
