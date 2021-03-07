package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
