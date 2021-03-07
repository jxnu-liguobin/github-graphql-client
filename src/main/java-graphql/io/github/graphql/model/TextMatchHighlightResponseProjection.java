package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TextMatchHighlight
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class TextMatchHighlightResponseProjection extends GraphQLResponseProjection {

    public TextMatchHighlightResponseProjection() {
    }

    @Override
    public TextMatchHighlightResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TextMatchHighlightResponseProjection all$(int maxDepth) {
        this.beginIndice();
        this.endIndice();
        this.text();
        this.typename();
        return this;
    }

    public TextMatchHighlightResponseProjection beginIndice() {
        return beginIndice(null);
    }

    public TextMatchHighlightResponseProjection beginIndice(String alias) {
        fields.add(new GraphQLResponseField("beginIndice").alias(alias));
        return this;
    }

    public TextMatchHighlightResponseProjection endIndice() {
        return endIndice(null);
    }

    public TextMatchHighlightResponseProjection endIndice(String alias) {
        fields.add(new GraphQLResponseField("endIndice").alias(alias));
        return this;
    }

    public TextMatchHighlightResponseProjection text() {
        return text(null);
    }

    public TextMatchHighlightResponseProjection text(String alias) {
        fields.add(new GraphQLResponseField("text").alias(alias));
        return this;
    }

    public TextMatchHighlightResponseProjection typename() {
        return typename(null);
    }

    public TextMatchHighlightResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
