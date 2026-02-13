// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.transactions

import com.rain_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionListParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("authorizedAfter", "2019-12-27T18:11:19.117Z")
                    .put("authorizedBefore", "2019-12-27T18:11:19.117Z")
                    .put("cardId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("companyId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("postedAfter", "2019-12-27T18:11:19.117Z")
                    .put("postedBefore", "2019-12-27T18:11:19.117Z")
                    .put("transactionHash", "transactionHash")
                    .put("type", listOf("spend").joinToString(","))
                    .put("userId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
