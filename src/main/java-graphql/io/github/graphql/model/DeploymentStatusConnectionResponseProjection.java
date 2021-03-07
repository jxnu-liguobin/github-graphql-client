package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeploymentStatusConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeploymentStatusConnectionResponseProjection extends GraphQLResponseProjection {

    public DeploymentStatusConnectionResponseProjection() {
    }

    @Override
    public DeploymentStatusConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeploymentStatusConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", 0) + 1);
            this.edges(new DeploymentStatusEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", 0) + 1);
            this.nodes(new DeploymentStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.DeploymentStatusResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public DeploymentStatusConnectionResponseProjection edges(DeploymentStatusEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public DeploymentStatusConnectionResponseProjection edges(String alias, DeploymentStatusEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentStatusConnectionResponseProjection nodes(DeploymentStatusResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public DeploymentStatusConnectionResponseProjection nodes(String alias, DeploymentStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentStatusConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public DeploymentStatusConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentStatusConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public DeploymentStatusConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public DeploymentStatusConnectionResponseProjection typename() {
        return typename(null);
    }

    public DeploymentStatusConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
