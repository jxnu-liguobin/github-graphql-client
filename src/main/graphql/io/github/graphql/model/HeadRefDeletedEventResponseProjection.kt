package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for HeadRefDeletedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class HeadRefDeletedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): HeadRefDeletedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): HeadRefDeletedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", 0) <= maxDepth) {
            projectionDepthOnFields["HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef"] = projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", 0) + 1
            this.headRef(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", 0)))
        }
        this.headRefName()
        this.id()
        if (projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): HeadRefDeletedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): HeadRefDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): HeadRefDeletedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): HeadRefDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun headRef(subProjection: RefResponseProjection): HeadRefDeletedEventResponseProjection = headRef(null, subProjection)

    fun headRef(alias: String?, subProjection: RefResponseProjection): HeadRefDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("headRef").alias(alias).projection(subProjection))
        return this
    }

    fun headRefName(): HeadRefDeletedEventResponseProjection = headRefName(null)

    fun headRefName(alias: String?): HeadRefDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("headRefName").alias(alias))
        return this
    }

    fun id(): HeadRefDeletedEventResponseProjection = id(null)

    fun id(alias: String?): HeadRefDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): HeadRefDeletedEventResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): HeadRefDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): HeadRefDeletedEventResponseProjection = typename(null)

    fun typename(alias: String?): HeadRefDeletedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
