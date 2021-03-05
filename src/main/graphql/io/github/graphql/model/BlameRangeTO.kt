package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class BlameRangeTO(
    val age: Int,
    val commit: CommitTO,
    val endingLine: Int,
    val startingLine: Int
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("age: " + GraphQLRequestSerializer.getEntry(age))
        joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        joiner.add("endingLine: " + GraphQLRequestSerializer.getEntry(endingLine))
        joiner.add("startingLine: " + GraphQLRequestSerializer.getEntry(startingLine))
        return joiner.toString()
    }
}
