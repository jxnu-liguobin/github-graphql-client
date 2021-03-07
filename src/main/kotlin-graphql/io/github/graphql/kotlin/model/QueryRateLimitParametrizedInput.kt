package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field rateLimit in type Query
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
data class QueryRateLimitParametrizedInput(
    val dryRun: Boolean? = false
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (dryRun != null) {
            joiner.add("dryRun: " + GraphQLRequestSerializer.getEntry(dryRun))
        }
        return joiner.toString()
    }
}
