package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RepositoryInvitationTO(
    override
    val id: String,
    val invitee: UserTO,
    val inviter: UserTO,
    val permission: RepositoryPermissionTO,
    val repository: RepositoryInfoTO?
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("invitee: " + GraphQLRequestSerializer.getEntry(invitee))
        joiner.add("inviter: " + GraphQLRequestSerializer.getEntry(inviter))
        joiner.add("permission: " + GraphQLRequestSerializer.getEntry(permission))
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        }
        return joiner.toString()
    }
}
