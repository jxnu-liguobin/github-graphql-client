package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for HeadRefForcePushedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class HeadRefForcePushedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): HeadRefForcePushedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): HeadRefForcePushedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) + 1)
            this.afterCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) + 1)
            this.beforeCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) + 1)
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): HeadRefForcePushedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): HeadRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def afterCommit(subProjection: CommitResponseProjection): HeadRefForcePushedEventResponseProjection = {
        afterCommit(null.asInstanceOf[String], subProjection)
    }

    def afterCommit(alias: String, subProjection: CommitResponseProjection): HeadRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("afterCommit").alias(alias).projection(subProjection))
        this
    }

    def beforeCommit(subProjection: CommitResponseProjection): HeadRefForcePushedEventResponseProjection = {
        beforeCommit(null.asInstanceOf[String], subProjection)
    }

    def beforeCommit(alias: String, subProjection: CommitResponseProjection): HeadRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("beforeCommit").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): HeadRefForcePushedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): HeadRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): HeadRefForcePushedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): HeadRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): HeadRefForcePushedEventResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): HeadRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def ref(subProjection: RefResponseProjection): HeadRefForcePushedEventResponseProjection = {
        ref(null.asInstanceOf[String], subProjection)
    }

    def ref(alias: String, subProjection: RefResponseProjection): HeadRefForcePushedEventResponseProjection = {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection))
        this
    }

    def typename(): HeadRefForcePushedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): HeadRefForcePushedEventResponseProjection = {
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
        val that = obj.asInstanceOf[HeadRefForcePushedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
