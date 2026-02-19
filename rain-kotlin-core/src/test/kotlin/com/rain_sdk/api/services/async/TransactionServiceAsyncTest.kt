// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.services.async

import com.rain_sdk.api.client.okhttp.RainOkHttpClientAsync
import com.rain_sdk.api.models.transactions.TransactionCreateDisputeParams
import com.rain_sdk.api.models.transactions.TransactionListParams
import com.rain_sdk.api.models.transactions.TransactionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val issuingTransaction =
            transactionServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        issuingTransaction.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        transactionServiceAsync.update(
            TransactionUpdateParams.builder()
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("memo")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val issuingTransactions =
            transactionServiceAsync.list(
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

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun createDispute() {
        val client = RainOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val issuingDispute =
            transactionServiceAsync.createDispute(
                TransactionCreateDisputeParams.builder()
                    .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .textEvidence("textEvidence")
                    .build()
            )

        issuingDispute.validate()
    }
}
