package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestRevisionMarker
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestRevisionMarkerResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestRevisionMarkerResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestRevisionMarkerResponseProjection {
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit"] = projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", 0) + 1
            this.lastSeenCommit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        return this
    }

    fun createdAt(): PullRequestRevisionMarkerResponseProjection = createdAt(null)

    fun createdAt(alias: String?): PullRequestRevisionMarkerResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun lastSeenCommit(subProjection: CommitResponseProjection): PullRequestRevisionMarkerResponseProjection = lastSeenCommit(null, subProjection)

    fun lastSeenCommit(alias: String?, subProjection: CommitResponseProjection): PullRequestRevisionMarkerResponseProjection {
        fields.add(GraphQLResponseField("lastSeenCommit").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): PullRequestRevisionMarkerResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): PullRequestRevisionMarkerResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestRevisionMarkerResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestRevisionMarkerResponseProjection {
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
        val that = other as PullRequestRevisionMarkerResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
