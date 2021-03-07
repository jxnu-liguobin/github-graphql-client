package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DeploymentStatusTO
        return Objects.equals(createdAt, that.createdAt)
                && Objects.equals(creator, that.creator)
                && Objects.equals(deployment, that.deployment)
                && Objects.equals(description, that.description)
                && Objects.equals(environmentUrl, that.environmentUrl)
                && Objects.equals(id, that.id)
                && Objects.equals(logUrl, that.logUrl)
                && Objects.equals(state, that.state)
                && Objects.equals(updatedAt, that.updatedAt)

    }

    override fun hashCode(): Int = {
        return Objects.hash(createdAt, creator, deployment, description, environmentUrl, id, logUrl, state, updatedAt)
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
