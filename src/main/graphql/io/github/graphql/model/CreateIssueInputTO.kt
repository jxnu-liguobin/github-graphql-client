package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreateIssueInputTO(
    val assigneeIds: List<String>?,
    val body: String?,
    val clientMutationId: String?,
    val labelIds: List<String>?,
    val milestoneId: String?,
    val projectIds: List<String>?,
    val repositoryId: String,
    val title: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (assigneeIds != null) {
            joiner.add("assigneeIds: " + GraphQLRequestSerializer.getEntry(assigneeIds))
        }
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (labelIds != null) {
            joiner.add("labelIds: " + GraphQLRequestSerializer.getEntry(labelIds))
        }
        if (milestoneId != null) {
            joiner.add("milestoneId: " + GraphQLRequestSerializer.getEntry(milestoneId))
        }
        if (projectIds != null) {
            joiner.add("projectIds: " + GraphQLRequestSerializer.getEntry(projectIds))
        }
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        return joiner.toString()
    }
}
