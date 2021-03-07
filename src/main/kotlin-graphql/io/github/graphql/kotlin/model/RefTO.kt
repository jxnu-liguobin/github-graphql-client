package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RefTO(
    override
    val id: String,
    val name: String,
    val prefix: String,
    val repository: RepositoryTO,
    val target: GitObjectTO
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("prefix: " + GraphQLRequestSerializer.getEntry(prefix))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("target: " + GraphQLRequestSerializer.getEntry(target))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RefTO
        return Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(prefix, that.prefix)
                && Objects.equals(repository, that.repository)
                && Objects.equals(target, that.target)

    }

    override fun hashCode(): Int = {
        return Objects.hash(id, name, prefix, repository, target)
    }

    class Builder {

        private lateinit var id: String
        private lateinit var name: String
        private lateinit var prefix: String
        private lateinit var repository: RepositoryTO
        private lateinit var target: GitObjectTO

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setPrefix(prefix: String): Builder {
            this.prefix = prefix
            return this
        }

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
            return this
        }

        fun setTarget(target: GitObjectTO): Builder {
            this.target = target
            return this
        }

        fun build(): RefTO {
            return RefTO(id, name, prefix, repository, target)
        }
    }
}
