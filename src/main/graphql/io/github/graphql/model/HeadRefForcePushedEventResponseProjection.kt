package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for HeadRefForcePushedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class HeadRefForcePushedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): HeadRefForcePushedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): HeadRefForcePushedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) <= maxDepth) {
            projectionDepthOnFields["HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit"] = projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) + 1
            this.afterCommit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) <= maxDepth) {
            projectionDepthOnFields["HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit"] = projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) + 1
            this.beforeCommit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields["HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref"] = projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) + 1
            this.ref(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): HeadRefForcePushedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): HeadRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun afterCommit(subProjection: CommitResponseProjection): HeadRefForcePushedEventResponseProjection = afterCommit(null, subProjection)

    fun afterCommit(alias: String?, subProjection: CommitResponseProjection): HeadRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("afterCommit").alias(alias).projection(subProjection))
        return this
    }

    fun beforeCommit(subProjection: CommitResponseProjection): HeadRefForcePushedEventResponseProjection = beforeCommit(null, subProjection)

    fun beforeCommit(alias: String?, subProjection: CommitResponseProjection): HeadRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("beforeCommit").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): HeadRefForcePushedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): HeadRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): HeadRefForcePushedEventResponseProjection = id(null)

    fun id(alias: String?): HeadRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): HeadRefForcePushedEventResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): HeadRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun ref(subProjection: RefResponseProjection): HeadRefForcePushedEventResponseProjection = ref(null, subProjection)

    fun ref(alias: String?, subProjection: RefResponseProjection): HeadRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("ref").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): HeadRefForcePushedEventResponseProjection = typename(null)

    fun typename(alias: String?): HeadRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
