package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestRevisionMarker
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestRevisionMarkerResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestRevisionMarkerResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestRevisionMarkerResponseProjection = {
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", 0) + 1)
            this.lastSeenCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.typename()
        this
    }

    def createdAt(): PullRequestRevisionMarkerResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): PullRequestRevisionMarkerResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def lastSeenCommit(subProjection: CommitResponseProjection): PullRequestRevisionMarkerResponseProjection = {
        lastSeenCommit(null.asInstanceOf[String], subProjection)
    }

    def lastSeenCommit(alias: String, subProjection: CommitResponseProjection): PullRequestRevisionMarkerResponseProjection = {
        fields.add(new GraphQLResponseField("lastSeenCommit").alias(alias).projection(subProjection))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): PullRequestRevisionMarkerResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): PullRequestRevisionMarkerResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestRevisionMarkerResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestRevisionMarkerResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
