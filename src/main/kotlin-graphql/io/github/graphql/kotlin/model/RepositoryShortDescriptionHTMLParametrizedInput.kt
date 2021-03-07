package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field shortDescriptionHTML in type Repository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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
