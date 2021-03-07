package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BlobTO(
    @javax.validation.constraints.NotNull
    override val abbreviatedOid: String,
    byteSize: Int,
    @javax.validation.constraints.NotNull
    override val commitResourcePath: String,
    @javax.validation.constraints.NotNull
    override val commitUrl: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    isBinary: Boolean,
    isTruncated: Boolean,
    @javax.validation.constraints.NotNull
    override val oid: String,
    @javax.validation.constraints.NotNull
    override val repository: RepositoryTO,
    text: String
) extends GitObjectTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (abbreviatedOid != null) "abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid) else "",
            "byteSize: " + GraphQLRequestSerializer.getEntry(byteSize),
            if (commitResourcePath != null) "commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath) else "",
            if (commitUrl != null) "commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isBinary: " + GraphQLRequestSerializer.getEntry(isBinary),
            "isTruncated: " + GraphQLRequestSerializer.getEntry(isTruncated),
            if (oid != null) "oid: " + GraphQLRequestSerializer.getEntry(oid) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (text != null) "text: " + GraphQLRequestSerializer.getEntry(text) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[BlobTO]
        Objects.equals(abbreviatedOid, that.abbreviatedOid) &&
        Objects.equals(byteSize, that.byteSize) &&
        Objects.equals(commitResourcePath, that.commitResourcePath) &&
        Objects.equals(commitUrl, that.commitUrl) &&
        Objects.equals(id, that.id) &&
        Objects.equals(isBinary, that.isBinary) &&
        Objects.equals(isTruncated, that.isTruncated) &&
        Objects.equals(oid, that.oid) &&
        Objects.equals(repository, that.repository) &&
        Objects.equals(text, that.text)
    }

    override def hashCode(): Int = {
        Objects.hash(abbreviatedOid, byteSize, commitResourcePath, commitUrl, id, isBinary, isTruncated, oid, repository, text)
    }
}

object BlobTO {

    def builder(): BlobTO.Builder = new Builder()

    class Builder {

        private var abbreviatedOid: String = _
        private var byteSize: Int = _
        private var commitResourcePath: String = _
        private var commitUrl: String = _
        private var id: String = _
        private var isBinary: Boolean = _
        private var isTruncated: Boolean = _
        private var oid: String = _
        private var repository: RepositoryTO = _
        private var text: String = _

        def setAbbreviatedOid(abbreviatedOid: String): Builder = {
            this.abbreviatedOid = abbreviatedOid
            this
        }

        def setByteSize(byteSize: Int): Builder = {
            this.byteSize = byteSize
            this
        }

        def setCommitResourcePath(commitResourcePath: String): Builder = {
            this.commitResourcePath = commitResourcePath
            this
        }

        def setCommitUrl(commitUrl: String): Builder = {
            this.commitUrl = commitUrl
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIsBinary(isBinary: Boolean): Builder = {
            this.isBinary = isBinary
            this
        }

        def setIsTruncated(isTruncated: Boolean): Builder = {
            this.isTruncated = isTruncated
            this
        }

        def setOid(oid: String): Builder = {
            this.oid = oid
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def setText(text: String): Builder = {
            this.text = text
            this
        }

        def build(): BlobTO = new BlobTO(abbreviatedOid, byteSize, commitResourcePath, commitUrl, id, isBinary, isTruncated, oid, repository, text)

    }
}
