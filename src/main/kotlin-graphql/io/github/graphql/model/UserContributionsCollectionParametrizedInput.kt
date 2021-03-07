package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field contributionsCollection in type User
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
data class UserContributionsCollectionParametrizedInput(
    val from: String?,
    val organizationID: String?,
    val to: String?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (from != null) {
            joiner.add("from: " + GraphQLRequestSerializer.getEntry(from))
        }
        if (organizationID != null) {
            joiner.add("organizationID: " + GraphQLRequestSerializer.getEntry(organizationID))
        }
        if (to != null) {
            joiner.add("to: " + GraphQLRequestSerializer.getEntry(to))
        }
        return joiner.toString()
    }
}
