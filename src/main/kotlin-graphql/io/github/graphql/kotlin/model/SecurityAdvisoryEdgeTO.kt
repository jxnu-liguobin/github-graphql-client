package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SecurityAdvisoryEdgeTO(
    val cursor: String,
    val node: SecurityAdvisoryTO?
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SecurityAdvisoryEdgeTO
        return Objects.equals(cursor, that.cursor)
                && Objects.equals(node, that.node)

    }

    override fun hashCode(): Int = {
        return Objects.hash(cursor, node)
    }

    class Builder {

        private lateinit var cursor: String
        private var node: SecurityAdvisoryTO? = null

        fun setCursor(cursor: String): Builder {
            this.cursor = cursor
            return this
        }

        fun setNode(node: SecurityAdvisoryTO?): Builder {
            this.node = node
            return this
        }

        fun build(): SecurityAdvisoryEdgeTO {
            return SecurityAdvisoryEdgeTO(cursor, node)
        }
    }
}
