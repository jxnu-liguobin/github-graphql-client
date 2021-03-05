package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PermissionSourceTO(
    val organization: OrganizationTO,
    val permission: DefaultRepositoryPermissionFieldTO,
    val source: PermissionGranterTO
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization))
        joiner.add("permission: " + GraphQLRequestSerializer.getEntry(permission))
        joiner.add("source: " + GraphQLRequestSerializer.getEntry(source))
        return joiner.toString()
    }
}
