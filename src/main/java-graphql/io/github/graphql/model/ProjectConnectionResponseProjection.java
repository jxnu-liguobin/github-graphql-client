package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ProjectConnectionResponseProjection extends GraphQLResponseProjection {

    public ProjectConnectionResponseProjection() {
    }

    @Override
    public ProjectConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ProjectEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", 0) + 1);
            this.nodes(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ProjectConnectionResponseProjection edges(ProjectEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ProjectConnectionResponseProjection edges(String alias, ProjectEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectConnectionResponseProjection nodes(ProjectResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ProjectConnectionResponseProjection nodes(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ProjectConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ProjectConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ProjectConnectionResponseProjection typename() {
        return typename(null);
    }

    public ProjectConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
