package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestReviewThreadTO(
    override
    val id: String,
    val isResolved: Boolean,
    val pullRequest: PullRequestTO,
    val repository: RepositoryTO,
    val resolvedBy: UserTO?,
    val viewerCanResolve: Boolean,
    val viewerCanUnresolve: Boolean
) : PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isResolved: " + GraphQLRequestSerializer.getEntry(isResolved))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        if (resolvedBy != null) {
            joiner.add("resolvedBy: " + GraphQLRequestSerializer.getEntry(resolvedBy))
        }
        joiner.add("viewerCanResolve: " + GraphQLRequestSerializer.getEntry(viewerCanResolve))
        joiner.add("viewerCanUnresolve: " + GraphQLRequestSerializer.getEntry(viewerCanUnresolve))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as PullRequestReviewThreadTO
        return Objects.equals(id, that.id)
                && Objects.equals(isResolved, that.isResolved)
                && Objects.equals(pullRequest, that.pullRequest)
                && Objects.equals(repository, that.repository)
                && Objects.equals(resolvedBy, that.resolvedBy)
                && Objects.equals(viewerCanResolve, that.viewerCanResolve)
                && Objects.equals(viewerCanUnresolve, that.viewerCanUnresolve)

    }

    override fun hashCode(): Int = {
        return Objects.hash(id, isResolved, pullRequest, repository, resolvedBy, viewerCanResolve, viewerCanUnresolve)
    }

    class Builder {

        private lateinit var id: String
        private var isResolved: Boolean = false
        private lateinit var pullRequest: PullRequestTO
        private lateinit var repository: RepositoryTO
        private var resolvedBy: UserTO? = null
        private var viewerCanResolve: Boolean = false
        private var viewerCanUnresolve: Boolean = false

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsResolved(isResolved: Boolean): Builder {
            this.isResolved = isResolved
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO): Builder {
            this.pullRequest = pullRequest
            return this
        }

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
            return this
        }

        fun setResolvedBy(resolvedBy: UserTO?): Builder {
            this.resolvedBy = resolvedBy
            return this
        }

        fun setViewerCanResolve(viewerCanResolve: Boolean): Builder {
            this.viewerCanResolve = viewerCanResolve
            return this
        }

        fun setViewerCanUnresolve(viewerCanUnresolve: Boolean): Builder {
            this.viewerCanUnresolve = viewerCanUnresolve
            return this
        }

        fun build(): PullRequestReviewThreadTO {
            return PullRequestReviewThreadTO(id, isResolved, pullRequest, repository, resolvedBy, viewerCanResolve, viewerCanUnresolve)
        }
    }
}
