package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MergedEventTO(
    val actor: ActorTO?,
    val commit: CommitTO?,
    val createdAt: String,
    override
    val id: String,
    val mergeRef: RefTO?,
    val mergeRefName: String,
    val pullRequest: PullRequestTO,
    override
    val resourcePath: String,
    override
    val url: String
) : PullRequestTimelineItemsTO, PullRequestTimelineItemTO, UniformResourceLocatableTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (mergeRef != null) {
            joiner.add("mergeRef: " + GraphQLRequestSerializer.getEntry(mergeRef))
        }
        joiner.add("mergeRefName: " + GraphQLRequestSerializer.getEntry(mergeRefName))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as MergedEventTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(commit, that.commit)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(id, that.id)
                && Objects.equals(mergeRef, that.mergeRef)
                && Objects.equals(mergeRefName, that.mergeRefName)
                && Objects.equals(pullRequest, that.pullRequest)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, commit, createdAt, id, mergeRef, mergeRefName, pullRequest, resourcePath, url)
    }

    class Builder {

        private var actor: ActorTO? = null
        private var commit: CommitTO? = null
        private lateinit var createdAt: String
        private lateinit var id: String
        private var mergeRef: RefTO? = null
        private lateinit var mergeRefName: String
        private lateinit var pullRequest: PullRequestTO
        private lateinit var resourcePath: String
        private lateinit var url: String

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setCommit(commit: CommitTO?): Builder {
            this.commit = commit
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setMergeRef(mergeRef: RefTO?): Builder {
            this.mergeRef = mergeRef
            return this
        }

        fun setMergeRefName(mergeRefName: String): Builder {
            this.mergeRefName = mergeRefName
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

        fun build(): MergedEventTO {
            return MergedEventTO(actor, commit, createdAt, id, mergeRef, mergeRefName, pullRequest, resourcePath, url)
        }
    }
}
