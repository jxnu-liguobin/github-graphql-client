package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestCommitTO(
    val commit: CommitTO,
    override
    val id: String,
    val pullRequest: PullRequestTO,
    override
    val resourcePath: String,
    override
    val url: String
) : PullRequestTimelineItemsTO, UniformResourceLocatableTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }

    class Builder {

        private lateinit var commit: CommitTO
        private lateinit var id: String
        private lateinit var pullRequest: PullRequestTO
        private lateinit var resourcePath: String
        private lateinit var url: String

        fun setCommit(commit: CommitTO): Builder {
            this.commit = commit
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO): Builder {
            this.pullRequest = pullRequest
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): PullRequestCommitTO {
            return PullRequestCommitTO(commit, id, pullRequest, resourcePath, url)
        }
    }
}
