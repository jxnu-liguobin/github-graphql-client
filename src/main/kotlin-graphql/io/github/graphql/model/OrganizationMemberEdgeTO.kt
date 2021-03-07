package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class OrganizationMemberEdgeTO(
    val cursor: String,
    val hasTwoFactorEnabled: Boolean?,
    val node: UserTO?,
    val role: OrganizationMemberRoleTO?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor))
        if (hasTwoFactorEnabled != null) {
            joiner.add("hasTwoFactorEnabled: " + GraphQLRequestSerializer.getEntry(hasTwoFactorEnabled))
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node))
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role))
        }
        return joiner.toString()
    }

    class Builder {

        private lateinit var cursor: String
        private var hasTwoFactorEnabled: Boolean? = null
        private var node: UserTO? = null
        private var role: OrganizationMemberRoleTO? = null

        fun setCursor(cursor: String): Builder {
            this.cursor = cursor
            return this
        }

        fun setHasTwoFactorEnabled(hasTwoFactorEnabled: Boolean?): Builder {
            this.hasTwoFactorEnabled = hasTwoFactorEnabled
            return this
        }

        fun setNode(node: UserTO?): Builder {
            this.node = node
            return this
        }

        fun setRole(role: OrganizationMemberRoleTO?): Builder {
            this.role = role
            return this
        }

        fun build(): OrganizationMemberEdgeTO {
            return OrganizationMemberEdgeTO(cursor, hasTwoFactorEnabled, node, role)
        }
    }
}
