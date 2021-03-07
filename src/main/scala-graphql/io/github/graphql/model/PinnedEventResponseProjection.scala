package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PinnedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PinnedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): PinnedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): PinnedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("PinnedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("PinnedEventResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.IssueResponseProjection.issue", 0) + 1)
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): PinnedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): PinnedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): PinnedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): PinnedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): PinnedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): PinnedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def issue(subProjection: IssueResponseProjection): PinnedEventResponseProjection = {
        issue(null.asInstanceOf[String], subProjection)
    }

    def issue(alias: String, subProjection: IssueResponseProjection): PinnedEventResponseProjection = {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection))
        this
    }

    def typename(): PinnedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PinnedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
