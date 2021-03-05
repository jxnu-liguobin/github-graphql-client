package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class LicenseRuleTO(
    val description: String,
    val key: String,
    val label: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        joiner.add("key: " + GraphQLRequestSerializer.getEntry(key))
        joiner.add("label: " + GraphQLRequestSerializer.getEntry(label))
        return joiner.toString()
    }
}
