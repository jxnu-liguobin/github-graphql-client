package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class GistFileTO(
    encodedName: String,
    encoding: String,
    extension: String,
    isImage: Boolean,
    isTruncated: Boolean,
    language: LanguageTO,
    name: String,
    size: Option[Int]
) {

    override def toString(): String = {
        Seq(
            if (encodedName != null) "encodedName: " + GraphQLRequestSerializer.getEntry(encodedName) else "",
            if (encoding != null) "encoding: " + GraphQLRequestSerializer.getEntry(encoding) else "",
            if (extension != null) "extension: " + GraphQLRequestSerializer.getEntry(extension) else "",
            "isImage: " + GraphQLRequestSerializer.getEntry(isImage),
            "isTruncated: " + GraphQLRequestSerializer.getEntry(isTruncated),
            if (language != null) "language: " + GraphQLRequestSerializer.getEntry(language) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (size.isDefined) "size: " + GraphQLRequestSerializer.getEntry(size.get) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[GistFileTO]
        Objects.equals(encodedName, that.encodedName) &&
        Objects.equals(encoding, that.encoding) &&
        Objects.equals(extension, that.extension) &&
        Objects.equals(isImage, that.isImage) &&
        Objects.equals(isTruncated, that.isTruncated) &&
        Objects.equals(language, that.language) &&
        Objects.equals(name, that.name) &&
        Objects.equals(size, that.size)
    }

    override def hashCode(): Int = {
        Objects.hash(encodedName, encoding, extension, isImage, isTruncated, language, name, size)
    }
}

object GistFileTO {

    def builder(): GistFileTO.Builder = new Builder()

    class Builder {

        private var encodedName: String = _
        private var encoding: String = _
        private var extension: String = _
        private var isImage: Boolean = _
        private var isTruncated: Boolean = _
        private var language: LanguageTO = _
        private var name: String = _
        private var size: Option[Int] = _

        def setEncodedName(encodedName: String): Builder = {
            this.encodedName = encodedName
            this
        }

        def setEncoding(encoding: String): Builder = {
            this.encoding = encoding
            this
        }

        def setExtension(extension: String): Builder = {
            this.extension = extension
            this
        }

        def setIsImage(isImage: Boolean): Builder = {
            this.isImage = isImage
            this
        }

        def setIsTruncated(isTruncated: Boolean): Builder = {
            this.isTruncated = isTruncated
            this
        }

        def setLanguage(language: LanguageTO): Builder = {
            this.language = language
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setSize(size: Option[Int]): Builder = {
            this.size = size
            this
        }

        def build(): GistFileTO = new GistFileTO(encodedName, encoding, extension, isImage, isTruncated, language, name, size)

    }
}
