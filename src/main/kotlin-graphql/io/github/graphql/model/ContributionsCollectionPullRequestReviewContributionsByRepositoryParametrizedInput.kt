package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field pullRequestReviewContributionsByRepository in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
data class ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput(
    val maxRepositories: Int? = 25
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (maxRepositories != null) {
            joiner.add("maxRepositories: " + GraphQLRequestSerializer.getEntry(maxRepositories))
        }
        return joiner.toString()
    }
}
