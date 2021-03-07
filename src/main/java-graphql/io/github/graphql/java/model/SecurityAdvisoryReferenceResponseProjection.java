package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for SecurityAdvisoryReference
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SecurityAdvisoryReferenceResponseProjection extends GraphQLResponseProjection {

    public SecurityAdvisoryReferenceResponseProjection() {
    }

    @Override
    public SecurityAdvisoryReferenceResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SecurityAdvisoryReferenceResponseProjection all$(int maxDepth) {
        this.url();
        this.typename();
        return this;
    }

    public SecurityAdvisoryReferenceResponseProjection url() {
        return url(null);
    }

    public SecurityAdvisoryReferenceResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public SecurityAdvisoryReferenceResponseProjection typename() {
        return typename(null);
    }

    public SecurityAdvisoryReferenceResponseProjection typename(String alias) {
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
        final SecurityAdvisoryReferenceResponseProjection that = (SecurityAdvisoryReferenceResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
