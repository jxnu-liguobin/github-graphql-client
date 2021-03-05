package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field totalRepositoriesWithContributedIssues in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class ContributionsCollectionTotalRepositoriesWithContributedIssuesParametrizedInput(
    val excludeFirst: Boolean? = false,
    val excludePopular: Boolean? = false
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (excludeFirst != null) {
            joiner.add("excludeFirst: " + GraphQLRequestSerializer.getEntry(excludeFirst))
        }
        if (excludePopular != null) {
            joiner.add("excludePopular: " + GraphQLRequestSerializer.getEntry(excludePopular))
        }
        return joiner.toString()
    }
}
