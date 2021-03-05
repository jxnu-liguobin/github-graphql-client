package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PageInfoTO(
    val endCursor: String?,
    val hasNextPage: Boolean,
    val hasPreviousPage: Boolean,
    val startCursor: String?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (endCursor != null) {
            joiner.add("endCursor: " + GraphQLRequestSerializer.getEntry(endCursor))
        }
        joiner.add("hasNextPage: " + GraphQLRequestSerializer.getEntry(hasNextPage))
        joiner.add("hasPreviousPage: " + GraphQLRequestSerializer.getEntry(hasPreviousPage))
        if (startCursor != null) {
            joiner.add("startCursor: " + GraphQLRequestSerializer.getEntry(startCursor))
        }
        return joiner.toString()
    }
}
