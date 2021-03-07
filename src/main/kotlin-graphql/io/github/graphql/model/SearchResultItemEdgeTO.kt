package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SearchResultItemEdgeTO(
    val cursor: String,
    val node: SearchResultItemTO?,
    val textMatches: List<TextMatchTO?>?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor))
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node))
        }
        if (textMatches != null) {
            joiner.add("textMatches: " + GraphQLRequestSerializer.getEntry(textMatches))
        }
        return joiner.toString()
    }

    class Builder {

        private lateinit var cursor: String
        private var node: SearchResultItemTO? = null
        private var textMatches: List<TextMatchTO?>? = null

        fun setCursor(cursor: String): Builder {
            this.cursor = cursor
            return this
        }

        fun setNode(node: SearchResultItemTO?): Builder {
            this.node = node
            return this
        }

        fun setTextMatches(textMatches: List<TextMatchTO?>?): Builder {
            this.textMatches = textMatches
            return this
        }

        fun build(): SearchResultItemEdgeTO {
            return SearchResultItemEdgeTO(cursor, node, textMatches)
        }
    }
}
