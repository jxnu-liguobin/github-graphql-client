package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestChangedFileTO(
    val additions: Int,
    val deletions: Int,
    val path: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("additions: " + GraphQLRequestSerializer.getEntry(additions))
        joiner.add("deletions: " + GraphQLRequestSerializer.getEntry(deletions))
        joiner.add("path: " + GraphQLRequestSerializer.getEntry(path))
        return joiner.toString()
    }

    class Builder {

        private var additions: Int = 0
        private var deletions: Int = 0
        private lateinit var path: String

        fun setAdditions(additions: Int): Builder {
            this.additions = additions
            return this
        }

        fun setDeletions(deletions: Int): Builder {
            this.deletions = deletions
            return this
        }

        fun setPath(path: String): Builder {
            this.path = path
            return this
        }

        fun build(): PullRequestChangedFileTO {
            return PullRequestChangedFileTO(additions, deletions, path)
        }
    }
}
