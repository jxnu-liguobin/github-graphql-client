package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TopicEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class TopicEdgeResponseProjection extends GraphQLResponseProjection {

    public TopicEdgeResponseProjection() {
    }

    @Override
    public TopicEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TopicEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("TopicEdgeResponseProjection.TopicResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicEdgeResponseProjection.TopicResponseProjection.node", projectionDepthOnFields.getOrDefault("TopicEdgeResponseProjection.TopicResponseProjection.node", 0) + 1);
            this.node(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicEdgeResponseProjection.TopicResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public TopicEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public TopicEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public TopicEdgeResponseProjection node(TopicResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public TopicEdgeResponseProjection node(String alias, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public TopicEdgeResponseProjection typename() {
        return typename(null);
    }

    public TopicEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
