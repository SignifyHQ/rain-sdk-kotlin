// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.cards

import com.rain_hello_world.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardListParamsTest {

    @Test
    fun create() {
        CardListParams.builder()
            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cursor("cursor")
            .limit(1L)
            .status(IssuingCardStatus.NOT_ACTIVATED)
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CardListParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cursor("cursor")
                .limit(1L)
                .status(IssuingCardStatus.NOT_ACTIVATED)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("companyId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("status", "notActivated")
                    .put("userId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CardListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
