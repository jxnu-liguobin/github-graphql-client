package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CommitCommentEdgeTO(
    val cursor: String,
    val node: CommitCommentTO?
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
        private var node: CommitCommentTO? = null

        fun setCursor(cursor: String): Builder {
            this.cursor = cursor
            return this
        }

        fun setNode(node: CommitCommentTO?): Builder {
            this.node = node
            return this
        }

        fun build(): CommitCommentEdgeTO {
            return CommitCommentEdgeTO(cursor, node)
        }
    }
}
