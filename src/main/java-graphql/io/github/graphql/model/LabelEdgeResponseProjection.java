package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for LabelEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class LabelEdgeResponseProjection extends GraphQLResponseProjection {

    public LabelEdgeResponseProjection() {
    }

    @Override
    public LabelEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LabelEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("LabelEdgeResponseProjection.LabelResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelEdgeResponseProjection.LabelResponseProjection.node", projectionDepthOnFields.getOrDefault("LabelEdgeResponseProjection.LabelResponseProjection.node", 0) + 1);
            this.node(new LabelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelEdgeResponseProjection.LabelResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public LabelEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public LabelEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public LabelEdgeResponseProjection node(LabelResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public LabelEdgeResponseProjection node(String alias, LabelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public LabelEdgeResponseProjection typename() {
        return typename(null);
    }

    public LabelEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
