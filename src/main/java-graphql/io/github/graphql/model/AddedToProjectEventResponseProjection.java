package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AddedToProjectEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AddedToProjectEventResponseProjection extends GraphQLResponseProjection {

    public AddedToProjectEventResponseProjection() {
    }

    @Override
    public AddedToProjectEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AddedToProjectEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AddedToProjectEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddedToProjectEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("AddedToProjectEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddedToProjectEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.databaseId();
        this.id();
        this.typename();
        return this;
    }

    public AddedToProjectEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public AddedToProjectEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public AddedToProjectEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public AddedToProjectEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public AddedToProjectEventResponseProjection databaseId() {
        return databaseId(null);
    }

    public AddedToProjectEventResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public AddedToProjectEventResponseProjection id() {
        return id(null);
    }

    public AddedToProjectEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AddedToProjectEventResponseProjection typename() {
        return typename(null);
    }

    public AddedToProjectEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
