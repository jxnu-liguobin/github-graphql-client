package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for HeadRefDeletedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class HeadRefDeletedEventResponseProjection extends GraphQLResponseProjection {

    public HeadRefDeletedEventResponseProjection() {
    }

    @Override
    public HeadRefDeletedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public HeadRefDeletedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", 0) + 1);
            this.headRef(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.RefResponseProjection.headRef", 0)));
        }
        this.headRefName();
        this.id();
        if (projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("HeadRefDeletedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.typename();
        return this;
    }

    public HeadRefDeletedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public HeadRefDeletedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public HeadRefDeletedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public HeadRefDeletedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public HeadRefDeletedEventResponseProjection headRef(RefResponseProjection subProjection) {
        return headRef(null, subProjection);
    }

    public HeadRefDeletedEventResponseProjection headRef(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("headRef").alias(alias).projection(subProjection));
        return this;
    }

    public HeadRefDeletedEventResponseProjection headRefName() {
        return headRefName(null);
    }

    public HeadRefDeletedEventResponseProjection headRefName(String alias) {
        fields.add(new GraphQLResponseField("headRefName").alias(alias));
        return this;
    }

    public HeadRefDeletedEventResponseProjection id() {
        return id(null);
    }

    public HeadRefDeletedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public HeadRefDeletedEventResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public HeadRefDeletedEventResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public HeadRefDeletedEventResponseProjection typename() {
        return typename(null);
    }

    public HeadRefDeletedEventResponseProjection typename(String alias) {
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
        final HeadRefDeletedEventResponseProjection that = (HeadRefDeletedEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
