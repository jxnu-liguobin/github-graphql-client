package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RegistryPackageVersionConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackageVersionConnectionResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageVersionConnectionResponseProjection() {
    }

    @Override
    public RegistryPackageVersionConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageVersionConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RegistryPackageVersionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", 0) + 1);
            this.nodes(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public RegistryPackageVersionConnectionResponseProjection edges(RegistryPackageVersionEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RegistryPackageVersionConnectionResponseProjection edges(String alias, RegistryPackageVersionEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionConnectionResponseProjection nodes(RegistryPackageVersionResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public RegistryPackageVersionConnectionResponseProjection nodes(String alias, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RegistryPackageVersionConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RegistryPackageVersionConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RegistryPackageVersionConnectionResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageVersionConnectionResponseProjection typename(String alias) {
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
        final RegistryPackageVersionConnectionResponseProjection that = (RegistryPackageVersionConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
