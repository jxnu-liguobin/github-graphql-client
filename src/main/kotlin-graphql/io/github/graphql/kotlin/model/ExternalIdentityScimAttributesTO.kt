package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ExternalIdentityScimAttributesTO(
    val username: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (username != null) {
            joiner.add("username: " + GraphQLRequestSerializer.getEntry(username))
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
        val that = other as ExternalIdentityScimAttributesTO
        return Objects.equals(username, that.username)

    }

    override fun hashCode(): Int = {
        return Objects.hash(username)
    }

    class Builder {

        private var username: String? = null

        fun setUsername(username: String?): Builder {
            this.username = username
            return this
        }

        fun build(): ExternalIdentityScimAttributesTO {
            return ExternalIdentityScimAttributesTO(username)
        }
    }
}
