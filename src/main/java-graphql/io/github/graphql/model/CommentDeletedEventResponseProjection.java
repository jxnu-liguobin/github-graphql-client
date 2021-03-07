package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CommentDeletedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CommentDeletedEventResponseProjection extends GraphQLResponseProjection {

    public CommentDeletedEventResponseProjection() {
    }

    @Override
    public CommentDeletedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommentDeletedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommentDeletedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.databaseId();
        this.id();
        this.typename();
        return this;
    }

    public CommentDeletedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public CommentDeletedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public CommentDeletedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public CommentDeletedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public CommentDeletedEventResponseProjection databaseId() {
        return databaseId(null);
    }

    public CommentDeletedEventResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public CommentDeletedEventResponseProjection id() {
        return id(null);
    }

    public CommentDeletedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CommentDeletedEventResponseProjection typename() {
        return typename(null);
    }

    public CommentDeletedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}