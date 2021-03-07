package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestRevisionMarker
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestRevisionMarkerResponseProjection extends GraphQLResponseProjection {

    public PullRequestRevisionMarkerResponseProjection() {
    }

    @Override
    public PullRequestRevisionMarkerResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestRevisionMarkerResponseProjection all$(int maxDepth) {
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", 0) + 1);
            this.lastSeenCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.CommitResponseProjection.lastSeenCommit", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestRevisionMarkerResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestRevisionMarkerResponseProjection createdAt() {
        return createdAt(null);
    }

    public PullRequestRevisionMarkerResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public PullRequestRevisionMarkerResponseProjection lastSeenCommit(CommitResponseProjection subProjection) {
        return lastSeenCommit(null, subProjection);
    }

    public PullRequestRevisionMarkerResponseProjection lastSeenCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lastSeenCommit").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestRevisionMarkerResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public PullRequestRevisionMarkerResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestRevisionMarkerResponseProjection typename() {
        return typename(null);
    }

    public PullRequestRevisionMarkerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
