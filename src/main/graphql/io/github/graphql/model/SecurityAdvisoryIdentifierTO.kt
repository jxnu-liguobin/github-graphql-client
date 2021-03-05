package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SecurityAdvisoryIdentifierTO(
    val type: String,
    val value: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("type: " + GraphQLRequestSerializer.getEntry(type))
        joiner.add("value: " + GraphQLRequestSerializer.getEntry(value))
        return joiner.toString()
    }
}
