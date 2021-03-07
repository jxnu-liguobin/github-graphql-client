package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CommitCommentThreadTO(
    val commit: CommitTO,
    override
    val id: String,
    val path: String?,
    val position: Int?,
    override
    val repository: RepositoryTO
) : PullRequestTimelineItemTO, NodeTO, RepositoryNodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path))
        }
        if (position != null) {
            joiner.add("position: " + GraphQLRequestSerializer.getEntry(position))
        }
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as CommitCommentThreadTO
        return Objects.equals(commit, that.commit)
                && Objects.equals(id, that.id)
                && Objects.equals(path, that.path)
                && Objects.equals(position, that.position)
                && Objects.equals(repository, that.repository)

    }

    override fun hashCode(): Int = {
        return Objects.hash(commit, id, path, position, repository)
    }

    class Builder {

        private lateinit var commit: CommitTO
        private lateinit var id: String
        private var path: String? = null
        private var position: Int? = null
        private lateinit var repository: RepositoryTO

        fun setCommit(commit: CommitTO): Builder {
            this.commit = commit
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setPath(path: String?): Builder {
            this.path = path
            return this
        }

        fun setPosition(position: Int?): Builder {
            this.position = position
            return this
        }

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
            return this
        }

        fun build(): CommitCommentThreadTO {
            return CommitCommentThreadTO(commit, id, path, position, repository)
        }
    }
}
