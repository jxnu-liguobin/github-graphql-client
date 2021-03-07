package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for HeadRefRestoredEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class HeadRefRestoredEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): HeadRefRestoredEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): HeadRefRestoredEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["HeadRefRestoredEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["HeadRefRestoredEventResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefRestoredEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): HeadRefRestoredEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): HeadRefRestoredEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): HeadRefRestoredEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): HeadRefRestoredEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): HeadRefRestoredEventResponseProjection = id(null)

    fun id(alias: String?): HeadRefRestoredEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): HeadRefRestoredEventResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): HeadRefRestoredEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): HeadRefRestoredEventResponseProjection = typename(null)

    fun typename(alias: String?): HeadRefRestoredEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
