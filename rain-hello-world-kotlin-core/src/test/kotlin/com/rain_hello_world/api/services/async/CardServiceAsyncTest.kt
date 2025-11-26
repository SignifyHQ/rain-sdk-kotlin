// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.services.async

import com.rain_hello_world.api.TestServerExtension
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClientAsync
import com.rain_hello_world.api.models.applications.company.PhysicalAddress
import com.rain_hello_world.api.models.cards.CardListParams
import com.rain_hello_world.api.models.cards.CardRetrieveSecretsParams
import com.rain_hello_world.api.models.cards.CardUpdateParams
import com.rain_hello_world.api.models.cards.IssuingCardLimit
import com.rain_hello_world.api.models.cards.IssuingCardStatus
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardServiceAsync = client.cards()

        val issuingCard = cardServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingCard.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardServiceAsync = client.cards()

        val issuingCard =
            cardServiceAsync.update(
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
    suspend fun list() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardServiceAsync = client.cards()

        val issuingCards =
            cardServiceAsync.list(
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
    suspend fun retrieveSecrets() {
        val client =
            RainHelloWorldOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardServiceAsync = client.cards()

        val response =
            cardServiceAsync.retrieveSecrets(
                CardRetrieveSecretsParams.builder()
                    .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("x")
                    .build()
            )

        response.validate()
    }
}
