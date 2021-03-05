package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeploymentStatus
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeploymentStatusResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeploymentStatusResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeploymentStatusResponseProjection {
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentStatusResponseProjection.ActorResponseProjection.creator"] = projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.ActorResponseProjection.creator", 0) + 1
            this.creator(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.ActorResponseProjection.creator", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment"] = projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", 0) + 1
            this.deployment(DeploymentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", 0)))
        }
        this.description()
        this.environmentUrl()
        this.id()
        this.logUrl()
        this.state()
        this.updatedAt()
        this.typename()
        return this
    }

    fun createdAt(): DeploymentStatusResponseProjection = createdAt(null)

    fun createdAt(alias: String?): DeploymentStatusResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun creator(subProjection: ActorResponseProjection): DeploymentStatusResponseProjection = creator(null, subProjection)

    fun creator(alias: String?, subProjection: ActorResponseProjection): DeploymentStatusResponseProjection {
        fields.add(GraphQLResponseField("creator").alias(alias).projection(subProjection))
        return this
    }

    fun deployment(subProjection: DeploymentResponseProjection): DeploymentStatusResponseProjection = deployment(null, subProjection)

    fun deployment(alias: String?, subProjection: DeploymentResponseProjection): DeploymentStatusResponseProjection {
        fields.add(GraphQLResponseField("deployment").alias(alias).projection(subProjection))
        return this
    }

    fun description(): DeploymentStatusResponseProjection = description(null)

    fun description(alias: String?): DeploymentStatusResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun environmentUrl(): DeploymentStatusResponseProjection = environmentUrl(null)

    fun environmentUrl(alias: String?): DeploymentStatusResponseProjection {
        fields.add(GraphQLResponseField("environmentUrl").alias(alias))
        return this
    }

    fun id(): DeploymentStatusResponseProjection = id(null)

    fun id(alias: String?): DeploymentStatusResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun logUrl(): DeploymentStatusResponseProjection = logUrl(null)

    fun logUrl(alias: String?): DeploymentStatusResponseProjection {
        fields.add(GraphQLResponseField("logUrl").alias(alias))
        return this
    }

    fun state(): DeploymentStatusResponseProjection = state(null)

    fun state(alias: String?): DeploymentStatusResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun updatedAt(): DeploymentStatusResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): DeploymentStatusResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun typename(): DeploymentStatusResponseProjection = typename(null)

    fun typename(alias: String?): DeploymentStatusResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
