package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DemilestonedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DemilestonedEventResponseProjection extends GraphQLResponseProjection {

    public DemilestonedEventResponseProjection() {
    }

    @Override
    public DemilestonedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DemilestonedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("DemilestonedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        this.milestoneTitle();
        if (projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) + 1);
            this.subject(new MilestoneItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DemilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0)));
        }
        this.typename();
        return this;
    }

    public DemilestonedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public DemilestonedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public DemilestonedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public DemilestonedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public DemilestonedEventResponseProjection id() {
        return id(null);
    }

    public DemilestonedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DemilestonedEventResponseProjection milestoneTitle() {
        return milestoneTitle(null);
    }

    public DemilestonedEventResponseProjection milestoneTitle(String alias) {
        fields.add(new GraphQLResponseField("milestoneTitle").alias(alias));
        return this;
    }

    public DemilestonedEventResponseProjection subject(MilestoneItemResponseProjection subProjection) {
        return subject(null, subProjection);
    }

    public DemilestonedEventResponseProjection subject(String alias, MilestoneItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection));
        return this;
    }

    public DemilestonedEventResponseProjection typename() {
        return typename(null);
    }

    public DemilestonedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
