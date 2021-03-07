package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import DeploymentStatusStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeploymentStatusTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    creator: ActorTO,
    @javax.validation.constraints.NotNull
    deployment: DeploymentTO,
    description: String,
    environmentUrl: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    logUrl: String,
    @javax.validation.constraints.NotNull
    state: DeploymentStatusStateTO,
    @javax.validation.constraints.NotNull
    updatedAt: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (creator != null) "creator: " + GraphQLRequestSerializer.getEntry(creator) else "",
            if (deployment != null) "deployment: " + GraphQLRequestSerializer.getEntry(deployment) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (environmentUrl != null) "environmentUrl: " + GraphQLRequestSerializer.getEntry(environmentUrl) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (logUrl != null) "logUrl: " + GraphQLRequestSerializer.getEntry(logUrl) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeploymentStatusTO {

    def builder(): DeploymentStatusTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var creator: ActorTO = _
        private var deployment: DeploymentTO = _
        private var description: String = _
        private var environmentUrl: String = _
        private var id: String = _
        private var logUrl: String = _
        private var state: DeploymentStatusStateTO = _
        private var updatedAt: String = _

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setCreator(creator: ActorTO): Builder = {
            this.creator = creator
            this
        }

        def setDeployment(deployment: DeploymentTO): Builder = {
            this.deployment = deployment
            this
        }

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setEnvironmentUrl(environmentUrl: String): Builder = {
            this.environmentUrl = environmentUrl
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setLogUrl(logUrl: String): Builder = {
            this.logUrl = logUrl
            this
        }

        def setState(state: DeploymentStatusStateTO): Builder = {
            this.state = state
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def build(): DeploymentStatusTO = new DeploymentStatusTO(createdAt, creator, deployment, description, environmentUrl, id, logUrl, state, updatedAt)

    }
}
