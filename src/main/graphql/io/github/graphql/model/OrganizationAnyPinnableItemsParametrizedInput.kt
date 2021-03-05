package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field anyPinnableItems in type Organization
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class OrganizationAnyPinnableItemsParametrizedInput(
    val type: PinnableItemTypeTO?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type))
        }
        return joiner.toString()
    }
}
