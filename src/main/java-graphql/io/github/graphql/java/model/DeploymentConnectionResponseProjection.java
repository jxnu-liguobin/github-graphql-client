package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for DeploymentConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeploymentConnectionResponseProjection extends GraphQLResponseProjection {

    public DeploymentConnectionResponseProjection() {
    }

    @Override
    public DeploymentConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeploymentConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", 0) + 1);
            this.edges(new DeploymentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", 0) + 1);
            this.nodes(new DeploymentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.DeploymentResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public DeploymentConnectionResponseProjection edges(DeploymentEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public DeploymentConnectionResponseProjection edges(String alias, DeploymentEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentConnectionResponseProjection nodes(DeploymentResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public DeploymentConnectionResponseProjection nodes(String alias, DeploymentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public DeploymentConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public DeploymentConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public DeploymentConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public DeploymentConnectionResponseProjection typename() {
        return typename(null);
    }

    public DeploymentConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeploymentConnectionResponseProjection that = (DeploymentConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
