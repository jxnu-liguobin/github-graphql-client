package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class BlobTO(
    override
    val abbreviatedOid: String,
    val byteSize: Int,
    override
    val commitResourcePath: String,
    override
    val commitUrl: String,
    override
    val id: String,
    val isBinary: Boolean,
    val isTruncated: Boolean,
    override
    val oid: String,
    override
    val repository: RepositoryTO,
    val text: String?
) : GitObjectTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid))
        joiner.add("byteSize: " + GraphQLRequestSerializer.getEntry(byteSize))
        joiner.add("commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath))
        joiner.add("commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isBinary: " + GraphQLRequestSerializer.getEntry(isBinary))
        joiner.add("isTruncated: " + GraphQLRequestSerializer.getEntry(isTruncated))
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        if (text != null) {
            joiner.add("text: " + GraphQLRequestSerializer.getEntry(text))
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
        val that = other as BlobTO
        return Objects.equals(abbreviatedOid, that.abbreviatedOid)
                && Objects.equals(byteSize, that.byteSize)
                && Objects.equals(commitResourcePath, that.commitResourcePath)
                && Objects.equals(commitUrl, that.commitUrl)
                && Objects.equals(id, that.id)
                && Objects.equals(isBinary, that.isBinary)
                && Objects.equals(isTruncated, that.isTruncated)
                && Objects.equals(oid, that.oid)
                && Objects.equals(repository, that.repository)
                && Objects.equals(text, that.text)

    }

    override fun hashCode(): Int = {
        return Objects.hash(abbreviatedOid, byteSize, commitResourcePath, commitUrl, id, isBinary, isTruncated, oid, repository, text)
    }

    class Builder {

        private lateinit var abbreviatedOid: String
        private var byteSize: Int = 0
        private lateinit var commitResourcePath: String
        private lateinit var commitUrl: String
        private lateinit var id: String
        private var isBinary: Boolean = false
        private var isTruncated: Boolean = false
        private lateinit var oid: String
        private lateinit var repository: RepositoryTO
        private var text: String? = null

        fun setAbbreviatedOid(abbreviatedOid: String): Builder {
            this.abbreviatedOid = abbreviatedOid
            return this
        }

        fun setByteSize(byteSize: Int): Builder {
            this.byteSize = byteSize
            return this
        }

        fun setCommitResourcePath(commitResourcePath: String): Builder {
            this.commitResourcePath = commitResourcePath
            return this
        }

        fun setCommitUrl(commitUrl: String): Builder {
            this.commitUrl = commitUrl
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsBinary(isBinary: Boolean): Builder {
            this.isBinary = isBinary
            return this
        }

        fun setIsTruncated(isTruncated: Boolean): Builder {
            this.isTruncated = isTruncated
            return this
        }

        fun setOid(oid: String): Builder {
            this.oid = oid
            return this
        }

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
            return this
        }

        fun setText(text: String?): Builder {
            this.text = text
            return this
        }

        fun build(): BlobTO {
            return BlobTO(abbreviatedOid, byteSize, commitResourcePath, commitUrl, id, isBinary, isTruncated, oid, repository, text)
        }
    }
}
