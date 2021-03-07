package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestChangedFileEdgeTO(
    val cursor: String,
    val node: PullRequestChangedFileTO?
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
        return joiner.toString()
    }

    class Builder {

        private lateinit var cursor: String
        private var node: PullRequestChangedFileTO? = null

        fun setCursor(cursor: String): Builder {
            this.cursor = cursor
            return this
        }

        fun setNode(node: PullRequestChangedFileTO?): Builder {
            this.node = node
            return this
        }

        fun build(): PullRequestChangedFileEdgeTO {
            return PullRequestChangedFileEdgeTO(cursor, node)
        }
    }
}