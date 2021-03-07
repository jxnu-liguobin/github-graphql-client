package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for LabelConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LabelConnectionResponseProjection extends GraphQLResponseProjection {

    public LabelConnectionResponseProjection() {
    }

    @Override
    public LabelConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LabelConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", 0) + 1);
            this.edges(new LabelEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelConnectionResponseProjection.LabelResponseProjection.nodes", projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelResponseProjection.nodes", 0) + 1);
            this.nodes(new LabelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public LabelConnectionResponseProjection edges(LabelEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public LabelConnectionResponseProjection edges(String alias, LabelEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public LabelConnectionResponseProjection nodes(LabelResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public LabelConnectionResponseProjection nodes(String alias, LabelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public LabelConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public LabelConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public LabelConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public LabelConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public LabelConnectionResponseProjection typename() {
        return typename(null);
    }

    public LabelConnectionResponseProjection typename(String alias) {
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
        final LabelConnectionResponseProjection that = (LabelConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
