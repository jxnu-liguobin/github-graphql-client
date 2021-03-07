package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for BaseRefForcePushedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BaseRefForcePushedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): BaseRefForcePushedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): BaseRefForcePushedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) + 1)
            this.afterCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) + 1)
            this.beforeCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) + 1)
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): BaseRefForcePushedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): BaseRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def afterCommit(subProjection: CommitResponseProjection): BaseRefForcePushedEventResponseProjection = {
        afterCommit(null.asInstanceOf[String], subProjection)
    }

    def afterCommit(alias: String, subProjection: CommitResponseProjection): BaseRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("afterCommit").alias(alias).projection(subProjection))
        this
    }

    def beforeCommit(subProjection: CommitResponseProjection): BaseRefForcePushedEventResponseProjection = {
        beforeCommit(null.asInstanceOf[String], subProjection)
    }

    def beforeCommit(alias: String, subProjection: CommitResponseProjection): BaseRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("beforeCommit").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): BaseRefForcePushedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): BaseRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): BaseRefForcePushedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): BaseRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): BaseRefForcePushedEventResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): BaseRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def ref(subProjection: RefResponseProjection): BaseRefForcePushedEventResponseProjection = {
        ref(null.asInstanceOf[String], subProjection)
    }

    def ref(alias: String, subProjection: RefResponseProjection): BaseRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection))
        this
    }

    def typename(): BaseRefForcePushedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BaseRefForcePushedEventResponseProjection = {
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
        val that = obj.asInstanceOf[BaseRefForcePushedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
