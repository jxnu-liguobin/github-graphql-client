package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeployedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeployedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeployedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeployedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["DeployedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", 0) <= maxDepth) {
            projectionDepthOnFields["DeployedEventResponseProjection.DeploymentResponseProjection.deployment"] = projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", 0) + 1
            this.deployment(DeploymentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", 0)))
        }
        this.id()
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields["DeployedEventResponseProjection.RefResponseProjection.ref"] = projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.RefResponseProjection.ref", 0) + 1
            this.ref(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): DeployedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): DeployedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): DeployedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): DeployedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): DeployedEventResponseProjection = databaseId(null)

    fun databaseId(alias: String?): DeployedEventResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun deployment(subProjection: DeploymentResponseProjection): DeployedEventResponseProjection = deployment(null, subProjection)

    fun deployment(alias: String?, subProjection: DeploymentResponseProjection): DeployedEventResponseProjection {
        fields.add(GraphQLResponseField("deployment").alias(alias).projection(subProjection))
        return this
    }

    fun id(): DeployedEventResponseProjection = id(null)

    fun id(alias: String?): DeployedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): DeployedEventResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): DeployedEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun ref(subProjection: RefResponseProjection): DeployedEventResponseProjection = ref(null, subProjection)

    fun ref(alias: String?, subProjection: RefResponseProjection): DeployedEventResponseProjection {
        fields.add(GraphQLResponseField("ref").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeployedEventResponseProjection = typename(null)

    fun typename(alias: String?): DeployedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
