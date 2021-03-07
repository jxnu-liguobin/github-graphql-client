package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SavedReplyEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SavedReplyEdgeResponseProjection extends GraphQLResponseProjection {

    public SavedReplyEdgeResponseProjection() {
    }

    @Override
    public SavedReplyEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SavedReplyEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", projectionDepthOnFields.getOrDefault("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", 0) + 1);
            this.node(new SavedReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyEdgeResponseProjection.SavedReplyResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public SavedReplyEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public SavedReplyEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public SavedReplyEdgeResponseProjection node(SavedReplyResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public SavedReplyEdgeResponseProjection node(String alias, SavedReplyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public SavedReplyEdgeResponseProjection typename() {
        return typename(null);
    }

    public SavedReplyEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
