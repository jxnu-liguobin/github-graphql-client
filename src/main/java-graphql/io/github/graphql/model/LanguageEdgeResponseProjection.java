package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for LanguageEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LanguageEdgeResponseProjection extends GraphQLResponseProjection {

    public LanguageEdgeResponseProjection() {
    }

    @Override
    public LanguageEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LanguageEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("LanguageEdgeResponseProjection.LanguageResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("LanguageEdgeResponseProjection.LanguageResponseProjection.node", projectionDepthOnFields.getOrDefault("LanguageEdgeResponseProjection.LanguageResponseProjection.node", 0) + 1);
            this.node(new LanguageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LanguageEdgeResponseProjection.LanguageResponseProjection.node", 0)));
        }
        this.size();
        this.typename();
        return this;
    }

    public LanguageEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public LanguageEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public LanguageEdgeResponseProjection node(LanguageResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public LanguageEdgeResponseProjection node(String alias, LanguageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public LanguageEdgeResponseProjection size() {
        return size(null);
    }

    public LanguageEdgeResponseProjection size(String alias) {
        fields.add(new GraphQLResponseField("size").alias(alias));
        return this;
    }

    public LanguageEdgeResponseProjection typename() {
        return typename(null);
    }

    public LanguageEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
