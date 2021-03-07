package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MergedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class MergedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MergedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MergedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["MergedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["MergedEventResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.RefResponseProjection.mergeRef", 0) <= maxDepth) {
            projectionDepthOnFields["MergedEventResponseProjection.RefResponseProjection.mergeRef"] = projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.RefResponseProjection.mergeRef", 0) + 1
            this.mergeRef(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.RefResponseProjection.mergeRef", 0)))
        }
        this.mergeRefName()
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["MergedEventResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.resourcePath()
        this.url()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): MergedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): MergedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun commit(subProjection: CommitResponseProjection): MergedEventResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): MergedEventResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): MergedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): MergedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): MergedEventResponseProjection = id(null)

    fun id(alias: String?): MergedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun mergeRef(subProjection: RefResponseProjection): MergedEventResponseProjection = mergeRef(null, subProjection)

    fun mergeRef(alias: String?, subProjection: RefResponseProjection): MergedEventResponseProjection {
        fields.add(GraphQLResponseField("mergeRef").alias(alias).projection(subProjection))
        return this
    }

    fun mergeRefName(): MergedEventResponseProjection = mergeRefName(null)

    fun mergeRefName(alias: String?): MergedEventResponseProjection {
        fields.add(GraphQLResponseField("mergeRefName").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): MergedEventResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): MergedEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): MergedEventResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): MergedEventResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): MergedEventResponseProjection = url(null)

    fun url(alias: String?): MergedEventResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): MergedEventResponseProjection = typename(null)

    fun typename(alias: String?): MergedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
