package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for HeadRefRestoredEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class HeadRefRestoredEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): HeadRefRestoredEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): HeadRefRestoredEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefRestoredEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefRestoredEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): HeadRefRestoredEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): HeadRefRestoredEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): HeadRefRestoredEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): HeadRefRestoredEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): HeadRefRestoredEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): HeadRefRestoredEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): HeadRefRestoredEventResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): HeadRefRestoredEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): HeadRefRestoredEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): HeadRefRestoredEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
