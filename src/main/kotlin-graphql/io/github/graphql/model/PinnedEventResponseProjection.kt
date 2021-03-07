package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PinnedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PinnedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PinnedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PinnedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["PinnedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields["PinnedEventResponseProjection.IssueResponseProjection.issue"] = projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.IssueResponseProjection.issue", 0) + 1
            this.issue(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PinnedEventResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): PinnedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): PinnedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): PinnedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): PinnedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): PinnedEventResponseProjection = id(null)

    fun id(alias: String?): PinnedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun issue(subProjection: IssueResponseProjection): PinnedEventResponseProjection = issue(null, subProjection)

    fun issue(alias: String?, subProjection: IssueResponseProjection): PinnedEventResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PinnedEventResponseProjection = typename(null)

    fun typename(alias: String?): PinnedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
