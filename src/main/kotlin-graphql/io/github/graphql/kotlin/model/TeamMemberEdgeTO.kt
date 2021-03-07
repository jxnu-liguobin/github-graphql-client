package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as TeamMemberEdgeTO
        return Objects.equals(cursor, that.cursor)
                && Objects.equals(memberAccessResourcePath, that.memberAccessResourcePath)
                && Objects.equals(memberAccessUrl, that.memberAccessUrl)
                && Objects.equals(node, that.node)
                && Objects.equals(role, that.role)

    }

    override fun hashCode(): Int = {
        return Objects.hash(cursor, memberAccessResourcePath, memberAccessUrl, node, role)
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
