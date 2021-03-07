package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RepositoryCollaboratorEdgeTO(
    val cursor: String,
    val node: UserTO,
    val permission: RepositoryPermissionTO,
    val permissionSources: List<PermissionSourceTO>?
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
        if (permissionSources != null) {
            joiner.add("permissionSources: " + GraphQLRequestSerializer.getEntry(permissionSources))
        }
        return joiner.toString()
    }

    class Builder {

        private lateinit var cursor: String
        private lateinit var node: UserTO
        private lateinit var permission: RepositoryPermissionTO
        private var permissionSources: List<PermissionSourceTO>? = null

        fun setCursor(cursor: String): Builder {
            this.cursor = cursor
            return this
        }

        fun setNode(node: UserTO): Builder {
            this.node = node
            return this
        }

        fun setPermission(permission: RepositoryPermissionTO): Builder {
            this.permission = permission
            return this
        }

        fun setPermissionSources(permissionSources: List<PermissionSourceTO>?): Builder {
            this.permissionSources = permissionSources
            return this
        }

        fun build(): RepositoryCollaboratorEdgeTO {
            return RepositoryCollaboratorEdgeTO(cursor, node, permission, permissionSources)
        }
    }
}
