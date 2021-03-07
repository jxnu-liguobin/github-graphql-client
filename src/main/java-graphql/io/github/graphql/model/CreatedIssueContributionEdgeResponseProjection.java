package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatedIssueContributionEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreatedIssueContributionEdgeResponseProjection extends GraphQLResponseProjection {

    public CreatedIssueContributionEdgeResponseProjection() {
    }

    @Override
    public CreatedIssueContributionEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedIssueContributionEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", projectionDepthOnFields.getOrDefault("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", 0) + 1);
            this.node(new CreatedIssueContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionEdgeResponseProjection.CreatedIssueContributionResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CreatedIssueContributionEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CreatedIssueContributionEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CreatedIssueContributionEdgeResponseProjection node(CreatedIssueContributionResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CreatedIssueContributionEdgeResponseProjection node(String alias, CreatedIssueContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedIssueContributionEdgeResponseProjection typename() {
        return typename(null);
    }

    public CreatedIssueContributionEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
