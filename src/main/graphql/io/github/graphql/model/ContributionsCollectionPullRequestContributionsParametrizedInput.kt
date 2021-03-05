package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field pullRequestContributions in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class ContributionsCollectionPullRequestContributionsParametrizedInput(
    val after: String?,
    val before: String?,
    val excludeFirst: Boolean? = false,
    val excludePopular: Boolean? = false,
    val first: Int?,
    val last: Int?,
    val orderBy: ContributionOrderTO?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before))
        }
        if (excludeFirst != null) {
            joiner.add("excludeFirst: " + GraphQLRequestSerializer.getEntry(excludeFirst))
        }
        if (excludePopular != null) {
            joiner.add("excludePopular: " + GraphQLRequestSerializer.getEntry(excludePopular))
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy))
        }
        return joiner.toString()
    }
}
