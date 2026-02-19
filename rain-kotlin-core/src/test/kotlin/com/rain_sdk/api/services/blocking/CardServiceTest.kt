// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.applications.company.PhysicalAddress
import com.rain_sdk.api.models.cards.CardListParams
import com.rain_sdk.api.models.cards.CardRetrieveSecretsParams
import com.rain_sdk.api.models.cards.CardUpdateParams
import com.rain_sdk.api.models.cards.IssuingCardLimit
import com.rain_sdk.api.models.cards.IssuingCardStatus
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CardServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val cardService = client.cards()

        val issuingCard = cardService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingCard.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val cardService = client.cards()

        val issuingCard =
            cardService.update(
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
            )

        issuingCard.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val cardService = client.cards()

        val issuingCards =
            cardService.list(
                CardListParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .limit(1L)
                    .status(IssuingCardStatus.NOT_ACTIVATED)
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        issuingCards.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSecrets() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val cardService = client.cards()

        val response =
            cardService.retrieveSecrets(
                CardRetrieveSecretsParams.builder()
                    .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("x")
                    .build()
            )

        response.validate()
    }
}
