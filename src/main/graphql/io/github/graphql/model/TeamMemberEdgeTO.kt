package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TeamMemberEdgeTO(
    val cursor: String,
    val memberAccessResourcePath: String,
    val memberAccessUrl: String,
    val node: UserTO,
    val role: TeamMemberRoleTO
) {

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
}
