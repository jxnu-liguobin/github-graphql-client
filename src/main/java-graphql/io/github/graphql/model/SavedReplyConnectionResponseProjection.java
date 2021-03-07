package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SavedReplyConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SavedReplyConnectionResponseProjection extends GraphQLResponseProjection {

    public SavedReplyConnectionResponseProjection() {
    }

    @Override
    public SavedReplyConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SavedReplyConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", 0) + 1);
            this.edges(new SavedReplyEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", 0) + 1);
            this.nodes(new SavedReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public SavedReplyConnectionResponseProjection edges(SavedReplyEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public SavedReplyConnectionResponseProjection edges(String alias, SavedReplyEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public SavedReplyConnectionResponseProjection nodes(SavedReplyResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public SavedReplyConnectionResponseProjection nodes(String alias, SavedReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public SavedReplyConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public SavedReplyConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public SavedReplyConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public SavedReplyConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public SavedReplyConnectionResponseProjection typename() {
        return typename(null);
    }

    public SavedReplyConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
