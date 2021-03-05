package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RepositoryCollaboratorEdgeTO(
    val cursor: String,
    val node: UserTO,
    val permission: RepositoryPermissionTO,
    val permissionSources: List<PermissionSourceTO>?
) {

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
}
