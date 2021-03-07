package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class TreeEntryTO(
    val mode: Int,
    val name: String,
    val `object`: GitObjectTO?,
    val oid: String,
    val repository: RepositoryTO,
    val type: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("mode: " + GraphQLRequestSerializer.getEntry(mode))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (`object` != null) {
            joiner.add("object: " + GraphQLRequestSerializer.getEntry(`object`))
        }
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("type: " + GraphQLRequestSerializer.getEntry(type))
        return joiner.toString()
    }

    class Builder {

        private var mode: Int = 0
        private lateinit var name: String
        private var `object`: GitObjectTO? = null
        private lateinit var oid: String
        private lateinit var repository: RepositoryTO
        private lateinit var type: String

        fun setMode(mode: Int): Builder {
            this.mode = mode
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setObject(`object`: GitObjectTO?): Builder {
            this.`object` = `object`
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

        fun setType(type: String): Builder {
            this.type = type
            return this
        }

        fun build(): TreeEntryTO {
            return TreeEntryTO(mode, name, `object`, oid, repository, type)
        }
    }
}
