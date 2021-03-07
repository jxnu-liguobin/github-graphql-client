package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ProjectColumnConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ProjectColumnConnectionResponseProjection extends GraphQLResponseProjection {

    public ProjectColumnConnectionResponseProjection() {
    }

    @Override
    public ProjectColumnConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectColumnConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ProjectColumnEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", 0) + 1);
            this.nodes(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.ProjectColumnResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ProjectColumnConnectionResponseProjection edges(ProjectColumnEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ProjectColumnConnectionResponseProjection edges(String alias, ProjectColumnEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectColumnConnectionResponseProjection nodes(ProjectColumnResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ProjectColumnConnectionResponseProjection nodes(String alias, ProjectColumnResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectColumnConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ProjectColumnConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectColumnConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ProjectColumnConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ProjectColumnConnectionResponseProjection typename() {
        return typename(null);
    }

    public ProjectColumnConnectionResponseProjection typename(String alias) {
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
        final ProjectColumnConnectionResponseProjection that = (ProjectColumnConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
