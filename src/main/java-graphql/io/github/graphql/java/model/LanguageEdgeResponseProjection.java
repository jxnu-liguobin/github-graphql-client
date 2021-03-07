package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for LanguageEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final LanguageEdgeResponseProjection that = (LanguageEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
