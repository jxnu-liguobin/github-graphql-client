package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class TransferredEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    val fromRepository: RepositoryTO?,
    override
    val id: String,
    val issue: IssueTO
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (fromRepository != null) {
            joiner.add("fromRepository: " + GraphQLRequestSerializer.getEntry(fromRepository))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("issue: " + GraphQLRequestSerializer.getEntry(issue))
        return joiner.toString()
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private var fromRepository: RepositoryTO? = null
        private lateinit var id: String
        private lateinit var issue: IssueTO

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setFromRepository(fromRepository: RepositoryTO?): Builder {
            this.fromRepository = fromRepository
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIssue(issue: IssueTO): Builder {
            this.issue = issue
            return this
        }

        fun build(): TransferredEventTO {
            return TransferredEventTO(actor, createdAt, fromRepository, id, issue)
        }
    }
}
