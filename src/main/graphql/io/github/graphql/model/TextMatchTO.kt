package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TextMatchTO(
    val fragment: String,
    val highlights: List<TextMatchHighlightTO>,
    val property: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("fragment: " + GraphQLRequestSerializer.getEntry(fragment))
        joiner.add("highlights: " + GraphQLRequestSerializer.getEntry(highlights))
        joiner.add("property: " + GraphQLRequestSerializer.getEntry(property))
        return joiner.toString()
    }
}
