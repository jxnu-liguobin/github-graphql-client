package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field shortDescriptionHTML in type Repository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
data class RepositoryShortDescriptionHTMLParametrizedInput(
    val limit: Int? = 200
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit))
        }
        return joiner.toString()
    }
}
