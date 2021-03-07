package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatedRepositoryContributionEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreatedRepositoryContributionEdgeResponseProjection extends GraphQLResponseProjection {

    public CreatedRepositoryContributionEdgeResponseProjection() {
    }

    @Override
    public CreatedRepositoryContributionEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedRepositoryContributionEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", 0) + 1);
            this.node(new CreatedRepositoryContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionEdgeResponseProjection.CreatedRepositoryContributionResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CreatedRepositoryContributionEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CreatedRepositoryContributionEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CreatedRepositoryContributionEdgeResponseProjection node(CreatedRepositoryContributionResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CreatedRepositoryContributionEdgeResponseProjection node(String alias, CreatedRepositoryContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedRepositoryContributionEdgeResponseProjection typename() {
        return typename(null);
    }

    public CreatedRepositoryContributionEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
