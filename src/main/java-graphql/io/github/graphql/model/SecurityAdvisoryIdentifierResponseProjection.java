package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SecurityAdvisoryIdentifier
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SecurityAdvisoryIdentifierResponseProjection extends GraphQLResponseProjection {

    public SecurityAdvisoryIdentifierResponseProjection() {
    }

    @Override
    public SecurityAdvisoryIdentifierResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SecurityAdvisoryIdentifierResponseProjection all$(int maxDepth) {
        this.type();
        this.value();
        this.typename();
        return this;
    }

    public SecurityAdvisoryIdentifierResponseProjection type() {
        return type(null);
    }

    public SecurityAdvisoryIdentifierResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public SecurityAdvisoryIdentifierResponseProjection value() {
        return value(null);
    }

    public SecurityAdvisoryIdentifierResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }

    public SecurityAdvisoryIdentifierResponseProjection typename() {
        return typename(null);
    }

    public SecurityAdvisoryIdentifierResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
