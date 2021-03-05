package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field files in type Gist
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class GistFilesParametrizedInput(
    val limit: Int? = 10,
    val oid: String?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit))
        }
        if (oid != null) {
            joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        }
        return joiner.toString()
    }
}
