package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MilestoneEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MilestoneEdgeResponseProjection extends GraphQLResponseProjection {

    public MilestoneEdgeResponseProjection() {
    }

    @Override
    public MilestoneEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MilestoneEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", projectionDepthOnFields.getOrDefault("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", 0) + 1);
            this.node(new MilestoneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneEdgeResponseProjection.MilestoneResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public MilestoneEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public MilestoneEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public MilestoneEdgeResponseProjection node(MilestoneResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public MilestoneEdgeResponseProjection node(String alias, MilestoneResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public MilestoneEdgeResponseProjection typename() {
        return typename(null);
    }

    public MilestoneEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
