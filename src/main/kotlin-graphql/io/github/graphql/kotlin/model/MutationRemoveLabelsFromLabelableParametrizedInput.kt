package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field removeLabelsFromLabelable in type Mutation
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
data class MutationRemoveLabelsFromLabelableParametrizedInput(
    val input: RemoveLabelsFromLabelableInputTO
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        joiner.add("input: " + GraphQLRequestSerializer.getEntry(input))
        return joiner.toString()
    }
}
