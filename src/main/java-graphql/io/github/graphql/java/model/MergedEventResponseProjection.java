package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for MergedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MergedEventResponseProjection extends GraphQLResponseProjection {

    public MergedEventResponseProjection() {
    }

    @Override
    public MergedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MergedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergedEventResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.CommitResponseProjection.commit", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.RefResponseProjection.mergeRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergedEventResponseProjection.RefResponseProjection.mergeRef", projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.RefResponseProjection.mergeRef", 0) + 1);
            this.mergeRef(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.RefResponseProjection.mergeRef", 0)));
        }
        this.mergeRefName();
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.resourcePath();
        this.url();
        this.typename();
        return this;
    }

    public MergedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public MergedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public MergedEventResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public MergedEventResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public MergedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public MergedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public MergedEventResponseProjection id() {
        return id(null);
    }

    public MergedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MergedEventResponseProjection mergeRef(RefResponseProjection subProjection) {
        return mergeRef(null, subProjection);
    }

    public MergedEventResponseProjection mergeRef(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mergeRef").alias(alias).projection(subProjection));
        return this;
    }

    public MergedEventResponseProjection mergeRefName() {
        return mergeRefName(null);
    }

    public MergedEventResponseProjection mergeRefName(String alias) {
        fields.add(new GraphQLResponseField("mergeRefName").alias(alias));
        return this;
    }

    public MergedEventResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public MergedEventResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public MergedEventResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public MergedEventResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public MergedEventResponseProjection url() {
        return url(null);
    }

    public MergedEventResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public MergedEventResponseProjection typename() {
        return typename(null);
    }

    public MergedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MergedEventResponseProjection that = (MergedEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
