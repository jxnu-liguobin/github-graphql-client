package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MentionedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MentionedEventResponseProjection extends GraphQLResponseProjection {

    public MentionedEventResponseProjection() {
    }

    @Override
    public MentionedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MentionedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MentionedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("MentionedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("MentionedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MentionedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.databaseId();
        this.id();
        this.typename();
        return this;
    }

    public MentionedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public MentionedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public MentionedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public MentionedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public MentionedEventResponseProjection databaseId() {
        return databaseId(null);
    }

    public MentionedEventResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public MentionedEventResponseProjection id() {
        return id(null);
    }

    public MentionedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MentionedEventResponseProjection typename() {
        return typename(null);
    }

    public MentionedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
