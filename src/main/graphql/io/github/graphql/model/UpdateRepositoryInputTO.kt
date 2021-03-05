package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateRepositoryInputTO(
    val clientMutationId: String?,
    val description: String?,
    val hasIssuesEnabled: Boolean?,
    val hasProjectsEnabled: Boolean?,
    val hasWikiEnabled: Boolean?,
    val homepageUrl: String?,
    val name: String?,
    val repositoryId: String,
    val template: Boolean?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        if (hasIssuesEnabled != null) {
            joiner.add("hasIssuesEnabled: " + GraphQLRequestSerializer.getEntry(hasIssuesEnabled))
        }
        if (hasProjectsEnabled != null) {
            joiner.add("hasProjectsEnabled: " + GraphQLRequestSerializer.getEntry(hasProjectsEnabled))
        }
        if (hasWikiEnabled != null) {
            joiner.add("hasWikiEnabled: " + GraphQLRequestSerializer.getEntry(hasWikiEnabled))
        }
        if (homepageUrl != null) {
            joiner.add("homepageUrl: " + GraphQLRequestSerializer.getEntry(homepageUrl))
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template))
        }
        return joiner.toString()
    }
}
