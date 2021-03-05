package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SuggestedReviewerTO(
    val isAuthor: Boolean,
    val isCommenter: Boolean,
    val reviewer: UserTO
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("isAuthor: " + GraphQLRequestSerializer.getEntry(isAuthor))
        joiner.add("isCommenter: " + GraphQLRequestSerializer.getEntry(isCommenter))
        joiner.add("reviewer: " + GraphQLRequestSerializer.getEntry(reviewer))
        return joiner.toString()
    }
}
