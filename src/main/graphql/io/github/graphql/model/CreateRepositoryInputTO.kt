package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreateRepositoryInputTO(
    val clientMutationId: String?,
    val description: String?,
    val hasIssuesEnabled: Boolean? = true,
    val hasWikiEnabled: Boolean? = false,
    val homepageUrl: String?,
    val name: String,
    val ownerId: String?,
    val teamId: String?,
    val template: Boolean? = false,
    val visibility: RepositoryVisibilityTO
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
        if (hasWikiEnabled != null) {
            joiner.add("hasWikiEnabled: " + GraphQLRequestSerializer.getEntry(hasWikiEnabled))
        }
        if (homepageUrl != null) {
            joiner.add("homepageUrl: " + GraphQLRequestSerializer.getEntry(homepageUrl))
        }
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId))
        }
        if (teamId != null) {
            joiner.add("teamId: " + GraphQLRequestSerializer.getEntry(teamId))
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template))
        }
        joiner.add("visibility: " + GraphQLRequestSerializer.getEntry(visibility))
        return joiner.toString()
    }
}
