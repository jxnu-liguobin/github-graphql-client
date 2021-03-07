package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MovedColumnsInProjectEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class MovedColumnsInProjectEventResponseProjection extends GraphQLResponseProjection {

    public MovedColumnsInProjectEventResponseProjection() {
    }

    @Override
    public MovedColumnsInProjectEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MovedColumnsInProjectEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MovedColumnsInProjectEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.databaseId();
        this.id();
        this.typename();
        return this;
    }

    public MovedColumnsInProjectEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public MovedColumnsInProjectEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public MovedColumnsInProjectEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public MovedColumnsInProjectEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public MovedColumnsInProjectEventResponseProjection databaseId() {
        return databaseId(null);
    }

    public MovedColumnsInProjectEventResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public MovedColumnsInProjectEventResponseProjection id() {
        return id(null);
    }

    public MovedColumnsInProjectEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MovedColumnsInProjectEventResponseProjection typename() {
        return typename(null);
    }

    public MovedColumnsInProjectEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
