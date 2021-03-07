package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ExternalIdentitySamlAttributes
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ExternalIdentitySamlAttributesResponseProjection extends GraphQLResponseProjection {

    public ExternalIdentitySamlAttributesResponseProjection() {
    }

    @Override
    public ExternalIdentitySamlAttributesResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ExternalIdentitySamlAttributesResponseProjection all$(int maxDepth) {
        this.nameId();
        this.typename();
        return this;
    }

    public ExternalIdentitySamlAttributesResponseProjection nameId() {
        return nameId(null);
    }

    public ExternalIdentitySamlAttributesResponseProjection nameId(String alias) {
        fields.add(new GraphQLResponseField("nameId").alias(alias));
        return this;
    }

    public ExternalIdentitySamlAttributesResponseProjection typename() {
        return typename(null);
    }

    public ExternalIdentitySamlAttributesResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
