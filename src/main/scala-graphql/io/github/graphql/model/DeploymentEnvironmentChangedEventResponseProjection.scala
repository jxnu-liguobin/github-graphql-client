package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeploymentEnvironmentChangedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeploymentEnvironmentChangedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeploymentEnvironmentChangedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeploymentEnvironmentChangedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", 0) + 1)
            this.deploymentStatus(new DeploymentStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", 0)))
        }
        this.id()
        if (projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): DeploymentEnvironmentChangedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): DeploymentEnvironmentChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): DeploymentEnvironmentChangedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): DeploymentEnvironmentChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def deploymentStatus(subProjection: DeploymentStatusResponseProjection): DeploymentEnvironmentChangedEventResponseProjection = {
        deploymentStatus(null.asInstanceOf[String], subProjection)
    }

    def deploymentStatus(alias: String, subProjection: DeploymentStatusResponseProjection): DeploymentEnvironmentChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("deploymentStatus").alias(alias).projection(subProjection))
        this
    }

    def id(): DeploymentEnvironmentChangedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): DeploymentEnvironmentChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): DeploymentEnvironmentChangedEventResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): DeploymentEnvironmentChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeploymentEnvironmentChangedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeploymentEnvironmentChangedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
