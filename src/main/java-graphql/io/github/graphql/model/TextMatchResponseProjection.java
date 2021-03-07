package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TextMatch
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class TextMatchResponseProjection extends GraphQLResponseProjection {

    public TextMatchResponseProjection() {
    }

    @Override
    public TextMatchResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TextMatchResponseProjection all$(int maxDepth) {
        this.fragment();
        if (projectionDepthOnFields.getOrDefault("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", 0) <= maxDepth) {
            projectionDepthOnFields.put("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", projectionDepthOnFields.getOrDefault("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", 0) + 1);
            this.highlights(new TextMatchHighlightResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", 0)));
        }
        this.property();
        this.typename();
        return this;
    }

    public TextMatchResponseProjection fragment() {
        return fragment(null);
    }

    public TextMatchResponseProjection fragment(String alias) {
        fields.add(new GraphQLResponseField("fragment").alias(alias));
        return this;
    }

    public TextMatchResponseProjection highlights(TextMatchHighlightResponseProjection subProjection) {
        return highlights(null, subProjection);
    }

    public TextMatchResponseProjection highlights(String alias, TextMatchHighlightResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("highlights").alias(alias).projection(subProjection));
        return this;
    }

    public TextMatchResponseProjection property() {
        return property(null);
    }

    public TextMatchResponseProjection property(String alias) {
        fields.add(new GraphQLResponseField("property").alias(alias));
        return this;
    }

    public TextMatchResponseProjection typename() {
        return typename(null);
    }

    public TextMatchResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
