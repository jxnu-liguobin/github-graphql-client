package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for SponsorshipConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SponsorshipConnectionResponseProjection extends GraphQLResponseProjection {

    public SponsorshipConnectionResponseProjection() {
    }

    @Override
    public SponsorshipConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SponsorshipConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", 0) + 1);
            this.edges(new SponsorshipEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", 0) + 1);
            this.nodes(new SponsorshipResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public SponsorshipConnectionResponseProjection edges(SponsorshipEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public SponsorshipConnectionResponseProjection edges(String alias, SponsorshipEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public SponsorshipConnectionResponseProjection nodes(SponsorshipResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public SponsorshipConnectionResponseProjection nodes(String alias, SponsorshipResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public SponsorshipConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public SponsorshipConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public SponsorshipConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public SponsorshipConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public SponsorshipConnectionResponseProjection typename() {
        return typename(null);
    }

    public SponsorshipConnectionResponseProjection typename(String alias) {
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
        final SponsorshipConnectionResponseProjection that = (SponsorshipConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
