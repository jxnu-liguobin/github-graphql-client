package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestChangedFileTO(
    val additions: Int,
    val deletions: Int,
    val path: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("additions: " + GraphQLRequestSerializer.getEntry(additions))
        joiner.add("deletions: " + GraphQLRequestSerializer.getEntry(deletions))
        joiner.add("path: " + GraphQLRequestSerializer.getEntry(path))
        return joiner.toString()
    }
}
