package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TextMatchHighlightTO(
    val beginIndice: Int,
    val endIndice: Int,
    val text: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("beginIndice: " + GraphQLRequestSerializer.getEntry(beginIndice))
        joiner.add("endIndice: " + GraphQLRequestSerializer.getEntry(endIndice))
        joiner.add("text: " + GraphQLRequestSerializer.getEntry(text))
        return joiner.toString()
    }
}
