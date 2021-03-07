package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class DeploymentStatusTO(
    val createdAt: String,
    val creator: ActorTO?,
    val deployment: DeploymentTO,
    val description: String?,
    val environmentUrl: String?,
    override
    val id: String,
    val logUrl: String?,
    val state: DeploymentStatusStateTO,
    val updatedAt: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        joiner.add("deployment: " + GraphQLRequestSerializer.getEntry(deployment))
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        if (environmentUrl != null) {
            joiner.add("environmentUrl: " + GraphQLRequestSerializer.getEntry(environmentUrl))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (logUrl != null) {
            joiner.add("logUrl: " + GraphQLRequestSerializer.getEntry(logUrl))
        }
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        return joiner.toString()
    }

    class Builder {

        private lateinit var createdAt: String
        private var creator: ActorTO? = null
        private lateinit var deployment: DeploymentTO
        private var description: String? = null
        private var environmentUrl: String? = null
        private lateinit var id: String
        private var logUrl: String? = null
        private lateinit var state: DeploymentStatusStateTO
        private lateinit var updatedAt: String

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setCreator(creator: ActorTO?): Builder {
            this.creator = creator
            return this
        }

        fun setDeployment(deployment: DeploymentTO): Builder {
            this.deployment = deployment
            return this
        }

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setEnvironmentUrl(environmentUrl: String?): Builder {
            this.environmentUrl = environmentUrl
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setLogUrl(logUrl: String?): Builder {
            this.logUrl = logUrl
            return this
        }

        fun setState(state: DeploymentStatusStateTO): Builder {
            this.state = state
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun build(): DeploymentStatusTO {
            return DeploymentStatusTO(createdAt, creator, deployment, description, environmentUrl, id, logUrl, state, updatedAt)
        }
    }
}
