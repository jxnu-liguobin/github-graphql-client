package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnpinnedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UnpinnedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UnpinnedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UnpinnedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["UnpinnedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields["UnpinnedEventResponseProjection.IssueResponseProjection.issue"] = projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.IssueResponseProjection.issue", 0) + 1
            this.issue(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): UnpinnedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): UnpinnedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): UnpinnedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): UnpinnedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): UnpinnedEventResponseProjection = id(null)

    fun id(alias: String?): UnpinnedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun issue(subProjection: IssueResponseProjection): UnpinnedEventResponseProjection = issue(null, subProjection)

    fun issue(alias: String?, subProjection: IssueResponseProjection): UnpinnedEventResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UnpinnedEventResponseProjection = typename(null)

    fun typename(alias: String?): UnpinnedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
