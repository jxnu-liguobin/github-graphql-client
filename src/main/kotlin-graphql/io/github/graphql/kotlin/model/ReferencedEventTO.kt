package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReferencedEventTO(
    val actor: ActorTO?,
    val commit: CommitTO?,
    val commitRepository: RepositoryTO,
    val createdAt: String,
    override
    val id: String,
    val isCrossRepository: Boolean,
    val isDirectReference: Boolean,
    val subject: ReferencedSubjectTO
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

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
        joiner.add("commitRepository: " + GraphQLRequestSerializer.getEntry(commitRepository))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isCrossRepository: " + GraphQLRequestSerializer.getEntry(isCrossRepository))
        joiner.add("isDirectReference: " + GraphQLRequestSerializer.getEntry(isDirectReference))
        joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ReferencedEventTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(commit, that.commit)
                && Objects.equals(commitRepository, that.commitRepository)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(id, that.id)
                && Objects.equals(isCrossRepository, that.isCrossRepository)
                && Objects.equals(isDirectReference, that.isDirectReference)
                && Objects.equals(subject, that.subject)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, commit, commitRepository, createdAt, id, isCrossRepository, isDirectReference, subject)
    }

    class Builder {

        private var actor: ActorTO? = null
        private var commit: CommitTO? = null
        private lateinit var commitRepository: RepositoryTO
        private lateinit var createdAt: String
        private lateinit var id: String
        private var isCrossRepository: Boolean = false
        private var isDirectReference: Boolean = false
        private lateinit var subject: ReferencedSubjectTO

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setCommit(commit: CommitTO?): Builder {
            this.commit = commit
            return this
        }

        fun setCommitRepository(commitRepository: RepositoryTO): Builder {
            this.commitRepository = commitRepository
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

        fun setIsCrossRepository(isCrossRepository: Boolean): Builder {
            this.isCrossRepository = isCrossRepository
            return this
        }

        fun setIsDirectReference(isDirectReference: Boolean): Builder {
            this.isDirectReference = isDirectReference
            return this
        }

        fun setSubject(subject: ReferencedSubjectTO): Builder {
            this.subject = subject
            return this
        }

        fun build(): ReferencedEventTO {
            return ReferencedEventTO(actor, commit, commitRepository, createdAt, id, isCrossRepository, isDirectReference, subject)
        }
    }
}
