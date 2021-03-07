package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeployedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class DeployedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeployedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeployedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", 0) + 1)
            this.deployment(new DeploymentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.DeploymentResponseProjection.deployment", 0)))
        }
        this.id()
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployedEventResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.RefResponseProjection.ref", 0) + 1)
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployedEventResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): DeployedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): DeployedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): DeployedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): DeployedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): DeployedEventResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): DeployedEventResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def deployment(subProjection: DeploymentResponseProjection): DeployedEventResponseProjection = {
        deployment(null.asInstanceOf[String], subProjection)
    }

    def deployment(alias: String, subProjection: DeploymentResponseProjection): DeployedEventResponseProjection = {
        fields.add(new GraphQLResponseField("deployment").alias(alias).projection(subProjection))
        this
    }

    def id(): DeployedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): DeployedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): DeployedEventResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): DeployedEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def ref(subProjection: RefResponseProjection): DeployedEventResponseProjection = {
        ref(null.asInstanceOf[String], subProjection)
    }

    def ref(alias: String, subProjection: RefResponseProjection): DeployedEventResponseProjection = {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeployedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeployedEventResponseProjection = {
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
        val that = obj.asInstanceOf[DeployedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
