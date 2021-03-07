package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as LanguageEdgeTO
        return Objects.equals(cursor, that.cursor)
                && Objects.equals(node, that.node)
                && Objects.equals(size, that.size)

    }

    override fun hashCode(): Int = {
        return Objects.hash(cursor, node, size)
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
