// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.applications.company.PhysicalAddress
import com.rain_sdk.api.models.cards.IssuingCardLimit
import com.rain_sdk.api.models.cards.IssuingCardStatus
import com.rain_sdk.api.models.companies.IssuingChargeCreateBody
import com.rain_sdk.api.models.users.UserCreateCardParams
import com.rain_sdk.api.models.users.UserCreateChargeParams
import com.rain_sdk.api.models.users.UserCreateParams
import com.rain_sdk.api.models.users.UserInitiatePaymentParams
import com.rain_sdk.api.models.users.UserListParams
import com.rain_sdk.api.models.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val issuingUser =
            userService.create(
                UserCreateParams.builder()
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
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
                    .phoneCountryCode("1")
                    .phoneNumber("5555555555")
                    .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .build()
            )

        issuingUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val issuingUser = userService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val issuingUser =
            userService.update(
                UserUpdateParams.builder()
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    .email("email")
                    .firstName("firstName")
                    .isActive(true)
                    .isTermsOfServiceAccepted(true)
                    .lastName("lastName")
                    .phoneCountryCode("1")
                    .phoneNumber("5555555555")
                    .build()
            )

        issuingUser.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val issuingUsers =
            userService.list(
                UserListParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .limit(1L)
                    .build()
            )

        issuingUsers.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        userService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createCard() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val issuingCard =
            userService.createCard(
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
            )

        issuingCard.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createCharge() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val issuingChargeCreateResponse =
            userService.createCharge(
                UserCreateChargeParams.builder()
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .issuingChargeCreateBody(
                        IssuingChargeCreateBody.builder()
                            .amount(1L)
                            .description("description")
                            .build()
                    )
                    .build()
            )

        issuingChargeCreateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun initiatePayment() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val response =
            userService.initiatePayment(
                UserInitiatePaymentParams.builder()
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .walletAddress("0xE1CB97d8EBbDbaAae6d9B1ca0D1cFaADcCcbdaDa")
                    .chainId(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveBalances() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val response = userService.retrieveBalances("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveContracts() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val issuingContracts = userService.retrieveContracts("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingContracts.forEach { it.validate() }
    }
}
