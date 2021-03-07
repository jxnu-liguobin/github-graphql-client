package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CommitHistoryConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CommitHistoryConnectionResponseProjection extends GraphQLResponseProjection {

    public CommitHistoryConnectionResponseProjection() {
    }

    @Override
    public CommitHistoryConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommitHistoryConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CommitEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", 0) + 1);
            this.nodes(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public CommitHistoryConnectionResponseProjection edges(CommitEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CommitHistoryConnectionResponseProjection edges(String alias, CommitEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CommitHistoryConnectionResponseProjection nodes(CommitResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public CommitHistoryConnectionResponseProjection nodes(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public CommitHistoryConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CommitHistoryConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CommitHistoryConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CommitHistoryConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CommitHistoryConnectionResponseProjection typename() {
        return typename(null);
    }

    public CommitHistoryConnectionResponseProjection typename(String alias) {
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
        final CommitHistoryConnectionResponseProjection that = (CommitHistoryConnectionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
