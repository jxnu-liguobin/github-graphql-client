package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RemovedFromProjectEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RemovedFromProjectEventResponseProjection extends GraphQLResponseProjection {

    public RemovedFromProjectEventResponseProjection() {
    }

    @Override
    public RemovedFromProjectEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RemovedFromProjectEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemovedFromProjectEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.databaseId();
        this.id();
        this.typename();
        return this;
    }

    public RemovedFromProjectEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public RemovedFromProjectEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public RemovedFromProjectEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public RemovedFromProjectEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public RemovedFromProjectEventResponseProjection databaseId() {
        return databaseId(null);
    }

    public RemovedFromProjectEventResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public RemovedFromProjectEventResponseProjection id() {
        return id(null);
    }

    public RemovedFromProjectEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RemovedFromProjectEventResponseProjection typename() {
        return typename(null);
    }

    public RemovedFromProjectEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
