package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MoveProjectColumnInputTO(
    val afterColumnId: String?,
    val clientMutationId: String?,
    val columnId: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (afterColumnId != null) {
            joiner.add("afterColumnId: " + GraphQLRequestSerializer.getEntry(afterColumnId))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("columnId: " + GraphQLRequestSerializer.getEntry(columnId))
        return joiner.toString()
    }
}
