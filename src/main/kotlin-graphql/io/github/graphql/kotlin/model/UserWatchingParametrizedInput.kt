package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field watching in type User
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
data class UserWatchingParametrizedInput(
    val affiliations: List<RepositoryAffiliationTO?>? = listOf(RepositoryAffiliationTO.OWNER, RepositoryAffiliationTO.COLLABORATOR, RepositoryAffiliationTO.ORGANIZATION_MEMBER),
    val after: String?,
    val before: String?,
    val first: Int?,
    val isLocked: Boolean?,
    val last: Int?,
    val orderBy: RepositoryOrderTO?,
    val ownerAffiliations: List<RepositoryAffiliationTO?>? = listOf(RepositoryAffiliationTO.OWNER, RepositoryAffiliationTO.COLLABORATOR),
    val privacy: RepositoryPrivacyTO?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (affiliations != null) {
            joiner.add("affiliations: " + GraphQLRequestSerializer.getEntry(affiliations))
        }
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before))
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first))
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
        if (ownerAffiliations != null) {
            joiner.add("ownerAffiliations: " + GraphQLRequestSerializer.getEntry(ownerAffiliations))
        }
        if (privacy != null) {
            joiner.add("privacy: " + GraphQLRequestSerializer.getEntry(privacy))
        }
        return joiner.toString()
    }
}
