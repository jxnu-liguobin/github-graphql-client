package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeploymentEnvironmentChangedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    deploymentStatus: DeploymentStatusTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO
) extends PullRequestTimelineItemsTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (deploymentStatus != null) "deploymentStatus: " + GraphQLRequestSerializer.getEntry(deploymentStatus) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeploymentEnvironmentChangedEventTO {

    def builder(): DeploymentEnvironmentChangedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var deploymentStatus: DeploymentStatusTO = _
        private var id: String = _
        private var pullRequest: PullRequestTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setDeploymentStatus(deploymentStatus: DeploymentStatusTO): Builder = {
            this.deploymentStatus = deploymentStatus
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
            this
        }

        def build(): DeploymentEnvironmentChangedEventTO = new DeploymentEnvironmentChangedEventTO(actor, createdAt, deploymentStatus, id, pullRequest)

    }
}
