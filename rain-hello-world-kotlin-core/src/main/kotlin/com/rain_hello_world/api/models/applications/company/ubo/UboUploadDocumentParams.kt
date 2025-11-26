// File generated from our OpenAPI spec by Stainless.

package com.rain_hello_world.api.models.applications.company.ubo

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rain_hello_world.api.core.Enum
import com.rain_hello_world.api.core.ExcludeMissing
import com.rain_hello_world.api.core.JsonField
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

/**
 * This deprecated endpoint allows the upload of a document for a UBO to support a company's
 * corporate application. It is recommended to use the newer endpoint for document uploads.
 */
@Deprecated("deprecated")
class UboUploadDocumentParams
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
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun document(): InputStream = body.document()

    /**
     * The UBO's email address
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = body.email()

    /**
     * The country where the document was issued
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun country(): String? = body.country()

    /**
     * The side of the document being uploaded
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun side(): Side? = body.side()

    /**
     * The type of the document being uploaded
     *
     * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Type? = body.type()

    /**
     * Returns the raw multipart value of [document].
     *
     * Unlike [document], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _document(): MultipartField<InputStream> = body._document()

    /**
     * Returns the raw multipart value of [email].
     *
     * Unlike [email], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _email(): MultipartField<String> = body._email()

    /**
     * Returns the raw multipart value of [country].
     *
     * Unlike [country], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _country(): MultipartField<String> = body._country()

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
         * Returns a mutable builder for constructing an instance of [UboUploadDocumentParams].
         *
         * The following fields are required:
         * ```kotlin
         * .document()
         * .email()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UboUploadDocumentParams]. */
    class Builder internal constructor() {

        private var companyId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(uboUploadDocumentParams: UboUploadDocumentParams) = apply {
            companyId = uboUploadDocumentParams.companyId
            body = uboUploadDocumentParams.body.toBuilder()
            additionalHeaders = uboUploadDocumentParams.additionalHeaders.toBuilder()
            additionalQueryParams = uboUploadDocumentParams.additionalQueryParams.toBuilder()
        }

        fun companyId(companyId: String?) = apply { this.companyId = companyId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [document]
         * - [email]
         * - [country]
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

        /** The UBO's email address */
        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary multipart value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: MultipartField<String>) = apply { body.email(email) }

        /** The country where the document was issued */
        fun country(country: String) = apply { body.country(country) }

        /**
         * Sets [Builder.country] to an arbitrary multipart value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: MultipartField<String>) = apply { body.country(country) }

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
         * Returns an immutable instance of [UboUploadDocumentParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .document()
         * .email()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UboUploadDocumentParams =
            UboUploadDocumentParams(
                companyId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "document" to _document(),
                "email" to _email(),
                "country" to _country(),
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
        private val email: MultipartField<String>,
        private val country: MultipartField<String>,
        private val side: MultipartField<Side>,
        private val type: MultipartField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The actual document file to be uploaded. The document must be in binary format, and the
         * maximum allowed size is 20 MB.
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun document(): InputStream = document.value.getRequired("document")

        /**
         * The UBO's email address
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.value.getRequired("email")

        /**
         * The country where the document was issued
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun country(): String? = country.value.getNullable("country")

        /**
         * The side of the document being uploaded
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun side(): Side? = side.value.getNullable("side")

        /**
         * The type of the document being uploaded
         *
         * @throws RainHelloWorldInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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
         * Returns the raw multipart value of [email].
         *
         * Unlike [email], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): MultipartField<String> = email

        /**
         * Returns the raw multipart value of [country].
         *
         * Unlike [country], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): MultipartField<String> = country

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
             * .email()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var document: MultipartField<InputStream>? = null
            private var email: MultipartField<String>? = null
            private var country: MultipartField<String> = MultipartField.of(null)
            private var side: MultipartField<Side> = MultipartField.of(null)
            private var type: MultipartField<Type> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                document = body.document
                email = body.email
                country = body.country
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

            /** The UBO's email address */
            fun email(email: String) = email(MultipartField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary multipart value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: MultipartField<String>) = apply { this.email = email }

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
             * .email()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("document", document),
                    checkRequired("email", email),
                    country,
                    side,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            document()
            email()
            country()
            side()?.validate()
            type()?.validate()
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
                document == other.document &&
                email == other.email &&
                country == other.country &&
                side == other.side &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(document, email, country, side, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{document=$document, email=$email, country=$country, side=$side, type=$type, additionalProperties=$additionalProperties}"
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
         * @throws RainHelloWorldInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                FRONT -> Known.FRONT
                BACK -> Known.BACK
                else -> throw RainHelloWorldInvalidDataException("Unknown Side: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RainHelloWorldInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw RainHelloWorldInvalidDataException("Value is not a String")

        private var validated: Boolean = false

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
            } catch (e: RainHelloWorldInvalidDataException) {
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

            val ID_CARD = of("idCard")

            val PASSPORT = of("passport")

            val DRIVERS = of("drivers")

            val RESIDENCE_PERMIT = of("residencePermit")

            val UTILITY_BILL = of("utilityBill")

            val SELFIE = of("selfie")

            val VIDEO_SELFIE = of("videoSelfie")

            val PROFILE_IMAGE = of("profileImage")

            val ID_DOC_PHOTO = of("idDocPhoto")

            val AGREEMENT = of("agreement")

            val CONTRACT = of("contract")

            val DRIVERS_TRANSLATION = of("driversTranslation")

            val INVESTOR_DOC = of("investorDoc")

            val VEHICLE_REGISTRATION_CERTIFICATE = of("vehicleRegistrationCertificate")

            val INCOME_SOURCE = of("incomeSource")

            val PAYMENT_METHOD = of("paymentMethod")

            val BANK_CARD = of("bankCard")

            val COVID_VACCINATION_FORM = of("covidVaccinationForm")

            val OTHER = of("other")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ID_CARD,
            PASSPORT,
            DRIVERS,
            RESIDENCE_PERMIT,
            UTILITY_BILL,
            SELFIE,
            VIDEO_SELFIE,
            PROFILE_IMAGE,
            ID_DOC_PHOTO,
            AGREEMENT,
            CONTRACT,
            DRIVERS_TRANSLATION,
            INVESTOR_DOC,
            VEHICLE_REGISTRATION_CERTIFICATE,
            INCOME_SOURCE,
            PAYMENT_METHOD,
            BANK_CARD,
            COVID_VACCINATION_FORM,
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
            ID_CARD,
            PASSPORT,
            DRIVERS,
            RESIDENCE_PERMIT,
            UTILITY_BILL,
            SELFIE,
            VIDEO_SELFIE,
            PROFILE_IMAGE,
            ID_DOC_PHOTO,
            AGREEMENT,
            CONTRACT,
            DRIVERS_TRANSLATION,
            INVESTOR_DOC,
            VEHICLE_REGISTRATION_CERTIFICATE,
            INCOME_SOURCE,
            PAYMENT_METHOD,
            BANK_CARD,
            COVID_VACCINATION_FORM,
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
                ID_CARD -> Value.ID_CARD
                PASSPORT -> Value.PASSPORT
                DRIVERS -> Value.DRIVERS
                RESIDENCE_PERMIT -> Value.RESIDENCE_PERMIT
                UTILITY_BILL -> Value.UTILITY_BILL
                SELFIE -> Value.SELFIE
                VIDEO_SELFIE -> Value.VIDEO_SELFIE
                PROFILE_IMAGE -> Value.PROFILE_IMAGE
                ID_DOC_PHOTO -> Value.ID_DOC_PHOTO
                AGREEMENT -> Value.AGREEMENT
                CONTRACT -> Value.CONTRACT
                DRIVERS_TRANSLATION -> Value.DRIVERS_TRANSLATION
                INVESTOR_DOC -> Value.INVESTOR_DOC
                VEHICLE_REGISTRATION_CERTIFICATE -> Value.VEHICLE_REGISTRATION_CERTIFICATE
                INCOME_SOURCE -> Value.INCOME_SOURCE
                PAYMENT_METHOD -> Value.PAYMENT_METHOD
                BANK_CARD -> Value.BANK_CARD
                COVID_VACCINATION_FORM -> Value.COVID_VACCINATION_FORM
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RainHelloWorldInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                ID_CARD -> Known.ID_CARD
                PASSPORT -> Known.PASSPORT
                DRIVERS -> Known.DRIVERS
                RESIDENCE_PERMIT -> Known.RESIDENCE_PERMIT
                UTILITY_BILL -> Known.UTILITY_BILL
                SELFIE -> Known.SELFIE
                VIDEO_SELFIE -> Known.VIDEO_SELFIE
                PROFILE_IMAGE -> Known.PROFILE_IMAGE
                ID_DOC_PHOTO -> Known.ID_DOC_PHOTO
                AGREEMENT -> Known.AGREEMENT
                CONTRACT -> Known.CONTRACT
                DRIVERS_TRANSLATION -> Known.DRIVERS_TRANSLATION
                INVESTOR_DOC -> Known.INVESTOR_DOC
                VEHICLE_REGISTRATION_CERTIFICATE -> Known.VEHICLE_REGISTRATION_CERTIFICATE
                INCOME_SOURCE -> Known.INCOME_SOURCE
                PAYMENT_METHOD -> Known.PAYMENT_METHOD
                BANK_CARD -> Known.BANK_CARD
                COVID_VACCINATION_FORM -> Known.COVID_VACCINATION_FORM
                OTHER -> Known.OTHER
                else -> throw RainHelloWorldInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RainHelloWorldInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw RainHelloWorldInvalidDataException("Value is not a String")

        private var validated: Boolean = false

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
            } catch (e: RainHelloWorldInvalidDataException) {
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

        return other is UboUploadDocumentParams &&
            companyId == other.companyId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(companyId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UboUploadDocumentParams{companyId=$companyId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
