// File generated from our OpenAPI spec by Stainless.

package com.rain_sdk.api.models.applications.company

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_sdk.api.core.Enum
import com.rain_sdk.api.core.ExcludeMissing
import com.rain_sdk.api.core.JsonField
import com.rain_sdk.api.core.JsonValue
import com.rain_sdk.api.core.MultipartField
import com.rain_sdk.api.core.Params
import com.rain_sdk.api.core.checkRequired
import com.rain_sdk.api.core.http.Headers
import com.rain_sdk.api.core.http.QueryParams
import com.rain_sdk.api.core.toImmutable
import com.rain_sdk.api.errors.RainInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import kotlin.io.path.inputStream
import kotlin.io.path.name

/**
 * Uploads a document that supports a company's corporate application. This is typically used to
 * provide additional documentation, such as proof of address, incorporation certificates, or other
 * required legal documents.
 */
class CompanyUploadDocumentParams
private constructor(
    private val companyId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun companyId(): String? = companyId

    /**
     * The actual document file to be uploaded. The document must be in binary format, and the
     * maximum allowed size is 20 MB.
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun document(): InputStream = body.document()

    /**
     * The country where the document was issued
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun country(): String? = body.country()

    /**
     * The name of the document being uploaded
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * The side of the document being uploaded
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun side(): Side? = body.side()

    /**
     * The type of the document being uploaded
     *
     * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun type(): Type? = body.type()

    /**
     * Returns the raw multipart value of [document].
     *
     * Unlike [document], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _document(): MultipartField<InputStream> = body._document()

    /**
     * Returns the raw multipart value of [country].
     *
     * Unlike [country], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _country(): MultipartField<String> = body._country()

    /**
     * Returns the raw multipart value of [name].
     *
     * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _name(): MultipartField<String> = body._name()

    /**
     * Returns the raw multipart value of [side].
     *
     * Unlike [side], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _side(): MultipartField<Side> = body._side()

    /**
     * Returns the raw multipart value of [type].
     *
     * Unlike [type], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _type(): MultipartField<Type> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CompanyUploadDocumentParams].
         *
         * The following fields are required:
         * ```kotlin
         * .document()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CompanyUploadDocumentParams]. */
    class Builder internal constructor() {

        private var companyId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(companyUploadDocumentParams: CompanyUploadDocumentParams) = apply {
            companyId = companyUploadDocumentParams.companyId
            body = companyUploadDocumentParams.body.toBuilder()
            additionalHeaders = companyUploadDocumentParams.additionalHeaders.toBuilder()
            additionalQueryParams = companyUploadDocumentParams.additionalQueryParams.toBuilder()
        }

        fun companyId(companyId: String?) = apply { this.companyId = companyId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [document]
         * - [country]
         * - [name]
         * - [side]
         * - [type]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The actual document file to be uploaded. The document must be in binary format, and the
         * maximum allowed size is 20 MB.
         */
        fun document(document: InputStream) = apply { body.document(document) }

        /**
         * Sets [Builder.document] to an arbitrary multipart value.
         *
         * You should usually call [Builder.document] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun document(document: MultipartField<InputStream>) = apply { body.document(document) }

        /**
         * The actual document file to be uploaded. The document must be in binary format, and the
         * maximum allowed size is 20 MB.
         */
        fun document(document: ByteArray) = apply { body.document(document) }

        /**
         * The actual document file to be uploaded. The document must be in binary format, and the
         * maximum allowed size is 20 MB.
         */
        fun document(path: Path) = apply { body.document(path) }

        /** The country where the document was issued */
        fun country(country: String) = apply { body.country(country) }

        /**
         * Sets [Builder.country] to an arbitrary multipart value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: MultipartField<String>) = apply { body.country(country) }

        /** The name of the document being uploaded */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary multipart value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: MultipartField<String>) = apply { body.name(name) }

        /** The side of the document being uploaded */
        fun side(side: Side) = apply { body.side(side) }

        /**
         * Sets [Builder.side] to an arbitrary multipart value.
         *
         * You should usually call [Builder.side] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun side(side: MultipartField<Side>) = apply { body.side(side) }

        /** The type of the document being uploaded */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary multipart value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: MultipartField<Type>) = apply { body.type(type) }

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
         * Returns an immutable instance of [CompanyUploadDocumentParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .document()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyUploadDocumentParams =
            CompanyUploadDocumentParams(
                companyId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "document" to _document(),
                "country" to _country(),
                "name" to _name(),
                "side" to _side(),
                "type" to _type(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> companyId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val document: MultipartField<InputStream>,
        private val country: MultipartField<String>,
        private val name: MultipartField<String>,
        private val side: MultipartField<Side>,
        private val type: MultipartField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The actual document file to be uploaded. The document must be in binary format, and the
         * maximum allowed size is 20 MB.
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun document(): InputStream = document.value.getRequired("document")

        /**
         * The country where the document was issued
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): String? = country.value.getNullable("country")

        /**
         * The name of the document being uploaded
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.value.getNullable("name")

        /**
         * The side of the document being uploaded
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun side(): Side? = side.value.getNullable("side")

        /**
         * The type of the document being uploaded
         *
         * @throws RainInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Type? = type.value.getNullable("type")

        /**
         * Returns the raw multipart value of [document].
         *
         * Unlike [document], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("document")
        @ExcludeMissing
        fun _document(): MultipartField<InputStream> = document

        /**
         * Returns the raw multipart value of [country].
         *
         * Unlike [country], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): MultipartField<String> = country

        /**
         * Returns the raw multipart value of [name].
         *
         * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

        /**
         * Returns the raw multipart value of [side].
         *
         * Unlike [side], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("side") @ExcludeMissing fun _side(): MultipartField<Side> = side

        /**
         * Returns the raw multipart value of [type].
         *
         * Unlike [type], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): MultipartField<Type> = type

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
             * .document()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var document: MultipartField<InputStream>? = null
            private var country: MultipartField<String> = MultipartField.of(null)
            private var name: MultipartField<String> = MultipartField.of(null)
            private var side: MultipartField<Side> = MultipartField.of(null)
            private var type: MultipartField<Type> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                document = body.document
                country = body.country
                name = body.name
                side = body.side
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The actual document file to be uploaded. The document must be in binary format, and
             * the maximum allowed size is 20 MB.
             */
            fun document(document: InputStream) = document(MultipartField.of(document))

            /**
             * Sets [Builder.document] to an arbitrary multipart value.
             *
             * You should usually call [Builder.document] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun document(document: MultipartField<InputStream>) = apply { this.document = document }

            /**
             * The actual document file to be uploaded. The document must be in binary format, and
             * the maximum allowed size is 20 MB.
             */
            fun document(document: ByteArray) = document(document.inputStream())

            /**
             * The actual document file to be uploaded. The document must be in binary format, and
             * the maximum allowed size is 20 MB.
             */
            fun document(path: Path) =
                document(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** The country where the document was issued */
            fun country(country: String) = country(MultipartField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary multipart value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: MultipartField<String>) = apply { this.country = country }

            /** The name of the document being uploaded */
            fun name(name: String) = name(MultipartField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary multipart value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: MultipartField<String>) = apply { this.name = name }

            /** The side of the document being uploaded */
            fun side(side: Side) = side(MultipartField.of(side))

            /**
             * Sets [Builder.side] to an arbitrary multipart value.
             *
             * You should usually call [Builder.side] with a well-typed [Side] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun side(side: MultipartField<Side>) = apply { this.side = side }

            /** The type of the document being uploaded */
            fun type(type: Type) = type(MultipartField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary multipart value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: MultipartField<Type>) = apply { this.type = type }

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
             * .document()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("document", document),
                    country,
                    name,
                    side,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws RainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            document()
            country()
            name()
            side()?.validate()
            type()?.validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RainInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                document == other.document &&
                country == other.country &&
                name == other.name &&
                side == other.side &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(document, country, name, side, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{document=$document, country=$country, name=$name, side=$side, type=$type, additionalProperties=$additionalProperties}"
    }

    /** The side of the document being uploaded */
    class Side @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FRONT = of("front")

            val BACK = of("back")

            fun of(value: String) = Side(JsonField.of(value))
        }

        /** An enum containing [Side]'s known values. */
        enum class Known {
            FRONT,
            BACK,
        }

        /**
         * An enum containing [Side]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Side] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FRONT,
            BACK,
            /** An enum member indicating that [Side] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FRONT -> Value.FRONT
                BACK -> Value.BACK
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RainInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                FRONT -> Known.FRONT
                BACK -> Known.BACK
                else -> throw RainInvalidDataException("Unknown Side: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw RainInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws RainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Side = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Side && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of the document being uploaded */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DIRECTORS_REGISTRY = of("directorsRegistry")

            val STATE_REGISTRY = of("stateRegistry")

            val INCUMBENCY_CERT = of("incumbencyCert")

            val PROOF_OF_ADDRESS = of("proofOfAddress")

            val TRUST_AGREEMENT = of("trustAgreement")

            val INFORMATION_STATEMENT = of("informationStatement")

            val INCORPORATION_CERT = of("incorporationCert")

            val INCORPORATION_ARTICLES = of("incorporationArticles")

            val SHAREHOLDER_REGISTRY = of("shareholderRegistry")

            val GOOD_STANDING_CERT = of("goodStandingCert")

            val POWER_OF_ATTORNEY = of("powerOfAttorney")

            val OTHER = of("other")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DIRECTORS_REGISTRY,
            STATE_REGISTRY,
            INCUMBENCY_CERT,
            PROOF_OF_ADDRESS,
            TRUST_AGREEMENT,
            INFORMATION_STATEMENT,
            INCORPORATION_CERT,
            INCORPORATION_ARTICLES,
            SHAREHOLDER_REGISTRY,
            GOOD_STANDING_CERT,
            POWER_OF_ATTORNEY,
            OTHER,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DIRECTORS_REGISTRY,
            STATE_REGISTRY,
            INCUMBENCY_CERT,
            PROOF_OF_ADDRESS,
            TRUST_AGREEMENT,
            INFORMATION_STATEMENT,
            INCORPORATION_CERT,
            INCORPORATION_ARTICLES,
            SHAREHOLDER_REGISTRY,
            GOOD_STANDING_CERT,
            POWER_OF_ATTORNEY,
            OTHER,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DIRECTORS_REGISTRY -> Value.DIRECTORS_REGISTRY
                STATE_REGISTRY -> Value.STATE_REGISTRY
                INCUMBENCY_CERT -> Value.INCUMBENCY_CERT
                PROOF_OF_ADDRESS -> Value.PROOF_OF_ADDRESS
                TRUST_AGREEMENT -> Value.TRUST_AGREEMENT
                INFORMATION_STATEMENT -> Value.INFORMATION_STATEMENT
                INCORPORATION_CERT -> Value.INCORPORATION_CERT
                INCORPORATION_ARTICLES -> Value.INCORPORATION_ARTICLES
                SHAREHOLDER_REGISTRY -> Value.SHAREHOLDER_REGISTRY
                GOOD_STANDING_CERT -> Value.GOOD_STANDING_CERT
                POWER_OF_ATTORNEY -> Value.POWER_OF_ATTORNEY
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RainInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                DIRECTORS_REGISTRY -> Known.DIRECTORS_REGISTRY
                STATE_REGISTRY -> Known.STATE_REGISTRY
                INCUMBENCY_CERT -> Known.INCUMBENCY_CERT
                PROOF_OF_ADDRESS -> Known.PROOF_OF_ADDRESS
                TRUST_AGREEMENT -> Known.TRUST_AGREEMENT
                INFORMATION_STATEMENT -> Known.INFORMATION_STATEMENT
                INCORPORATION_CERT -> Known.INCORPORATION_CERT
                INCORPORATION_ARTICLES -> Known.INCORPORATION_ARTICLES
                SHAREHOLDER_REGISTRY -> Known.SHAREHOLDER_REGISTRY
                GOOD_STANDING_CERT -> Known.GOOD_STANDING_CERT
                POWER_OF_ATTORNEY -> Known.POWER_OF_ATTORNEY
                OTHER -> Known.OTHER
                else -> throw RainInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw RainInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws RainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyUploadDocumentParams &&
            companyId == other.companyId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(companyId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CompanyUploadDocumentParams{companyId=$companyId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
