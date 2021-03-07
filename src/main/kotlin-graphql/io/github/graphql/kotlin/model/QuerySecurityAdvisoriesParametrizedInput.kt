package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field securityAdvisories in type Query
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
data class QuerySecurityAdvisoriesParametrizedInput(
    val after: String?,
    val before: String?,
    val first: Int?,
    val identifier: SecurityAdvisoryIdentifierFilterTO?,
    val last: Int?,
    val orderBy: SecurityAdvisoryOrderTO?,
    val publishedSince: String?,
    val updatedSince: String?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before))
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first))
        }
        if (identifier != null) {
            joiner.add("identifier: " + GraphQLRequestSerializer.getEntry(identifier))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy))
        }
        if (publishedSince != null) {
            joiner.add("publishedSince: " + GraphQLRequestSerializer.getEntry(publishedSince))
        }
        if (updatedSince != null) {
            joiner.add("updatedSince: " + GraphQLRequestSerializer.getEntry(updatedSince))
        }
        return joiner.toString()
    }
}
