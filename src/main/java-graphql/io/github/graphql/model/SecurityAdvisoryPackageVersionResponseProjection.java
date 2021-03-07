package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SecurityAdvisoryPackageVersion
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SecurityAdvisoryPackageVersionResponseProjection extends GraphQLResponseProjection {

    public SecurityAdvisoryPackageVersionResponseProjection() {
    }

    @Override
    public SecurityAdvisoryPackageVersionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SecurityAdvisoryPackageVersionResponseProjection all$(int maxDepth) {
        this.identifier();
        this.typename();
        return this;
    }

    public SecurityAdvisoryPackageVersionResponseProjection identifier() {
        return identifier(null);
    }

    public SecurityAdvisoryPackageVersionResponseProjection identifier(String alias) {
        fields.add(new GraphQLResponseField("identifier").alias(alias));
        return this;
    }

    public SecurityAdvisoryPackageVersionResponseProjection typename() {
        return typename(null);
    }

    public SecurityAdvisoryPackageVersionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
