package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class TeamRepositoryEdgeTO(
    val cursor: String,
    val node: RepositoryTO,
    val permission: RepositoryPermissionTO
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor))
        joiner.add("node: " + GraphQLRequestSerializer.getEntry(node))
        joiner.add("permission: " + GraphQLRequestSerializer.getEntry(permission))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as TeamRepositoryEdgeTO
        return Objects.equals(cursor, that.cursor)
                && Objects.equals(node, that.node)
                && Objects.equals(permission, that.permission)

    }

    override fun hashCode(): Int = {
        return Objects.hash(cursor, node, permission)
    }

    class Builder {

        private lateinit var cursor: String
        private lateinit var node: RepositoryTO
        private lateinit var permission: RepositoryPermissionTO

        fun setCursor(cursor: String): Builder {
            this.cursor = cursor
            return this
        }

        fun setNode(node: RepositoryTO): Builder {
            this.node = node
            return this
        }

        fun setPermission(permission: RepositoryPermissionTO): Builder {
            this.permission = permission
            return this
        }

        fun build(): TeamRepositoryEdgeTO {
            return TeamRepositoryEdgeTO(cursor, node, permission)
        }
    }
}
