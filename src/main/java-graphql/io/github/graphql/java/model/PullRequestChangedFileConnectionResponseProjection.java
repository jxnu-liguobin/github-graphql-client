package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestChangedFileConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestChangedFileConnectionResponseProjection extends GraphQLResponseProjection {

    public PullRequestChangedFileConnectionResponseProjection() {
    }

    @Override
    public PullRequestChangedFileConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestChangedFileConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PullRequestChangedFileEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", 0) + 1);
            this.nodes(new PullRequestChangedFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PullRequestChangedFileConnectionResponseProjection edges(PullRequestChangedFileEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PullRequestChangedFileConnectionResponseProjection edges(String alias, PullRequestChangedFileEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestChangedFileConnectionResponseProjection nodes(PullRequestChangedFileResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public PullRequestChangedFileConnectionResponseProjection nodes(String alias, PullRequestChangedFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestChangedFileConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PullRequestChangedFileConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestChangedFileConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PullRequestChangedFileConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PullRequestChangedFileConnectionResponseProjection typename() {
        return typename(null);
    }

    public PullRequestChangedFileConnectionResponseProjection typename(String alias) {
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
        final PullRequestChangedFileConnectionResponseProjection that = (PullRequestChangedFileConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
