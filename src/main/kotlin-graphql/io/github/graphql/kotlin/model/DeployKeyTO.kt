package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class DeployKeyTO(
    val createdAt: String,
    override
    val id: String,
    val key: String,
    val readOnly: Boolean,
    val title: String,
    val verified: Boolean
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("key: " + GraphQLRequestSerializer.getEntry(key))
        joiner.add("readOnly: " + GraphQLRequestSerializer.getEntry(readOnly))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        joiner.add("verified: " + GraphQLRequestSerializer.getEntry(verified))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DeployKeyTO
        return Objects.equals(createdAt, that.createdAt)
                && Objects.equals(id, that.id)
                && Objects.equals(key, that.key)
                && Objects.equals(readOnly, that.readOnly)
                && Objects.equals(title, that.title)
                && Objects.equals(verified, that.verified)

    }

    override fun hashCode(): Int = {
        return Objects.hash(createdAt, id, key, readOnly, title, verified)
    }

    class Builder {

        private lateinit var createdAt: String
        private lateinit var id: String
        private lateinit var key: String
        private var readOnly: Boolean = false
        private lateinit var title: String
        private var verified: Boolean = false

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setKey(key: String): Builder {
            this.key = key
            return this
        }

        fun setReadOnly(readOnly: Boolean): Builder {
            this.readOnly = readOnly
            return this
        }

        fun setTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun setVerified(verified: Boolean): Builder {
            this.verified = verified
            return this
        }

        fun build(): DeployKeyTO {
            return DeployKeyTO(createdAt, id, key, readOnly, title, verified)
        }
    }
}
