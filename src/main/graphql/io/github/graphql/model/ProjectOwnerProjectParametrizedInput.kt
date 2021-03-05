package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field project in type ProjectOwner
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:08:59+0800"
)
data class ProjectOwnerProjectParametrizedInput(
    val number: Int
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number))
        return joiner.toString()
    }
}
