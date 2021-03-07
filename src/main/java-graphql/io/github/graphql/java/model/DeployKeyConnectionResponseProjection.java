package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for DeployKeyConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeployKeyConnectionResponseProjection extends GraphQLResponseProjection {

    public DeployKeyConnectionResponseProjection() {
    }

    @Override
    public DeployKeyConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeployKeyConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", 0) + 1);
            this.edges(new DeployKeyEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", 0) + 1);
            this.nodes(new DeployKeyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public DeployKeyConnectionResponseProjection edges(DeployKeyEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public DeployKeyConnectionResponseProjection edges(String alias, DeployKeyEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public DeployKeyConnectionResponseProjection nodes(DeployKeyResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public DeployKeyConnectionResponseProjection nodes(String alias, DeployKeyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public DeployKeyConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public DeployKeyConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public DeployKeyConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public DeployKeyConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public DeployKeyConnectionResponseProjection typename() {
        return typename(null);
    }

    public DeployKeyConnectionResponseProjection typename(String alias) {
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
        final DeployKeyConnectionResponseProjection that = (DeployKeyConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
