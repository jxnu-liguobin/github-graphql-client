package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TeamConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class TeamConnectionResponseProjection extends GraphQLResponseProjection {

    public TeamConnectionResponseProjection() {
    }

    @Override
    public TeamConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TeamConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", 0) + 1);
            this.edges(new TeamEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamConnectionResponseProjection.TeamResponseProjection.nodes", projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamResponseProjection.nodes", 0) + 1);
            this.nodes(new TeamResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.TeamResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public TeamConnectionResponseProjection edges(TeamEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public TeamConnectionResponseProjection edges(String alias, TeamEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public TeamConnectionResponseProjection nodes(TeamResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public TeamConnectionResponseProjection nodes(String alias, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public TeamConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public TeamConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public TeamConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public TeamConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public TeamConnectionResponseProjection typename() {
        return typename(null);
    }

    public TeamConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
