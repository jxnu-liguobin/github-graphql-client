package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReactionConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReactionConnectionResponseProjection extends GraphQLResponseProjection {

    public ReactionConnectionResponseProjection() {
    }

    @Override
    public ReactionConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReactionConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ReactionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", 0) + 1);
            this.nodes(new ReactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.viewerHasReacted();
        this.typename();
        return this;
    }

    public ReactionConnectionResponseProjection edges(ReactionEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ReactionConnectionResponseProjection edges(String alias, ReactionEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ReactionConnectionResponseProjection nodes(ReactionResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ReactionConnectionResponseProjection nodes(String alias, ReactionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ReactionConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ReactionConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ReactionConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ReactionConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ReactionConnectionResponseProjection viewerHasReacted() {
        return viewerHasReacted(null);
    }

    public ReactionConnectionResponseProjection viewerHasReacted(String alias) {
        fields.add(new GraphQLResponseField("viewerHasReacted").alias(alias));
        return this;
    }

    public ReactionConnectionResponseProjection typename() {
        return typename(null);
    }

    public ReactionConnectionResponseProjection typename(String alias) {
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
        final ReactionConnectionResponseProjection that = (ReactionConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
