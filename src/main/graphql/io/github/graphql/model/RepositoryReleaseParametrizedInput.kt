package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field release in type Repository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class RepositoryReleaseParametrizedInput(
    val tagName: String
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        joiner.add("tagName: " + GraphQLRequestSerializer.getEntry(tagName))
        return joiner.toString()
    }
}
