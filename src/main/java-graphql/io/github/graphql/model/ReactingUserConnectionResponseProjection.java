package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReactingUserConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReactingUserConnectionResponseProjection extends GraphQLResponseProjection {

    public ReactingUserConnectionResponseProjection() {
    }

    @Override
    public ReactingUserConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReactingUserConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ReactingUserEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1);
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ReactingUserConnectionResponseProjection edges(ReactingUserEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ReactingUserConnectionResponseProjection edges(String alias, ReactingUserEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ReactingUserConnectionResponseProjection nodes(UserResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ReactingUserConnectionResponseProjection nodes(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ReactingUserConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ReactingUserConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ReactingUserConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ReactingUserConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ReactingUserConnectionResponseProjection typename() {
        return typename(null);
    }

    public ReactingUserConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
