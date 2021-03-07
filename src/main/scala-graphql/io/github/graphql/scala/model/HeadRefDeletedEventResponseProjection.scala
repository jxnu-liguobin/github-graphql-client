package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for HeadRefDeletedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class HeadRefDeletedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): HeadRefDeletedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): HeadRefDeletedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", 0) + 1)
            this.headRef(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", 0)))
        }
        this.headRefName()
        this.id()
        if (projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): HeadRefDeletedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): HeadRefDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): HeadRefDeletedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): HeadRefDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def headRef(subProjection: RefResponseProjection): HeadRefDeletedEventResponseProjection = {
        headRef(null.asInstanceOf[String], subProjection)
    }

    def headRef(alias: String, subProjection: RefResponseProjection): HeadRefDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("headRef").alias(alias).projection(subProjection))
        this
    }

    def headRefName(): HeadRefDeletedEventResponseProjection = {
        headRefName(null.asInstanceOf[String])
    }

    def headRefName(alias: String): HeadRefDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("headRefName").alias(alias))
        this
    }

    def id(): HeadRefDeletedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): HeadRefDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): HeadRefDeletedEventResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): HeadRefDeletedEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): HeadRefDeletedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): HeadRefDeletedEventResponseProjection = {
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
        val that = obj.asInstanceOf[HeadRefDeletedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
