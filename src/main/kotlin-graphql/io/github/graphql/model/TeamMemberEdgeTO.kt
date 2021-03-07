package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class TeamMemberEdgeTO(
    val cursor: String,
    val memberAccessResourcePath: String,
    val memberAccessUrl: String,
    val node: UserTO,
    val role: TeamMemberRoleTO
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor))
        joiner.add("memberAccessResourcePath: " + GraphQLRequestSerializer.getEntry(memberAccessResourcePath))
        joiner.add("memberAccessUrl: " + GraphQLRequestSerializer.getEntry(memberAccessUrl))
        joiner.add("node: " + GraphQLRequestSerializer.getEntry(node))
        joiner.add("role: " + GraphQLRequestSerializer.getEntry(role))
        return joiner.toString()
    }

    class Builder {

        private lateinit var cursor: String
        private lateinit var memberAccessResourcePath: String
        private lateinit var memberAccessUrl: String
        private lateinit var node: UserTO
        private lateinit var role: TeamMemberRoleTO

        fun setCursor(cursor: String): Builder {
            this.cursor = cursor
            return this
        }

        fun setMemberAccessResourcePath(memberAccessResourcePath: String): Builder {
            this.memberAccessResourcePath = memberAccessResourcePath
            return this
        }

        fun setMemberAccessUrl(memberAccessUrl: String): Builder {
            this.memberAccessUrl = memberAccessUrl
            return this
        }

        fun setNode(node: UserTO): Builder {
            this.node = node
            return this
        }

        fun setRole(role: TeamMemberRoleTO): Builder {
            this.role = role
            return this
        }

        fun build(): TeamMemberEdgeTO {
            return TeamMemberEdgeTO(cursor, memberAccessResourcePath, memberAccessUrl, node, role)
        }
    }
}
