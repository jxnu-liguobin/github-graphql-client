package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RepositoryTopicEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RepositoryTopicEdgeResponseProjection extends GraphQLResponseProjection {

    public RepositoryTopicEdgeResponseProjection() {
    }

    @Override
    public RepositoryTopicEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryTopicEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", projectionDepthOnFields.getOrDefault("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", 0) + 1);
            this.node(new RepositoryTopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicEdgeResponseProjection.RepositoryTopicResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RepositoryTopicEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RepositoryTopicEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RepositoryTopicEdgeResponseProjection node(RepositoryTopicResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RepositoryTopicEdgeResponseProjection node(String alias, RepositoryTopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryTopicEdgeResponseProjection typename() {
        return typename(null);
    }

    public RepositoryTopicEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
