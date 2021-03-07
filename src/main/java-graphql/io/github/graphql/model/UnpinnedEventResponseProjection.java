package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UnpinnedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UnpinnedEventResponseProjection extends GraphQLResponseProjection {

    public UnpinnedEventResponseProjection() {
    }

    @Override
    public UnpinnedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UnpinnedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnpinnedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnpinnedEventResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.IssueResponseProjection.issue", 0) + 1);
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnpinnedEventResponseProjection.IssueResponseProjection.issue", 0)));
        }
        this.typename();
        return this;
    }

    public UnpinnedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public UnpinnedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public UnpinnedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public UnpinnedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UnpinnedEventResponseProjection id() {
        return id(null);
    }

    public UnpinnedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UnpinnedEventResponseProjection issue(IssueResponseProjection subProjection) {
        return issue(null, subProjection);
    }

    public UnpinnedEventResponseProjection issue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection));
        return this;
    }

    public UnpinnedEventResponseProjection typename() {
        return typename(null);
    }

    public UnpinnedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
