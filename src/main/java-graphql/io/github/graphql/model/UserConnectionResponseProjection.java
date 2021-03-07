package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UserConnectionResponseProjection extends GraphQLResponseProjection {

    public UserConnectionResponseProjection() {
    }

    @Override
    public UserConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) + 1);
            this.edges(new UserEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1);
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public UserConnectionResponseProjection edges(UserEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public UserConnectionResponseProjection edges(String alias, UserEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public UserConnectionResponseProjection nodes(UserResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public UserConnectionResponseProjection nodes(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public UserConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public UserConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public UserConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public UserConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public UserConnectionResponseProjection typename() {
        return typename(null);
    }

    public UserConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
