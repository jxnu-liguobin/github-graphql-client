package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RepositoryTopicConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RepositoryTopicConnectionResponseProjection extends GraphQLResponseProjection {

    public RepositoryTopicConnectionResponseProjection() {
    }

    @Override
    public RepositoryTopicConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryTopicConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RepositoryTopicEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", 0) + 1);
            this.nodes(new RepositoryTopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public RepositoryTopicConnectionResponseProjection edges(RepositoryTopicEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RepositoryTopicConnectionResponseProjection edges(String alias, RepositoryTopicEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryTopicConnectionResponseProjection nodes(RepositoryTopicResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public RepositoryTopicConnectionResponseProjection nodes(String alias, RepositoryTopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryTopicConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RepositoryTopicConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryTopicConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RepositoryTopicConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RepositoryTopicConnectionResponseProjection typename() {
        return typename(null);
    }

    public RepositoryTopicConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
