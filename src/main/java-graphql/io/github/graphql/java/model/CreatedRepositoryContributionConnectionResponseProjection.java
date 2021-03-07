package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CreatedRepositoryContributionConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedRepositoryContributionConnectionResponseProjection extends GraphQLResponseProjection {

    public CreatedRepositoryContributionConnectionResponseProjection() {
    }

    @Override
    public CreatedRepositoryContributionConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedRepositoryContributionConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CreatedRepositoryContributionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", 0) + 1);
            this.nodes(new CreatedRepositoryContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public CreatedRepositoryContributionConnectionResponseProjection edges(CreatedRepositoryContributionEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CreatedRepositoryContributionConnectionResponseProjection edges(String alias, CreatedRepositoryContributionEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedRepositoryContributionConnectionResponseProjection nodes(CreatedRepositoryContributionResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public CreatedRepositoryContributionConnectionResponseProjection nodes(String alias, CreatedRepositoryContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedRepositoryContributionConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CreatedRepositoryContributionConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedRepositoryContributionConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CreatedRepositoryContributionConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CreatedRepositoryContributionConnectionResponseProjection typename() {
        return typename(null);
    }

    public CreatedRepositoryContributionConnectionResponseProjection typename(String alias) {
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
        final CreatedRepositoryContributionConnectionResponseProjection that = (CreatedRepositoryContributionConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
