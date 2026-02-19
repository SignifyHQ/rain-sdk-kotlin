// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.blocking

import com.rain_sdk.api.client.okhttp.RainOkHttpClient
import com.rain_sdk.api.models.transactions.TransactionCreateDisputeParams
import com.rain_sdk.api.models.transactions.TransactionListParams
import com.rain_sdk.api.models.transactions.TransactionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        val issuingTransaction = transactionService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingTransaction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        transactionService.update(
            TransactionUpdateParams.builder()
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("memo")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        val issuingTransactions =
            transactionService.list(
                TransactionListParams.builder()
                    .authorizedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .authorizedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .limit(1L)
                    .postedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .postedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionHash("transactionHash")
                    .addType(TransactionListParams.Type.SPEND)
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        issuingTransactions.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createDispute() {
        val client = RainOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        val issuingDispute =
            transactionService.createDispute(
                TransactionCreateDisputeParams.builder()
                    .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .textEvidence("textEvidence")
                    .build()
            )

        issuingDispute.validate()
    }
}
