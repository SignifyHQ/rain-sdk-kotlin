// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rain_hello_world.api.client.okhttp.RainHelloWorldOkHttpClient
import com.rain_hello_world.api.core.jsonMapper
import com.rain_hello_world.api.models.applications.company.IssuingApplication
import com.rain_hello_world.api.models.cards.IssuingCardStatus
import com.rain_hello_world.api.models.companies.signatures.IssuingSignature
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/rain-hello-world-kotlin-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = RainHelloWorldOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.applications()).isNotNull()
        assertThat(client.balances()).isNotNull()
        assertThat(client.cards()).isNotNull()
        assertThat(client.companies()).isNotNull()
        assertThat(client.contracts()).isNotNull()
        assertThat(client.disputes()).isNotNull()
        assertThat(client.keys()).isNotNull()
        assertThat(client.payments()).isNotNull()
        assertThat(client.signatures()).isNotNull()
        assertThat(client.transactions()).isNotNull()
        assertThat(client.users()).isNotNull()
    }

    @Test
    fun issuingApplicationRoundtrip() {
        val jsonMapper = jsonMapper()
        val issuingApplication =
            IssuingApplication.builder()
                .applicationStatus(IssuingApplication.ApplicationStatus.APPROVED)
                .applicationCompletionLink(
                    IssuingApplication.ApplicationCompletionLink.builder()
                        .url("https://example.com")
                        .params(
                            IssuingApplication.ApplicationCompletionLink.Params.builder()
                                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .applicationExternalVerificationLink(
                    IssuingApplication.ApplicationExternalVerificationLink.builder()
                        .url("https://example.com")
                        .params(
                            IssuingApplication.ApplicationExternalVerificationLink.Params.builder()
                                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .applicationReason("applicationReason")
                .build()

        val roundtrippedIssuingApplication =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingApplication),
                jacksonTypeRef<IssuingApplication>(),
            )

        assertThat(roundtrippedIssuingApplication).isEqualTo(issuingApplication)
    }

    @Test
    fun issuingSignatureRoundtrip() {
        val jsonMapper = jsonMapper()
        val issuingSignature =
            IssuingSignature.ofIfSignatureIsPending(
                IssuingSignature.IfSignatureIsPending.builder()
                    .retryAfter(0L)
                    .status(IssuingSignature.IfSignatureIsPending.Status.PENDING)
                    .build()
            )

        val roundtrippedIssuingSignature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingSignature),
                jacksonTypeRef<IssuingSignature>(),
            )

        assertThat(roundtrippedIssuingSignature).isEqualTo(issuingSignature)
    }

    @Test
    fun issuingCardStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val issuingCardStatus = IssuingCardStatus.NOT_ACTIVATED

        val roundtrippedIssuingCardStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(issuingCardStatus),
                jacksonTypeRef<IssuingCardStatus>(),
            )

        assertThat(roundtrippedIssuingCardStatus).isEqualTo(issuingCardStatus)
    }
}
