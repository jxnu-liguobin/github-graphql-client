package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field history in type Commit
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class CommitHistoryParametrizedInput(
    val after: String?,
    val author: CommitAuthorTO?,
    val before: String?,
    val first: Int?,
    val last: Int?,
    val path: String?,
    val since: String?,
    val until: String?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author))
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before))
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path))
        }
        if (since != null) {
            joiner.add("since: " + GraphQLRequestSerializer.getEntry(since))
        }
        if (until != null) {
            joiner.add("until: " + GraphQLRequestSerializer.getEntry(until))
        }
        return joiner.toString()
    }
}
