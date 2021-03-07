package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TeamRepositoryConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class TeamRepositoryConnectionResponseProjection extends GraphQLResponseProjection {

    public TeamRepositoryConnectionResponseProjection() {
    }

    @Override
    public TeamRepositoryConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TeamRepositoryConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.TeamRepositoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamRepositoryConnectionResponseProjection.TeamRepositoryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.TeamRepositoryEdgeResponseProjection.edges", 0) + 1);
            this.edges(new TeamRepositoryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.TeamRepositoryEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) + 1);
            this.nodes(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public TeamRepositoryConnectionResponseProjection edges(TeamRepositoryEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public TeamRepositoryConnectionResponseProjection edges(String alias, TeamRepositoryEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public TeamRepositoryConnectionResponseProjection nodes(RepositoryResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public TeamRepositoryConnectionResponseProjection nodes(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public TeamRepositoryConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public TeamRepositoryConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public TeamRepositoryConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public TeamRepositoryConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public TeamRepositoryConnectionResponseProjection typename() {
        return typename(null);
    }

    public TeamRepositoryConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
