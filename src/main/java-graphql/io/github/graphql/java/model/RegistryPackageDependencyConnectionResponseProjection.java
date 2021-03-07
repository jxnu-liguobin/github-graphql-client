package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RegistryPackageDependencyConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackageDependencyConnectionResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageDependencyConnectionResponseProjection() {
    }

    @Override
    public RegistryPackageDependencyConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageDependencyConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RegistryPackageDependencyEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyResponseProjection.nodes", 0) + 1);
            this.nodes(new RegistryPackageDependencyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageDependencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public RegistryPackageDependencyConnectionResponseProjection edges(RegistryPackageDependencyEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RegistryPackageDependencyConnectionResponseProjection edges(String alias, RegistryPackageDependencyEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageDependencyConnectionResponseProjection nodes(RegistryPackageDependencyResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public RegistryPackageDependencyConnectionResponseProjection nodes(String alias, RegistryPackageDependencyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageDependencyConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RegistryPackageDependencyConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageDependencyConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RegistryPackageDependencyConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RegistryPackageDependencyConnectionResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageDependencyConnectionResponseProjection typename(String alias) {
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
        final RegistryPackageDependencyConnectionResponseProjection that = (RegistryPackageDependencyConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
