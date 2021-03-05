package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SearchResultItemEdgeTO(
    val cursor: String,
    val node: SearchResultItemTO?,
    val textMatches: List<TextMatchTO?>?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor))
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node))
        }
        if (textMatches != null) {
            joiner.add("textMatches: " + GraphQLRequestSerializer.getEntry(textMatches))
        }
        return joiner.toString()
    }
}
