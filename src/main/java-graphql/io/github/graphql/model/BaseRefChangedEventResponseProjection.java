package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for BaseRefChangedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class BaseRefChangedEventResponseProjection extends GraphQLResponseProjection {

    public BaseRefChangedEventResponseProjection() {
    }

    @Override
    public BaseRefChangedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BaseRefChangedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BaseRefChangedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.databaseId();
        this.id();
        this.typename();
        return this;
    }

    public BaseRefChangedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public BaseRefChangedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public BaseRefChangedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public BaseRefChangedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public BaseRefChangedEventResponseProjection databaseId() {
        return databaseId(null);
    }

    public BaseRefChangedEventResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public BaseRefChangedEventResponseProjection id() {
        return id(null);
    }

    public BaseRefChangedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public BaseRefChangedEventResponseProjection typename() {
        return typename(null);
    }

    public BaseRefChangedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
