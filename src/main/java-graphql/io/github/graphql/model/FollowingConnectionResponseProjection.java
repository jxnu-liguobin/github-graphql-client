package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for FollowingConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class FollowingConnectionResponseProjection extends GraphQLResponseProjection {

    public FollowingConnectionResponseProjection() {
    }

    @Override
    public FollowingConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public FollowingConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) + 1);
            this.edges(new UserEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("FollowingConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1);
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.UserResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FollowingConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public FollowingConnectionResponseProjection edges(UserEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public FollowingConnectionResponseProjection edges(String alias, UserEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public FollowingConnectionResponseProjection nodes(UserResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public FollowingConnectionResponseProjection nodes(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public FollowingConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public FollowingConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public FollowingConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public FollowingConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public FollowingConnectionResponseProjection typename() {
        return typename(null);
    }

    public FollowingConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
