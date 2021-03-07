package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ContentReference
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ContentReferenceResponseProjection extends GraphQLResponseProjection {

    public ContentReferenceResponseProjection() {
    }

    @Override
    public ContentReferenceResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ContentReferenceResponseProjection all$(int maxDepth) {
        this.databaseId();
        this.id();
        this.reference();
        this.typename();
        return this;
    }

    public ContentReferenceResponseProjection databaseId() {
        return databaseId(null);
    }

    public ContentReferenceResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public ContentReferenceResponseProjection id() {
        return id(null);
    }

    public ContentReferenceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ContentReferenceResponseProjection reference() {
        return reference(null);
    }

    public ContentReferenceResponseProjection reference(String alias) {
        fields.add(new GraphQLResponseField("reference").alias(alias));
        return this;
    }

    public ContentReferenceResponseProjection typename() {
        return typename(null);
    }

    public ContentReferenceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
