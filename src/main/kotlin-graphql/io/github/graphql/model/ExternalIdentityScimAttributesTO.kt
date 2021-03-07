package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
