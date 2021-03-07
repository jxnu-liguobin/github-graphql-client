package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SecurityAdvisoryReference
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
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


}
