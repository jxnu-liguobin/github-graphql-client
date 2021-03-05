package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ContributionOrderTO(
    val direction: OrderDirectionTO,
    val field: ContributionOrderFieldTO?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("direction: " + GraphQLRequestSerializer.getEntry(direction))
        if (field != null) {
            joiner.add("field: " + GraphQLRequestSerializer.getEntry(field))
        }
        return joiner.toString()
    }
}
