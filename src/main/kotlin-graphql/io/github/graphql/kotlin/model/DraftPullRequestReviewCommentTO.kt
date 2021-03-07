package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class DraftPullRequestReviewCommentTO(
    val body: String,
    val path: String,
    val position: Int
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("path: " + GraphQLRequestSerializer.getEntry(path))
        joiner.add("position: " + GraphQLRequestSerializer.getEntry(position))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DraftPullRequestReviewCommentTO
        return Objects.equals(body, that.body)
                && Objects.equals(path, that.path)
                && Objects.equals(position, that.position)

    }

    override fun hashCode(): Int = {
        return Objects.hash(body, path, position)
    }

    class Builder {

        private lateinit var body: String
        private lateinit var path: String
        private var position: Int = 0

        fun setBody(body: String): Builder {
            this.body = body
            return this
        }

        fun setPath(path: String): Builder {
            this.path = path
            return this
        }

        fun setPosition(position: Int): Builder {
            this.position = position
            return this
        }

        fun build(): DraftPullRequestReviewCommentTO {
            return DraftPullRequestReviewCommentTO(body, path, position)
        }
    }
}
