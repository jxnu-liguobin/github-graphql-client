package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field deletePullRequestReview in type Mutation
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
data class MutationDeletePullRequestReviewParametrizedInput(
    val input: DeletePullRequestReviewInputTO
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        joiner.add("input: " + GraphQLRequestSerializer.getEntry(input))
        return joiner.toString()
    }
}
