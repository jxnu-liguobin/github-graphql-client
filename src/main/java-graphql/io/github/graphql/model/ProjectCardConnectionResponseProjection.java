package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectCardConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ProjectCardConnectionResponseProjection extends GraphQLResponseProjection {

    public ProjectCardConnectionResponseProjection() {
    }

    @Override
    public ProjectCardConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectCardConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ProjectCardEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", 0) + 1);
            this.nodes(new ProjectCardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.ProjectCardResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ProjectCardConnectionResponseProjection edges(ProjectCardEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ProjectCardConnectionResponseProjection edges(String alias, ProjectCardEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectCardConnectionResponseProjection nodes(ProjectCardResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ProjectCardConnectionResponseProjection nodes(String alias, ProjectCardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectCardConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ProjectCardConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectCardConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ProjectCardConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ProjectCardConnectionResponseProjection typename() {
        return typename(null);
    }

    public ProjectCardConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
