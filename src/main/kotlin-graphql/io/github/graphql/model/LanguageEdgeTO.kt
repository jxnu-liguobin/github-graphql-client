package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class LanguageEdgeTO(
    val cursor: String,
    val node: LanguageTO,
    val size: Int
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor))
        joiner.add("node: " + GraphQLRequestSerializer.getEntry(node))
        joiner.add("size: " + GraphQLRequestSerializer.getEntry(size))
        return joiner.toString()
    }

    class Builder {

        private lateinit var cursor: String
        private lateinit var node: LanguageTO
        private var size: Int = 0

        fun setCursor(cursor: String): Builder {
            this.cursor = cursor
            return this
        }

        fun setNode(node: LanguageTO): Builder {
            this.node = node
            return this
        }

        fun setSize(size: Int): Builder {
            this.size = size
            return this
        }

        fun build(): LanguageEdgeTO {
            return LanguageEdgeTO(cursor, node, size)
        }
    }
}
