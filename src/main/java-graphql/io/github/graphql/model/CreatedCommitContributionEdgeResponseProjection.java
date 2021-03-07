package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatedCommitContributionEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreatedCommitContributionEdgeResponseProjection extends GraphQLResponseProjection {

    public CreatedCommitContributionEdgeResponseProjection() {
    }

    @Override
    public CreatedCommitContributionEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedCommitContributionEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", projectionDepthOnFields.getOrDefault("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", 0) + 1);
            this.node(new CreatedCommitContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionEdgeResponseProjection.CreatedCommitContributionResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CreatedCommitContributionEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CreatedCommitContributionEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CreatedCommitContributionEdgeResponseProjection node(CreatedCommitContributionResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CreatedCommitContributionEdgeResponseProjection node(String alias, CreatedCommitContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedCommitContributionEdgeResponseProjection typename() {
        return typename(null);
    }

    public CreatedCommitContributionEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
