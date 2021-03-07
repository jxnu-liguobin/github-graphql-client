package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class DeployedEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    val databaseId: Int?,
    val deployment: DeploymentTO,
    override
    val id: String,
    val pullRequest: PullRequestTO,
    val ref: RefTO?
) : PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

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
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("deployment: " + GraphQLRequestSerializer.getEntry(deployment))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref))
        }
        return joiner.toString()
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private var databaseId: Int? = null
        private lateinit var deployment: DeploymentTO
        private lateinit var id: String
        private lateinit var pullRequest: PullRequestTO
        private var ref: RefTO? = null

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setDatabaseId(databaseId: Int?): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setDeployment(deployment: DeploymentTO): Builder {
            this.deployment = deployment
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

        fun setRef(ref: RefTO?): Builder {
            this.ref = ref
            return this
        }

        fun build(): DeployedEventTO {
            return DeployedEventTO(actor, createdAt, databaseId, deployment, id, pullRequest, ref)
        }
    }
}
