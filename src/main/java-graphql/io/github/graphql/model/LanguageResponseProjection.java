package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Language
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LanguageResponseProjection extends GraphQLResponseProjection {

    public LanguageResponseProjection() {
    }

    @Override
    public LanguageResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LanguageResponseProjection all$(int maxDepth) {
        this.color();
        this.id();
        this.name();
        this.typename();
        return this;
    }

    public LanguageResponseProjection color() {
        return color(null);
    }

    public LanguageResponseProjection color(String alias) {
        fields.add(new GraphQLResponseField("color").alias(alias));
        return this;
    }

    public LanguageResponseProjection id() {
        return id(null);
    }

    public LanguageResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LanguageResponseProjection name() {
        return name(null);
    }

    public LanguageResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public LanguageResponseProjection typename() {
        return typename(null);
    }

    public LanguageResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
