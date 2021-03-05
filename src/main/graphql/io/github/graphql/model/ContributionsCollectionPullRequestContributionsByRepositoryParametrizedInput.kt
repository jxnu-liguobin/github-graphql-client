package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field pullRequestContributionsByRepository in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput(
    val excludeFirst: Boolean? = false,
    val excludePopular: Boolean? = false,
    val maxRepositories: Int? = 25
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (excludeFirst != null) {
            joiner.add("excludeFirst: " + GraphQLRequestSerializer.getEntry(excludeFirst))
        }
        if (excludePopular != null) {
            joiner.add("excludePopular: " + GraphQLRequestSerializer.getEntry(excludePopular))
        }
        if (maxRepositories != null) {
            joiner.add("maxRepositories: " + GraphQLRequestSerializer.getEntry(maxRepositories))
        }
        return joiner.toString()
    }
}
