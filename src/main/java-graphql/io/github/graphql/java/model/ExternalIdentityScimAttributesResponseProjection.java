package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ExternalIdentityScimAttributes
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ExternalIdentityScimAttributesResponseProjection that = (ExternalIdentityScimAttributesResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
