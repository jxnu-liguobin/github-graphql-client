package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CodeOfConduct
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CodeOfConductResponseProjection extends GraphQLResponseProjection {

    public CodeOfConductResponseProjection() {
    }

    @Override
    public CodeOfConductResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CodeOfConductResponseProjection all$(int maxDepth) {
        this.body();
        this.id();
        this.key();
        this.name();
        this.resourcePath();
        this.url();
        this.typename();
        return this;
    }

    public CodeOfConductResponseProjection body() {
        return body(null);
    }

    public CodeOfConductResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public CodeOfConductResponseProjection id() {
        return id(null);
    }

    public CodeOfConductResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CodeOfConductResponseProjection key() {
        return key(null);
    }

    public CodeOfConductResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public CodeOfConductResponseProjection name() {
        return name(null);
    }

    public CodeOfConductResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CodeOfConductResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public CodeOfConductResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public CodeOfConductResponseProjection url() {
        return url(null);
    }

    public CodeOfConductResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public CodeOfConductResponseProjection typename() {
        return typename(null);
    }

    public CodeOfConductResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
