package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TopicConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class TopicConnectionResponseProjection extends GraphQLResponseProjection {

    public TopicConnectionResponseProjection() {
    }

    @Override
    public TopicConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TopicConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", 0) + 1);
            this.edges(new TopicEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicConnectionResponseProjection.TopicResponseProjection.nodes", projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicResponseProjection.nodes", 0) + 1);
            this.nodes(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public TopicConnectionResponseProjection edges(TopicEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public TopicConnectionResponseProjection edges(String alias, TopicEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public TopicConnectionResponseProjection nodes(TopicResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public TopicConnectionResponseProjection nodes(String alias, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public TopicConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public TopicConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public TopicConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public TopicConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public TopicConnectionResponseProjection typename() {
        return typename(null);
    }

    public TopicConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
