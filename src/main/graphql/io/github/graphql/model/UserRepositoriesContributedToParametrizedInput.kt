package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field repositoriesContributedTo in type User
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class UserRepositoriesContributedToParametrizedInput(
    val after: String?,
    val before: String?,
    val contributionTypes: List<RepositoryContributionTypeTO?>?,
    val first: Int?,
    val includeUserRepositories: Boolean?,
    val isLocked: Boolean?,
    val last: Int?,
    val orderBy: RepositoryOrderTO?,
    val privacy: RepositoryPrivacyTO?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before))
        }
        if (contributionTypes != null) {
            joiner.add("contributionTypes: " + GraphQLRequestSerializer.getEntry(contributionTypes))
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first))
        }
        if (includeUserRepositories != null) {
            joiner.add("includeUserRepositories: " + GraphQLRequestSerializer.getEntry(includeUserRepositories))
        }
        if (isLocked != null) {
            joiner.add("isLocked: " + GraphQLRequestSerializer.getEntry(isLocked))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy))
        }
        if (privacy != null) {
            joiner.add("privacy: " + GraphQLRequestSerializer.getEntry(privacy))
        }
        return joiner.toString()
    }
}
