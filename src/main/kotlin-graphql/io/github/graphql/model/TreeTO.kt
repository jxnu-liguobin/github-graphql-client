package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class TreeTO(
    override
    val abbreviatedOid: String,
    override
    val commitResourcePath: String,
    override
    val commitUrl: String,
    val entries: List<TreeEntryTO>?,
    override
    val id: String,
    override
    val oid: String,
    override
    val repository: RepositoryTO
) : GitObjectTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid))
        joiner.add("commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath))
        joiner.add("commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl))
        if (entries != null) {
            joiner.add("entries: " + GraphQLRequestSerializer.getEntry(entries))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        return joiner.toString()
    }

    class Builder {

        private lateinit var abbreviatedOid: String
        private lateinit var commitResourcePath: String
        private lateinit var commitUrl: String
        private var entries: List<TreeEntryTO>? = null
        private lateinit var id: String
        private lateinit var oid: String
        private lateinit var repository: RepositoryTO

        fun setAbbreviatedOid(abbreviatedOid: String): Builder {
            this.abbreviatedOid = abbreviatedOid
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

        fun setEntries(entries: List<TreeEntryTO>?): Builder {
            this.entries = entries
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
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

        fun build(): TreeTO {
            return TreeTO(abbreviatedOid, commitResourcePath, commitUrl, entries, id, oid, repository)
        }
    }
}
