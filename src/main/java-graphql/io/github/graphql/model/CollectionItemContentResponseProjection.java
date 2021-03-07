package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CollectionItemContent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CollectionItemContentResponseProjection extends GraphQLResponseProjection {

    public CollectionItemContentResponseProjection() {
    }

    @Override
    public CollectionItemContentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CollectionItemContentResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public CollectionItemContentResponseProjection onRepository(RepositoryResponseProjection subProjection) {
        return onRepository(null, subProjection);
    }

    public CollectionItemContentResponseProjection onRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection));
        return this;
    }

    public CollectionItemContentResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public CollectionItemContentResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public CollectionItemContentResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public CollectionItemContentResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public CollectionItemContentResponseProjection typename() {
        return typename(null);
    }

    public CollectionItemContentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}