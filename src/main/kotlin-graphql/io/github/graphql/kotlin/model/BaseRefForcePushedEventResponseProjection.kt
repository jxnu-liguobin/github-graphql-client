package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for BaseRefForcePushedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class BaseRefForcePushedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BaseRefForcePushedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BaseRefForcePushedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) <= maxDepth) {
            projectionDepthOnFields["BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit"] = projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0) + 1
            this.afterCommit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.afterCommit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) <= maxDepth) {
            projectionDepthOnFields["BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit"] = projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0) + 1
            this.beforeCommit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.CommitResponseProjection.beforeCommit", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields["BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref"] = projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0) + 1
            this.ref(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefForcePushedEventResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): BaseRefForcePushedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): BaseRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun afterCommit(subProjection: CommitResponseProjection): BaseRefForcePushedEventResponseProjection = afterCommit(null, subProjection)

    fun afterCommit(alias: String?, subProjection: CommitResponseProjection): BaseRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("afterCommit").alias(alias).projection(subProjection))
        return this
    }

    fun beforeCommit(subProjection: CommitResponseProjection): BaseRefForcePushedEventResponseProjection = beforeCommit(null, subProjection)

    fun beforeCommit(alias: String?, subProjection: CommitResponseProjection): BaseRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("beforeCommit").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): BaseRefForcePushedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): BaseRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): BaseRefForcePushedEventResponseProjection = id(null)

    fun id(alias: String?): BaseRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): BaseRefForcePushedEventResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): BaseRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun ref(subProjection: RefResponseProjection): BaseRefForcePushedEventResponseProjection = ref(null, subProjection)

    fun ref(alias: String?, subProjection: RefResponseProjection): BaseRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("ref").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): BaseRefForcePushedEventResponseProjection = typename(null)

    fun typename(alias: String?): BaseRefForcePushedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as BaseRefForcePushedEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
