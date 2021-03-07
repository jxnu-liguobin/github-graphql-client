package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ExternalIdentityScimAttributes
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ExternalIdentityScimAttributesResponseProjection extends GraphQLResponseProjection {

    public ExternalIdentityScimAttributesResponseProjection() {
    }

    @Override
    public ExternalIdentityScimAttributesResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ExternalIdentityScimAttributesResponseProjection all$(int maxDepth) {
        this.username();
        this.typename();
        return this;
    }

    public ExternalIdentityScimAttributesResponseProjection username() {
        return username(null);
    }

    public ExternalIdentityScimAttributesResponseProjection username(String alias) {
        fields.add(new GraphQLResponseField("username").alias(alias));
        return this;
    }

    public ExternalIdentityScimAttributesResponseProjection typename() {
        return typename(null);
    }

    public ExternalIdentityScimAttributesResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
