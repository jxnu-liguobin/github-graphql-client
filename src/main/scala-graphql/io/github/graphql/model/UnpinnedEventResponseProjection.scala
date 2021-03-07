package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnpinnedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UnpinnedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): UnpinnedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): UnpinnedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnpinnedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnpinnedEventResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.IssueResponseProjection.issue", 0) + 1)
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): UnpinnedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): UnpinnedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): UnpinnedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): UnpinnedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): UnpinnedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): UnpinnedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def issue(subProjection: IssueResponseProjection): UnpinnedEventResponseProjection = {
        issue(null.asInstanceOf[String], subProjection)
    }

    def issue(alias: String, subProjection: IssueResponseProjection): UnpinnedEventResponseProjection = {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection))
        this
    }

    def typename(): UnpinnedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UnpinnedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
