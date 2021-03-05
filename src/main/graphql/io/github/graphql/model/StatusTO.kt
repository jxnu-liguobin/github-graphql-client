package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class StatusTO(
    val commit: CommitTO?,
    val contexts: List<StatusContextTO>,
    override
    val id: String,
    val state: StatusStateTO
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        }
        joiner.add("contexts: " + GraphQLRequestSerializer.getEntry(contexts))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        return joiner.toString()
    }
}
