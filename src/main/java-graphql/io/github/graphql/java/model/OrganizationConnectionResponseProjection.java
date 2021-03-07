package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for OrganizationConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class OrganizationConnectionResponseProjection extends GraphQLResponseProjection {

    public OrganizationConnectionResponseProjection() {
    }

    @Override
    public OrganizationConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public OrganizationConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0) + 1);
            this.edges(new OrganizationEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0) + 1);
            this.nodes(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public OrganizationConnectionResponseProjection edges(OrganizationEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public OrganizationConnectionResponseProjection edges(String alias, OrganizationEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationConnectionResponseProjection nodes(OrganizationResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public OrganizationConnectionResponseProjection nodes(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public OrganizationConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public OrganizationConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public OrganizationConnectionResponseProjection typename() {
        return typename(null);
    }

    public OrganizationConnectionResponseProjection typename(String alias) {
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
        final OrganizationConnectionResponseProjection that = (OrganizationConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
