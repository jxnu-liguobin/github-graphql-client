package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeploymentEnvironmentChangedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class DeploymentEnvironmentChangedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeploymentEnvironmentChangedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeploymentEnvironmentChangedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus"] = projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", 0) + 1
            this.deploymentStatus(DeploymentStatusResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.DeploymentStatusResponseProjection.deploymentStatus", 0)))
        }
        this.id()
        if (projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentEnvironmentChangedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): DeploymentEnvironmentChangedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): DeploymentEnvironmentChangedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): DeploymentEnvironmentChangedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): DeploymentEnvironmentChangedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun deploymentStatus(subProjection: DeploymentStatusResponseProjection): DeploymentEnvironmentChangedEventResponseProjection = deploymentStatus(null, subProjection)

    fun deploymentStatus(alias: String?, subProjection: DeploymentStatusResponseProjection): DeploymentEnvironmentChangedEventResponseProjection {
        fields.add(GraphQLResponseField("deploymentStatus").alias(alias).projection(subProjection))
        return this
    }

    fun id(): DeploymentEnvironmentChangedEventResponseProjection = id(null)

    fun id(alias: String?): DeploymentEnvironmentChangedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): DeploymentEnvironmentChangedEventResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): DeploymentEnvironmentChangedEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeploymentEnvironmentChangedEventResponseProjection = typename(null)

    fun typename(alias: String?): DeploymentEnvironmentChangedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DeploymentEnvironmentChangedEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
