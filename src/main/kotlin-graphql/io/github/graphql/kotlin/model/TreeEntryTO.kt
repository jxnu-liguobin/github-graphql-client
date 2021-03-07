package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as TreeEntryTO
        return Objects.equals(mode, that.mode)
                && Objects.equals(name, that.name)
                && Objects.equals(`object`, that.`object`)
                && Objects.equals(oid, that.oid)
                && Objects.equals(repository, that.repository)
                && Objects.equals(type, that.type)

    }

    override fun hashCode(): Int = {
        return Objects.hash(mode, name, `object`, oid, repository, type)
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
