package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SecurityAdvisoryPackage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SecurityAdvisoryPackageResponseProjection extends GraphQLResponseProjection {

    public SecurityAdvisoryPackageResponseProjection() {
    }

    @Override
    public SecurityAdvisoryPackageResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SecurityAdvisoryPackageResponseProjection all$(int maxDepth) {
        this.ecosystem();
        this.name();
        this.typename();
        return this;
    }

    public SecurityAdvisoryPackageResponseProjection ecosystem() {
        return ecosystem(null);
    }

    public SecurityAdvisoryPackageResponseProjection ecosystem(String alias) {
        fields.add(new GraphQLResponseField("ecosystem").alias(alias));
        return this;
    }

    public SecurityAdvisoryPackageResponseProjection name() {
        return name(null);
    }

    public SecurityAdvisoryPackageResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SecurityAdvisoryPackageResponseProjection typename() {
        return typename(null);
    }

    public SecurityAdvisoryPackageResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
