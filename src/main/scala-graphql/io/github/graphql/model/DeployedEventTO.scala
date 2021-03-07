package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeployedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    deployment: DeploymentTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO,
    ref: RefTO
) extends PullRequestTimelineItemsTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (deployment != null) "deployment: " + GraphQLRequestSerializer.getEntry(deployment) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else "",
            if (ref != null) "ref: " + GraphQLRequestSerializer.getEntry(ref) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeployedEventTO {

    def builder(): DeployedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var databaseId: Option[Int] = _
        private var deployment: DeploymentTO = _
        private var id: String = _
        private var pullRequest: PullRequestTO = _
        private var ref: RefTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
            this
        }

        def setDeployment(deployment: DeploymentTO): Builder = {
            this.deployment = deployment
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

        def setRef(ref: RefTO): Builder = {
            this.ref = ref
            this
        }

        def build(): DeployedEventTO = new DeployedEventTO(actor, createdAt, databaseId, deployment, id, pullRequest, ref)

    }
}
