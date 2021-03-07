package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for MilestoneConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MilestoneConnectionResponseProjection extends GraphQLResponseProjection {

    public MilestoneConnectionResponseProjection() {
    }

    @Override
    public MilestoneConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MilestoneConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", 0) + 1);
            this.edges(new MilestoneEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", 0) + 1);
            this.nodes(new MilestoneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public MilestoneConnectionResponseProjection edges(MilestoneEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public MilestoneConnectionResponseProjection edges(String alias, MilestoneEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public MilestoneConnectionResponseProjection nodes(MilestoneResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public MilestoneConnectionResponseProjection nodes(String alias, MilestoneResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public MilestoneConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public MilestoneConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public MilestoneConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public MilestoneConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public MilestoneConnectionResponseProjection typename() {
        return typename(null);
    }

    public MilestoneConnectionResponseProjection typename(String alias) {
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
        final MilestoneConnectionResponseProjection that = (MilestoneConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
