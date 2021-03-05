package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field object in type Repository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class RepositoryObjectParametrizedInput(
    val expression: String?,
    val oid: String?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (expression != null) {
            joiner.add("expression: " + GraphQLRequestSerializer.getEntry(expression))
        }
        if (oid != null) {
            joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        }
        return joiner.toString()
    }
}
