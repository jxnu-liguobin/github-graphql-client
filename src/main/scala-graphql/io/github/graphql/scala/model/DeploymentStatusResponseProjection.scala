package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeploymentStatus
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class DeploymentStatusResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeploymentStatusResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeploymentStatusResponseProjection = {
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.ActorResponseProjection.creator", 0) + 1)
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.ActorResponseProjection.creator", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", 0) + 1)
            this.deployment(new DeploymentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusResponseProjection.DeploymentResponseProjection.deployment", 0)))
        }
        this.description()
        this.environmentUrl()
        this.id()
        this.logUrl()
        this.state()
        this.updatedAt()
        this.typename()
        this
    }

    def createdAt(): DeploymentStatusResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): DeploymentStatusResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def creator(subProjection: ActorResponseProjection): DeploymentStatusResponseProjection = {
        creator(null.asInstanceOf[String], subProjection)
    }

    def creator(alias: String, subProjection: ActorResponseProjection): DeploymentStatusResponseProjection = {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection))
        this
    }

    def deployment(subProjection: DeploymentResponseProjection): DeploymentStatusResponseProjection = {
        deployment(null.asInstanceOf[String], subProjection)
    }

    def deployment(alias: String, subProjection: DeploymentResponseProjection): DeploymentStatusResponseProjection = {
        fields.add(new GraphQLResponseField("deployment").alias(alias).projection(subProjection))
        this
    }

    def description(): DeploymentStatusResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): DeploymentStatusResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def environmentUrl(): DeploymentStatusResponseProjection = {
        environmentUrl(null.asInstanceOf[String])
    }

    def environmentUrl(alias: String): DeploymentStatusResponseProjection = {
        fields.add(new GraphQLResponseField("environmentUrl").alias(alias))
        this
    }

    def id(): DeploymentStatusResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): DeploymentStatusResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def logUrl(): DeploymentStatusResponseProjection = {
        logUrl(null.asInstanceOf[String])
    }

    def logUrl(alias: String): DeploymentStatusResponseProjection = {
        fields.add(new GraphQLResponseField("logUrl").alias(alias))
        this
    }

    def state(): DeploymentStatusResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): DeploymentStatusResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def updatedAt(): DeploymentStatusResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): DeploymentStatusResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def typename(): DeploymentStatusResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeploymentStatusResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeploymentStatusResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
