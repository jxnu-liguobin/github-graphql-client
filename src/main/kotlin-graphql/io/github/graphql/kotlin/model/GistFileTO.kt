package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class GistFileTO(
    val encodedName: String?,
    val encoding: String?,
    val extension: String?,
    val isImage: Boolean,
    val isTruncated: Boolean,
    val language: LanguageTO?,
    val name: String?,
    val size: Int?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (encodedName != null) {
            joiner.add("encodedName: " + GraphQLRequestSerializer.getEntry(encodedName))
        }
        if (encoding != null) {
            joiner.add("encoding: " + GraphQLRequestSerializer.getEntry(encoding))
        }
        if (extension != null) {
            joiner.add("extension: " + GraphQLRequestSerializer.getEntry(extension))
        }
        joiner.add("isImage: " + GraphQLRequestSerializer.getEntry(isImage))
        joiner.add("isTruncated: " + GraphQLRequestSerializer.getEntry(isTruncated))
        if (language != null) {
            joiner.add("language: " + GraphQLRequestSerializer.getEntry(language))
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as GistFileTO
        return Objects.equals(encodedName, that.encodedName)
                && Objects.equals(encoding, that.encoding)
                && Objects.equals(extension, that.extension)
                && Objects.equals(isImage, that.isImage)
                && Objects.equals(isTruncated, that.isTruncated)
                && Objects.equals(language, that.language)
                && Objects.equals(name, that.name)
                && Objects.equals(size, that.size)

    }

    override fun hashCode(): Int = {
        return Objects.hash(encodedName, encoding, extension, isImage, isTruncated, language, name, size)
    }

    class Builder {

        private var encodedName: String? = null
        private var encoding: String? = null
        private var extension: String? = null
        private var isImage: Boolean = false
        private var isTruncated: Boolean = false
        private var language: LanguageTO? = null
        private var name: String? = null
        private var size: Int? = null

        fun setEncodedName(encodedName: String?): Builder {
            this.encodedName = encodedName
            return this
        }

        fun setEncoding(encoding: String?): Builder {
            this.encoding = encoding
            return this
        }

        fun setExtension(extension: String?): Builder {
            this.extension = extension
            return this
        }

        fun setIsImage(isImage: Boolean): Builder {
            this.isImage = isImage
            return this
        }

        fun setIsTruncated(isTruncated: Boolean): Builder {
            this.isTruncated = isTruncated
            return this
        }

        fun setLanguage(language: LanguageTO?): Builder {
            this.language = language
            return this
        }

        fun setName(name: String?): Builder {
            this.name = name
            return this
        }

        fun setSize(size: Int?): Builder {
            this.size = size
            return this
        }

        fun build(): GistFileTO {
            return GistFileTO(encodedName, encoding, extension, isImage, isTruncated, language, name, size)
        }
    }
}
