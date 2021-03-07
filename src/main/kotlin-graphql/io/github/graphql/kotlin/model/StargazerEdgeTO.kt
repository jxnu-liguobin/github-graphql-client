package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class StargazerEdgeTO(
    val cursor: String,
    val node: UserTO,
    val starredAt: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor))
        joiner.add("node: " + GraphQLRequestSerializer.getEntry(node))
        joiner.add("starredAt: " + GraphQLRequestSerializer.getEntry(starredAt))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as StargazerEdgeTO
        return Objects.equals(cursor, that.cursor)
                && Objects.equals(node, that.node)
                && Objects.equals(starredAt, that.starredAt)

    }

    override fun hashCode(): Int = {
        return Objects.hash(cursor, node, starredAt)
    }

    class Builder {

        private lateinit var cursor: String
        private lateinit var node: UserTO
        private lateinit var starredAt: String

        fun setCursor(cursor: String): Builder {
            this.cursor = cursor
            return this
        }

        fun setNode(node: UserTO): Builder {
            this.node = node
            return this
        }

        fun setStarredAt(starredAt: String): Builder {
            this.starredAt = starredAt
            return this
        }

        fun build(): StargazerEdgeTO {
            return StargazerEdgeTO(cursor, node, starredAt)
        }
    }
}
