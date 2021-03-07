package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class TagTO(
    override
    val abbreviatedOid: String,
    override
    val commitResourcePath: String,
    override
    val commitUrl: String,
    override
    val id: String,
    val message: String?,
    val name: String,
    override
    val oid: String,
    override
    val repository: RepositoryTO,
    val tagger: GitActorTO?,
    val target: GitObjectTO
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
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message))
        }
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        if (tagger != null) {
            joiner.add("tagger: " + GraphQLRequestSerializer.getEntry(tagger))
        }
        joiner.add("target: " + GraphQLRequestSerializer.getEntry(target))
        return joiner.toString()
    }

    class Builder {

        private lateinit var abbreviatedOid: String
        private lateinit var commitResourcePath: String
        private lateinit var commitUrl: String
        private lateinit var id: String
        private var message: String? = null
        private lateinit var name: String
        private lateinit var oid: String
        private lateinit var repository: RepositoryTO
        private var tagger: GitActorTO? = null
        private lateinit var target: GitObjectTO

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

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setMessage(message: String?): Builder {
            this.message = message
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
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

        fun setTagger(tagger: GitActorTO?): Builder {
            this.tagger = tagger
            return this
        }

        fun setTarget(target: GitObjectTO): Builder {
            this.target = target
            return this
        }

        fun build(): TagTO {
            return TagTO(abbreviatedOid, commitResourcePath, commitUrl, id, message, name, oid, repository, tagger, target)
        }
    }
}
