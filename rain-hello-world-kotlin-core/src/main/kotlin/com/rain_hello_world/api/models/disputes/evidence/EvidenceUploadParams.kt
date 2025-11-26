// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.disputes.evidence

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_hello_world.api.core.ExcludeMissing
import com.rain_hello_world.api.core.JsonValue
import com.rain_hello_world.api.core.MultipartField
import com.rain_hello_world.api.core.Params
import com.rain_hello_world.api.core.checkRequired
import com.rain_hello_world.api.core.http.Headers
import com.rain_hello_world.api.core.http.QueryParams
import com.rain_hello_world.api.core.toImmutable
import com.rain_hello_world.api.errors.RainHelloWorldInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import kotlin.io.path.inputStream
import kotlin.io.path.name

/** Upload a file that will serve as evidence for a dispute. */
class EvidenceUploadParams
private constructor(
    private val disputeId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun disputeId(): String? = disputeId

    /**
     * The evidence to upload
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun evidence(): InputStream = body.evidence()

    /**
     * The name of the evidence
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The type of evidence
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = body.type()

    /**
     * Returns the raw multipart value of [evidence].
     *
     * Unlike [evidence], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _evidence(): MultipartField<InputStream> = body._evidence()

    /**
     * Returns the raw multipart value of [name].
     *
     * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _name(): MultipartField<String> = body._name()

    /**
     * Returns the raw multipart value of [type].
     *
     * Unlike [type], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _type(): MultipartField<String> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EvidenceUploadParams].
         *
         * The following fields are required:
         * ```kotlin
         * .evidence()
         * .name()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EvidenceUploadParams]. */
    class Builder internal constructor() {

        private var disputeId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(evidenceUploadParams: EvidenceUploadParams) = apply {
            disputeId = evidenceUploadParams.disputeId
            body = evidenceUploadParams.body.toBuilder()
            additionalHeaders = evidenceUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = evidenceUploadParams.additionalQueryParams.toBuilder()
        }

        fun disputeId(disputeId: String?) = apply { this.disputeId = disputeId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [evidence]
         * - [name]
         * - [type]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The evidence to upload */
        fun evidence(evidence: InputStream) = apply { body.evidence(evidence) }

        /**
         * Sets [Builder.evidence] to an arbitrary multipart value.
         *
         * You should usually call [Builder.evidence] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun evidence(evidence: MultipartField<InputStream>) = apply { body.evidence(evidence) }

        /** The evidence to upload */
        fun evidence(evidence: ByteArray) = apply { body.evidence(evidence) }

        /** The evidence to upload */
        fun evidence(path: Path) = apply { body.evidence(path) }

        /** The name of the evidence */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary multipart value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: MultipartField<String>) = apply { body.name(name) }

        /** The type of evidence */
        fun type(type: String) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary multipart value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: MultipartField<String>) = apply { body.type(type) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EvidenceUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .evidence()
         * .name()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EvidenceUploadParams =
            EvidenceUploadParams(
                disputeId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("evidence" to _evidence(), "name" to _name(), "type" to _type()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> disputeId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val evidence: MultipartField<InputStream>,
        private val name: MultipartField<String>,
        private val type: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The evidence to upload
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun evidence(): InputStream = evidence.value.getRequired("evidence")

        /**
         * The name of the evidence
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.value.getRequired("name")

        /**
         * The type of evidence
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.value.getRequired("type")

        /**
         * Returns the raw multipart value of [evidence].
         *
         * Unlike [evidence], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("evidence")
        @ExcludeMissing
        fun _evidence(): MultipartField<InputStream> = evidence

        /**
         * Returns the raw multipart value of [name].
         *
         * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

        /**
         * Returns the raw multipart value of [type].
         *
         * Unlike [type], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): MultipartField<String> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .evidence()
             * .name()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var evidence: MultipartField<InputStream>? = null
            private var name: MultipartField<String>? = null
            private var type: MultipartField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                evidence = body.evidence
                name = body.name
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The evidence to upload */
            fun evidence(evidence: InputStream) = evidence(MultipartField.of(evidence))

            /**
             * Sets [Builder.evidence] to an arbitrary multipart value.
             *
             * You should usually call [Builder.evidence] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun evidence(evidence: MultipartField<InputStream>) = apply { this.evidence = evidence }

            /** The evidence to upload */
            fun evidence(evidence: ByteArray) = evidence(evidence.inputStream())

            /** The evidence to upload */
            fun evidence(path: Path) =
                evidence(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** The name of the evidence */
            fun name(name: String) = name(MultipartField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary multipart value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: MultipartField<String>) = apply { this.name = name }

            /** The type of evidence */
            fun type(type: String) = type(MultipartField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary multipart value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: MultipartField<String>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .evidence()
             * .name()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("evidence", evidence),
                    checkRequired("name", name),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            evidence()
            name()
            type()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RainHelloWorldInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                evidence == other.evidence &&
                name == other.name &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(evidence, name, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{evidence=$evidence, name=$name, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EvidenceUploadParams &&
            disputeId == other.disputeId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(disputeId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EvidenceUploadParams{disputeId=$disputeId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
