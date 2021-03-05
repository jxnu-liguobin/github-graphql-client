package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DraftPullRequestReviewCommentTO(
    val body: String,
    val path: String,
    val position: Int
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("path: " + GraphQLRequestSerializer.getEntry(path))
        joiner.add("position: " + GraphQLRequestSerializer.getEntry(position))
        return joiner.toString()
    }
}
